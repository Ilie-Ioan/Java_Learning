public class Main {
    public static void main(String[] args) {

        SearchTree tree = new SearchTree(new Node("50"));

        tree.addItem(new Node("30"));
        tree.addItem(new Node("70"));
        tree.addItem(new Node("20"));
        tree.addItem(new Node("40"));
        tree.addItem(new Node("60"));
        tree.addItem(new Node("80"));

        System.out.println("Traversing tree:");
        tree.traverse(tree.getRoot());

        System.out.println("\nRemoving 70");
        tree.removeItem(new Node("70"));

        System.out.println("Traversing tree after removal:");
        tree.traverse(tree.getRoot());

        System.out.println("\nRemoving 30");
        tree.removeItem(new Node("30"));

        System.out.println("Traversing tree after removal:");
        tree.traverse(tree.getRoot());

        System.out.println("\nRemoving 50");
        tree.removeItem(new Node("50"));

        System.out.println("Traversing tree after removal:");
        tree.traverse(tree.getRoot());
    }
}