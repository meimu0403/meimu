package lesson1_27;

public class Sub {

	private String name; //宣言
	private double m; //アクセス修飾子privateを使用して定義する
	private int km;  //アクセス修飾子privateを使用して定義する
	String getName() {  //下記setter.getter処理
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	double getM() {
		return this.m;
	}
	public void setM(double m) {
		this.m = m;
	}
	int getKm() {
		return this.km;
	}
	public void setKm(int km) {
		this.km = km;
	}


}

