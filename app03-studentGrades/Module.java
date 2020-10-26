
/**
 * Write a description of class Module here.
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