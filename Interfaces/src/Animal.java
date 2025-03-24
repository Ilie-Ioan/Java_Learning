interface FlightEnabled{

   double MILES_TO_KM = 1.60934;
   double KM_TO_MILES = 0.621371;

    public abstract void takeOff();

    abstract void land();

    void fly();
}

interface Trackabable{

    void track();

}

public abstract  class Animal {

    public abstract void move();
}
