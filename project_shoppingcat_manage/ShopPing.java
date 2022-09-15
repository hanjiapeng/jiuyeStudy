package project_shoppingcat_manage;

/* 编号，名称，单价，数量，访问器，重写toStirng()方法 **/
public class ShopPing {
    private int id;
    private String name;
    private double price;
    private int num;

    public ShopPing(){}

    public ShopPing(int id, String name, double price, int num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return id + "\t\t\t" + name + "\t\t\t" + price + "\t\t\t" + num;
    }
}
