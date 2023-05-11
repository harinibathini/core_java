package week2_core_java_practice;


class EmpEncapsulation{
    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int eid) {
      empId = eid;
    }
}
public class EncapsulationPractice {
    public static void main(String[] args) {
        EmpEncapsulation employee = new EmpEncapsulation();
        employee.setEmpId(5497);
        System.out.println(employee.getEmpId());
    }
}
