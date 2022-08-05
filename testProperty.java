
/**
 * Write a description of class testProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class testProperty extends Property
{
      public static void main(String [] args)
    {
        ArrayList <resProperty> arrResProp = new <resProperty> ArrayList();
        ArrayList <busProperty> arrBussProp = new <busProperty> ArrayList();

        Scanner input = new Scanner(System.in);
        Scanner inputValues = new Scanner(System.in);

        FileClass file = new FileClass();
        file.readFromFile("properties.txt");
        arrResProp = file.getResArray();
        arrBussProp = file.getBussArray();
        
        displayResProp(arrResProp);
        
        System.out.print("\n");
        
        displayBussProp(arrBussProp);
    }
   
    public static void displayResProp(ArrayList arrResProp)
    {
        System.out.println("Residential Properties");
        System.out.printf("%-15s %-15s %-10s %-8s %-8s %-12s %-10s\n","Name", "Cell num", "Months", "Type", "Beds", "Baths", "Rent(pm)" );
        
        for(int i = 0; i < arrResProp.size(); i++)
        {
            ResProperty prop = (ResProperty)arrResProp.get(i);
            System.out.println(prop.toString());
        }
    }
    
    public static void displayBusProp(ArrayList arrBussProp)
    {
        System.out.println("Business Properties");
        System.out.printf("%-12s %-12s %-10s %-10s %-12s %-10s\n","Name", "Cell num", "Months", "Size", "Insurance", "Rent(pm)" );
        
        for(int i = 0; i < arrBussProp.size(); i++)
        {
            BussProperty prop = (BussProperty)arrBussProp.get(k);
            System.out.println(prop.toString());
        }
    }
}
