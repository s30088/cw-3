
public class Employee {

    private String name;
    private String lastName;
    private String address;
    private String email;
    private Integer yearOfEmployment;
    private Long pesel;
    private Double salary;

    public Employee(String name, String lastName, String address, String email, Integer yearOfEmployment, Long pesel) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.yearOfEmployment = yearOfEmployment;
        this.pesel = pesel;
        this.salary = 3000.0;
    }

    public Double calculateSalary () {
        return salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
