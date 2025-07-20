import java.util.ArrayList;

/**
 * Class Student that takes the students name and a list of courses the student is enrolled in.
 *
 * @author Ashfaqul Alam
 * @version 1.0
 */
public class Student
{
    private String name;
    private ArrayList<Course>courses;

    /**
     * Constructor for class Student
     */
    public Student(String name)
    {
        this.name = name;
        courses = new ArrayList<>();
    }

    /**
     * Method addCourse adds courses to the list of courses.
     *
     * @param  c  a parameter for a method that gets courses added to
     * 
     */
    public void addCourse(Course c)
    {
        courses.add(c);
        
    }
    
    /**
     * Method getCourse gets the courses the student is enrolled in.
     *
     * @return Course  course student is enrolled in. 
     *
     */
    
    public ArrayList<Course> getCourses()
    {
        return courses;
        
    }
    
    
    /**
     * Method getCourseCount gets the number of courses in the list of courses.
     *
     * @return int  number of courses. 
     *
     */
    
    public int getCourseCount()
    {
        return courses.size();
        
    }
    
    /**
     * 
     * 
     * Method getName gets the code for the the course
     * 
     * @return String the String representation of the name.
     */
    public String getName()
    {
        
         return name;
    }
    
    /**
     * Method removeCourse removes courses from the list of courses.
     *
     * @param  code  a parameter for a method that removes code from.
     * 
     */
    public void removeCourse(String code)
    {
        
        courses.removeIf(c -> c.getCode().equals(code));
        
    }
    
    /**
     * 
     * Helper Method to convert Average  into GPA
     * 
     * @param percent the percent that will be converted into GPA
     * 
     */
    public double convertToGPA( double percent)
    {
        
        if(percent >= 90) return 4.0;
        else if(percent >= 85 ) return 3.9;
        else if(percent >= 80 ) return 3.7;
        else if(percent >= 77 ) return 3.3;
        else if(percent >= 73 ) return 3.0;
        else if(percent >= 70 ) return 2.7;
        else if(percent >= 67 ) return 2.3;
        else if(percent >= 63 ) return 2.0;       
        else if(percent >= 60 ) return 1.7;
        else if(percent >= 57 ) return 1.3;
        else if(percent >= 53 ) return 1.0;
        else if(percent >= 50 ) return 0.7;
        else  return 0.0;

    
    }
    
    /**
     * 
     * Method convertGPAtoLetterGrade method that converts GPA to a letterGrade.
     * 
     * @param gpa the gpa that will be converted to a letter grade
     * 
     */
    
    public String convertGPAtoLetterGrade(double gpa)
    {
        
        if (gpa == 4.0) return "A+";
        else if (gpa >= 3.9) return "A";
        else if (gpa >= 3.7) return "A-";
        else if (gpa >= 3.3) return "B+";
        else if (gpa >= 3.0) return "B";
        else if (gpa >= 2.7) return "B-";
        else if (gpa >= 2.3) return "C+";
        else if (gpa >= 2.0) return "C";
        else if (gpa >= 1.7) return "C-";
        else if (gpa >= 1.3) return "D+";
        else if (gpa >= 1.0) return "D";
        else if (gpa >= 0.7) return "D-";
        return "F";
    
    }
    
    
    /**
     * 
     * Method calculateGPA calculates the average for all the courses combined.
     *
     * 
     * 
     */
    public double calculateGPA()
    {
        
        if( getCourseCount() == 0 ) return 0.0;
        
        double gpa = 0.0;

        
        for(Course c: courses)
        {
        
           double courseAvg = c.getAverage(); 
           gpa += convertToGPA(courseAvg);
        
        }
        
        
        return gpa / courses.size();
        
        
    }
    
    
    

    
}
