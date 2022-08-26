package LazyInitializion;

public class Singleton {
	private static volatile Singleton inst = null;
	private Singleton() {
		System.out.println("Lazy Initializion singleton constructor");
	}
	public static Singleton getInstance() {
		if (inst == null) {
			synchronized (Singleton.class) {
				if (inst == null)
					inst = new Singleton();
			}
		}
		return inst;
	}
	
	public void print() {
		System.out.println("Lazy Initializion singleton instance hashcode" + inst.hashCode());
	}
}
