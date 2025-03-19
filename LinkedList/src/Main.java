import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0,"Canberra");

        System.out.println(placeToVisit);

        addMoreElementes(placeToVisit);
        System.out.println(placeToVisit);

//        removeMoreElementes(placeToVisit);
//        System.out.println(placeToVisit);

        gettingElements(placeToVisit);
        printItinerary(placeToVisit);

    }

    private static void addMoreElementes(LinkedList<String> list)
    {
        list.addFirst("Vaslui");
        list.addLast("Bucuresti");

        //Queue methods
        list.offer("Cluj");
        list.offerFirst("Sibiu");
        list.offerLast("Kentucky");

        //Stack Methods
        list.push("Jaaaaaaaponia");

    }

    private static  void removeMoreElementes(LinkedList<String> list)
    {
        list.remove(4);
        list.remove("Bucuresti");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");
        //Queue/Deque poll metothds

        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Jaaaaaaaponia");
        list.push("Vaslui");
        list.push("HEHE");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static  void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("Retrieved First Element = " + list.getFirst());
        System.out.println("Retrieved Last Element = " + list.getLast());

        System.out.println("Vaslui is at position: "  + list.indexOf("Vaslui"));
        System.out.println("Kentucky is at position: " + list.lastIndexOf("Kentucky"));
        //Queue retrival methods
        System.out.println("Element from element() = " + list.element());
        //Stack retrival methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }
    private static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;

        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list) {

        //Using for loop
        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i< list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }


}