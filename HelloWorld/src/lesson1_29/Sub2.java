package lesson1_29;

import lesson1_29b.Main;

public class Sub2 {
	// 配列に下記を代入
	String[] prefectures = { 
			"北海道:札幌市:83424", 
			"青森県:青森市:9646",
			"岩手県:盛岡市:15275",
			"宮城県:仙台市:7282",
			"秋田県:秋田市:11638",
			"山形県:山形市:9323",
			"福島県:福島市:13784",
			"茨城県:水戸市:6097",
			"栃木県:宇都宮市:6408",
			"群馬県:前橋市:6362",
			"埼玉県:さいたま市:3798"
	};
	 //引数に文字列型と整数型を渡す
	public  void printMessage() {
		 // main呼び出し
		Main main = new Main();
		 // indicesStrの配列分繰り返し処理
		for(int i = 0; i < main.indicesStr.length; i++) {
			 // stringをintに変換してmainのindicesStr出してきて”:”で文字分割
			String[] sp = prefectures[Integer.parseInt(main.indicesStr[i])].split(":");
			 // spの配列分繰り返し処理
			for(int m = 0; m < sp.length; m++) {
				 // sub呼び出し
				Sub sub = new Sub();
				 // subのsetNameのsp配列呼び出し
				sub.setName(sp[m]);
				 // subのsetCapitalのsp配列呼び出し、メモリー数一増やす
				sub.setCapital(sp[++m]);
				 // subのsetAreaをdoubleに変えてsp配列呼び出し
				sub.setArea(Double.parseDouble(sp[++m]));
				 // 出力結果
				System.out.println("都道府県名：" + sub.getName());
				System.out.println("県庁所在地：" + sub.getCapital());
				System.out.println("面積：" + sub.getArea() + "km2");
				System.out.println("");
			}
			
		}
	}
}
