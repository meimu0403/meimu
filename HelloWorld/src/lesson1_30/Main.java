package lesson1_30;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0); // personにいれる値を指定
		person1.print(); // 出力結果をpersonメソッドから持ってくる
		//    System.out.println(person1.name);
		//    System.out.println(person1.age);
		//    System.out.println(person1.height);
		Person.printCount(); // 合計人数呼び出し

	}
}