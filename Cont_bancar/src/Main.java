public class Main {

    public static void main(String[] args)
    {
        Bank_Account myAccount = new Bank_Account();

        myAccount.setNumber(12345);
        myAccount.setBalance(300);
        myAccount.setEmail("ionutilie2002@gmail.com");
        myAccount.setCustomer_Name("Ioan Ilie");
        myAccount.setPhone_number(" (0773) 980 904");


        myAccount.withdrawFunds(100.0);
        myAccount.depositFunds(250);
        myAccount.withdrawFunds(50);

        myAccount.withdrawFunds(200);

        myAccount.depositFunds( 100);
        myAccount.withdrawFunds(45.55);
        myAccount.withdrawFunds(54.45);
    }
}
