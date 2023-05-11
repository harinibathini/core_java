package assignment15;
import java.util.Random;
import java.util.Scanner;

//public class TipiTipiTop implements Runnable {
//    private String name;
//    private int playerNumber;
//    private int rounds;
//    Scanner sc;
//    private Random random;
//
//    public TipiTipiTop(String name, int playerNumber, int rounds) {
//        this.name = name;
//        this.playerNumber = playerNumber;
//        this.rounds = rounds;
//        sc = new Scanner(System.in);
//        random = new Random();
//    }
//
//    @Override
//    public synchronized void run() {
//        synchronized (this) {
//            System.out.println(name + " is ready to play Tipi Tipi Top!");
//
//            for (int i = 1; i <= rounds; i++) {
//                System.out.println(name + ", get ready for round " + i + "!");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                int playerTurn = random.nextInt((playerNumber) + 1);
//                if (playerTurn == 1) {
//                    System.out.println(name + ", you go first!");
//                } else {
//                    System.out.println(name + ", it's player " + playerTurn + "'s turn to start.");
//                }
//                synchronized (this) {
//                    System.out.println("Say 'Tipi Tipi Top' and perform the sequence as fast as you can!");
//                    System.out.println("Ready? Press enter 'go' to start.");
//                    //sc.nextLine();
//                    if (sc.nextLine() == "go") {
////                    try {
////                        Thread.sleep(1500);
////                    } catch (InterruptedException e) {
////                        throw new RuntimeException(e);
////                    }
//                        //}
//                        // perform the sequence
//                        System.out.print("Tipi ");
//                        try {
//                            Thread.sleep(500);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.print("Tipi ");
//                        try {
//                            Thread.sleep(500);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.print("Top ");
//                        try {
//                            Thread.sleep(500);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println("!");
//                    }
//                }
//                System.out.println(name + ", did you finish the sequence? (yes/no)");
//                String answer = sc.nextLine();
////                try {
////                    Thread.sleep(1500);
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                }
//                if (answer.equalsIgnoreCase("no")) {
//                    System.out.println(name + " is out!");
//                    break;
//                }
//            }
//
//            System.out.println(name + " has finished playing Tipi Tipi Top!");
//        }
//    }
//
//    public static void main(String[] args) {
//        int playerNumber = 3;
//        int rounds = 5;
//        TipiTipiTop[] players = new TipiTipiTop[playerNumber];
//
//        for (int i = 0; i < playerNumber; i++) {
//            players[i] = new TipiTipiTop("Player " + (i + 1), 3, rounds);
//            new Thread(players[i]).start();
//        }
//
//    }
//}
//
//
//
import java.util.Scanner;
import java.util.Random;

class JGuess extends Thread{
    public void run() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Welcome banner
        System.out.println("   _  ____\n" +
                "  (_)/ ___|_   _  ___  ___ ___\n" +
                "  | | |  _| | | |/ _ \\/ __/ __|\n" +
                "  | | |_| | |_| |  __/\\__ \\__ \\\n" +
                " _/ |\\____|\\__,_|\\___||___/___/\n" +
                "|__/");
        System.out.println();
        System.out.println("-> My number is less than 10!");
        System.out.println();

        // Variables
        int number = random.nextInt(10);
        int userNumber = 15052004; // That's my birth date!
        // int userNumber = input.nextInt();

        while (userNumber != number) {
            System.out.print("My number is => ");
            userNumber = input.nextInt();
            if (userNumber < number) {
                System.out.println("My number is bigger!");
                System.out.println();
            } else if (userNumber > number) {
                System.out.println("My number is smaller!");
                System.out.println();
            } else {
                System.out.println("  ____                            _       _\n" +
                        " / ___|___  _ __   __ _ _ __ __ _| |_ ___| |\n" +
                        "| |   / _ \\| '_ \\ / _` | '__/ _` | __/ __| |\n" +
                        "| |__| (_) | | | | (_| | | | (_| | |_\\__ \\_|\n" +
                        " \\____\\___/|_| |_|\\__, |_|  \\__,_|\\__|___(_)\n" +
                        "                  |___/");
                System.out.println();
            }
        }
    }
}
public class TipiTipiTop {

    public static void main(String[] args) {

        // Object declarations
        JGuess jGuess = new JGuess();
        jGuess.start();

    }
}




