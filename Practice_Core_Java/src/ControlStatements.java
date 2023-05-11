public class ControlStatements {
    int num1 = 6;  //global variable
    public void whileLoop(){
        System.out.println("--while loop start--");
        while(num1 > 2) {
            System.out.println("num1 is " + num1);
            num1--;
        }
        System.out.println("--while loop end--");
    }

  public void doWhileLoop(){
    int num1 = 3;  //instance variable
      System.out.println("--do while loop start--");
    do{
        System.out.println("num1 is "+num1);
        num1--;
    }while(num1 > 5);
      System.out.println("--do while loop end--");

  }
  public void switchCase(){
        int num1 = 3;
      System.out.println("--switch case start--");
      switch(num1){
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thursday");
              break;
          case 5:
              System.out.println("Friday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;
          default:
              System.out.println("please enter the valid number");

      }
      System.out.println("--switch case end--");
  }
    public void switchCaseString(){
        String day = "Thursday";
        System.out.println("--switch using String start--");
        switch(day){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter the valid day");

        }
        System.out.println("--switch using String end--");
    }


    public static void main(String[] args) {
        ControlStatements testObj = new ControlStatements();
        testObj.whileLoop();
        testObj.doWhileLoop();
        testObj.switchCase();
        testObj.switchCaseString();
    }

}
