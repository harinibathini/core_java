package week2_core_java_practice.customException;

public class AgeNotValidException extends RuntimeException {

        AgeNotValidException(){
            System.out.println("This is default AgeNotValidException...");
        }
        AgeNotValidException(String s){
            System.out.println("You are a minor:: "+s);
        }
        AgeNotValidException(Throwable cause){
            System.out.println("Throwable cause of AgeNotValidException...");
        }
        AgeNotValidException(Throwable cause, String s){
            System.out.println("Throwable cause with String of AgeNotValidException...");
        }
    }
