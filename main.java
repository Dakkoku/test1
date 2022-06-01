import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int me = 1;
		int masu = 30;
		int sai = 0;
		boolean goal = false;
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
		
		for(int i = 1; i <= me - 1; i++) {
			System.out.print("〇");
		}			
		System.out.print("■");
		for(int i = 1; i <= masu - me; i++) {
			System.out.print("〇");
		}	
		System.out.println("←ゴール");
		if(goal == true) {
			System.out.println("ゲームクリア！！");
			break;
		}
		System.out.println("さいころを振ろう！！　1：さいころを振る　2：スタートに戻る");
		int choice = stdIn.nextInt();
		switch(choice) {
		case 1:
			System.out.println("さいころの目は...");
			sai = (int)Math.ceil(Math.random() *  6);
			System.out.println(sai + "です！");
			me = me + sai;
			if(me > masu) {
				me =  masu - (me - masu);
			}else if(me == masu) {
				goal = true;
			}
			break;
		case 2:
			System.out.println("最初に戻ります");
			me = 1;
			break;
		default:
			System.out.println("1か2を入力して！");
			break;	
		}
		
		}
			
		
		System.exit(0);
	}
}