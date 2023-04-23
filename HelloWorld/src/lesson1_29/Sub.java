package lesson1_29;

public class Sub { // 宣言
	private String name;
	private String capital;
	private double area;

	 // getter処理で県名を取得
	public String getName() {
		return name;
	}
	 // 県名をを設定
	public void setName(String name) {
		this.name = name;
	}
	 // 県庁所在地を取得
	public String getCapital() {
		return capital;
	}
	 // 県庁所在地を設定
	public void setCapital(String capital) {
		this.capital = capital;
	}
	 // 面積を取得
	public double getArea() {
		return area;
	}
	 // 面積を設定
	public void setArea(double area) {
		this.area = area;
	}
}
