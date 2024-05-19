import java.util.Scanner;
import java.util.Random;

public class RSP_01 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random random = new Random();        
        String[] choices = {"가위", "바위", "보"};                
        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 선택하세요: ");
        String gamer = s.nextLine(); 
        
        int computerIndex = random.nextInt(3); 
        String computerChoice = choices[computerIndex];
               
        System.out.println("사용자: " + gamer);
        System.out.println("컴퓨터: " + computerChoice);
               
        if (gamer.equals(computerChoice)) {
            System.out.println("비겼습니다!");
        } else if ((gamer.equals("가위") && computerChoice.equals("보")) ||
                   (gamer.equals("바위") && computerChoice.equals("가위")) ||
                   (gamer.equals("보") && computerChoice.equals("바위"))) {
            System.out.println("사용자가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
        
          s.close();
    }
}
