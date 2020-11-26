
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
            printChoices(choices);
            
            choice = reader.getInput();
            choice = choice.toLowerCase();
            
            // CHECK IF CHOICE IS VALID
        }
        return choice;
    }
    
    private boolean checkIsValid(String [] choices, String choice)
    {
        return false; 
    }
    
    private void printChoices(String []choices)
    {
        System.out.println("Your choices are; \n");
        
        for(String choice: choices)
        {
            System.out.println(choice);
        }
    }
}
