import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes = new ArrayList<>();

    public Tester(String name, String lastName, String address, String email, Integer yearOfEmployment, Long pesel) {
        super(name, lastName, address, email, yearOfEmployment, pesel);
    }

    public void addTestType(String testType) {
        this.testTypes.add(testType);
    }

    @Override
    public Double calculateSalary() {
        return getSalary() + (testTypes.size() * 300);
    }
}
