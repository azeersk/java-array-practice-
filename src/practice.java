import java.util.Scanner;

public interface practice {
    void addition(int a, int b);
    void subtraction(int a, int b);
}

interface practOne{
    void multiplication(int a, int b);
}

class inter implements practice{
    public void addition(int a, int b){
        System.out.println("addition: "+ (a + b));
    }
    public void subtraction(int a, int b){
        System.out.println("subtraction: "+ (a-b));
    }
}

// multiple inheritance
class innerOf implements practice, practOne{
    public void addition(int c, int d){
        System.out.println("addition of: "+ (c + d));
    }
    public void subtraction(int c, int d){
        System.out.println("substraction of: "+ (c - d));
    }
    public void multiplication(int c,int d){
        System.out.println("multiplication of: "+ (c*d));
    }
}

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        inter obj = new inter();
        obj.addition(a,b);
        obj.subtraction(a,b);

        innerOf objInner = new innerOf();
        objInner.addition(a,b);
        objInner.subtraction(a,b);
        System.out.println("first: ");
        int c = input.nextInt();
        System.out.println("second: ");
        int d = input.nextInt();
        objInner.multiplication(c,d);

    }
}
