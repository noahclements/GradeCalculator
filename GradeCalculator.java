class Grades {
	double quiz1Grade, quiz2Grade, quiz3Grade, quiz4Grade, quiz5Grade;
	double quizTotalMark, examMark, finalMark;
	int midtermExam, finalExam, quizTotal;
	char gradeLetter;
	Grades(double quiz1, double quiz2, double quiz3, double quiz4, double quiz5, int midterm, int exam) {
		quiz1Grade = quiz1;
		quiz2Grade = quiz2;
		quiz3Grade = quiz3;
		quiz4Grade = quiz4;
		quiz5Grade = quiz5;
		midtermExam = midterm;
		finalExam = exam;
	}
		quizTotal = (((quiz1Grade + quiz2Grade + quiz3Grade + quiz4Grade + quiz5Grade) / 5 ) * 10);
		quizTotalMark  = quizTotal * 0.5; // quizs are worth 50%

		midtermMark = midtermExam * 0.25; // midterm worth 25%

		examMark = finalExam * 0.25; // exam worth 25%

		finalMark = quizTotalMark + midtermMark + examMark; // this is the final mark

if (finalMark >+ 90) {
	gradeLetter = 'A';
} else if(finalMark >+ 80 && finalMark < 90) {
	gradeLetter = 'B';
} else if(finalMark >+ 70 && finalMark < 80) {
	gradeLetter = 'C';
} else if(finalMark >+ 60 && finalMark < 70) {
	gradeLetter = 'D';
} else if(finalMark < 60) {
	gradeLetter = 'E'; 
	}


		void showSeperateGrades() {
			System.out.println("Your average grade with your quizzes was: " + quizTotal + "%");
		}


		void showGradePercentage() {
			System.out.println("Your final grade percentage is: " + finalMark + "%");
		}

		void showGradeLetter() {
			System.out.println("Your final grade letter is: " + gradeLetter);
		}
}




public class GradeCalculator {		// the main class
	public static void main(String[] args) {

		Grades person1 = new Grades(8.0, 7.5, 9.0, 9.5, 8.5, 89, 93);
		/*
		person1.quiz1Grade = 8.0;
		person1.quiz2Grade = 7.5;
		person1.quiz3Grade = 9.0;
		person1.quiz4Grade = 9.5;
		person1.quiz5Grade = 8.5;

		person1.midtermExam = 89;

		person1.finalExam = 93;
		*/
		person1.showSeperateGrades();
		person1.showGradePercentage();
		person1.showGradeLetter();

		Grades person2 = new Grades(6.5, 7.5, 4.5, 7.5, 9.0, 87, 90);
		/*
		person2.quiz1Grade = 6.5;
		person2.quiz2Grade = 7.5;
		person2.quiz3Grade = 4.5;
		person2.quiz4Grade = 7.5;
		person2.quiz5Grade = 9.0;

		person2.midtermExam = 87;

		person2.finalExam = 90;
		*/

		Grades person3 = new Grades(4.5, 6.5, 7.5, 8.0, 8.0, 90, 95);
		/*
		person3.quiz1Grade = 4.5;
		person3.quiz2Grade = 6.5;
		person3.quiz3Grade = 7.5;
		person3.quiz4Grade = 8.0;
		person3.quiz5Grade = 8.0;

		person3.midtermExam = 90;

		person3.finalExam = 95;
		*/

		Grades person4 = new Grades(10.0, 9.5, 8.0, 8.5, 9.5, 95, 98);
		/*
		person4.quiz1Grade = 10.0;
		person4.quiz2Grade = 9.5;
		person4.quiz3Grade = 8.0;
		person4.quiz4Grade = 8.5;
		person4.quiz5Grade = 9.5;

		person4.midtermExam = 95;

		person4.finalExam = 98;
		*/

		Grades person5 = new Grades(4.5, 4.0, 6.0, 6.0, 7.5, 85, 91);
		/*
		person5.quiz1Grade = 4.5;
		person5.quiz2Grade = 4.0;
		person5.quiz3Grade = 6.0;
		person5.quiz4Grade = 6.0;
		person5.quiz5Grade = 7.5;

		person5.midtermExam = 85;

		person5.finalExam = 91;
		*/


	}
}
