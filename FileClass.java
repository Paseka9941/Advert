
/**
 * Write a description of class FileClass here.
 *
 * @author (31777597)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
public class FileClass
{
  
     ArrayList <resProperty> arrResProp = new <resProperty> ArrayList();
     ArrayList <busProperty> arrBusProp = new <bussProperty> ArrayList();
    
    public void readFromFile(String filename)
    {
        try
        {
            Scanner reader = new Scanner(new FileReader(filename));
            
            while (reader.hasNext())
            {
                String line = reader.nextLine();
                String [] info = line.split("#");
                
                char property = info[0].charAt(0);
                String name = info[1];
                String contactNum = info[2];
                int contract = Integer.parseInt(info[3]);
                if (property =='R')
                {
                    char type = info[4].charAt(0);
                    int bedrooms = Integer.parseInt(info[5]);
                    int bathrooms = Integer.parseInt(info[6]);
                
                    arrResProp.add(new resProperty(name, contactNum, contract, type, bedrooms, bathrooms));
                }
                else
                {
                    int size = Integer.parseInt(info[4]); 
                    arrBusProp.add(new busProperty(name, contactNum, contract, size)); 
                }
                    
            }
            
            reader.close();  
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error reading the file");
        }
        
    }
    
         
    public ArrayList getResArray()
    {
        return arrResProp;
    }
    
    public ArrayList getBussArray()
    {
        return arrBusProp;
    }
}
