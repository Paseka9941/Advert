
/**
 * Write a description of class busProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class busProperty extends Property
{
   private int size;
   
   
   public busProperty()
   {
       
   }
   
   public busProperty(String name, String contactNum, int contract, int size)
   {
       super.(name, contactNum, contract);
       this.size = size;
   }
   
   public int getSize()
   {
       return size;
   }
   
   public double calcInsurance()
    {
        double insurance = calcMonthRent() * 10/100.0;
        return insurance;
    }
      
    public double calcMonthRent()
    {
        double rent = size * 250.0;
        return rent;
    }
     public String toString()
    {
        String str = String.format("%s %-10d R%-10.2f R%-10.2f", super.toString(), size, calcInsurance(), calcMonthRent());
        return str;
    }
}
