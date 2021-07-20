package hellodemo;

public class hello {
    private int id;
    private  String name;
    private  double price;
    private  int number;
    private  double money;
    private  String publish;
    public hello(){
        super();

    }

    public hello(int id, String name, double price, int number, double money, String publish) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.money = money;
        this.publish = publish;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return
                "图书编号：" + id +
                "图书名称：" + name +
                "单价：" + price +
                "库存：" + number +
                "总价值：" + money +
                "出版社：" + publish
                ;
    }
}



