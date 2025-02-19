class Product
{
    int pcode;
    int price;
    String pname;

    Product(int pcode,String pname,int price)
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    void display()
    {
        System.out.println("Product code:"+this.pcode);
        System.out.println("Product Name:"+this.pname);
        System.out.println("Product Price:$"+this.price);
    }
    public static void main(String[]args)
    {
        Product p1=new Product(101,"Laptop",75000);
        Product p2=new Product(102,"Smartphone",5000);
        Product p3=new Product(103,"Tablet",3000);
        System.out.println("Product Details:");
        p1.display();
        p2.display();
        p3.display();
        Product lowest;
        if(p1.price<p2.price&&p1.price<p3.price)
           lowest=p1;
        else if(p2.price<p3.price)
           lowest=p2;
        else
           lowest=p3;
    System.out.println("Product with the lowest price:");
    lowest.display();
    }
}