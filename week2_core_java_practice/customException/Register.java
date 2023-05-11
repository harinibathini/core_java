package week2_core_java_practice.customException;

public class Register {
    public void checkCriteria(String citizenship,int age){
        try {
            if (age < 18)
                throw new AgeNotValidException("You are  not eligible for voting...");
        }
        catch(AgeNotValidException e){
            System.out.println();
        }
        try {
            if (!citizenship.equalsIgnoreCase("Indian")) {
                throw new NonIndianCitizenshipException("You are not eligible for voting...");
            }
        }
        catch(NonIndianCitizenshipException e){
                //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println();

        }

    }
}
