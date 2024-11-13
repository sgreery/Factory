public class Factory {
    //made a variable of type string

    //made variable of int

    //made a variable of type boolean (true false)
    boolean inUse;
    String nameOfFactory;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Factory();
    }

    public Factory () {
        inUse = false;
        Pumpkin spookly = new Pumpkin("oval", "pink", true, 30);
        spookly.printInfo();
        System.out.println(" ");
        Pumpkin Kinpump = new Pumpkin("mound", "black", true, 20);
        System.out.println("Kinpump");
        Kinpump.printInfo();
        System.out.println(" ");
        for (int x=0; x<10; x=x+1) {
            System.out.println(" ");
            Pumpkin Lefifi = new Pumpkin();
            Lefifi.printInfo();
        }
        System.out.println(" ");
        System.out.println("Factory is bought by cookie factory");
        System.out.println("Now the factory makes cookies and pumpkins");
        nameOfFactory = "LeFactory";
        System.out.println("Kai");
        Cookie Kai = new Cookie();
        Kai.printInfo();
        System.out.println(" ");
        System.out.println("Left");
        Cookie Left = new Cookie(20, "Oatmeal Raisin", 3, "Circle");
        Left.printInfo();
        for (int x=0; x<10; x=x+1) {
            System.out.println(" ");
            Cookie Kat = new Cookie();
            Kat.printInfo();
        }
    }
}