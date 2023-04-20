package lesson1_29;

public class Sub { // 宣言
    private String name;
    private String capital;
    private double area;

    public Sub(String name, String capital, double area) { // コンストラクタ作成
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() { // getter処理
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }
}
