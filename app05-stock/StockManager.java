import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Zammar Baig) 
 * @version (version 1)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct (id);
        
        if(product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered : " + product);
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!!!");
        }
    }
    
        /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct (id);
        
        if(product != null)
        {
            stock.remove(product);
            System.out.println("\nProduct " + product + " removed!\n");
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!!!");
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null) 
        {
            printDetails(id);
            product.sell(amount);
            printDetails(id);
        }
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public boolean isDuplicateID(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        if(stock.size() == 0)
        {
            System.out.println("Currently you have no stock!");
        }
        else
        {       
            for(Product product : stock)
            {
                System.out.println(product);
            }
        }
        
        System.out.println();
    }
    
    private ArrayList<Product> getLowStock (int stockLevel)
    {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product product : stock) 
        {
            if(product.getQuantity() <= stockLevel)
            {
                result.add(product);
            }
        }
        return result; 
    }
}    
