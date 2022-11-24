public class Menu {

    // Indian Restaurant Object
    Restaurant res1 = new Restaurant(1);

    // Indian Starters

    Food Poppadoms = new Food("Poppadoms",3.00);
    Food Samosas = new Food("Samosas",2.00);
    Food Chicken_Pakora = new Food("Chicken Pakora",4.00);
    Food Prawn_Momos = new Food("Prawn Momos",4.00);

    // Indian MainCourses

    Food Tikka_Masala  = new Food("Tikka Masala",12.99);
    Food Korma  = new Food("Korma",11.99);
    Food Madras  = new Food("Madras",10.99);
    Food Mixed_Veg  = new Food("Mixed Vegetables",9.99);
    Food Prawn_Balti  = new Food("Prawn Balti",12.99);
    Food Biryani = new Food("Biryani",8.00);


    // Chinese Restaurant Object
    Restaurant res2 = new Restaurant(2);

    // Chinese Starters

    Food Spring_Rolls = new Food("Spring Rolls",2.00);
    Food Meat_Sung = new Food("Meat Sung",4.00);
    Food Chicken_Wings = new Food("Chicken Wings",6.00);
    Food King_Prawns = new Food("King Prawns ",5.00);

    // Chinese MainCourses

    Food Soup_Of_The_Day  = new Food("Soup Of The Day",9.99);
    Food Seafood_Curry  = new Food("Seafood Curry",12.99);
    Food Combination_Duck  = new Food("Combination Duck",14.99);
    Food PepperCorn_Chicken  = new Food("PepperCorn Chicken",11.99);
    Food Chow_Mein  = new Food("Chow Mein",9.99);
    Food StirFry = new Food("StirFry",10.99);


    // Italian Restaurant Object
    Restaurant res3 = new Restaurant(3);

    // Italian Starters

    Food Garlic_Focaccia = new Food("Garlic Focaccia",4.00);
    Food Bruschetta = new Food("Bruschetta",3.00);
    Food Parma_Focaccia = new Food("Parma Focaccia",4.00);
    Food Spicy_Prawn_Brochettes = new Food("Spicy Prawn Brochettes ",5.00);

    // Italian MainCourses

    Food Lasagne_Bolognese  = new Food("Lasagne Bolognese ",12.99);
    Food Spaghetti_Alla_Carbonara  = new Food("Spaghetti Alla Carbonara",14.99);
    Food Fusilli_Salmon  = new Food("Fusilli Salmon",13.99);
    Food Ravioli_Verdi  = new Food("Ravioli Verdi",12.99);
    Food Pizza  = new Food("Pizza",10.99);
    Food Orecchiette = new Food("Orecchiette",11.99);

    // Deserts

    Food Ice_Cream  = new Food("Ice Cream",3.50);
    Food Lassi  = new Food("Lassi ",4.99);
    Food Fuskas = new Food("Fuskas ",3.99);
    Food Brownies = new Food("Brownies ",4.99);
    Food Cheese_Cake = new Food("Cheese Cake ",6.99);
    Food Apple_Pie = new Food("Apple Pie",3.99);
    Food Pavlova = new Food("Pavlova ",5.99);


    // Drinks

    Food Fanta  = new Food("Fanta ",3.00);
    Food Coke  = new Food("Coke ",3.00);
    Food Diet_Coke  = new Food("Diet Coke",3.00);
    Food Juice  = new Food("Juice ",2.50);
    Food Seven_Up  = new Food("7 Up",3.00);




    public void main(String[] args) {

        //Indian Restaurant Menu

        //Indians starters added
        res1.addStarter(Poppadoms);
        res1.addStarter(Samosas);
        res1.addStarter(Chicken_Pakora);
        res1.addStarter(Prawn_Momos);

        //Indian MainCourse
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

        //Drinks

        res1.addDrinks(Fanta);
        res1.addDrinks(Seven_Up);
        res1.addDrinks(Coke);
        res1.addDrinks(Diet_Coke);
        res1.addDrinks(Juice);


        //Chinese Restaurant Menu

        //Chinese starters added
        res2.addStarter(Spring_Rolls);
        res2.addStarter(Meat_Sung);
        res2.addStarter(Chicken_Wings);
        res2.addStarter(King_Prawns);

        //Chinese MainCourse
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

        //Drinks

        res2.addDrinks(Fanta);
        res2.addDrinks(Seven_Up);
        res2.addDrinks(Coke);
        res2.addDrinks(Diet_Coke);
        res2.addDrinks(Juice);


        // Italian Menu

        //Italian Starters
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

        //Drinks

        res3.addDrinks(Fanta);
        res3.addDrinks(Seven_Up);
        res3.addDrinks(Coke);
        res3.addDrinks(Diet_Coke);
        res3.addDrinks(Juice);
        
    }
}

