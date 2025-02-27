public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "Small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles()
    {
        System.out.println("Muscles moving");
    }

    private  void moveBackFin()
    {
        System.out.println("Backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "Fast")
        {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
