public class Quiz
{
	private int id;
	private String student;
	private int totalScore;
	private int maxScore;

	public Quiz(int id, Student Student, int totalScore, int maxScore) {
		this.id = id;
		this.student = student;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
		
	}
    
	public double grade() {
		return (double) ((this.totalScore*100) / this.maxScore);
	}
	

	public static void main(String[] args) {
		// create a new student
		Student student = new Student();
        System.out.println(student.getStudent());
     
		int totalScore = 0;
		int maxScore = 0;

		// create a quiz result for the student
		Quiz quiz1 = new Quiz(1, student, 18, 20);
		totalScore= quiz1.totalScore;
		maxScore = quiz1.maxScore;
        System.out.println("Quiz 1 Score: "+ quiz1.totalScore + "/"+  quiz1.maxScore);
		
		// print the student's total grade on the quiz
		double totalGrade = ((double) totalScore / maxScore)*100;
		System.out.println("Total grade: " + totalGrade+"%");
	}
	
}


