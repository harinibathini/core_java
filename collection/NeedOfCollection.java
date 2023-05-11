package collection;

public class NeedOfCollection {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int[] arr = new int[10000];
        //array limitations
        //fixed size
        //array can hold only homogeneous data elements
        //readymade API support is not avvailable in arrays

        Students[] students = new Students[10];
        students[0] = new Students();
        students[1] = new Students();
       // students[2] = new Book();

        Object[] objects = new Object[10];
        objects[0] = new Students();
        objects[1] = new Students();
        objects[2] = new Book();
    }
}
class Students{

}
class Book{

}
