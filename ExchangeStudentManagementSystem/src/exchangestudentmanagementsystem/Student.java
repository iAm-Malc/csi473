package ExchangeStudentManagementSystem;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

import java.util.ArrayList;


public class Student {

	private String name;
	private final int studId;
	private final String DOB;
	private int creditsTaken;
        private final ArrayList<EquivalenceCourse> coursesTaken;
        
        public Student(String name,int studId, String DOB, int creditsTaken,ArrayList<EquivalenceCourse> coursesTaken)
        {
            this.name = name;
            this.studId = studId;
            this.creditsTaken = creditsTaken;
            this.DOB = DOB;
            this.coursesTaken = coursesTaken;
        }

	public String getName() {
		return name;
	}
        
        public int getStudentID()
        {
            return studId;
        }

	/**
	 * 
	 * @param newName
	 */
	public void setName(String newName) {
            this.name = newName;
        }
	
        /**
	 * 
	 * @param course
	 */
        public void addCourseTaken(EquivalenceCourse course)
        {
            coursesTaken.add(course);
            creditsTaken += course.credits;
        }
	

}