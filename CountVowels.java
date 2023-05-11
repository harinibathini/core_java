import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountVowels {
    public static void main(String[] args) {
//        int counta=0,counte=0,counti=0,counto=0,countu=0;
//        int count = 0;
//        String name = "coditas solutions";
//        Map<String,Integer> map = new HashMap<>();
//        for(int i=0;i<name.length();i++){
//            if(name.charAt(i) == 'a'){
//              counta++;
//            }
//            if(name.charAt(i) == 'e'){
//                counte++;
//            }
//            if(name.charAt(i) == 'i'){
//                counti++;
//            }
//            if(name.charAt(i) == 'o'){
//                counto++;
//            }
//            if(name.charAt(i) == 'u'){
//                countu++;
//            }
//        }
//        map.put("a",counta);
//        map.put("e",counte);
//        map.put("i",counti);
//        map.put("o",counto);
//        map.put("u",countu);
//        System.out.println(map);

        String str = "coditas solutions";
        char arr[] = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else {
                    map.put(arr[i],1);
                }
            }
        }

        System.out.println(map);
    }
}
