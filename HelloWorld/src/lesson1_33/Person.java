package lesson1_33;
// インスタンスフィールド
public class Person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;
	 // コンストラクタを定義
	Person(String firstName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	  // コンストラクタオーバーロード
	Person(String firstName, String lastName,int age, double height, double weight){
	Person.count++;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.height = height;
	this.weight = weight;
	}
	public String fullName(){ // fullNameメソッド定義
		return this.firstName + this.lastName; // firstNameとlastNameを合わせた値を返す
	}
 // printメソッドの定義
	public void print(){ 
		System.out.println("名前は" + this.fullName() + "です"); // 名前の出力
		System.out.println("年は" + this.age + "です"); // 年齢出力
	}
 // bmiメソッドの定義
	public double bmi(){
 // bmiの計算して返す処理
		return this.weight / this.height / this.height;
	}
 // printCountメソッド定義
	public static void printCount(){
 // Person.countの出力
		System.out.println("合計" + Person.count + "人です");

	}
}
