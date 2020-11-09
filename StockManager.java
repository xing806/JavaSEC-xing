import java.util.ArrayList;

public class StockManager {

    private ArrayList<Product> stock;

    public StockManager()
    {
        stock = new ArrayList<>();
    }
    public void addProduct(Product item)
    {
        for (Product stock : stock)
        {
            if (stock.getID() ==  item.getID()){}
        
        }
        stock.add(item);
    }
    public void delivery(int id, int amount)
    {
        for (Product stock : stock)
        {
            if (stock.getID()==id)
            {
                stock.increaseQuantity(amount);
            }
        }
    }
    public void printLowStockProducts(int standard)
    {
        for (Product stock : stock)
        {
            if (stock.getQuantity() <= standard)
            {
                stock.toString();
            }
        }
    }
    public Product findProduct(int id)
    {
        for (Product stock : stock)
        {
            if (stock.getID()==id)
            {
                return stock;
            }
        }
        return null;
    }
    public Product findProductByName(String name)
    {
        for (Product stock : stock)
        {
            if (stock.getName().equals(name)){
                return stock;
            }
        }
        return null;
    }
    public int numberInStock(int id)
    {
        for (Product stock : stock)
        {
            if (stock.getID()==id)
            {
                return stock.getQuantity();
            }
        }
        return 0;
    }
    public void printProductDetails()
    {
        for (Product stock : stock)
        {
            System.out.println(stock.toString());
        }
    }
    public Product sell(int id){
        for (Product stock : stock)
        {
            if (stock.getID()==id)
            {
               stock.sellOne();
               return stock;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        StockManager manager = new StockManager();
        //加入新的元素
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
        //打印所有元素
        manager.printProductDetails();
        //增加数量
        manager.delivery(132, 5);
        manager.delivery(37, 5);
        //再次打印所有元素
        manager.printProductDetails();
        //打印数量小于2的产品
        manager.printLowStockProducts(2);
        //根据id找产品
        System.out.println(manager.findProduct(37));
        //根据名字找产品
        System.out.println(manager.findProductByName("Clock Radio"));
        //卖一个产品
        System.out.println(manager.sell(132));
        System.out.println(manager.sell(23));
    }
}
