/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package lesson14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String strArray[] = {"a","b","c","d","e","f","g","h","i","j"};
		String str = "d";
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
			if(strArray[i] == str) {
				break;
			}
		}
	
		for (int num1 = 0; num1 < strArray.length; num1++) {
			if(!(num1 == 8) ){
				System.out.println(strArray[num1]);
			}
			
		}	
	}
	}

