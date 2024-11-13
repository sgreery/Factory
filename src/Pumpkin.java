public class Pumpkin {
    //variables big, color, shape, halloween pumpkin
    int size;
    String color;
    String shape;
    boolean isHalloween;

    public Pumpkin(String pShape, String pColor, Boolean pHalloween, Integer pSize){
        System.out.println("making a pumpkin");
        color = pColor;
        shape = pShape;
        size = pSize;
        isHalloween = pHalloween;
    }
    public Pumpkin(){
        size = (int) (Math.random() * 100)+0;
        color = "blue";
        if (size >50){
            isHalloween = true;
        }
        else {
            isHalloween = false;
        }
        shape = "Lump";
    }

    public void printInfo(){
        System.out.println(color);
        System.out.println("size: " +  size);
        System.out.println("shape: " + shape);
        int yearFounded;
        String nameOfFactory;
        yearFounded = 1914;
        nameOfFactory = "Pumpkin Factory";
        System.out.println(nameOfFactory + " " + yearFounded);
        if(isHalloween){
            System.out.println("I will be used for halloween!");
        }
        else{
            System.out.println("I am a regular pumpkin");
        }

    }

}
