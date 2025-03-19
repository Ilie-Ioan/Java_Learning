import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)", name.toUpperCase(), distance);
    }
};


public class Main {
    public static void main(String[] args) {

        LinkedList<Place>  placesToVisit = new LinkedList<>();
        Place Vaslui = new Place("Barlad",53);
        addPlaces(placesToVisit,Vaslui);
        addPlaces(placesToVisit,new Place("Milano",2450));
        addPlaces(placesToVisit,new Place("Iasi",87));
        addPlaces(placesToVisit,new Place("Bucuresti",632));
        addPlaces(placesToVisit,new Place("Cluj",250));
        addPlaces(placesToVisit,new Place("Atena",1887));
        addPlaces(placesToVisit,new Place("Timisoara",887));

        placesToVisit.addFirst(new Place("Vaslui",0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner s = new Scanner(System.in);
        boolean quitLoop = false;
        boolean foward = true;

        printMenu();
        while (!quitLoop) {
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                foward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : " + iterator.previous());
                foward = false;
            }
            System.out.print("Enter Value : ");
            String menuItem = s.nextLine().toUpperCase().substring(0,1);
            switch (menuItem){
                case "F" :
                    System.out.println("User wants to go foward");
                    if(!foward){
                        foward = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("--> NextStop: " + iterator.next());
                    }

                    break;
                case "B" :
                    System.out.println("User wants to go backwards");
                    if(foward){
                        foward = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("--> PreviousStop: " + iterator.previous());
                    }
                    break;
                case "M" :
                    System.out.println("User wants to print the menu");
                    printMenu();
                    break;
                case "L" :
                    System.out.println("User wants to see the places to visit");
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }


        }

    }

    private static void addPlaces(LinkedList<Place> list, Place place) {

        if(list.contains(place)) {
            System.out.println("Found duplicate: "  + place);
            return;
        }

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: "  + place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }

            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

}