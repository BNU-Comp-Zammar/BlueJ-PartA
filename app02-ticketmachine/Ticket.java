import java.util.Date;

/**
 * The ticket is used to create a ticket for the user so that they can travel 
 * to any one of the 3 destinations being Ayelesbury, Amersham or High Wycombe. 
 * customer can buy a ticket for 1 of these areas by entering location and price
 * of ticket.
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
    
    /**
     * Return the ticket's destination as a string
     * Not needed
     */
    public String getDestination()
   {
       return destination;
   }
    
    /**
     * this will print a value but will not return as we do not need a return
     */
    public void print()
    {
          System.out.println("Ticket to " + destination);
          System.out.print("cost " + price + "p ");
          System.out.println("Issued: " + timeStamp);
    }
}
