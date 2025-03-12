import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = total.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = total.nextInt();

        int sum = num1 + num2;

        System.out.printf("%d + %d : %d", num1, num2, sum);

        total.close();
    }
}