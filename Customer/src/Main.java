public class Main {
    public static void main(String[] args)
    {
        Customer customer = new Customer("Tim",1000,"time@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer customer1 = new Customer("Ioan","ioanilie@yahoo.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmailAddress());

        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());



    }
}
