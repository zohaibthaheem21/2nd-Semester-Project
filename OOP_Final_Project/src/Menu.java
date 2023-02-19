import java.util.Scanner;

// Menu Class which contain menu() method and extended by languages class
public class Menu {

    // Menu Method
    public void menu() {
        System.out.println("\n****************************");
        System.out.println("Welcome to the Z Coding App");
        System.out.println("****************************"
        +"\n1: Java             2: C++"
        +"\n3: C                4: Python"
        +"\n5: About Us         6: Exit");
    }   // end of menu() method
}   // end of Menu class

// Languages class which contain few methods like java, cpp, c and python
class Languages extends Menu {
    Scanner sc = new Scanner(System.in);

    About_Us about_us = new About_Us(); // Object of About_Us class
    boolean input = true;

    // java_Basic method which contain information about Java Basic
    public void java_Basic() {

        // Information
        System.out.println("\nJava First Program --> Hello World\n");
        System.out.println("public class Main {\n" +
                "  public static void main(String[] args) {\n" +
                "    System.out.println(\"Hello World\");\n" +
                "  }\n" +
                "}");
        System.out.println("\n// Output : Hello World");

        System.out.println("\n--> Java Comments");
        System.out.println("\nComments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.");

        System.out.println("\nJava Variables");

        System.out.println("\nVariables are containers for storing data values.\n" +
                "\n" +
                "In Java, there are different types of variables, for example:\n" +
                "\n" +
                "String - stores text, such as \"Hello\". String values are surrounded by double quotes\n" +
                "int - stores integers (whole numbers), without decimals, such as 123 or -123\n" +
                "float - stores floating point numbers, with decimals, such as 19.99 or -19.99\n" +
                "char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\n" +
                "boolean - stores values with two states: true or false");

        System.out.println("\nJava Data Types");

        System.out.println("\nData types are divided into two groups:\n" +
                "\n" +
                "Primitive data types - includes byte, short, int, long, float, double, boolean and char\n" +
                "Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)");

        System.out.println("\nPrimitive Data Types");

        System.out.println("\nA primitive data type specifies the size and type of variable values, and it has no additional methods.\n" +
                "\n" +
                "There are eight primitive data types in Java:");

        System.out.println("\nData Type\tSize\tDescription\n" +
                "byte\t1 byte\tStores whole numbers from -128 to 127\n" +
                "short\t2 bytes\tStores whole numbers from -32,768 to 32,767\n" +
                "int\t4 bytes\tStores whole numbers from -2,147,483,648 to 2,147,483,647\n" +
                "long\t8 bytes\tStores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\n" +
                "float\t4 bytes\tStores fractional numbers. Sufficient for storing 6 to 7 decimal digits\n" +
                "double\t8 bytes\tStores fractional numbers. Sufficient for storing 15 decimal digits\n" +
                "boolean\t1 bit\tStores true or false values\n" +
                "char\t2 bytes\tStores a single character/letter or ASCII values\n");

        System.out.println("___________________________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next Topic" +
                "\n____________________________________________________________________________________________");
        int basicButtons = sc.nextInt();

        if (basicButtons == 1) {
            java();
        } else if (basicButtons == 2) {
            menu();
        } else if (basicButtons == 3) {
            java_OOP();
        } else {
            System.out.println("_______________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "\n________________________________________");
            java_Basic();
        }
}   // end of java_Basic() method

    // java_OOP method which contain information about Java OOP
    public void java_OOP() {

//        // Information
        System.out.println("\n--> What is OOP?");
        System.out.println("\nOOP stands for Object-Oriented Programming.\n" +
                "\n" +
                "Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.\n" +
                "\n" +
                "Object-oriented programming has several advantages over procedural programming:\n" +
                "\n" +
                "OOP is faster and easier to execute\n" +
                "OOP provides a clear structure for the programs\n" +
                "OOP helps to keep the Java code DRY \"Don't Repeat Yourself\", and makes the code easier to maintain, modify and debug\n" +
                "OOP makes it possible to create full reusable applications with less code and shorter development time\n" +
                "Tip: The \"Don't Repeat Yourself\" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.");

        System.out.println("\nJava Classes and Objects\n" +
                "Java Classes/Objects\n" +
                "Java is an object-oriented programming language.\n" +
                "\n" +
                "Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.\n" +
                "\n" +
                "A Class is like an object constructor, or a \"blueprint\" for creating objects.\n" +
                "\n" +
                "Create a Class\n" +
                "To create a class, use the keyword class:\n" +
                "\n" +
                "Main.java\n" +
                "Create a class named \"Main\" with a variable x:\n" +
                "\n" +
                "public class Main {\n" +
                "  int x = 5;\n" +
                "}\n" +
                "Remember from the Java Syntax chapter that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.\n" +
                "\n" +
                "Create an Object\n" +
                "In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.\n" +
                "\n" +
                "To create an object of Main, specify the class name, followed by the object name, and use the keyword new:\n" +
                "\n" +
                "Example\n" +
                "Create an object called \"myObj\" and print the value of x:\n" +
                "\n" +
                "public class Main {\n" +
                "  int x = 5;\n" +
                "\n" +
                "  public static void main(String[] args) {\n" +
                "    Main myObj = new Main();\n" +
                "    System.out.println(myObj.x);\n" +
                "  }\n" +
                "}\n" +
                " \n" +
                "\n" +
                "ADVERTISEMENT\n" +
                "\n" +
                "Multiple Objects\n" +
                "You can create multiple objects of one class:\n" +
                "\n" +
                "Example\n" +
                "Create two objects of Main:\n" +
                "\n" +
                "public class Main {\n" +
                "  int x = 5;\n" +
                "\n" +
                "  public static void main(String[] args) {\n" +
                "    Main myObj1 = new Main();  // Object 1\n" +
                "    Main myObj2 = new Main();  // Object 2\n" +
                "    System.out.println(myObj1.x);\n" +
                "    System.out.println(myObj2.x);\n" +
                "  }\n" +
                "}\n" +
                " \n" +
                " \n" +
                "\n" +
                "Using Multiple Classes\n" +
                "You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).\n" +
                "\n" +
                "Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:\n" +
                "\n" +
                "Main.java\n" +
                "Second.java\n" +
                "Main.java\n" +
                "public class Main {\n" +
                "  int x = 5;\n" +
                "}\n" +
                "Second.java\n" +
                "class Second {\n" +
                "  public static void main(String[] args) {\n" +
                "    Main myObj = new Main();\n" +
                "    System.out.println(myObj.x);\n" +
                "  }\n" +
                "}\n" +
                "When both files have been compiled:");

        // Buttons for back and next topics
        System.out.println("_____________________________________________________________________________________________-" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next Topic" +
                "\n______________________________________________________________________________________________");
        int oopButtons = sc.nextInt();

        if (oopButtons==1) {
            java_Basic();
        } else if (oopButtons==2) {
            menu();
        } else if (oopButtons==3) {
            java_More_Topics();
        } else {
            System.out.println("________________________________________" +
                    "\n--> Sorry you entered invalid number...!" +
                    "\n___________________________________________");
            java_OOP();
        }
    }   // end of java_OOP() method

    // java_More_Topics method which contain information about More Topics
    public void java_More_Topics() {
        System.out.println("Java More Topics");

        // Information
        System.out.println("\nJava Files");
        System.out.println("\nFile handling is an important part of any application.\n" +
                "\n" +
                "Java has several methods for creating, reading, updating, and deleting files.");

        System.out.println("\nJava Threads\n" +
                "Java Threads\n" +
                "Threads allows a program to operate more efficiently by doing multiple things at the same time.\n" +
                "\n" +
                "Threads can be used to perform complicated tasks in the background without interrupting the main program.\n" +
                "\n" +
                "Creating a Thread\n" +
                "There are two ways to create a thread.\n" +
                "\n" +
                "It can be created by extending the Thread class and overriding its run() method:\n" +
                "\n" +
                "Extend Syntax\n" +
                "public class Main extends Thread {\n" +
                "  public void run() {\n" +
                "    System.out.println(\"This code is running in a thread\");\n" +
                "  }\n" +
                "}\n" +
                "Another way to create a thread is to implement the Runnable interface:\n" +
                "\n" +
                "Implement Syntax\n" +
                "public class Main implements Runnable {\n" +
                "  public void run() {\n" +
                "    System.out.println(\"This code is running in a thread\");\n" +
                "  }\n" +
                "}\n" +
                "Running Threads\n" +
                "If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:\n" +
                "\n" +
                "Extend Example\n" +
                "public class Main extends Thread {\n" +
                "  public static void main(String[] args) {\n" +
                "    Main thread = new Main();\n" +
                "    thread.start();\n" +
                "    System.out.println(\"This code is outside of the thread\");\n" +
                "  }\n" +
                "  public void run() {\n" +
                "    System.out.println(\"This code is running in a thread\");\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:\n" +
                "\n" +
                "Implement Example\n" +
                "public class Main implements Runnable {\n" +
                "  public static void main(String[] args) {\n" +
                "    Main obj = new Main();\n" +
                "    Thread thread = new Thread(obj);\n" +
                "    thread.start();\n" +
                "    System.out.println(\"This code is outside of the thread\");\n" +
                "  }\n" +
                "  public void run() {\n" +
                "    System.out.println(\"This code is running in a thread\");\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "Differences between \"extending\" and \"implementing\" Threads\n" +
                "\n" +
                "The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.\n" +
                "\n" +
                "Concurrency Problems\n" +
                "Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The problems that result from this are called concurrency problems.\n" +
                "\n" +
                "Example\n" +
                "A code example where the value of the variable amount is unpredictable:\n" +
                "\n" +
                "public class Main extends Thread {\n" +
                "  public static int amount = 0;\n" +
                "\n" +
                "  public static void main(String[] args) {\n" +
                "    Main thread = new Main();\n" +
                "    thread.start();\n" +
                "    System.out.println(amount);\n" +
                "    amount++;\n" +
                "    System.out.println(amount);\n" +
                "  }\n" +
                "\n" +
                "  public void run() {\n" +
                "    amount++;\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.\n" +
                "\n" +
                "Example\n" +
                "Use isAlive() to prevent concurrency problems:\n" +
                "\n" +
                "public class Main extends Thread {\n" +
                "  public static int amount = 0;\n" +
                "\n" +
                "  public static void main(String[] args) {\n" +
                "    Main thread = new Main();\n" +
                "    thread.start();\n" +
                "    // Wait for the thread to finish\n" +
                "    while(thread.isAlive()) {\n" +
                "    System.out.println(\"Waiting...\");\n" +
                "  }\n" +
                "  // Update amount and print its value\n" +
                "  System.out.println(\"Main: \" + amount);\n" +
                "  amount++;\n" +
                "  System.out.println(\"Main: \" + amount);\n" +
                "  }\n" +
                "  public void run() {\n" +
                "    amount++;\n" +
                "  }\n" +
                "}");

        // Buttons for back and next topics
        System.out.println("_________________________________________________________________________" +
                "\nwhat do you want now : \t 1 : Back to Previous \t 2 : Back to Menu" +
                "\n_______________________________________________________________________");
        int mtButtons = sc.nextInt();

        if (mtButtons==1) {
            java_OOP();
        } else if (mtButtons==2) {
            menu();
        } else {
            System.out.println("__________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "_______________________________________");
            java_More_Topics();
        }
    }   // end of java_More_Topics() method

    // cpp_Basic method which contain information about C++ Basic
    public void cpp_Basic() {

        // Information
        System.out.println("\nC++ Arrays\n" +
                "Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.\n" +
                "\n" +
                "To declare an array, define the variable type, specify the name of the array followed by square brackets and specify the number of elements it should store:\n" +
                "\n" +
                "string cars[4];\n" +
                "We have now declared a variable that holds an array of four strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:\n" +
                "\n" +
                "string cars[4] = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
                "To create an array of three integers, you could write:\n" +
                "\n" +
                "int myNum[3] = {10, 20, 30};\n" +
                "Access the Elements of an Array\n" +
                "You access an array element by referring to the index number inside square brackets [].\n" +
                "\n" +
                "This statement accesses the value of the first element in cars:\n" +
                "\n" +
                "Example\n" +
                "string cars[4] = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n" +
                "cout << cars[0];\n" +
                "// Outputs Volvo");

        // Buttons for back and next topics
        System.out.println("________________________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next topic" +
                "______________________________________________________________________________________________");
        int cpp_Basic_Buttons = sc.nextInt();

        if (cpp_Basic_Buttons==1) {
            cpp();
        } else if (cpp_Basic_Buttons==2) {
            menu();
        } else if (cpp_Basic_Buttons==3) {
            cpp_OOP();
        } else {
            System.out.println("____________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "_________________________________________");
            cpp_Basic();
        }
    }   // end of cpp_Basic() method

    public void cpp_OOP() {

        // Information
        System.out.println("\nC++ What is OOP?\n" +
                "OOP stands for Object-Oriented Programming.\n" +
                "\n" +
                "Procedural programming is about writing procedures or functions that perform operations on the data, while object-oriented programming is about creating objects that contain both data and functions.\n" +
                "\n" +
                "Object-oriented programming has several advantages over procedural programming:\n" +
                "\n" +
                "OOP is faster and easier to execute\n" +
                "OOP provides a clear structure for the programs\n" +
                "OOP helps to keep the C++ code DRY \"Don't Repeat Yourself\", and makes the code easier to maintain, modify and debug\n" +
                "OOP makes it possible to create full reusable applications with less code and shorter development time\n" +
                "Tip: The \"Don't Repeat Yourself\" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.\n" +
                "\n" +
                "C++ What are Classes and Objects?\n" +
                "Classes and objects are the two main aspects of object-oriented programming.\n" +
                "\n" +
                "Look at the following illustration to see the difference between class and objects:\n" +
                "\n" +
                "class\n" +
                "Fruit\n" +
                "\n" +
                "objects\n" +
                "Apple\n" +
                "\n" +
                "Banana\n" +
                "\n" +
                "Mango\n" +
                "\n" +
                "Another example:\n" +
                "\n" +
                "class\n" +
                "Car\n" +
                "\n" +
                "objects\n" +
                "Volvo\n" +
                "\n" +
                "Audi\n" +
                "\n" +
                "Toyota\n" +
                "\n" +
                "So, a class is a template for objects, and an object is an instance of a class.\n" +
                "\n" +
                "When the individual objects are created, they inherit all the variables and functions from the class.\n" +
                "\n" +
                "You will learn much more about classes and objects in the next chapter.");

        // Buttons for back and next topics
        System.out.println("____________________________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next topic" +
                "\n____________________________________________________________________________________________");
        int cpp_OOP_Buttons = sc.nextInt();

        if (cpp_OOP_Buttons==1) {
           cpp_Basic();
        } else if (cpp_OOP_Buttons==2) {
            menu();
        } else if (cpp_OOP_Buttons==3) {
            cpp_More_Topics();
        } else {
            System.out.println("___________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "_______________________________________");
            cpp_OOP();
        }
    }   // end of cpp_OOP() method

    public void cpp_More_Topics() {

        // Information
        System.out.println("\nC++ Exceptions\n" +
                "C++ Exceptions\n" +
                "When executing C++ code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.\n" +
                "\n" +
                "When an error occurs, C++ will normally stop and generate an error message. The technical term for this is: C++ will throw an exception (throw an error).\n" +
                "\n" +
                "C++ try and catch\n" +
                "Exception handling in C++ consist of three keywords: try, throw and catch:\n" +
                "\n" +
                "The try statement allows you to define a block of code to be tested for errors while it is being executed.\n" +
                "\n" +
                "The throw keyword throws an exception when a problem is detected, which lets us create a custom error.\n" +
                "\n" +
                "The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.\n" +
                "\n" +
                "The try and catch keywords come in pairs:\n" +
                "\n" +
                "Example\n" +
                "try {\n" +
                "  // Block of code to try\n" +
                "  throw exception; // Throw an exception when a problem arise\n" +
                "}\n" +
                "catch () {\n" +
                "  // Block of code to handle errors\n" +
                "}\n" +
                "Consider the following example:\n" +
                "\n" +
                "Example\n" +
                "try {\n" +
                "  int age = 15;\n" +
                "  if (age >= 18) {\n" +
                "    cout << \"Access granted - you are old enough.\";\n" +
                "  } else {\n" +
                "    throw (age);\n" +
                "  }\n" +
                "}\n" +
                "catch (int myNum) {\n" +
                "  cout << \"Access denied - You must be at least 18 years old.\\n\";\n" +
                "  cout << \"Age is: \" << myNum;\n" +
                "}\n" +
                "Example explained\n" +
                "We use the try block to test some code: If the age variable is less than 18, we will throw an exception, and handle it in our catch block.\n" +
                "\n" +
                "In the catch block, we catch the error and do something about it. The catch statement takes a parameter: in our example we use an int variable (myNum) (because we are throwing an exception of int type in the try block (age)), to output the value of age.\n" +
                "\n" +
                "If no error occurs (e.g. if age is 20 instead of 15, meaning it will be be greater than 18), the catch block is skipped:\n" +
                "\n" +
                "Example\n" +
                "int age = 20;\n" +
                "You can also use the throw keyword to output a reference number, like a custom error number/code for organizing purposes:\n" +
                "\n" +
                "Example\n" +
                "try {\n" +
                "  int age = 15;\n" +
                "  if (age >= 18) {\n" +
                "    cout << \"Access granted - you are old enough.\";\n" +
                "  } else {\n" +
                "    throw 505;\n" +
                "  }\n" +
                "}\n" +
                "catch (int myNum) {\n" +
                "  cout << \"Access denied - You must be at least 18 years old.\\n\";\n" +
                "  cout << \"Error number: \" << myNum;\n" +
                "}\n" +
                "Handle Any Type of Exceptions (...)\n" +
                "If you do not know the throw type used in the try block, you can use the \"three dots\" syntax (...) inside the catch block, which will handle any type of exception:\n" +
                "\n" +
                "Example\n" +
                "try {\n" +
                "  int age = 15;\n" +
                "  if (age >= 18) {\n" +
                "    cout << \"Access granted - you are old enough.\";\n" +
                "  } else {\n" +
                "    throw 505;\n" +
                "  }\n" +
                "}\n" +
                "catch (...) {\n" +
                "  cout << \"Access denied - You must be at least 18 years old.\\n\";\n" +
                "}");

        // Buttons for back and next topics
        System.out.println("_________________________________________________________________________" +
                "\n--> what do you want now : \t 1 : Back to Previous \t 2 : Back to Menu " +
                "\n___________________________________________________________________________");
        int cpp_More_Topics_Buttons = sc.nextInt();

        if (cpp_More_Topics_Buttons==1) {
            cpp_OOP();
        } else if (cpp_More_Topics_Buttons==2) {
            menu();
        } else {
            System.out.println("_______________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "\n______________________________________");
            cpp_More_Topics();
        }
    }   // end of cpp_More_Topics() method

    // c_Basic method which contain information about C Basic
    public void c_Basic() {

        // Information
        System.out.println("\nComments in C\n" +
                "Comments can be used to explain code, and to make it more readable. It can also be used to prevent execution when testing alternative code.\n" +
                "\n" +
                "Comments can be singled-lined or multi-lined.\n" +
                "\n" +
                "Single-line Comments\n" +
                "Single-line comments start with two forward slashes (//).\n" +
                "\n" +
                "Any text between // and the end of the line is ignored by the compiler (will not be executed).\n" +
                "\n" +
                "This example uses a single-line comment before a line of code:\n" +
                "\n" +
                "Example\n" +
                "// This is a comment\n" +
                "printf(\"Hello World!\");\n" +
                "This example uses a single-line comment at the end of a line of code:\n" +
                "\n" +
                "Example\n" +
                "printf(\"Hello World!\"); // This is a comment\n" +
                "C Multi-line Comments\n" +
                "Multi-line comments start with /* and ends with */.\n" +
                "\n" +
                "Any text between /* and */ will be ignored by the compiler:\n" +
                "\n" +
                "Example\n" +
                "/* The code below will print the words Hello World!\n" +
                "to the screen, and it is amazing */\n" +
                "printf(\"Hello World!\");\n" +
                "Single or multi-line comments?\n" +
                "It is up to you which you want to use. Normally, we use // for short comments, and /* */ for longer.\n" +
                "\n" +
                "Good to know: Before version C99 (released in 1999), you could only use multi-line comments in C.");

        System.out.println("\nConstants\n" +
                "When you don't want others (or yourself) to override existing variable values, use the const keyword (this will declare the variable as \"constant\", which means unchangeable and read-only):\n" +
                "\n" +
                "Example\n" +
                "const int myNum = 15;  // myNum will always be 15\n" +
                "myNum = 10;  // error: assignment of read-only variable 'myNum'");

        // Buttons for back and next topics
        System.out.println("______________________________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next topic" +
                "______________________________________________________________________________________________");
        int c_Basic_Buttons = sc.nextInt();

        if (c_Basic_Buttons==1) {
            c();
        } else if (c_Basic_Buttons==2) {
            menu();
        } else if (c_Basic_Buttons==3) {
            c_Functions();
        } else {
            System.out.println("_____________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "_____________________________________");
            c_Basic();
        }
    }   // end of c_Basic() method

    public void c_Functions() {

        // Information
        System.out.println("\nC Functions\n" +
                "A function is a block of code which only runs when it is called.\n" +
                "\n" +
                "You can pass data, known as parameters, into a function.\n" +
                "\n" +
                "Functions are used to perform certain actions, and they are important for reusing code: Define the code once, and use it many times.\n" +
                "\n" +
                "Predefined Functions\n" +
                "So it turns out you already know what a function is. You have been using it the whole time while studying this tutorial!\n" +
                "\n" +
                "For example, main() is a function, which is used to execute code, and printf() is a function; used to output/print text to the screen:\n" +
                "\n" +
                "Example\n" +
                "int main() {\n" +
                "  printf(\"Hello World!\");\n" +
                "  return 0;\n" +
                "}");

        System.out.println("\nMath Functions\n" +
                "There is also a list of math functions available, that allows you to perform mathematical tasks on numbers.\n" +
                "\n" +
                "To use them, you must include the math.h header file in your program:\n" +
                "\n" +
                "#include <math.h>\n" +
                "Square Root\n" +
                "To find the square root of a number, use the sqrt() function:\n" +
                "\n" +
                "Example\n" +
                "printf(\"%f\", sqrt(16));\n" +
                "Round a Number\n" +
                "The ceil() function rounds a number upwards to its nearest integer, and the floor() method rounds a number downwards to its nearest integer, and returns the result:\n" +
                "\n" +
                "Example\n" +
                "printf(\"%f\", ceil(1.4));\n" +
                "printf(\"%f\", floor(1.4));");

        // Buttons for back and next topics
        System.out.println("_______________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu " +
                "\n_______________________________________________________________________");
        int c_Functions_Buttons = sc.nextInt();

        if (c_Functions_Buttons==1) {
            c_Basic();
        } else if (c_Functions_Buttons==2) {
            menu();
        } else {
            System.out.println("_______________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "_______________________________________");
            c_Functions();
        }
    }   // end of c_Functions() method

    // python_Basic method which contain information about Python Basic
    public void python_Basic() {

        // Information
        System.out.println("\nPython Comments\n" +
                "Comments can be used to explain Python code.\n" +
                "\n" +
                "Comments can be used to make the code more readable.\n" +
                "\n" +
                "Comments can be used to prevent execution when testing code.\n" +
                "\n" +
                "Creating a Comment\n" +
                "Comments starts with a #, and Python will ignore them:\n" +
                "\n" +
                "Example\n" +
                "#This is a comment\n" +
                "print(\"Hello, World!\")\n" +
                "Comments can be placed at the end of a line, and Python will ignore the rest of the line:\n" +
                "\n" +
                "Example\n" +
                "print(\"Hello, World!\") #This is a comment\n" +
                "A comment does not have to be text that explains the code, it can also be used to prevent Python from executing code:\n" +
                "\n" +
                "Example\n" +
                "#print(\"Hello, World!\")\n" +
                "print(\"Cheers, Mate!\")");

        // Buttons for back and next topics
        System.out.println("_______________________________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next topic" +
                "_______________________________________________________________________________________________");
        int python_Basic_Buttons = sc.nextInt();

        if (python_Basic_Buttons==1) {
            python();
        } else if (python_Basic_Buttons==2) {
            menu();
        } else if (python_Basic_Buttons==3) {
            python_Modules();
        } else {
            System.out.println("______________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "\n______________________________________");
            python_Basic();
        }
    }   // end of python_Basic() method

    public void python_Modules() {

        // Information
        System.out.println("\nNumPy Tutorial\n" +
                "[+:\n" +
                "NumPy is a Python library.\n" +
                "\n" +
                "NumPy is used for working with arrays.\n" +
                "\n" +
                "NumPy is short for \"Numerical Python\".");

        System.out.println("\nPandas Tutorial\n" +
                "[+:\n" +
                "Pandas is a Python library.\n" +
                "\n" +
                "Pandas is used to analyze data.");

        // Buttons for back and next topics
        System.out.println("______________________________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu \t 3 : Next topic" +
                "\n______________________________________________________________________________________________");
        int python_Modules_Buttons = sc.nextInt();

        if (python_Modules_Buttons==1) {
            python_Basic();
        } else if (python_Modules_Buttons==2) {
            menu();
        } else if (python_Modules_Buttons==3) {
            python_Machine_Learning();
        } else {
            System.out.println("__________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "\n__________________________________");
            python_Modules();
        }
    }   // end of python_Modules() method

    public void python_Machine_Learning() {

        // Information
        System.out.println("\nMean, Median, and Mode\n" +
                "What can we learn from looking at a group of numbers?\n" +
                "\n" +
                "In Machine Learning (and in mathematics) there are often three values that interests us:\n" +
                "\n" +
                "Mean - The average value\n" +
                "Median - The mid point value\n" +
                "Mode - The most common value\n" +
                "Example: We have registered the speed of 13 cars:\n" +
                "\n" +
                "speed = [99,86,87,88,111,86,103,87,94,78,77,85,86]\n" +
                "\n" +
                "What is the average, the middle, or the most common speed value?");

        System.out.println("\nData Distribution\n" +
                "Earlier in this tutorial we have worked with very small amounts of data in our examples, just to understand the different concepts.\n" +
                "\n" +
                "In the real world, the data sets are much bigger, but it can be difficult to gather real world data, at least at an early stage of a project.\n" +
                "\n" +
                "How Can we Get Big Data Sets?\n" +
                "To create big data sets for testing, we use the Python module NumPy, which comes with a number of methods to create random data sets, of any size.");

        // Buttons for back and next topics
        System.out.println("____________________________________________________________________________" +
                "\n--> What do you want now : \t 1 : Back to Previous \t 2 : Back to Menu " +
                "\n____________________________________________________________________________");
        int python_ml_Buttons = sc.nextInt();

        if (python_ml_Buttons==1) {
            python_Modules();
        } else if (python_ml_Buttons==2) {
            menu();
        } else {
            System.out.println("________________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "\n________________________________________");
            python_Machine_Learning();
        }
    }   // end of python_Machine_Learning() method

    // java method in which java definition and sub topics are included
    public void java() {
        System.out.println("\n--> Java Definition");
        System.out.println("\nJava is a popular programming language.\n"+
                "\nJava is used to develop mobile apps, web apps, desktop apps, games and much more\n");

        System.out.println("-------------------------------");
        System.out.println("Start learning more about java");
        System.out.println("-------------------------------");

        System.out.println("\n You can learn more about Java's following topics from this Z Coding App\n"+
                "\n 1 : Java Basic " +
                "\n 2 : Java OOP " +
                "\n 3 : Java more topics " +
                "\n 4 : Back ");

            System.out.print("___________________________________________________________________________________________" +
                    "\nIf you want then enter number of the topic about which do you want to learn : " +
                    "\n___________________________________________________________________________________________\n");
            int javaChoice = sc.nextInt();

            // Selection

            // This button is used for Java Basic details
            if (javaChoice == 1) {

                java_Basic();

            }

            // This button is used for Java OOP details
            else if (javaChoice == 2) {

                java_OOP();

            }

            // This button is used for Java More Topics details
            else if (javaChoice == 3) {

                java_More_Topics();

            }

            // This button is used for Back to Menu
            else if (javaChoice == 4) {
                menu();
            }

            // This is for if there is no any button which matches with this condition
            else {
                System.out.println("_________________________________________" +
                        "\nSorry you entered invalid number...!" +
                        "\n_________________________________________");
                java();
            }
    }   // end of java() method

    // cpp method in which c++ definition and sub topics are included
    public void cpp() {
        System.out.println("\n--> C++ Definition");
        System.out.println("\nC++ is a popular programming language.\n" +
                "\n" +
                "C++ is used to create computer programs, and is one of the most used language in game development.");

        System.out.println("-------------------------------");
        System.out.println("Start learning more about c++");
        System.out.println("-------------------------------");

        System.out.println("\n You can learn more about C++'s following topics from this Z Coding App\n"+
                "\n 1 : C++ Basic " +
                "\n 2 : C++ OOP " +
                "\n 3 : C++ more topics " +
                "\n 4 : Back ");

        System.out.print("___________________________________________________________________________________________" +
                "\nIf you want then enter number of the topic about which do you want to learn : " +
                "\n___________________________________________________________________________________________\n");
        int cppChoice = sc.nextInt();

        // Selection

        // This button is used for C++ Basic details
        if (cppChoice==1) {

            cpp_Basic();

        }

        // This button is used for C++OOP details
        else if (cppChoice==2) {

            cpp_OOP();

        }

        // This button is used for C++ More Topics details
        else if (cppChoice==3) {

            cpp_More_Topics();

        }

        // This button is used for Back to Menu
        else if (cppChoice==4) {
            menu();
        }

        // This is for if there is no any button which matches with this condition
        else {
            System.out.println("_________________________________________" +
                    "\nSorry you entered invalid number...!" +
                    "\n_________________________________________");
            cpp();
        }
    }   // end of cpp() method

    // c method in which C definition and sub topics are included
    public void c() {
            System.out.println("\n--> What is C?");
            System.out.println("\nC is a general-purpose programming language created by Dennis Ritchie at the Bell Laboratories in 1972.\n" +
                    "\n" +
                    "It is a very popular language, despite being old.\n" +
                    "\n" +
                    "C is strongly associated with UNIX, as it was developed to write the UNIX operating system.");

            System.out.println("-------------------------------");
            System.out.println("Start learning more about c");
            System.out.println("-------------------------------");

            System.out.println("\n You can learn more about C's following topics from this Z Coding App\n"+
                    "\n 1 : C Basic " +
                    "\n 2 : C Functions " +
                    "\n 3 : Back ");

            System.out.print("___________________________________________________________________________________________" +
                    "\nIf you want then enter number of the topic about which do you want to learn : " +
                    "\n___________________________________________________________________________________________\n");
            int cChoice = sc.nextInt();

            // Selection

            // This button is used for C Basic details
            if (cChoice==1) {

                c_Basic();

            }

            // This button is used for C Functions details
            else if (cChoice==2) {

                c_Functions();

            }

            // This button is used for Back to Menu
            else if (cChoice==3) {
                menu();
            }

            // This is for if there is no any button which matches with this condition
            else {
                System.out.println("_________________________________________" +
                        "\nSorry you entered invalid number...!" +
                        "\n_________________________________________");
                c();
            }
    }   // end of c() method

    // python method in which Python definition and sub topics are included
    public void python() {
            System.out.println("\n--> Python Definition");
            System.out.println("\nPython is a popular programming language.\n" +
                    "\n" +
                    "Python can be used on a server to create web applications.");

            System.out.println("-------------------------------");
            System.out.println("Start learning more about python");
            System.out.println("-------------------------------");

            System.out.println("\n You can learn more about python's following topics from this Z Coding App\n"+
                    "\n 1 : Python Basic " +
                    "\n 2 : Python Modules " +
                    "\n 3 : Python Machine Learning " +
                    "\n 4 : Back ");

            System.out.print("___________________________________________________________________________________________" +
                    "\nIf you want then enter number of the topic about which do you want to learn : " +
                    "\n___________________________________________________________________________________________\n");
            int pChoice = sc.nextInt();

            // Selection

            // This button is used for Python Basic details
            if (pChoice==1) {

                python_Basic();

            }

            // This button is used for Python Modules details
            else if (pChoice==2) {

                python_Modules();

            }

            // This button is used for Python Machine Learning details
            else if (pChoice==3) {

                python_Machine_Learning();

            }

            // This button is used for Back to Menu
            else if (pChoice==4) {
                menu();
            }

            // This is for if there is no any button which matches with this condition
            else {
                System.out.println("_________________________________________" +
                        "\nSorry you entered invalid number...!" +
                        "\n_________________________________________");
                python();
            }
    }   // end of python() method
}   // end of Languages class
