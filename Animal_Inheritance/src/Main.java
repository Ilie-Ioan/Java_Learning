public class Main {

    public static void main(String[] args)
    {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"Fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"Fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swoimmer");
        doAnimalStuff(retriever,"Slow");

        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"Slow");

        Fish fish = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(fish,"Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed)
    {
        animal.MakeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }

}
