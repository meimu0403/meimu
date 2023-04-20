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
 package lesson1_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 都道府県データの定義
         Sub[] prefectures = { // 配列に下記を代入
            new Sub("北海道", "札幌市", 83424), // インスタンス化した破裂の値
            new Sub("青森県", "青森市", 9646),
            new Sub("岩手県", "盛岡市", 15275),
            new Sub("宮城県", "仙台市", 7282),
            new Sub("秋田県", "秋田市", 11638),
            new Sub("山形県", "山形市", 9323),
            new Sub("福島県", "福島市", 13784),
            new Sub("茨城県", "水戸市", 6097),
            new Sub("栃木県", "宇都宮市", 6408),
            new Sub("群馬県", "前橋市", 6362),
            new Sub("埼玉県", "さいたま市", 3798)
        };

        // 入力を求める処理
        Scanner scanner = new Scanner(System.in); // スキャナー処理を記述
        System.out.print("数字と昇順・降順の値を入力");
        String[] indicesStr = scanner.nextLine().split("\\s+"); // 配列の中身分割
        List<Integer> indices = new ArrayList<>(); // new演算子とArrayListで空のListを用意する
        for(String indexStr : indicesStr) { // 繰り返す処理
            indices.add(Integer.parseInt(indexStr)); // 文字列変換する
        }

        System.out.print("昇順の場合は 1、降順の場合は 0 を入力します。");
        int order = scanner.nextInt(); // スキャナー処理

        // 並べ替えを適用
        if(order > 0) {
            // 昇順を適用
            Collections.sort(indices);
        } else {
            // それ以外は降順
            Collections.sort(indices, Collections.reverseOrder());
        }

        // 出力結果
        for(int index : indices) {
            System.out.println("都道府県名：" + prefectures[index].getName());
            System.out.println("県庁所在地：" + prefectures[index].getCapital());
            System.out.println("面積：" + prefectures[index].getArea() + "km2");
            System.out.println("");
        }

        // スキャナーを閉じる
        scanner.close();
    }
}
