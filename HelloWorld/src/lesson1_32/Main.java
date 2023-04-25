package lesson1_32;

import lesson1_30.Person;

public class Main {
	public static void main(String[] argos){
		 // person1にいれる値を指定
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
//		person1.print();
		 // person2にいれる値を指定
		Person person2 = new Person("山田花子", 22, 1.5, 40);
//		person2.print();
//		System.out.println("合計" + Person.count + "人です");
		Person.printCount(); // 合計人数呼び出し
		}
}
