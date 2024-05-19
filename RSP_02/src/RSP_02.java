import java.util.Scanner;
import java.util.Random;
public class RSP_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int userPoints = 10;
        int computerPoints = 10;
        
        String[] choices = {"가위", "바위", "보"};
        
        while (userPoints > 0 && computerPoints > 0) {
            System.out.println("현재 포인트: " + userPoints + ", 컴퓨터 포인트: " + computerPoints);
            
            int userBet;
            do {
                System.out.print("원하는만큼 걸어주세요: ");
                userBet = scanner.nextInt();
            } while (userBet < 1 || userBet > userPoints);
            
            int computerBet = random.nextInt(computerPoints) + 1;
            System.out.println("컴퓨터는 " + computerBet + " 포인트를 걸었습니다.");
            
            System.out.print("가위, 바위, 보 중에서 선택하세요: ");
            scanner.nextLine();
            String userChoice = scanner.nextLine();
            
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            
            System.out.println("당신: " + userChoice);
            System.out.println("컴퓨터: " + computerChoice);
            
            if (userChoice.equals(computerChoice)) {
                System.out.println("비겼습니다!");
            } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                       (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                       (userChoice.equals("보") && computerChoice.equals("바위"))) {
                System.out.println("당신이 이겼습니다!");
                userPoints += computerBet;
                computerPoints -= computerBet;
            } else {
                System.out.println("컴퓨터가 이겼습니다!");
                userPoints -= userBet;
                computerPoints += userBet;
            }
            
            if (userPoints <= 0) {
                System.out.println("당신이 졌습니다.");
            } else if (computerPoints <= 0) {
                System.out.println("당신이 이겼습니다.");
            }
        }
        
        scanner.close();
    }
}
