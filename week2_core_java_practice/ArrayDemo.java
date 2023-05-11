package week2_core_java_practice;
import java.util.*;
class ArrayOrder{
    int d[];
    //d={6,7,1};
    //d={4,2,3,2,1};
    int[] b =new int[5];
    int a[]={2,1,2,3,1};
    int c[]=new int[4];
    int aa[][]=new int[3][3];

    public void arrayShow(){
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public void arrayDesc(){
        for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                   // int b=a[i];
                   // int b = a[i];
                    //a[i]=a[j];
                    //a[j]=b;
                    System.out.println(a[i]);

                }

            }


            //System.out.println(a[i]);
        }
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayOrder array = new ArrayOrder();
        array.arrayShow();
        array.arrayDesc();

    }
}
