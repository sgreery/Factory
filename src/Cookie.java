public class Cookie {
    int size;
    int price;
    String type;
    String shape;
    public Cookie(Integer cSize, String cType, Integer cPrice, String cShape) {
        System.out.println("making a cookie");
        size = cSize;
        type = cType;
        price = cPrice;
        shape = cShape;
    }
    public Cookie(){
        size = (int) (Math.random() * 100)+0;
        type = "Double Chunk Chocolate Cookie";
        price = 2;
        shape = "Square";
    }
    public void printInfo(){
        System.out.println(type);
        System.out.println("size: " +  size);
        System.out.println("price: $" + price);
        System.out.println("shape: " + shape);
        int yearFounded;
        String nameOfFactory;
        yearFounded = 1914;
        nameOfFactory = "LeFactory";
        System.out.println(nameOfFactory + " " + yearFounded);

    }
}
