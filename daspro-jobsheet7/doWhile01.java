import java.util.Scanner;

public class doWhile01 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in); 
    
    int x = 0;
    do {
        System.out.println(x);
    } while (++x <= 8);
    System.out.println("Program berhenti");

    int y = 10;
    do {
        System.out.println(y);
    } while (++y <= 8);
    System.out.println("Program berhenti");
    }
}
