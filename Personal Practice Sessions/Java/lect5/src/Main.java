public class Main {
    public static void main(String[] args) {
        //       ARRAY
        /*Array is a kind of data structure that stores similar data types of values in a
        continuous manner in RAM (inside Heap Memory.)
        IT PROVIDES CONTINUOUS SPACE AND ADDRESS. IF YOUR RAM DOESN'T HAVE CONTINUOUS SPACE OF
        THAT MUCH  SIZE , YOU WONT BE ABLE TO MAKE THAT ARRAY AND AN ERROR WILL BE THROWN.
         */

        /*
        Now, in Java, we dont access hardware directly, JVM manages the hardware side, so we can't
        use Pointers in Java.
         */

        /*
        Primitive data types, such as byte, short, int, long, float, double, boolean and char
        take up space in Stack. And their memory allocation is called Static Memory Allocation.
         */

        /*
        In Java, Array has dynamic memory allocation. We can change the size of Array in runtime.
         */

        //Syntax:
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        //or
        int arrnew[]= new int [10]; // Array of size 10 is created. Values can be assigned later on.

        //Name of Array (arr or arrnew) prints the address of reference of first element.

        // FUNCTIONS
        int add=sum(10,20);
        System.out.println(add);

    }
    static int sum(int a, int b) {
        //Here static word is used because the main function too is running in static mode.
        // Since the return type is integer, we need to mention it before function name.
        return (a+b);
        /*
        A function should have only one return, once the function reaches return, the function
        terminates, never write more than one return.
         */
    }
}