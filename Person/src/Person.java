public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen()
    {
        if(this.age > 12 && this.age < 20)
            return true;
        return false;
    }

    public String getFullName()
    {
        if(firstName.isEmpty())
        {
            return lastName;
        }
        else if (lastName.isEmpty())
        {
            return  firstName;

        } else if (firstName.isEmpty() && lastName.isEmpty() )
        {
            return "";
        }

        return firstName + " " + lastName;

    }
}
