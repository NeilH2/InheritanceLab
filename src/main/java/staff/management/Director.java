package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(double budget, String deptName, String name, String niNumber, double salary) {
        super(deptName, name, niNumber, salary);
        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }
}
