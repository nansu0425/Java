import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PeriodicElementImporter {
	public static PeriodicElement parse(String[] items) {
		try {
			if (items.length == 8) {
				int number = Integer.parseInt(items[0]);
				String name = items[1];
				String symbol = items[2];
				double weight = Double.parseDouble(items[3]);
				int period = Integer.parseInt(items[4]);
				int group = 0;
				if (!items[5].equals(""))
					group = Integer.parseInt(items[5]);
				State state = State.stateFactory(items[6]);
				String type = items[7];
				
				return PeriodicElementFactory.getInstance(number, symbol, name, weight, period, group, state, type);
			} else if (items.length == 7) {
				int number = Integer.parseInt(items[0]);
				String name = items[1];
				String symbol = items[2];
				double weight = Double.parseDouble(items[3]);
				int period = Integer.parseInt(items[4]);
				int group = 0;
				if (!items[5].equals(""))
					group = Integer.parseInt(items[5]);
				State state = State.stateFactory(items[6]);
				String type = "";
				return PeriodicElementFactory.getInstance(number, symbol, name, weight, period, group, state, type);
			}
		} catch (Exception e) {
			System.out.println("Exception1!");
		}
		return null;
	}
	
	public static List<PeriodicElement> loadCSV(String filename) {
		List<PeriodicElement> list = new ArrayList<>();
		File csv = new File("./" + filename + ".txt");
		String line = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
			while ((line = br.readLine()) != null) {
				String[] items = line.split(",");
				PeriodicElement p = parse(items);
				list.add(p);
			}
		} catch (Exception e) {
			System.out.println("Exception2!");
		} 
		return list;
	}
}
