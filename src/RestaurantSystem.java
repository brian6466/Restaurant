import java.io.IOException;

/**
   A system to manage appointments.
*/
public class RestaurantSystem
{  
   public static void main(String[] args)
        throws IOException
   { 
	   RestaurantUI menu = new RestaurantUI();
      menu.run();
   }
}
