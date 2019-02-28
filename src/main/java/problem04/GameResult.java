package problem04;

import java.util.Comparator;

public class GameResult implements Comparator<GameResult>{
	private int number;
	private int time;
	private int success;
	private int failcnt;
	
	public GameResult(int number, int time, int success, int failcnt) {
		this.number = number;
		this.time = time;
		this.success = success;
		this.failcnt = failcnt;
	}
	
	@Override
	public String toString() {
		return number+" : "+success+" / "+failcnt;
	}

	@Override
	public int compare(GameResult a, GameResult b) {
		if(a.success == b.success) {
			if(a.time<b.time) {
				return 1;
			}
			return -1;
		}else if(a.success > b.success){
			return -1;
		}else {
			return 1;
		}
	}
}
