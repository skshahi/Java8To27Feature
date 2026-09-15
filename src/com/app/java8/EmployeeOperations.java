package com.app.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EmployeeOperations {

    static List<Employee> employeeList= EmployeDB.getEmployees();

    public static void employeeOperations()
    {
        long count = employeeList.stream().count();
        System.out.println("Total Employee:"+count);
        //list out total department
        List<String> department = employeeList.stream().map(Employee::getDept).distinct().toList();
        System.out.println(department);
        //contact list
        List<List<String>> contactList = employeeList.stream().map(Employee::getContactList).toList();
        System.out.println(contactList);

        //sort employee name reverse order
        List<String> empSortedByName = employeeList.stream().sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder())).map(Employee::getName).toList();
        System.out.println(empSortedByName);

        //get employee whose salary is max
        Employee employee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee);

        //group employee by dept

        Map<String, List<Employee>> groupByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(groupByDept);
        //Second highest in each dept

        Map<String, Optional<Employee>> secondHighestSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(Collectors.toList(),
                employees -> employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                        .skip(1).findFirst()
        )));

        System.out.println(secondHighestSalary);

        Map<String, String> empToMap = employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getLocation));
        System.out.println(empToMap);

        ///
        Map<String, Double> avgSalaryByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);

        DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream().mapToDouble(Employee::getSalary).summaryStatistics();

        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics);

    }

    static void main() {
        employeeOperations();

    }
}
