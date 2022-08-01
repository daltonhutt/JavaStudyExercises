package com.ust.javapractice.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TheStreamsMain {

    public static void main(String[] args) throws NoSuchMethodException {
        Stream.of(employees); //both work,  same thing
        employees.stream();

        //foreach terminal operation
        employees.stream().forEach(employee -> System.out.println(employee));

        //map, intermediary operation returns a list of employees with a 10% pay increase
        //collect
        List<Employee> increasedSal = employees.stream().map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10, employee.getProjects())).collect(Collectors.toList());
        System.out.println(increasedSal);

        //filter increased salary on salaries over 5000
        //find first
        List<Employee> FilterEmployee = employees.stream().filter(employee -> employee.getSalary() > 5000.0).map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10, employee.getProjects())).collect(Collectors.toList());
        System.out.println(FilterEmployee);
        Employee firstEmployee = employees.stream().filter(employee -> employee.getSalary() > 5000.0).map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10, employee.getProjects())).findFirst().orElse(null);
        System.out.println(firstEmployee);


        //flatmap
        String projects = employees.stream().map(employee -> employee.getProjects()).flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
        System.out.println(projects);

        //Short Circuit operations
        List<Employee> shortCircuit = employees.stream().skip(1)
                .limit(1)
                .collect(Collectors.toList());

        //Finite Data, limiting infinite data
        Stream.generate(Math::random).limit(5).forEach(value -> System.out.println(value));

        //sorting
        List<Employee> sortedEmployees = employees.stream().sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName())).collect(Collectors.toList());
        System.out.println(sortedEmployees);

        // min or max data
        employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchMethodException::new);

        //reduce
        Double totalSal = employees.stream().map(employee -> employee.getSalary()).reduce(0.0, Double::sum);
        System.out.println(totalSal);
    }



    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee("Dalton", "Hutt", 5000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Daltona", "Hunt", 4000.0, List.of("Project 1", "Project 3")));
        employees.add(new Employee("Daltono", "Huft", 5100.0, List.of("Project 3", "Project 4")));

    }
}
