package practice.algorithms;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private int salary;

    public Employee(int id, int salary) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
public class Stream {

    public static void main(String[] args) {
        List<Employees> employeeList = new ArrayList<>();

        employeeList.add(new Employees(1,500));
        employeeList.add(new Employees(2,600));
        employeeList.add(new Employees(3,1500));

       List<Employees> results = employeeList.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
                .collect(Collectors.toList());

        System.out.println(results);
    }




}
