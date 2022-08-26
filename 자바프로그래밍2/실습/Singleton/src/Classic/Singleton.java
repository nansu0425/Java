package Classic;

public class Singleton {
	private static Singleton inst = null;
	private Singleton() {
		System.out.println("classic singleton constructor");
	}
	public static Singleton getInstance() {
		if (inst == null)
			inst = new Singleton();
		return inst;
	}
	
	public void print() {
		System.out.println("classic singleton instance hashcode" + inst.hashCode());
	}
}

