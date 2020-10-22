
/**
 * Write a description of class Course here.
 *
 * @author Zammar Baig
 * @version 0.1
 */
public class Course
{
    // Attribute, Field, Varible 
    private String title;
    
    private String codeNo;
    
    //Methods
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        this.codeNo = codeNo;
    } 
    
    public  void print()
    {
        System.out.println("Course: " + title + ", Code No: " + codeNo);
    }
}
