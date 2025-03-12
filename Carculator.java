import java.util.Scanner;

public class Carculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("두개의 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("연산할 연산자를 입력하세요 : ");
        String operator = scanner.nextLine();

        double result = 0.0;
        boolean validOperation = true;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "%":
                result = num1 % num2;
            case "/":
                if (num2 == 0){
                    System.out.println("0으로는 나눌 수 없습니다.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.printf("%d %s %d = %.4f", num1, operator, num2, result);
        }

        scanner.close();
    }
}
