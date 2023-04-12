package lesson1_25;
import java.util.Scanner;
/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
public class Theme2{
	


	public static void main(String[] args) {
		Rondam sub2 = new Rondam(); //ランダムになるように記述　sub2に代入
		try (Scanner scanner = new Scanner(System.in)) { //スキャナーの処理をscannerに代入
			String input = scanner.nextLine(); //1行を読み込んで返却
			    System.out.println("こんにちは「" + input + "」さん"); //名前と共に挨拶を出力
		}		    
		sub2.sub2();    //呼び出し
		System.out.println("");  //スペース出力
		System.out.println("さあ冒険に出かけよう"); //コンソール出力
		
	}
}	