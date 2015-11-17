package ExchangeStudentManagementSystem;

public class EquivalenceCourse {

	private int courseId;
	private String courseName;
	public int credits;
        //private Program program;
        
        public EquivalenceCourse(int courseId, String courseName, int credits)
        {
            this.courseId = courseId;
            this.courseName = courseName;
            this.credits = credits;
            //this.program = prog;
        }
        
       
        
        public void changeCourseName(String newName)
        {
            this.courseName = newName;
        }

}