import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (Zammar Baig)
 * @version (0.1 - Monday 19th )
 */
public class Ticket
{
    //Journey Destination 
    private String destination;
    
    //This is the ticket in pence
    private int price;
    
    //This is the date and time the ticket was printed
    private Date timeStamp;
    
    /**
     * Constructor for objects of class Ticket
     * 
     */
    public Ticket(String destination, int price)
    {
        timeStamp = new Date();
        this.destination = destination;
        this. price = price; 
        
    }
    
    
}
