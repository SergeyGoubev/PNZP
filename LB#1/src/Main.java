import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean k = false ; 
        Scanner console = new Scanner(System.in);
        int A = 1;
        System.out.println("Введите число N: ");
        int N = console.nextInt();
        System.out.println("Введите число M: ");
        int M = console.nextInt();
        for (int i=1; i<=N; i++) {
         A = A * i;
            if (A <= (M*i)) {
                k = true;
                System.out.println(A);
            }   
        }
                if (k == false) {
                System.out.println("NO");  
                }
    }
}