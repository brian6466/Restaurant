import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RestaurantCsv {
	public static void main(String[] args) {
		
		Restaurant res1 = new Restaurant(1);
		Restaurant res2 = new Restaurant(2);
		Restaurant res3 = new Restaurant(3);
		
		String file = "src\\Restaurant.csv";
		BufferedReader reader = null;
		String line = "";
		
		try { 
			reader =  new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				if (Integer.parseInt(row[0]) == 1) {
					res1.addTable(new Table(Integer.parseInt(row[1]), Integer.parseInt(row[2])));
				}else if (Integer.parseInt(row[0]) == 2) {
					res2.addTable(new Table(Integer.parseInt(row[1]), Integer.parseInt(row[2])));
				} else {
					res3.addTable(new Table(Integer.parseInt(row[1]), Integer.parseInt(row[2])));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(res1.getTables().size());
		System.out.println(res2.getTables().size());
		System.out.println(res3.getTables().size());
	}

	
	
}
