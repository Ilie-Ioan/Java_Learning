import java.util.Random;

public class Student {

    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ioan", "Teodora", "Alin", "Mircea"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student(){

        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(4)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2020,2025);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }
}
