
/**
 * Write a description of class Module here.
 *
 * @author (ZAMMAR BAIG)
 * @version (version1)
 */
public class Module
{
    //Fields
    private String title; 
    
    private String codeNo; 
    
    private int mark; 
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        mark = 0;
    }
      
    public void awardMark(int mark)
    {
        this.mark = mark; 
    }
    
}
