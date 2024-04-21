import java.time.LocalDate;

public class Goal {
    private String name;
    private LocalDate date;
    private Double bonus;

    public Goal(String name, LocalDate date, Double bonus) {
        this.name = name;
        this.date = date;
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public LocalDate getDate() {
        return date;
    }
}
