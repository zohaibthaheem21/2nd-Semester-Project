import javax.swing.*;
import java.util.Scanner;

    public class Main {

        // Constructor of Main Class
    public Main (){
        JFrame jFrame = new JFrame("Message");  // JFrame Object

        Languages languages = new Languages();  // Object of Language class

        languages.menu();   // Calling Menu's method that is menu
        try {
            boolean order = true;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.print("\n--> About what do you want to learn : ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\n******Java Programming******");
                        languages.java();
                        break;
                    case 2:
                        System.out.println("C++");
                        languages.cpp();
                        break;
                    case 3:
                        System.out.println("C");
                        languages.c();
                        break;
                    case 4:
                        System.out.println("Python");
                        languages.python();
                        break;
                    case 5:
                        System.out.println("About Us");
                        languages.about_us.about_us();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Thanks for using Z Coding App");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("____________________________" +
                                "\nYou entered invalid number" +
                                "\n____________________________");
                        break;
                }   // end of switch() statement
            } while (order);
        }catch (Exception e) {
            System.out.println("\n\t\tSorry Enter only numbers not character or any other symbol...!!!\n" +
                    "_____________________________________________________________________________________\n");
            new Main();
        }
 }
        public static void main(String[] args) throws Exception {
            WaitingScreen w = new WaitingScreen();
            w.start();
        }   // end of main() method
    }   // end of Main class

class WaitingScreen extends Thread {
    @Override
    public void run() {
        System.out.print("Waiting");
        int i=1;
        do {
            System.out.print(".");
            i++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (i<=10);

       Main m1 = new Main(); //  Object of Main() Constructor for calling it
    } // end of run() method
} //  end of WaitingScreen class
