package lesson1_31;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木" + "太郎", 20, 1.7, 60.0); // personにいれる値を指定
		//person1.print(); // 出力結果をpersonメソッドから持ってくる
		Person person2 = new Person("山田" + "花子",22 ,1.5 , 40);
		//Person.printCount(); // 合計人数呼び出し
		// Carクラス呼び出し
		Car car = new Car();
		// Bicycle呼び出し
		Bicycle bicycle = new Bicycle();
		// CarクラスのOwnerにperson1の"鈴木", "太郎"を設定
		car.setOwner(person1.fullName("鈴木", "太郎"));
		// bicycleクラスのOwnerにperson2の"山田", "花子"を設定
		bicycle.setOwner(person2.fullName("山田", "花子"));
		 // 以下を出力
		System.out.println(car.getOwner());   
		System.out.println(bicycle.getOwner());
		// 乗り物を購入
		  person1.buy(car);
		  person2.buy(bicycle);
	}
}