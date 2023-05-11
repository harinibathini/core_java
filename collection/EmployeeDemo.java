package collection;

import java.util.Objects;

public class EmployeeDemo {
    String name;
    String dept;
    int age;
    int id;
    public EmployeeDemo(String name,String dept,int age,int id){
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDemo that = (EmployeeDemo) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
