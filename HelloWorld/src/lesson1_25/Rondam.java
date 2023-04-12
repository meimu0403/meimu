package lesson1_25;
import java.util.Random;


public class Rondam {
	public void sub2() {
	Theme3 a = new Theme3(); //Themw3を呼び出し
	Random rnd = new Random(); //ランダムで回せる処理をrndに代入
	for(int num = 0; num < 5; num++) {  //ランダムで回した処理をさらに条件分岐させる
		switch(num) {
		case 0:
			a.setHp(rnd.nextInt(1001));
			System.out.println("HP :" + a.getHp());
			break;
		case 1:
			a.setMp(rnd.nextInt(1001));
			System.out.println("MP :" + a.getMp());
			break;
		case 2:	
			a.setAttack(rnd.nextInt(1001));
			System.out.println("攻撃力 :" + a.getAttack());
			break;
		case 3:
			a.setAgility(rnd.nextInt(1001));
			System.out.println("素早さ :" + a.getAgility());
			break;
		case 4:
			a.setDefense(rnd.nextInt(1001));
			System.out.println("防御力 :" + a.getDefense());
			break;
	}
}
}

	
		
	}
