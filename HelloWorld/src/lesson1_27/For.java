package lesson1_27;

import java.util.Scanner; //スキャナーimport

public class For {
	public void sub2() {
		try (Scanner sc1 = new Scanner(System.in)) { //標準入力からデータを読み取ることができるオブジェクトを作成
			String line1 = sc1.nextLine(); //スキャナー処理
			String [] animals = line1.split(","); //animalsを,で分割させる
			String name[] = new String[animals.length]; //animalの配列分値を出してくる
			double m[] = new double[animals.length]; //インスタンス化
			int km[] = new int [animals.length]; //インスタンス化

			for(int i = 0; i < animals.length; i++) { //すべてのanimals配列の要素を順番に処理
				String [] ani = animals[i].split(":"); //animalsを:で分割させる
				name[i] = ani[0]; //aniの配列0番目を指定したものを代入
				m[i] = Double.valueOf(ani[1]);  //string型からdouble型へ変換させる
				km[i] = Integer.valueOf(ani[2]); //string型からint型へ変換させる
				Sub sub = new Sub(); //subパッケージから呼び出す
				sub.setName(name[i]); //nameのなかにname[i]をセット
				sub.setM(m[i]); //mのなかにm[i]をセット
				sub.setKm(km[i]); //kmのなかにkm[i]をセット
				System.out.println("動物名：" + sub.getName()); //出力結果
				System.out.println("体長：" + sub.getM() + "m"); //出力結果
				System.out.println("速度：" + sub.getKm() +"km/h"); //出力結果

				switch(name[i]){   //switch分で学名の記述の条件出して呼び出す
				case "ライオン": //値がライオンの時
					System.out.println("学名：パンテラ レオ"); //出力
					break; 
				case "ゾウ": //値がゾウの時
					System.out.println("学名：ロキソドンタ・サイクロティス");
					break;
				case "パンダ": //値がパンダの時
					System.out.println("学名：アイルロポダ・メラノレウカ");
					break;
				case "チンパンジー": //値がチンパンジーの時
					System.out.println("学名：パン・トゥログロディテス");
					break;
				case "シマウマ": //値がシマウマの時
					System.out.println("学名：チャップマンシマウマ");
					break;
				case "インコ": //値がインコの時
					System.out.println("学名：不明");
					break;
				}
				System.out.println(""); //スペース出力
			}
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}