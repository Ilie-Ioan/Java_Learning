import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 13;
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i<studentCount; i++){
            students.add(new Student());
        }

        students.add(new LPAStudent());
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i<studentCount; i++){
            lpaStudents.add(new LPAStudent());
        }

        printMoreList(lpaStudents);


    }

    public static void printMoreList(List<? extends  Student> students){

        for(var student : students){

            System.out.println(student);
        }
        System.out.println();
    }


    public static void testList(List<String> list){

        for (var element : list){
            System.out.println("String: " + element.toUpperCase());
        }
    }

    public static void testList(List<Integer> list){

        for (var element : list){
            System.out.println("Integer: " + element.floatValue());
        }
    }
//    public static <T extends  Student> void printList(List<T> students){
//
//        for(var student : students){
//
//            System.out.println(student);
//        }
//        System.out.println();
//    }
}
