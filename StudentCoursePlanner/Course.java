import java.util.ArrayList;

/**
 * Represents a course with a course code, course name, and a list of assignments.
 *
 * @author Ashfaqul Alam
 * @version 1.0
 */
public class Course
{
    private String code;
    private String name;
    private ArrayList<Assignment>assignments;


    /**
     * Constructor to initialize course details
     */
    public Course(String code, String name)
    {
        this.code = code;
        this.name = name;
        this.assignments = new ArrayList<>();
    }

    /**
     *  Method addAssignment adds assignment to the list of assignments
     *  
     * @param  a a parameter for method
     * 
     */
    public void addAssignment(Assignment a)
    {

        assignments.add(a);
    }
    
    
    /**
     * 
     * 
     * Method getAssignmentCount gets the number of assignments 
     * 
     * 
     * @return int the number of assignment.
     */
    
    public int getAssignmentCount()
    {
        
     
         return assignments.size();
    }
    
        
    
    /**
     * 
     * 
     * Method getCode gets the code for the the course
     * 
     * @return String the String representation of the code.
     */
    public String getCode()
    {
        
         return code;
    }
    
    /**
     * Method removeAssignment removes an assignment by its title
     * 
     * 
     * @param title a String representation of the title of the assingment.
     * 
     */
    public void removeAssignment(String title)
    {
        
        assignments.removeIf(a -> a.getTitle().equals(title));
                
    
    }
    
     /**
     * Method getAverageGrade goes through all the grades and gets the average.
     * 
     * 
     * @param title a String representation of the title of the assignment.
     * @return double  the average grade of the assignments.
     * 
     */
    public double getAverage()
    {
        
        double totalgrades = 0.0; // number of courses
        
        for(Assignment a : assignments)
        {
            
            totalgrades += a.getGrade();
        
        
        }
        
        
        
        return  totalgrades / assignments.size();
                
    
    }
    
    /**
     * 
     * Returns a String representation of the course code and and name and number of assingments.
     * 
     * 
     * @return String a string represenation of the course code,name,number of assignments).
     */
    
    public String toString()
    
    {
    
        
        return code + ": " + name +  " (" +getAssignmentCount() + " " + "assignments)";
    
    
    
    }
    
    
    
}

