package lesson1_25;



public class Theme3 {  //宣言して値を初期値に
	private int hp = 0;
	private int mp = 0;
	private int Agility = 0;
	private int attack = 0;
	private int defense = 0;
	
	
	public int getHp(){  //setter.getter処理
		return this.hp;		
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAgility() {
		return this.Agility;
	}
	public void setAgility(int Agility) {
		this.Agility = Agility;
	}
	public int getAttack() {
		return this.attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return this.defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
}

	


