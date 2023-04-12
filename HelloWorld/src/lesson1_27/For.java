package lesson1_27;

import java.util.Scanner;

public class For {
	public void sub2() {
		Scanner sc1 = new Scanner(System.in);
		String line1 = sc1.nextLine();
		String [] animals = line1.split(","); //animalsを,で分割させる
		String name[] = new String[animals.length]; //animalの配列分値を出してくる
		double m[] = new double[animals.length];
		int km[] = new int [animals.length];
	
for(int i = 0; i < animals.length; i++) {
	 String [] ani = animals[i].split(":"); //animalsを:で分割させる
	 name[i] = ani[0];
	 m[i] = Double.valueOf(ani[1]);  //string型からdouble型へ変換させる
	 km[i] = Integer.valueOf(ani[2]); //string型からint型へ変換させる
	 Sub sub = new Sub(); //subパッケージから呼び出す
	 sub.setName(name[i]);
	 sub.setM(m[i]);
	 sub.setKm(km[i]);
	 System.out.println("動物名：" + sub.getName());
		System.out.println("体長：" + sub.getM() + "m");
		System.out.println("速度：" + sub.getKm() +"km/h");

	switch(name[i]){   //switch分で学名の記述の条件出して呼び出す
	 case "ライオン":
		 System.out.println("学名：パンテラ レオ");
		 break;
	 case "ゾウ": 
		 System.out.println("学名：ロキソドンタ・サイクロティス");
		 break;
	 case "パンダ": 
		 System.out.println("学名：アイルロポダ・メラノレウカ");
		 break;
	 case "チンパンジー":
		 System.out.println("学名：パン・トゥログロディテス");
		 break;
	 case "シマウマ":
		 System.out.println("学名：チャップマンシマウマ");
		 break;
	 case "インコ":
		 System.out.println("学名：不明");
		 break;
	 }
	System.out.println(""); //スペース出力
 }

}
	
}