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
			System.out.print("�Z");
		}			
		System.out.print("��");
		for(int i = 1; i <= masu - me; i++) {
			System.out.print("�Z");
		}	
		System.out.println("���S�[��");
		if(goal == true) {
			System.out.println("�Q�[���N���A�I�I");
			break;
		}
		System.out.println("���������U�낤�I�I�@1�F���������U��@2�F�X�^�[�g�ɖ߂�");
		int choice = stdIn.nextInt();
		switch(choice) {
		case 1:
			System.out.println("��������̖ڂ�...");
			sai = (int)Math.ceil(Math.random() *  6);
			System.out.println(sai + "�ł��I");
			me = me + sai;
			if(me > masu) {
				me =  masu - (me - masu);
			}else if(me == masu) {
				goal = true;
			}
			break;
		case 2:
			System.out.println("�ŏ��ɖ߂�܂�");
			me = 1;
			break;
		default:
			System.out.println("1��2����͂��āI");
			break;	
		}
		
		}
			
		
		System.exit(0);
	}
}