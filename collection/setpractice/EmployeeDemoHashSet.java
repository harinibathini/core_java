package collection.setpractice;

import collection.EmployeeDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDemoHashSet {

    public static void main(String[] args) {
        Set<EmployeeDemo> emp = new HashSet<>();
        emp.add(new EmployeeDemo("Harini", "it", 22, 3));
        emp.add(new EmployeeDemo("Anuj","it",23,1));
        emp.add(new EmployeeDemo("KRATI","IT",22,2  ));
        emp.add(new EmployeeDemo("Harini", "it", 22, 3));
//        for(EmployeeDemo e:emp) {
//            System.out.println(e);
//        }
       System.out.println(emp);
    }
}
