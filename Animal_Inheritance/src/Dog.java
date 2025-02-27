public class Dog extends  Animal{


    private String earShape;
    private String tailShape;

    public Dog()
    {
        super("Mutt","Big",50);
    }

    public Dog(String type, double weight)
    {
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
       super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "Slow")
        {
            walk();
            wagTail();
        }
        else
        {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void MakeNoise() {
        super.MakeNoise();
        if(type == "Wolf") {
            System.out.println("Woof");
        }
        bark();
        System.out.println();
    }

    private void bark()
    {
        System.out.println("Woof");
    }

    private void run()
    {
        System.out.println("Dog Run");
    }

    private void  walk()
    {
        System.out.println("Dog walking");
    }

    private void wagTail()
    {
        System.out.println("Tail Wagging");
    }



}
