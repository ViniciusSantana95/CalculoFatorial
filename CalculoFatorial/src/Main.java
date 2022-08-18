import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero inteiro qualquer para o calculo fatorial");
        num = scan.nextInt();

        System.out.println(CalculoFatorial(num));

    }
    public static int CalculoFatorial(int num){
        if(num > 0 ) {
            return num * CalculoFatorial(num - 1);
        }
        return 1;
    }

}