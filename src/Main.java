import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inputNum, n1 = 0, n2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        inputNum = input.nextInt();

        System.out.print("0");

        for (int i = 1; i <= inputNum - 1; i++){
            System.out.print(" " +  n2);
            int total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
    }
}