
/**
 * Write a description of class Property here.
 *
 * @author (31777597)
 * @version (a version number or a date)
 */
public class Property
{
  
   private String name;
   private String contactNum;
   private int contract;
   
   
   public Property()
   {
       
   }
   
   public Property(char typeOfProperty,int contract, String name, String contactNum)
   {
       
       this.name = name;
       this.contactNum = contactNum;
       this.contract = contract;
       
   }
   
  
   public String getName()
   {
       return name;
   }
   
   public String getContactNum()
   {
       return contactNum;
   }
   public int getContract()
   {
       return contract;
   }
   
   public String toString()
   {
       String Str = String.format("%-15s %-15s %-10d", name, contactNum, contract);
       return Str;
   }
}
