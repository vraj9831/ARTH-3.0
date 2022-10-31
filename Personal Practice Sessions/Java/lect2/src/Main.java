public class Main { // Class name's first world should be in uppercase. It's a good practice.
    public static void main(String[] args) {
        //static word means we can run main function without creating an object.

        // Java provides access control which provides security.


        System.out.println("Hello world!"); //" " means wo koi variable ya keyword nahi hai

        //Data types decide whether 65 is int or char.

        int i=65;
        System.out.println((char) i);
        System.out.println((int) i);

        // to know the size of data type:

        System.out.println(Integer.SIZE); // O/P: 32 bits ( 4 bytes ) "o/p is given in bits."
        System.out.println(Integer.MIN_VALUE); //-2147486648
        System.out.println(Integer.MAX_VALUE); //2147483647
    }
}