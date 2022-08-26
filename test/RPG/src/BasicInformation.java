
public class BasicInformation {
	private int hp;
	private int mp;
	private int power;
	Inventory inventory = new Inventory();
	
	public BasicInformation(int hp, int mp, int power) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	
}
