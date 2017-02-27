class Grades {
	double quiz1Grade, quiz2Grade, quiz3Grade, quiz4Grade, quiz5Grade;
	int midtermExam, finalExam;
	
	Grades(int quiz1, int quiz2, int quiz3, int quiz4, int quiz5, int midterm, int exam) {
		quiz1Grade = quiz1;
		quiz2Grade = quiz2;
		quiz3Grade = quiz3;
		quiz4Grade = quiz4;
		quiz5Grade = quiz5;
		midtermExam = midterm;
		finalExam = exam;
	}
		quizTotalMark = 
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
		
		Grades person3 = new Grades(45, 65, 76, 80, 78, 90, 89);
		/*
		person3.quiz1Grade = 45;
		person3.quiz2Grade = 65;
		person3.quiz3Grade = 76;
		person3.quiz4Grade = 80;
		person3.quiz5Grade = 78;
		
		person3.midtermExam = 90;
		
		person3.finalExam = 89;
		*/	
		
		Grades person4 = new Grades(97, 93, 79, 86, 95, 97, 98);
		/*
		person4.quiz1Grade = 97;
		person4.quiz2Grade = 93;
		person4.quiz3Grade = 79;
		person4.quiz4Grade = 86;
		person4.quiz5Grade = 95;
		
		person4.midtermExam = 97;
		
		person4.finalExam = 98;
		*/
		
		Grades person5 = new Grades(43, 39, 63, 60, 76, 85, 91);
		/*
		person5.quiz1Grade = 43;
		person5.quiz2Grade = 39;
		person5.quiz3Grade = 63;
		person5.quiz4Grade = 60;
		person5.quiz5Grade = 76;
		
		person5.midtermExam = 85;
		
		person5.finalExam = 91;
		*/
		
		
	}
}
