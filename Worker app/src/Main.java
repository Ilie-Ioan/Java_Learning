public class Main {

    public static void main(String[] args)
    {
        Employee Ioan  = new Employee("Ioan","01/06/2002","03/04/2025");
        System.out.println(Ioan);
        System.out.println("Age = " + Ioan.getAge());
        System.out.println("Pay = " + Ioan.collectPay());

        SalariedEmployee Teodora = new SalariedEmployee("Teodora","05/16/1995", "01/03/2025",35000);
        System.out.println(Teodora);
        System.out.println("Age = " + Teodora.getAge());
        System.out.println("Teodora paycheck is = $" +  Teodora.collectPay());
        Teodora.retire();
        System.out.println("Teodora pension check  is = $" +  Teodora.collectPay());

        HourlyEmployee Alin = new HourlyEmployee("Alin","06/08/1991","01/07/2020",20);
        System.out.println(Alin);
        System.out.println("Age = " + Alin.getAge());
        System.out.println("Alin paycheck is = $" +  Alin.collectPay());
        System.out.println("Alin holiday paycheck is = $" +  Alin.getDoublePay());








    }
}
