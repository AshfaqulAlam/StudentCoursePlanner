
/**
 * 
 * Represents a single assignment with a title, due date, and grade.
 *
 * @author Ashfaqul Alam
 * @version 1.0
 */
public class Assignment
{

    private String title;
    private String dueDate;
    private int grade;

    /**
     * Constructor to initialize an assignment
     */
    public Assignment(String title, String dueDate, int grade)
    {
        this.title = title;
        this.dueDate = dueDate;
        this.grade = grade;
        
    }

    /**
     * 
     * Returns the grade of the assignment
     *
     * 
     * @return grade 
     */
    public int getGrade()
    {

        return  grade;
    }
    
    
    /**
     * 
     * Returns the title of the assignment
     *
     * 
     * @return title
     */
    public String getTitle()
    {

        return  title;
    }
    
    
    /**
     * 
     * toString method to write the representation of the assignment details.
     * 
     * @return string represenation of students grade. 
     */    
    @Override
    public String toString()
    {
        
      return "Assignment: " + title + ", Due: " + dueDate + ", Grade: " + grade + "%";

    }
    
    

}
