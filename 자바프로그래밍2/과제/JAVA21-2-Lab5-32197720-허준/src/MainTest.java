import java.io.File;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements");
		list.forEach(System.out::println);
	}

}
