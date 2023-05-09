package lesson1_32;

public class Person {
	 // フィールドの定義
	public String name;
	public int age;
	public double height;
	public double weight;
	static int count = 0;
	Person(String name, int age, double height, double weight){ // Personコンストラクタ定義
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count++;
	}
	public static void printCount() { // カウントの処理
		System.out.println("合計" + count + "人です"); // countの出力
	}
}