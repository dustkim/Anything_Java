import java.util.Scanner;

public class SumTotal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("정수를 입력해 주세요 : ");
        String str = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0'; // 문자를 아스키코드 값으로 숫자로 바꾸기기
            sum += num;
        }

        System.out.printf("각 자리수의 합은 %d", sum);

        scanner.close();
    }
}
