package InnerStaticClass;

public class Singleton {
	private static class SingletonHolder {
		private static final Singleton inst = new Singleton();
	}
	
	private Singleton() {
		System.out.println("Inner Static Class singleton constructor");
	}
	public static Singleton getInstance() {
		return  SingletonHolder.inst;
	}
	
	public void print() {
		System.out.println("Inner Static Class instance hashcode" + SingletonHolder.inst.hashCode());
	}
}


