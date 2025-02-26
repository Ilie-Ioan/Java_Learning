public class Bank_Account {

    private  int number;
    private  double balance;
    private  String Customer_Name;
    private  String email;
    private String phone_number;

    public Bank_Account(int number, double balance, String customer_Name, String email, String phone_number) {
        this.number = number;
        this.balance = balance;
        Customer_Name = customer_Name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public Bank_Account() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void depositFunds(double depositAmount)
    {
        balance+=depositAmount;
        System.out.println("Deposit of $ " + depositAmount + " made.Your balance now is $" + this.balance);
    }

    public void withdrawFunds(double withdrawAmount)
    {
        if(balance - withdrawAmount < 0)
        {
            System.out.println("You cand withdraw that amount. You have $" + balance);
        }
        else
        {
            balance -= withdrawAmount;
            System.out.println("Withdraw of $ " + withdrawAmount + " made.Your balance now is $" + this.balance);
        }

    }

}
