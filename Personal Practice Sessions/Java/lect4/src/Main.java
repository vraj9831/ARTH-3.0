public class Main {
    public static void main(String[] args) {
        int a,b=10,c=20;
        a=++b+c; //this means
        //b=b+1;
        //a=b+1+c
        System.out.println(a);

        int x,y=45,z=50;
        x=y++ +z;
        //x=y+z
        //y=y+1
        System.out.println(x);

        int var1=5,var2=10;
        boolean var3=(var1>var2);
        boolean var4=(var1<var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(((Object)var3).getClass().getSimpleName());




        // IF - ELSE STATEMENTS

        //they always run TRUE statement no matter where it is present, in if or in else

        // if or else if ONLY TAKE BOOLEAN INPUT

        if (true) {
            System.out.println("True is run.");
        }
        else {
            System.out.println("False is run.");
        }

        if (false) {
            System.out.println("False is run.");
        }
        else {
            System.out.println("True is run.");
        }

        //ALWAYS REMEMBER IF - ELSE ONLY TAKE 'BOOLEAN' INPUT.



    }
}