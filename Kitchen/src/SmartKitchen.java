public class SmartKitchen {

    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag)
    {
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork()
    {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}

class CoffeeMaker{
    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee()
    {
        if (hasWorkToDo)
        {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes()
    {
        if (hasWorkToDo)
        {
            System.out.println("Wash the dishes");
            hasWorkToDo = false;
        }
    }


}

class Refrigerator{
    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood()
    {
        if (hasWorkToDo)
        {
            System.out.println("Order food");
            hasWorkToDo = false;
        }
    }


}
