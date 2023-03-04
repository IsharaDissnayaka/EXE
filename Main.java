import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Quex q1 = new Quex(5);
       
        Scanner sc = new Scanner(System.in);

       while(!(q1.IsFull())){
        System.out.print("Enter number");
        q1.Insert( sc.nextInt());
       }
       System.out.print("last number iS");
       System.out.println(q1.last_Number());
       System.out.println("max number is "+q1.MaxNumber());
    }
}