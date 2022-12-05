import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RestaurantUI {
	// Indian Restaurant Object
	Restaurant res1 = new Restaurant(1);

	// Indian Starters

	Food Poppadoms = new Food("Poppadoms", 3.00);
	Food Samosas = new Food("Samosas", 2.00);
	Food Chicken_Pakora = new Food("Chicken Pakora", 4.00);
	Food Prawn_Momos = new Food("Prawn Momos", 4.00);

	// Indian MainCourses

	Food Tikka_Masala = new Food("Tikka Masala", 12.99);
	Food Korma = new Food("Korma", 11.99);
	Food Madras = new Food("Madras", 10.99);
	Food Mixed_Veg = new Food("Mixed Vegetables", 9.99);
	Food Prawn_Balti = new Food("Prawn Balti", 12.99);
	Food Biryani = new Food("Biryani", 8.00);

	// Chinese Restaurant Object
	Restaurant res2 = new Restaurant(2);

	// Chinese Starters

	Food Spring_Rolls = new Food("Spring Rolls", 2.00);
	Food Meat_Sung = new Food("Meat Sung", 4.00);
	Food Chicken_Wings = new Food("Chicken Wings", 6.00);
	Food King_Prawns = new Food("King Prawns ", 5.00);

	// Chinese MainCourses

	Food Soup_Of_The_Day = new Food("Soup Of The Day", 9.99);
	Food Seafood_Curry = new Food("Seafood Curry", 12.99);
	Food Combination_Duck = new Food("Combination Duck", 14.99);
	Food PepperCorn_Chicken = new Food("PepperCorn Chicken", 11.99);
	Food Chow_Mein = new Food("Chow Mein", 9.99);
	Food StirFry = new Food("StirFry", 10.99);

	// Italian Restaurant Object
	Restaurant res3 = new Restaurant(3);

	// Italian Starters

	Food Garlic_Focaccia = new Food("Garlic Focaccia", 4.00);
	Food Bruschetta = new Food("Bruschetta", 3.00);
	Food Parma_Focaccia = new Food("Parma Focaccia", 4.00);
	Food Spicy_Prawn_Brochettes = new Food("Spicy Prawn Brochettes ", 5.00);

	// Italian MainCourses

	Food Lasagne_Bolognese = new Food("Lasagne Bolognese ", 12.99);
	Food Spaghetti_Alla_Carbonara = new Food("Spaghetti Alla Carbonara", 14.99);
	Food Fusilli_Salmon = new Food("Fusilli Salmon", 13.99);
	Food Ravioli_Verdi = new Food("Ravioli Verdi", 12.99);
	Food Pizza = new Food("Pizza", 10.99);
	Food Orecchiette = new Food("Orecchiette", 11.99);

	// Deserts

	Food Ice_Cream = new Food("Ice Cream", 3.50);
	Food Lassi = new Food("Lassi ", 4.99);
	Food Fuskas = new Food("Fuskas ", 3.99);
	Food Brownies = new Food("Brownies ", 4.99);
	Food Cheese_Cake = new Food("Cheese Cake ", 6.99);
	Food Apple_Pie = new Food("Apple Pie", 3.99);
	Food Pavlova = new Food("Pavlova ", 5.99);

	// Drinks

	Food Fanta = new Food("Fanta ", 3.00);
	Food Coke = new Food("Coke ", 3.00);
	Food Diet_Coke = new Food("Diet Coke", 3.00);
	Food Juice = new Food("Juice ", 2.50);
	Food Seven_Up = new Food("7 Up", 3.00);

	String file = "src\\Restaurant.csv";
	BufferedReader reader = null;
	String line = "";
	{

		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				if (Integer.parseInt(row[0]) == 1) {
					res1.addTable(new Table(Integer.parseInt(row[1]), Integer.parseInt(row[2])));
				} else if (Integer.parseInt(row[0]) == 2) {
					res2.addTable(new Table(Integer.parseInt(row[1]), Integer.parseInt(row[2])));
				} else {
					res3.addTable(new Table(Integer.parseInt(row[1]), Integer.parseInt(row[2])));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private Scanner in;

	public RestaurantUI() {
		in = new Scanner(System.in);
	}

	/**
	 * Runs the system.
	 * @throws FileNotFoundException 
	 */
	public void run() throws FileNotFoundException {
		// Indian Restaurant Menu

		// Indians starters added
		res1.addStarter(Poppadoms);
		res1.addStarter(Samosas);
		res1.addStarter(Chicken_Pakora);
		res1.addStarter(Prawn_Momos);

		// Indian MainCourse
		res1.addMaincourse(Tikka_Masala);
		res1.addMaincourse(Korma);
		res1.addMaincourse(Madras);
		res1.addMaincourse(Mixed_Veg);
		res1.addMaincourse(Prawn_Balti);
		res1.addMaincourse(Biryani);

		// Deserts

		res1.addDesert(Ice_Cream);
		res1.addDesert(Brownies);
		res1.addDesert(Apple_Pie);
		res1.addDesert(Pavlova);
		res1.addDesert(Lassi);
		res1.addDesert(Cheese_Cake);
		res1.addDesert(Fuskas);

		// Drinks

		res1.addDrinks(Fanta);
		res1.addDrinks(Seven_Up);
		res1.addDrinks(Coke);
		res1.addDrinks(Diet_Coke);
		res1.addDrinks(Juice);

		// Chinese Restaurant Menu

		// Chinese starters added
		res2.addStarter(Spring_Rolls);
		res2.addStarter(Meat_Sung);
		res2.addStarter(Chicken_Wings);
		res2.addStarter(King_Prawns);

		// Chinese MainCourse
		res2.addMaincourse(Soup_Of_The_Day);
		res2.addMaincourse(Seafood_Curry);
		res2.addMaincourse(Combination_Duck);
		res2.addMaincourse(PepperCorn_Chicken);
		res2.addMaincourse(Chow_Mein);
		res2.addMaincourse(StirFry);

		// Deserts

		res2.addDesert(Ice_Cream);
		res2.addDesert(Brownies);
		res2.addDesert(Apple_Pie);
		res2.addDesert(Pavlova);
		res2.addDesert(Lassi);
		res2.addDesert(Cheese_Cake);
		res2.addDesert(Fuskas);

		// Drinks

		res2.addDrinks(Fanta);
		res2.addDrinks(Seven_Up);
		res2.addDrinks(Coke);
		res2.addDrinks(Diet_Coke);
		res2.addDrinks(Juice);

		// Italian Menu

		// Italian Starters
		res3.addStarter(Garlic_Focaccia);
		res3.addStarter(Bruschetta);
		res3.addStarter(Parma_Focaccia);
		res3.addStarter(Spicy_Prawn_Brochettes);

		// Italian MainCourses

		res3.addMaincourse(Lasagne_Bolognese);
		res3.addMaincourse(Spaghetti_Alla_Carbonara);
		res3.addMaincourse(Fusilli_Salmon);
		res3.addMaincourse(Ravioli_Verdi);
		res3.addMaincourse(Pizza);
		res3.addMaincourse(Orecchiette);

		// Deserts

		res3.addDesert(Ice_Cream);
		res3.addDesert(Brownies);
		res3.addDesert(Apple_Pie);
		res3.addDesert(Pavlova);
		res3.addDesert(Lassi);
		res3.addDesert(Cheese_Cake);
		res3.addDesert(Fuskas);

		// Drinks

		res3.addDrinks(Fanta);
		res3.addDrinks(Seven_Up);
		res3.addDrinks(Coke);
		res3.addDrinks(Diet_Coke);
		res3.addDrinks(Juice);

		boolean more = true;
		while (more) {
			ArrayList<Reservation> reservations = new ArrayList<Reservation>();
			File csvFile = new File("reservation.csv");
			PrintWriter out = new PrintWriter(csvFile);
			for (Reservation reservation : reservations) {
				out.println(reservation.toString());
			}
			out.close();

		
			System.out.println("Type 1 for Restaurant one, 2 for Restaurant two, 3 for Restaurant three.");
			String command = in.next().toUpperCase();

			if (command.equals("1")) {
				System.out.println("R)eserve Table V)iew Menu C)ancel Reservation A)vailable Tables Q)uit");
				String one = in.next().toUpperCase();

				if (one.equals("R")) {

					System.out.println("Available Tables");
					for (int i = 0; i < res1.getTables().size(); i++) {
						int res1TableNo = res1.getTables().get(i).getTableNo();
						int res1Capacity = res1.getTables().get(i).getCapacity();
						System.out.println("Table Number: " + res1TableNo + "  Capacity: " + res1Capacity);
					}

					System.out.println("Enter Table Number you want to Book");

					int res1Table = in.nextInt();

					System.out.println("Enter Table Capacity: ");

					int res1Capacity = in.nextInt();

					System.out.println("Enter Name: ");

					String res1Name = in.next();

					System.out.println("Enter phone number (EXAMPLE : 0851234567): ");

					int res1Phone = in.nextInt();

					System.out.println("Enter time today (EXAMPLE : 15:30): ");

					String res1Time = in.next();
					// System.out.println(res1.getTables().toString());
					Reservation r = new Reservation(res1, res1Name, res1Table, res1Capacity, res1Phone, res1Time);
					// System.out.println(res1.getTables().toString());

				}
				if (one.equals("V")) {
					System.out.println("");
					System.out.println("Starters:");
					System.out.println("");
					for (int i = 0; i < res1.starters.size(); i++) {
						System.out.println(
								res1.starters.get(i).getFoodName() + " for €" + res1.starters.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Maincourse:");
					System.out.println("");
					for (int i = 0; i < res1.maincourse.size(); i++) {
						System.out.println(res1.maincourse.get(i).getFoodName() + " for €"
								+ res1.maincourse.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Dessert:");
					System.out.println("");
					for (int i = 0; i < res1.desert.size(); i++) {
						System.out.println(
								res1.desert.get(i).getFoodName() + " for €" + res1.desert.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Drinks:");
					System.out.println("");
					for (int i = 0; i < res1.drinks.size(); i++) {
						System.out.println(
								res1.drinks.get(i).getFoodName() + " for €" + res1.drinks.get(i).getFoodPrice());
					}

				}
				if (one.equals("C")) {
					System.out.println("Are you sure you want to cancel your reservation? Y/N");
					String res1CancelRes = in.next().toUpperCase();
					if (res1CancelRes.equals("Y")) {
						System.out.println("Enter phone number you reserved with: ");
						int res1PhoneCancel = in.nextInt();
						// System.out.println(res1.getReservations().size());
						for (int i = 0; i < res1.getReservations().size(); i++) {
							if (res1.getReservations().get(i).getReservationPhoneNo() == res1PhoneCancel) {
								res1.removeReservation(res1.getReservations().get(i));

							}
							// System.out.println(res1.getReservations().size());
						}
						if (res1CancelRes.equals("N")) {
							more = false;
						}
					}
				}
				if (one.equals("A")) {
					for (int i = 0; i < res1.tables.size(); i++) {
						System.out.println("Table Number: " + res1.tables.get(i).getTableNo());
						System.out.println("Capacity: " + res1.tables.get(i).getCapacity());
					}
				}
				if (one.equals("Q")) {
					more = false;
				}

			}
			if (command.equals("2")) {
				System.out.println("R)eserve Table V)iew Menu C)ancel Reservation A)vailable Tables Q)uit");
				String one = in.next().toUpperCase();

				if (one.equals("R")) {

					System.out.println("Available Tables");
					for (int i = 0; i < res2.getTables().size(); i++) {
						int res2TableNo = res2.getTables().get(i).getTableNo();
						int res2Capacity = res2.getTables().get(i).getCapacity();
						System.out.println("Table Number: " + res2TableNo + "  Capacity: " + res2Capacity);
					}

					System.out.println("Enter Table Number you want to Book");

					int res2Table = in.nextInt();

					System.out.println("Enter Table Capacity: ");

					int res2Capacity = in.nextInt();

					System.out.println("Enter Name: ");

					String res2Name = in.next();

					System.out.println("Enter phone number (EXAMPLE : 0851234567): ");

					int res2Phone = in.nextInt();

					System.out.println("Enter time today (EXAMPLE : 15:30): ");

					String res2Time = in.next();
					// System.out.println(res1.getTables().toString());
					Reservation r = new Reservation(res2, res2Name, res2Table, res2Capacity, res2Phone, res2Time);
					// System.out.println(res1.getTables().toString());

				}
				if (one.equals("V")) {
					System.out.println("");
					System.out.println("Starters:");
					System.out.println("");
					for (int i = 0; i < res2.starters.size(); i++) {
						System.out.println(
								res2.starters.get(i).getFoodName() + " for €" + res2.starters.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Maincourse:");
					System.out.println("");
					for (int i = 0; i < res2.maincourse.size(); i++) {
						System.out.println(res2.maincourse.get(i).getFoodName() + " for €"
								+ res2.maincourse.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Dessert:");
					System.out.println("");
					for (int i = 0; i < res2.desert.size(); i++) {
						System.out.println(
								res2.desert.get(i).getFoodName() + " for €" + res2.desert.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Drinks:");
					System.out.println("");
					for (int i = 0; i < res2.drinks.size(); i++) {
						System.out.println(
								res2.drinks.get(i).getFoodName() + " for €" + res2.drinks.get(i).getFoodPrice());
					}

				}
				if (one.equals("C")) {
					System.out.println("Are you sure you want to cancel your reservation? Y/N");
					String res2CancelRes = in.next().toUpperCase();
					if (res2CancelRes.equals("Y")) {
						System.out.println("Enter phone number you reserved with: ");
						int res2PhoneCancel = in.nextInt();
						// System.out.println(res1.getReservations().size());
						for (int i = 0; i < res2.getReservations().size(); i++) {
							if (res2.getReservations().get(i).getReservationPhoneNo() == res2PhoneCancel) {
								res2.removeReservation(res2.getReservations().get(i));
							}
							// System.out.println(res1.getReservations().size());
						}
						if (res2CancelRes.equals("N")) {
							more = false;
						}
					}
				}
				if (one.equals("A")) {
					for (int i = 0; i < res2.tables.size(); i++) {
						System.out.println("Table Number: " + res2.tables.get(i).getTableNo());
						System.out.println("Capacity: " + res2.tables.get(i).getCapacity());
					}
				}
				if (one.equals("Q")) {
					more = false;
				}
			}
			if (command.equals("3")) {
				System.out.println("R)eserve Table V)iew Menu C)ancel Reservation A)vailable Tables Q)uit");
				String one = in.next().toUpperCase();

				if (one.equals("R")) {

					System.out.println("Available Tables");
					for (int i = 0; i < res3.getTables().size(); i++) {
						int res3TableNo = res3.getTables().get(i).getTableNo();
						int res3Capacity = res3.getTables().get(i).getCapacity();
						System.out.println("Table Number: " + res3TableNo + "  Capacity: " + res3Capacity);
					}

					System.out.println("Enter Table Number you want to Book");

					int res3Table = in.nextInt();

					System.out.println("Enter Table Capacity: ");

					int res3Capacity = in.nextInt();

					System.out.println("Enter Name: ");

					String res3Name = in.next();

					System.out.println("Enter phone number (EXAMPLE : 0851234567): ");

					int res3Phone = in.nextInt();

					System.out.println("Enter time today (EXAMPLE : 15:30): ");

					String res3Time = in.next();
					// System.out.println(res1.getTables().toString());
					Reservation r = new Reservation(res3, res3Name, res3Table, res3Capacity, res3Phone, res3Time);
					// System.out.println(res1.getTables().toString());

				}
				if (one.equals("V")) {
					System.out.println("");
					System.out.println("Starters:");
					System.out.println("");
					for (int i = 0; i < res3.starters.size(); i++) {
						System.out.println(
								res3.starters.get(i).getFoodName() + " for €" + res3.starters.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Maincourse:");
					System.out.println("");
					for (int i = 0; i < res3.maincourse.size(); i++) {
						System.out.println(res3.maincourse.get(i).getFoodName() + " for €"
								+ res3.maincourse.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Dessert:");
					System.out.println("");
					for (int i = 0; i < res3.desert.size(); i++) {
						System.out.println(
								res3.desert.get(i).getFoodName() + " for €" + res3.desert.get(i).getFoodPrice());
					}
					System.out.println("");
					System.out.println("Drinks:");
					System.out.println("");
					for (int i = 0; i < res3.drinks.size(); i++) {
						System.out.println(
								res3.drinks.get(i).getFoodName() + " for €" + res3.drinks.get(i).getFoodPrice());
					}

				}
				if (one.equals("C")) {
					System.out.println("Are you sure you want to cancel your reservation? Y/N");
					String res3CancelRes = in.next().toUpperCase();
					if (res3CancelRes.equals("Y")) {
						System.out.println("Enter phone number you reserved with: ");
						int res3PhoneCancel = in.nextInt();
						// System.out.println(res3.getReservations().size());
						for (int i = 0; i < res3.getReservations().size(); i++) {
							if (res3.getReservations().get(i).getReservationPhoneNo() == res3PhoneCancel) {
								res3.removeReservation(res3.getReservations().get(i));
							}
							// System.out.println(res3.getReservations().size());
						}
						if (res3CancelRes.equals("N")) {
							more = false;
						}
					}
				}
				if (one.equals("A")) {
					for (int i = 0; i < res3.tables.size(); i++) {
						System.out.println("Table Number: " + res3.tables.get(i).getTableNo());
						System.out.println("Capacity: " + res3.tables.get(i).getCapacity());
					}
				}
				if (one.equals("Q")) {
					more = false;
				}
			}
		}
	}
}
