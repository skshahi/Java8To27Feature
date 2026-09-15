package com.app.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    }

    static void main() {
        employeeOperations();

    }
}
