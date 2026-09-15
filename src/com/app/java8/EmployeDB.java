package com.app.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeDB {
    public static List<Employee> getEmployees()
    {
        return Arrays.asList(
                new Employee(1,"sonu",100000.0, List.of("565656"),"Engineering","Bangalore"),
                new Employee(2,"atul",15000.0, List.of("5651656","7984735131"),"HR","Delhi"),
                new Employee(3,"vivaan",50000.0, List.of("565656","434131"),"FINANCE","Bangalore"),
                new Employee(4,"ajay",10800.0, List.of("56556656"),"PUBLIC SECTOR","Noida"),
                new Employee(5,"SP",30000.0, List.of("5646897"),"MANAGEMENT","Bangalore"),
                new Employee(6,"sahil",8000.0, List.of("895265"),"Engineering","Jaipur"),
                new Employee(7,"jaydeep",82000.0, List.of("798743","455649"),"Engineering","Bangalore"),
                new Employee(8,"manish",10900.0, List.of("5665656"),"Technician","Hyderabad"),
                new Employee(9,"pankal",18000.0, List.of("5654656"),"Engineering","Bangalore"),
                new Employee(10,"bhushan",10070.0, List.of("99556"),"Mechnical","Delhi"),
                new Employee(11,"anu",10300.0, List.of("5656576"),"Non Tech","Bangalore"),
                new Employee(12,"anshika",500000.0, List.of("5656000656","654649"),"Education","Uttar Pradesh"),
                new Employee(13,"priya",89000.0, List.of("565545656","4987987"),"Agriculture","Uttar Pradesh"),
                new Employee(14,"rahul",174000.0, List.of("56565456","465464"),"Public Sector","Jaipur")



        );
    }
}
