package serialization;

import java.io.Serializable;

// Serialization?
//primitives - object(wrapper classes)
//streams - object
// 1)implement serializable Interface
// 2)create new class -other file -for serializaytion process
// 3)create new class -other file -for de-serializaytion process
public class Employee implements Serializable {
    String name,city;
    int id;
    float salary;
    public Employee(){
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;

    }
}
