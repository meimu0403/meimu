package lesson1_22;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Theme3 {

	public static void main(String[] args) {
		Theme2 a = new Theme2(); //THemeのパッケージ呼び出し
		a.hello();
		a.sushi();
		a.food();
		a.time(0);
		System.out.println(a.hello + a.countries); //コンソールでこんにちは！ここは日本です！と記述
		
		System.out.println(a.sushi); //コンソールでこの寿司はうまいと記述
		
		System.out.println(a.food); //コンソールで寿司は和食ですと記述
		
		SimpleDateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //現在の日付を取得
        Date date = new Date();
        
        Calendar calendar = Calendar.getInstance(); //カレンダー方式
        calendar.setTime(date);
        
        Date d1 = calendar.getTime();
        System.out.println(a.word+time.format(d1) + "です"); //コンソールで今の現在日時は2023/03/09 10:23:39ですと記述
        
        
       
 

	}
	
}
