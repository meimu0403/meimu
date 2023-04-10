package lesson18;

import java.util.Arrays;
import java.util.Random;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello ();
		num(8);
		num1(3,4);
		num1(2.1,3.3);
		System.out.println(num(8));
		System.out.println(num1(3,4));
		System.out.println(num1(2.1,3.3));
		
		System.out.println(Arrays.toString(num2(2)));
		System.out.println(avg(2));
	}
		public static void hello() {
			System.out.println("Hello Java");
		}
		
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		public static int num(int x) {
			 return x+1; 
		}
		
	 //Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		public static int num1(int y, int g) {
			return y*g;
		}
		
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		public static double num1(double f, double h) {
			return f*h;
		}
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		public static int[] num2(int r) {
			int[] nums = new int[r];
			for(int i = 0; i < r; i++) {
				Random rnd = new Random();
				nums[i] = rnd.nextInt(100);
				}
			return nums;
		}
	
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
//		引数　Q5の取り出した値を入れる
//		処理↓
//		１,引数の値を取り出す。
//		２,取り出した値をたす。
//		３,取り出した値の平均で少数点まで出す。返す。
		public static double avg(int r) {
			
			int [] num3 = num2(r);
			int num5 = 0;
			for(int num4: num3) {
				num5 += num4;
			}
			double num6 = num5 / num3.length;
			return num6;
		}
	}


