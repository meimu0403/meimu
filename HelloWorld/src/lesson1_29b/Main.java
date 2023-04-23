/*

 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください

   	例:
   	8
   	5
   	9
   	と入力された場合（昇順）

   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */
package lesson1_29b;
// インポート
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import lesson1_29.Sub;
import lesson1_29.Sub2;

public class Main {
	//配列宣言
	public static String[] indicesStr;
	public static void main(String[] args) {
		// 入力を求める処理
		// スキャナー処理を記述
		Scanner scanner = new Scanner(System.in);
		System.out.print("1〜10の値を入力");
		// 配列の中身分割
		indicesStr = scanner.nextLine().split(",");
		System.out.print("昇順の場合は 1、降順の場合は 0 を入力します。");
		// スキャナー処理
		int order = scanner.nextInt();
		// sub呼び出し
		Sub sub = new Sub();
		// sub2呼び出し
		Sub2 sub2 = new Sub2();
		// 並べ替えを適用
		if(order == 1) {
			// 昇順を適用
			Arrays.sort(indicesStr); // 配列のソート
			sub2.printMessage();
		} else {
			// ０だったら降順
			Arrays.sort(indicesStr, Collections.reverseOrder()); // 配列のソート
			sub2.printMessage();
		}
		// スキャナーを閉じる
		scanner.close();
	}
}
