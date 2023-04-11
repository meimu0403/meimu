/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
package lesson1_22;
public class Theme2{

	String hello,countries;	 //宣言
		public void hello() {
			this.hello = "こんにちは！"; //helloにこんにちは！を代入
			this.countries = "ここは日本です！"; //countriesにここは日本です！を代入
		}
	String sushi,food,word;	 //宣言
	int time;
		public void sushi(){
			this.sushi = "この寿司はうまい"; //sushiにこの寿司はうまいを代入
		}
		public void food(){
			this.food = "寿司は和食です"; //foodに寿司は和食ですを代入
		}
		public void time(int time) {
			this.time = time;
			this.word = "現在の日時は"; //wordに現在の日時はを代入
		}
}				
			
		
	
	
	 
	
