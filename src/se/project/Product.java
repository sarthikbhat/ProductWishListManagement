
package se.project;

public class Product {
  private final int id;
    private final String name;
    private final float price;
    private final byte[] picture;
    
    public Product(int pid, String pname, float pprice, byte[] pimg)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.picture = pimg;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    

}
