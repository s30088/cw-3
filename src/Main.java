import java.time.LocalDate;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", 2020, 123456789L);
        Technology t = new Technology("Java", 800.0);
        dev.addTechnology(t);
        employees.add(dev);
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", " jane @smith.com ", 2021, 987654321L);
        tester.addTestType("UI/UX");
        tester.addTestType("Automatic");
        employees.add(tester);
        Manager manager = new Manager("Bob", "Johnson",
                "Chicago", "bob@johnson.com", 2019, 1122334455L);
        Goal g = new Goal("Implementing FB login", LocalDate.of(2024, 4, 15), 1000.0);
        manager.addGoals(g);
        employees.add(manager);
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
            System.out.println("Employe with name: " + employee.getClass() + " have to be paid " + employee.calculateSalary() + " USD");
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    }
}