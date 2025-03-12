import java.util.Scanner;

public class Multiple {
    public static void main(String[] args){
        Scanner check = new Scanner(System.in);

        System.out.println("두 개의 숫자를 입력해 주세요 : ");
        int num1 = check.nextInt();
        int num2 = check.nextInt();

        check.nextLine();

        System.out.println("연산자를 입력해주세요 : ");
        String operator = check.nextLine();

        double result = 0.0;
        boolean validOperation = true;

        switch(operator){
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    validOperation = false;
                } else{
                    result = (double) num1 / num2;
                    break;
                }
            default:
                System.out.println("잘못된 연산자 입니다.");
                validOperation = false;
                break;
        }

        if (validOperation){
            if((result % num1) == 0 && (result % num2) == 0){
                System.out.printf("%d %s %d = %.2f -> 두 숫자의 배수입니다.", num1, operator, num2, result);
            } else {
                System.out.printf("%d %s %d = %.2f -> 배수가 아닙니다.", num1, operator, num2, result);
            }
        }

        check.close();
    }
}
