
/**
 * Write a description of class ResProperty here.
 *
 * @author (3177597)
 * @version (a version number or a date)
 */
public class resProperty extends Property
{
   
   private int bedrooms;
   private char type;
   private int bathrooms;
   
   public resProperty()
   {
       
   }
   
   public resProperty(String name, String contactNum, int contract, char type, int bedrooms, int bathrooms)
   {
       super.(name, contactNum, contract);
       this.type = type;
       this.bedrooms = bedrooms;
       this.bathrooms = bathrooms;
   }
   
    public char getType()
    {
        return type;
    }
   public int getBedrooms()
   {
       return bedrooms;
    
   }
   
   public int getBathrooms()
    {
        return bathrooms;
    }
   
  
   
   public double calcMonthRent()
   {
       double month = 0.00;
       if (type == 'f' || type == 'F')
       {
       month = 8000 + (500 * bedrooms);
       }
       
       else if (type == 't' || type == 'T')
       {
       month = 15000 + (1000 * bedrooms);
       }
       else if (type == 'h' || type == 'H')
       {
       month = 12000 + (800 * bedrooms) ;
       }
       else if (type == 't' || type == 'T')
       {
           month = 1500 + (1000 * bedrooms);
        
       }
       
       
       return month;
       
   }
    public String toString()
    {
        String Str = String.format("%-2s %-10s %-12d %-12d R%-12.2f", super.toString(), type, bedrooms, bathrooms, calcMonthRent());
        return Str;
    }
}
