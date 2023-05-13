package lesson1_33;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);  // person呼び出して中身設定してperson1の代入
		person1.print();  // person1の設定でprintを呼び出す

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);  // person呼び出して中身設定してperson2の代入
		person2.print();  // person2の設定でprintを呼び出す

		Person.printCount(); // printCount呼び出し
	}

}
