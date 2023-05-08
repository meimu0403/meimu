package lesson1_31;

public class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	static int count = 0; // count初期化値設定
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // 要素の数増やす
	}

	public double bmi() {
		double height = 1.7;  // 身長は適当な値で固定
		double bmi = weight/ (height * height); // bmiの計算式
		return bmi; // 返す処理
	}
	public void print() {
		System.out.println("名前は" + this.name + "です"); // nameの出力
		System.out.println("年は" + this.age + "歳です"); // ageの出力
		System.out.println("BMIは" + this.bmi() + "です"); // bmiの出力
	}
	public static void printCount() {
		System.out.println("合計" + count + "人です"); // countの出力
	}
	// fullNameメソッドを定義
	  public String fullName(String firstName, String lastName) {
	    return firstName + lastName;
	  }
	  public void buy(Car car) {
		  car.setOwner(this.fullName("鈴木", "太郎"));
		  System.out.println(car.getOwner() + "が購入しました");
	  }
	  public void buy(Bicycle bicycle) {
		  bicycle.setOwner(this.fullName("山田","花子"));
		  System.out.println(bicycle.getOwner() + "が購入しました");
	  }
}
