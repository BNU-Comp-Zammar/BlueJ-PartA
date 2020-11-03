/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Apple iPhone 12"));
        manager.addProduct(new Product(102,  "Samsung Galaxy S20"));
        manager.addProduct(new Product(103,  "Google Pixel 4A"));
        manager.addProduct(new Product(104,  " Apple Mac"));
        manager.addProduct(new Product(105,  "Microsoft Surface"));
        manager.addProduct(new Product(106,  " Microsoft XP"));
        manager.addProduct(new Product(107,  " Apple iPad Air"));
        manager.addProduct(new Product(108,  " Dell Latitude"));
        manager.addProduct(new Product(109,  " Lenova ThinkPad"));
        manager.addProduct(new Product(110,  " Samsung Galaxy S3"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        manager.delivery(102, 4);
        manager.delivery(103, 7);
        manager.delivery(104, 12);
        manager.delivery(105, 2);
        manager.delivery(106, 16);
        manager.delivery(107, 1);
        manager.delivery(108, 14);
        manager.delivery(109, 3);
        manager.delivery(110, 2);
        manager.printAllProducts();
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
