package com.dietelProject.chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ProcessingEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);

//        list.stream().forEach(System.out::println);

        Predicate<Employee> employeeSalaryBetween$4000And$6000 = e -> (e.getSalary() >=4000 && e.getSalary() <=6000);

        list.stream()
                .filter(employeeSalaryBetween$4000And$6000)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        Optional<Employee> present = list.stream().filter(employeeSalaryBetween$4000And$6000).findFirst();
        boolean yes = present.isPresent();
        if(yes){
            System.out.println(present.get());
        }

        System.out.println("Finding the first employee that has salary range between 4000 && 6000");
        System.out.println(list.stream().filter(employeeSalaryBetween$4000And$6000).findFirst().get());
    }

}
