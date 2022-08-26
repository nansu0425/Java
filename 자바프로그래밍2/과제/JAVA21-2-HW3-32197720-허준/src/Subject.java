
public interface Subject {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver(Animal animal, boolean flag);
}
