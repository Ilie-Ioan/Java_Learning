import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); //preferabil aceasta metoda
        Integer deprecatedBoxing = new Integer(15);//nu mai e folosita din jdk 9
        int unboxedInt = boxedInt.intValue();// nu este necesar

        //Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));


    }

    private static Double getDoubleObject(){

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){

        return 100.00;
    }
}