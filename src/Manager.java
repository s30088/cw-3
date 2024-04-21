import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Goal> listOfGoals = new ArrayList<>();

    public Manager(String name, String lastName, String address, String email, Integer yearOfEmployment, Long pesel) {
        super(name, lastName, address, email, yearOfEmployment, pesel);
    }

    public void addGoals(Goal goal) {
        this.listOfGoals.add(goal);
    }

    @Override
    public Double calculateSalary() {
        var finishedGoals = listOfGoals.stream().filter(goal -> goal.getDate().getMonth() == LocalDate.now().getMonth()).toList();
        return getSalary() + finishedGoals.stream().mapToDouble(Goal::getBonus).sum();
    }
}
