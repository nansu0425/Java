package EagerInitialization;

public class Singleton {
	private static Singleton inst = new Singleton();
	private Singleton() {
		System.out.println("Eager Initialization singleton constructor");
	}
	public static Singleton getInstance() {
		return inst;
	}
	
	public void print() {
		System.out.println("Eager Initialization singleton instance hashcode" + inst.hashCode());
	}
}
