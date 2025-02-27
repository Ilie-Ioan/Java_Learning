public class Main {

    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i)
                    {
                        case 1 -> "Mary";
                        case 2 -> "Teo";
                        case 3 -> "Alin";
                        case 4-> "Ioan";
                        case 5 -> "Lisa";
                        default -> "Anonymus";
                    },
                    "01.03.2002",
                    "Java Masterclass"
                    );
            System.out.println(s);

        }

    }
}
