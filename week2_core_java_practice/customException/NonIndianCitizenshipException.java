package week2_core_java_practice.customException;

public class NonIndianCitizenshipException extends Exception{
    NonIndianCitizenshipException(){
        System.out.println("This is default NonIndiancitizenshipException...");
    }
    NonIndianCitizenshipException(String s){
        System.out.println("You are not Indian citizen :: "+s);
    }
    NonIndianCitizenshipException(Throwable cause){
        System.out.println("Throwable cause of NonIndiancitizenshipException...");
    }
    NonIndianCitizenshipException(Throwable cause, String s){
        System.out.println("Throwable cause with String of NonIndiancitizenshipException...");
    }
}
