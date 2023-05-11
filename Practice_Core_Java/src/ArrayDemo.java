class OneDArray{
public void displayData(){
    //way1
    int rollNumber[]; //declaration
    rollNumber = new int[5]; //definition

    //way2
    String name[]=new String[5]; //definition with decalration

    //way3
    String city[] ={"Pune","Mumbai","Delhi","Kanpur"};

    //way to print data:
    for(int i=0;i<city.length;i++){
        System.out.println(city[i]);
}
    //way2
    name[0]="Shreya";
    name[1]="Krati";
    name[2]="Aryaman";
    name[3]="Yash";
    name[4]="Mrunmayee";

    for(String newName:name){
        System.out.println("Name of students::"+newName);
    }

}
}
class TwoDArray{
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    public void displayData(){
        for(int i=0;i<=a.length;i++){
            for(int j=0;j<=a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class JaggedArrayDemo{
   // int a[][]=new int[3][3];
    int a[][]={{1,2},{3,4,5,6},{7,8,9}};
    public void displayData(){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Array Demo");
       OneDArray obj=new OneDArray();
       obj.displayData();
       JaggedArrayDemo jaggedArray=new JaggedArrayDemo();
       jaggedArray.displayData();
    }
}
