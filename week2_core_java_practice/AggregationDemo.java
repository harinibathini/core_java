package week2_core_java_practice;

class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee details are -->" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address ;
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        Address address1 = new Address(12,101,411030,"Shakuntala","sunita","pune","Maharastra","India");
        Employee employee = new Employee(1,"Coditas",address1);
        System.out.println(employee);
        System.out.println(address1);
    }

}
