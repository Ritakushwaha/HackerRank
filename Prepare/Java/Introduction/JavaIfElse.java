import java.util.Scanner;

public class JavaIfElse {
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        
        if(n%2 != 0){
            System.out.println("Weird");
        }else if ((n>=2 && n<=5) || n>20){
            System.out.println("Not Weird");
        }else if (n>=6 && n<=20){
            System.out.println("Weird");
        }
    }
}
