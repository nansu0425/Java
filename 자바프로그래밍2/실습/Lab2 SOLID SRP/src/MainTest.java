
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager manager = new BookManager();
		manager.loadFromFile();
		manager.show();
		manager.loadFromDB();
		manager.show();
		
		BookManager2 manager2 = new BookManager2();
		manager2.setLoader(new BookDataLoaderFromFile2());
		manager2.setViewer(new BookDataViewerConsole2());
		manager2.load();
		manager2.show();
		manager2.setLoader(new BookDataLoaderFormDB2());
	}

}
