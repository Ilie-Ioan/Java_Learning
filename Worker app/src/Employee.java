public class Employee extends  Worker{
     private long employeeID;
     private String hireDate;
     private static int employeeNoo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeID = Employee.employeeNoo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
