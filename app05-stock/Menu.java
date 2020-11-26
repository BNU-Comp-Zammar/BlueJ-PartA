
/**
 * Write a description of class Menu here.
 *
 * @author (zammar)
 * @version 1
 */
public class Menu
{
    private InputReader reader = new InputReader();
    
    /**
     * Display all the valid choices and make sure that the user 
     * chosen before returning
     */
    public String getMenuChoice(String [] choices)
    {
        boolean finished = false;
        String choice = null ;
        
        while(!finished)
        {
            printChoices();
           
            choice = reader.getInput();
            choice = choice.toLowerCase();
            
        }
        return choice;
    }
    
    private void printChoices()
    {
    }
}
