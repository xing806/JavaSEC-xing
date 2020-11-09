public class Product {
    private int id;
    private String name;
    private int quantity;
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String toString()
    {
        return id + ": " +
                name +
                " stock level: " + quantity;
    }
    public void
    increaseQuantity(int amount)
    {
        if(amount > 0) {
            quantity += amount;
        }
        else {
            System.out.println("Attempt to restock " +
                    name +
                    " with a non-positive amount: " +
                    amount);
        }
    }
    public void sellOne()
    {
        if(quantity > 0) {
            quantity--;
        }
        else {
            System.out.println(
                    "Attempt to sell an out of stock item: " + name);
        }
    }
}


