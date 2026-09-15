package com.app.java8;

import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private List<String> contactList;
    private  String dept;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getContactList() {
        return contactList;
    }

    public void setContactList(List<String> contactList) {
        this.contactList = contactList;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(int id, String name, double salary, List<String> contactList, String dept, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.contactList = contactList;
        this.dept = dept;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(contactList, employee.contactList) && Objects.equals(dept, employee.dept) && Objects.equals(location, employee.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, contactList, dept, location);
    }

    @Override
    public String toString() {

        return "{ \"id=%s, name=%s, salary=%s, contactList=%s, dept=%s, location=%s\" }"
                .formatted(id, name, salary, contactList, dept, location);

    }
}
