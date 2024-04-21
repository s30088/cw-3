import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    private List<Technology> technologyList = new ArrayList<>();

    public Developer(String name, String lastName, String address, String email, Integer yearOfEmployment, Long pesel) {
        super(name, lastName, address, email, yearOfEmployment, pesel);
    }

    public void addTechnology(Technology technology) {
        this.technologyList.add(technology);
    }
    @Override
    public Double calculateSalary() {
        return getSalary() +  technologyList.stream().mapToDouble(Technology::getBonus).sum();
    }
}
