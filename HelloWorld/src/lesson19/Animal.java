package lesson19;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dogA = new Dog();
		System.out.println(dogA.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dogB = new Dog(3);
		System.out.println(dogB.dogNum);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //現在の日付を取得
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //calendarメソッドを利用　カレンダー方式
        Date d1 = calendar.getTime();
        System.out.println(sdf.format(d1));
        //上記のメソッド（値）を代入してコンソール出力
        
	}
}
