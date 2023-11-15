package com.cg.a4;
import java.util.Arrays;
import java.util.Comparator;
	 class Emp {
        String name;
        int salary;
	 public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
        }
	 public String getName() {
        return name;
        }
	  public int getSalary() {
        return salary;
       }
@Override
public String toString() {
           return "Employee{" +
            "name='" + name + '\'' + ", salary=" + salary +'}';
}
	 public static void main(String[] args) {
           Emp[] employee = {
            new Emp("Keerthi", 80000),
            new Emp("Priya", 60000),
            new Emp("Krishna", 40000),
            new Emp("Poojitha", 20000)

	        };
	 Arrays.sort(employee, Comparator.comparingInt(Emp::getSalary));
	 System.out.println(Arrays.toString(employee));

	    }

	}
	 

