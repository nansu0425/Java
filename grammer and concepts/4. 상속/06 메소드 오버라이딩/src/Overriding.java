/*
 * 게임에서 무기를 표현하는 Weapon 클래스를 만들고 살상능력을 리턴하는 fire() 메소드를 작성하고 대포를 구현하기 위해
 * Weapon을 상속받는 Cannon 클래스를 작성하라
 * Cannon은 살상능력이 10이다
 * fire() 메소드를 이에 맞게 오버라이딩하라
 */

public class Overriding {
	public static void main (String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}
}
