import java.util.Scanner;

public class SentenceSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("n값을 입력하세요 : ");
        int number = scanner.nextInt();

        int sum = 0;

        if(number > 0){
            for (int i=0; i <= number; i++){
                sum += i;
            }

            System.out.printf("1부터 %d까지의 합은 %d입니다.", number, sum);

        } else {
            System.out.println("잘못된 입력입니다.");
        }

        scanner.close();
    }
}
