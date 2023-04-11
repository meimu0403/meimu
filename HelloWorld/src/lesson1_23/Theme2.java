/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package lesson1_23;
	public class Theme2{
		
		public static void main(String[] args) {
			Theme3 a = new Theme3(); //Theme３から呼び出し
//			a.setName("");
			a.getName();
			a.getCm();
			a.getKm();
			System.out.println("動物名：" + a.getName()); //a.getNameを記述しコンソール出力
			System.out.println("体重：" + a.getCm() + "cm");  //a.getCmを記述しコンソール出力
			System.out.println("速度：" + a.getKm() + "km/h"); //a.getKmを記述しコンソール出力
		}
}