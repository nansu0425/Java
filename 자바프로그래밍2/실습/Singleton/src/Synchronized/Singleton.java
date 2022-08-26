package Synchronized;

public class Singleton {
	private static Singleton inst = null;
	private Singleton() {
		System.out.println("Synchronized Threadsafe singleton constructor");
	}
	public static synchronized Singleton getInstance() {
		if (inst == null)
			inst = new Singleton();
		return inst;
	}
	
	public void print() {
		System.out.println("Synchronized Threadsafe singleton instance hashcode" + inst.hashCode());
	}
}

