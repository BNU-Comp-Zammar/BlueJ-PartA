
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
    
    //
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        createModules();
    } 
    
    public void createModules()
    {
        module1 = new Module("Programming Concepts", "C0452");
        module2 = new Module("Computing", "G100");
        module3 = new Module("Global Business", "BM454");
        module4 = new Module("Web Development", "CO453");
    }
    
    public void addModule (Module module,int moduleNo)
    {
        if(moduleNo == 1) 
        {
            module1 = module;
        }
        else if(moduleNo == 2) 
        {
            module2 = module;
        }
        else if (moduleNo == 3) 
        {
            module3 = module;
        }
        else if(moduleNo == 4) 
        {
            module4 = module;
        }
        else
        {
           System.out.print("Invalid module!!!");
        }
    }
    
    public  void print()
    {
        System.out.println("Course: " + title + ", Code No: " + codeNo);
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
    
    public void awardmark(int mark, int moduleNo)
    {
        if(moduleNo ==1)
        {
            module1.awardMark(mark);
        }
    }
}
