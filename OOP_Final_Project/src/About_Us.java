import java.util.Scanner;

// About_Us class which contain only one method in which information is given about the Z Coding App and developer
public class About_Us {
    Menu m2 = new Menu();   // Menu Class object
    Scanner sc = new Scanner(System.in);    // Scanner to take input

    boolean in = true;

    // about_us method contains information
    public void about_us() {
        System.out.println("Developed By : Zohaib Ali Thaheem");
        System.out.println("Email : thaheemzohaibali705@gmail.com");
        System.out.println("Developed for : OOP Final Project");
        System.out.println("Contact us : 03151345921");

        System.out.println("\n--> For Back input 1");
        int aboutBack = sc.nextInt();

            if (aboutBack == 1) {
                m2.menu();
            } else {
                System.out.println("___________________________" +
                        "\nSorry...!!! invalid input" +
                        "\n___________________________");
                System.exit(0);
            }
    }   // end of about_Us() method
}   // end of About_Us class
