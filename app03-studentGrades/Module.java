
/**
 * This class will tell us about the marks that each student has achieved in 
 * work. The code read out 'if mark is greated than 40 = true but if mark is 
 * less than 40 the system will print out a line which says "Invalid Mark!!!"
 *
 * @author (ZAMMAR BAIG)
 * @version (version1)
 */
public class Module
{
    private String title; 
    
    private String codeNo; 
    
    private int mark; 
    
    private boolean completed; 
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        mark = 0;
        completed = false;
    }
      
    public void awardMark(int mark)
    {
      if ((mark >= 0 ) && (mark <= 100))
      {
         this.mark = mark; 
         if(mark > 40) completed = true;
      
      }
      else
      {
         System.out.print("Invalid mark!!!"); 
      }
      
    }     
       
    public int getMark()
    {
        return mark;
    }
    
    public void print()
    {
        System.out.println("module: " + codeNo +
            "" + title + " Mark = " + mark);
    }
}  