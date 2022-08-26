import java.util.List;

public class BookDataViewerConsole2 extends BookDataViewer2 {

	@Override
	public void show(List<Book2> books) {
		// TODO Auto-generated method stub
		for (Book2 book : books) {
			System.out.println("show the book info " + book);
		}
	}

}
