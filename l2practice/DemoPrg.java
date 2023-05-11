package l2practice;

import java.util.Comparator;
import java.util.HashMap;

public class DemoPrg {
    public static void main(String[] args) {
        String str = "India is my Country.I love my India";
        String[] arr = str.split("[ .]");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(hashMap.containsKey(arr[i])){
               hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);
    }
}
