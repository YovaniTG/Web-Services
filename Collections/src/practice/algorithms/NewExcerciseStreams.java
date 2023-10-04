package practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewExcerciseStreams {

    //given an employee list, sort employees based on their salaries in desc order.
    // fetch top 3 salaries employees details
    // fetch all employees having salary less than 3rd highest salary?
    // find sum all elements in an arrays using java 8 ? input: {2,3,4,5,7}
    public static void main(String[] args) {
            List<Employees> employeesList  = new ArrayList<>();
            employeesList.add(new Employees(1,500));
            employeesList.add(new Employees(2,1000));
            employeesList.add(new Employees(3,1500));
            employeesList.add(new Employees(4,2000));
            employeesList.add(new Employees(5,2500));
            employeesList.add(new Employees(6,3000));
            employeesList.add(new Employees(7,3500));

            int [] numArray = {2,3,4,5,7};

       int resultArray = Arrays.stream(numArray).reduce(0,Integer::sum);

          List<Employees> result =  employeesList.stream().sorted(((o1, o2) -> o2.getSalary() - o1.getSalary()))
                  .skip(3)
                  .collect(Collectors.toList());

          Employees newResult = employeesList.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
                          .findFirst().get();

        System.out.println(newResult);


    }
}
