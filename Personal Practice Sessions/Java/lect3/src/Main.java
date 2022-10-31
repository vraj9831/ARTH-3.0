import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x; //declaration
        x=65; //initialization
        int y;
        y=20;
        byte z=10; // byte is of 1 byte size or 8 bits size, stores only int from -128 to 127.


        // to know the data type of any variable:

        System.out.println(((Object) y).getClass()); // O should be in uppercase in Object.
        // To get simple name of data type, add getSimpleName()

        System.out.println(((Object) y).getClass().getSimpleName());

        //Typecasting:
        System.out.println((char) x); //int has been type casted to char.

        // TYPE COERCION
        int sum=x+z;
        System.out.println(sum); // here z was byte and x was int but their sum came out to be int.
        System.out.println(((Object) sum).getClass().getSimpleName());
        //Reason being type coercion automatically gives larger data type to store value.
        //eg. int+byte=int;  char+char= int;

        char var1='A';
        char var2='B';
        System.out.println(var1+var2); // here char gets converted to int automatically, this is called type coercion.


        System.out.println(x+y);
        //1. it will go to x.
        //2. it will go to y.
        //3. it will add x and y.
        //4. it will print the sum.


        //POLYMORPHISM
        int addition=x+y;
        System.out.println(addition);
        //here + sign adds two ints.

        String a="Hello "; // S should be capital in String.
        String b="World";
        System.out.println(a+b); //HERE + sign is concatenating two strings.
        //This one + sign has two different functionalities, it is called Polymorphism.

        int x11=Integer.MAX_VALUE;
        int y11=Integer.MAX_VALUE;
        System.out.println(x11+y11); // its output is -2.
        // This happens due to of operator overloading.

        // NOW, TO TAKE INPUT FROM KEYBOARD:
        //to take input and use scanner function, we need to add import java.util.Scanner on the top.

        Scanner sc =  new Scanner (System.in);

        System.out.println("Enter the int of your choice.");
        int input1=sc.nextInt(); //nextInt is used to take input of int type.
        System.out.println(input1);

        System.out.println("Enter the one word string of your choice.");
        String input2=sc.next(); // To take 1 WORD string input, we use next().
        System.out.println(input2);

        System.out.println("Enter the line of your choice.");
        String input3=sc.nextLine(); // To take string input of one complete line.
        System.out.println(input3);

        System.out.println("Enter the one word char of your choice.");
        char input4=sc.next().charAt(0); // To take char as input. no matter how long string user types, the first char will be its input.
        System.out.println(input4);


        System.out.println(" "+5+6); //string + int = string
        // This will print " 56". As it reads string first so aage aane wale ko usi ki trh treat krta.


        System.out.println(5+6+" "); //int+int=int && int+string=string [concatenation]
        //This will print "11 "

        //If you want to print sum after string then use brackets '()'.
        System.out.println("The sum is "+ (5+6) ); // precedence of brackets is greater than '+'.


    }
}