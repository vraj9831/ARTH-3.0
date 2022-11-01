public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5,6));// Here 5 and 6 are Argument or Formal Parameter.

        int x=50;
        System.out.println(x);
        System.out.println(var (40));
        System.out.println(x);

        /* The value of x in main() has nothing to do with x present in var function or any other function
        Every function make their own activation record in Stack and they have their own
        independent variables. Every function have their own local variables and they are independent
        of the other functns, no matter if their name is same or anything.
         */

        System.out.println(lw());
        //System.out.println(l); // This will throw an error as l isnt in main function.

        /* life cycle of activation record :
        as soon as the function is called - to - as soon as the return is reached.
         */

        /* The scope of variables is local. They cant be used outside function.
        */

        //Same name + different function parameters = different function.
        // this is called Function Overloading.


        //       LOOP
        int c;
        for (c=1;c<5;c++) {
            System.out.println("Vinit Raj");
        }// This for loop will only run if the condition is true.

        int d=1;
        for (System.out.println("I AM START");d<=10;System.out.println("I AM FOR LOOP ARGUMENT")) {
            System.out.println(d);
            d++;
        }
        /* i am start then d will print then loop argument will print.
        first the d will be printed then the argument inside for loop will be printed.
         */
        int qq[]={1,2,3,4,5,6};
        /* for (int id=0;true;id++) {
            System.out.println(qq[id]);
        }//after 6, loop will throw an error saying index 6 is out of bound.
        */
        // To know size of an array : qq.length
        for (int id1=0;id1<qq.length;id1++) {
            System.out.println(qq[id1]);
        }
        //this is called array traversing

        int arr1[]={1111,2222,3333,4444,5555,6666};
        for(int x1:arr1) {
            System.out.println(x1);
        }
        print(arr1);
        System.out.println(arr1[0]);// after the function is run, it will print  x[0] = s1123


    }
    static int sum(int a, int b) {
        // int a and int b are called function parameters.
        return a+b;
    }
    static int var (int x) {
        System.out.println(x);
        return x+20;
    }
    static int lw() {
        int l=44;
        return l;
    }
    static void print (int x[]) {
        for (int i:x) {
            System.out.println(i);
        }
        x[0]=1123; // any changes we make here will be reflected in main function too
        // since the array is stored in Heap memory, the changes will be made in Heap memory only.
        // all the changes will be made there, and is called Passing Parameter.
        // In Java we dont have call by address or reference, we have PASSING PARAMETERS.
    }
}