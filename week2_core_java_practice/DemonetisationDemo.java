package week2_core_java_practice;

import java.util.*;
class NoOfNotes{
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();

    int count = 0,count1=0;
    int count2=0,count3=0,count4=0;

    public void noOfNotes(){
        while(value>=100){
            int arr[]={2000,500,200,100};
            for(int i=0;i<arr.length;i++){
                while(value>=arr[i]){
                    count=count+(value/arr[i]);
                    value=value%arr[i];
                }
               // count=count+count1;
            }
        }
        System.out.println("minimum no of notes required is: "+count);
    }
        /*
        while(value>=2000){
            count1=value/2000;
            value=value%2000;
            System.out.println("count1: "+count1+"   "+"new value: "+value);
        }
        while(value>=500){
            count2=value/500;
            value=value%500;
            System.out.println("count2: "+count2+"   "+"new value: "+value);

        }
        while(value>=200){
            count3=value/200;
            value=value%200;
            System.out.println("count3: "+count3+"   "+"new value: "+value);
        }
        while(value>=100){
            count4=value/100;
            value=value%100;
            System.out.println("count4: "+count4+"   "+"new value: "+value);
        }
        count=count1+count2+count3+count4;
        System.out.println("minimum no of notes required is: "+count);
    }*/

}
public class DemonetisationDemo {
    public static void main(String[] args) {
        System.out.println("Enter the required amount: ");
        NoOfNotes notes = new NoOfNotes();
        notes.noOfNotes();
    }
}

/*
Output ---
Enter the required amount:
5700
count1: 2   new value: 1700
count2: 3   new value: 200
count3: 1   new value: 0
minimum no of notes required is: 6
 */
