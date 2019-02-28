package problem04;
import java.util.*;
public class Main{
	
	public static void main(String[] args){
		List<RandomGG> ggList = new ArrayList<RandomGG>();
		Queue<GameResult> gameList = new PriorityQueue<GameResult>();
		Scanner scan = new Scanner(System.in);
		int rannum;
		int gamecnt=0;
		int answer=0;
		int time=0, fail=0, success=0;
		String continueGame="yes";

		while(continueGame.equals("yes")) {
			for(int i=0;i<18;i++) {
				rannum = new Random().nextInt(9)+1;
				ggList.add(new RandomGG((int)i/2+1,rannum));
			}
			gamecnt++;
			fail=0;
			time=0;
			success=0;
			int num=1;
			while(!ggList.isEmpty()) {
				rannum = new Random().nextInt(ggList.size());
				System.out.println(num+". "+ggList.get(rannum).toString()+"?");
				if(scan.nextInt()!=ggList.get(rannum).getResult()) {
						success++;
				}else {
					fail++;	
				}
				ggList.remove(rannum);
				time++;
				num++;
			}
			gameList.offer(new GameResult(gamecnt,time,success,fail));
			for(int i=0;i<gameList.size();i++) {
				System.out.println(gameList.peek().toString());
				gameList.offer(gameList.poll());
			}
			System.out.println("계속하시겠습니까? (yes/no)");
			continueGame = scan.next();
		}
		
		
		
		
	}
}