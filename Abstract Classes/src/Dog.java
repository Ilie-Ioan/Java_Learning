public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(getExplicitTtpe() + " walking");
        } else {
            System.out.println(getExplicitTtpe() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitTtpe() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("Howling! ");
        }
        else {
            System.out.println("Woof! ");
        }
    }


}
