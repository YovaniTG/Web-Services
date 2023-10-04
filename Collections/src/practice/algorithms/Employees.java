package practice.algorithms;

public class Employees {

    private int id;
    private int salary;

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    public Employees(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
