package week2_core_java_practice;


//Constructor name should be the same as class name with ()
//no return type is allowed
//

public class Address {
    int pno,fno,pincode;
    String hname,area,city,state,country;

    public Address(){
        System.out.println("Default address constructor");
    }
    public Address(int pno, int fno, int pincode, String hname, String area, String city, String state, String country) {
        this.pno = pno;
        this.fno = fno;
        this.pincode = pincode;
        this.hname = hname;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pno=" + pno +
                ", fno=" + fno +
                ", pincode=" + pincode +
                ", hname='" + hname + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    //
}
