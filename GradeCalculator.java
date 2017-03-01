class Grades {
	double quiz1Grade, quiz2Grade, quiz3Grade, quiz4Grade, quiz5Grade;	// initializing all doubles, ints, chars and Strings
	double quizTotalMark, examMark, finalMark, quizTotal, midtermMark;
	int midtermExam, finalExam;
	char gradeLetter;
	String name;
	// makes a constructor to initialize all variables for the class
	Grades(double quiz1, double quiz2, double quiz3, double quiz4, double quiz5, int midterm, int exam, String studentName) {
		quiz1Grade = quiz1;	// initializing new variables 
		quiz2Grade = quiz2;
		quiz3Grade = quiz3;
		quiz4Grade = quiz4;
		quiz5Grade = quiz5;
		midtermExam = midterm;
		finalExam = exam;
		name = studentName;
		quizTotal = (((quiz1Grade + quiz2Grade + quiz3Grade + quiz4Grade + quiz5Grade) / 5 ) * 10); // calculating average quiz mark out of 100
		quizTotalMark  = quizTotal * 0.5; // making the total average worth 50%

		midtermMark = midtermExam * 0.25; // making the total average worth 25%

		examMark = finalExam * 0.25; // making the total average worth 25%

		finalMark = quizTotalMark + midtermMark + examMark; // adding them all up to find out the final mark
	
if(finalMark >= 90) {	// if the final mark is equal or greater than 90
	gradeLetter = 'A';		// the letter grade is A
} else if(finalMark >= 80 && finalMark < 90) {	// if its equal or greater than 80 AND less then 90
	gradeLetter = 'B';		// letter grade is B
} else if(finalMark >= 70 && finalMark < 80) {	// if equal or greater than 70 AND less than 80
	gradeLetter = 'C';		// letter grade is C
} else if(finalMark >= 60 && finalMark < 70) {	// if equal or greater than 60 AND less than  70
	gradeLetter = 'D';		// letter grade is D
} else if(finalMark < 60) {						// if its smaller than 60
	gradeLetter = 'F'; 		// letter grade is F
	}
}

		void showSeperateGrades() {	// a call that will print out your quiz mark percentage
			System.out.println(name + ", your average grade with your quizzes was: " + quizTotal + "%");
		}


		void showGradePercentage() {	// a call that will print out your final mark percentage
			System.out.println("Your final grade percentage is: " + finalMark + "%");
		}

		void showGradeLetter() {		// a call that will print out your final grade letter
			System.out.println("Your final grade letter is: " + gradeLetter + "\n"); // adds a blank line at the end, for better formatting
		}
}




public class GradeCalculator {		// the main class
	public static void main(String[] args) {

		Grades person1 = new Grades(8.0, 7.5, 9.0, 9.5, 8.5, 89, 93, "Noah"); // declaring all variables with the 1st person
		/*
		
		* 	LEFT ALL THESE AND BELOW HERE TO SHOW WHICH ONES IM DECLARING AND HOW 	*
		
		person1.quiz1Grade = 8.0;
		person1.quiz2Grade = 7.5;
		person1.quiz3Grade = 9.0;
		person1.quiz4Grade = 9.5;
		person1.quiz5Grade = 8.5;

		person1.midtermExam = 89;

		person1.finalExam = 93;
		person1.studentName = "Noah";
		*/
		person1.showSeperateGrades();	// calls the void showSeperateGrades
		person1.showGradePercentage();	// calls the void showGradePercentage
		person1.showGradeLetter();		// calls the void showGradeLetter

		Grades person2 = new Grades(6.5, 7.5, 4.5, 7.5, 9.0, 87, 90, "John");	// declaring all variables with 2nd person
		/*
		person2.quiz1Grade = 6.5;
		person2.quiz2Grade = 7.5;
		person2.quiz3Grade = 4.5;
		person2.quiz4Grade = 7.5;
		person2.quiz5Grade = 9.0;

		person2.midtermExam = 87;

		person2.finalExam = 90;
		person1.studentName = "John";
		*/
		person2.showSeperateGrades();	// calls the void showSeperateGrades
		person2.showGradePercentage();	// calls the void showGradePercentage
		person2.showGradeLetter();		// calls the void showGradeLetter

		Grades person3 = new Grades(4.5, 6.5, 7.5, 8.0, 8.0, 90, 95, "Gary");	// declaring all variables with 3rd person
		/*
		person3.quiz1Grade = 4.5;
		person3.quiz2Grade = 6.5;
		person3.quiz3Grade = 7.5;
		person3.quiz4Grade = 8.0;
		person3.quiz5Grade = 8.0;

		person3.midtermExam = 90;

		person3.finalExam = 95;
		person1.studentName = "Gary";
		*/
		person3.showSeperateGrades();	// calls the void showSeperateGrades
		person3.showGradePercentage();	// calls the void showGradePercentage
		person3.showGradeLetter();		// calls the void showGradeLetter

		Grades person4 = new Grades(10.0, 9.5, 8.0, 8.5, 9.5, 95, 98, "Winny");	// declaring all variables with 4th person
		/*
		person4.quiz1Grade = 10.0;
		person4.quiz2Grade = 9.5;
		person4.quiz3Grade = 8.0;
		person4.quiz4Grade = 8.5;
		person4.quiz5Grade = 9.5;

		person4.midtermExam = 95;

		person4.finalExam = 98;
		person1.studentName = "Winny";
		*/
		person4.showSeperateGrades();	// calls the void showSeperateGrades
		person4.showGradePercentage();	// calls the void showGradePercentage
		person4.showGradeLetter();		// calls the void showGradeLetter

		Grades person5 = new Grades(4.5, 4.0, 6.0, 6.0, 7.5, 85, 91, "Ben");	// declaring all variables with 5th person
		/*
		person5.quiz1Grade = 4.5;
		person5.quiz2Grade = 4.0;
		person5.quiz3Grade = 6.0;
		person5.quiz4Grade = 6.0;
		person5.quiz5Grade = 7.5;

		person5.midtermExam = 85;

		person5.finalExam = 91;
		person1.studentName = "Ben";
		*/
		person5.showSeperateGrades();	// calls the void showSeperateGrades
		person5.showGradePercentage();	// calls the void showGradePercentage
		person5.showGradeLetter();		// calls the void showGradeLetter


	}
}
