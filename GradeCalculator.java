class Grades {
	double quizTotalMark, examMark, finalMark, quizTotal, midtermMark;
	char gradeLetter;
	String name;

	Grades(double quiz1, double quiz2, double quiz3, double quiz4, double quiz5, int midterm, int exam,
			String studentName) {
		name = studentName;

		quizTotal = (((quiz1 + quiz2 + quiz3 + quiz4 + quiz5) / 5) * 10); // calculating average quiz mark out of 100
		quizTotalMark = quizTotal * 0.5;
		midtermMark = midterm * 0.25;
		examMark = exam * 0.25;
		finalMark = quizTotalMark + midtermMark + examMark;

		if (finalMark >= 90) {
			gradeLetter = 'A';
		} else if (finalMark >= 80 && finalMark < 90) {
			gradeLetter = 'B';
		} else if (finalMark >= 70 && finalMark < 80) {
			gradeLetter = 'C';
		} else if (finalMark >= 60 && finalMark < 70) {
			gradeLetter = 'D';
		} else if (finalMark < 60) {
			gradeLetter = 'F';
		}
	}

	void showSeperateGrades() {
		System.out.println(name + ", your average grade with your quizzes was: " + quizTotal + "%");
	}

	void showGradePercentage() {
		System.out.println("Your final grade percentage is: " + finalMark + "%");
	}

	void showGradeLetter() {
		System.out.println("Your final grade letter is: " + gradeLetter + "\n");
	}
}

public class GradeCalculator {
	public static void main(String[] args) {

		Grades person1 = new Grades(8.0, 7.5, 9.0, 9.5, 8.5, 89, 93, "Noah");
		person1.showSeperateGrades();
		person1.showGradePercentage();
		person1.showGradeLetter();

		Grades person2 = new Grades(6.5, 7.5, 4.5, 7.5, 9.0, 87, 90, "John");
		person2.showSeperateGrades();
		person2.showGradePercentage();
		person2.showGradeLetter();

		Grades person3 = new Grades(4.5, 6.5, 7.5, 8.0, 8.0, 90, 95, "Gary");
		person3.showSeperateGrades();
		person3.showGradePercentage();
		person3.showGradeLetter();

		Grades person4 = new Grades(10.0, 9.5, 8.0, 8.5, 9.5, 95, 98, "Winny");
		person4.showSeperateGrades();
		person4.showGradePercentage();
		person4.showGradeLetter();

		Grades person5 = new Grades(4.5, 4.0, 6.0, 6.0, 7.5, 85, 91, "Ben");
		person5.showSeperateGrades();
		person5.showGradePercentage();
		person5.showGradeLetter();
	}
}
