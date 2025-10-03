import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private int x;
    private HashMap<String, String> phonebook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        phonebook = new HashMap<>();
        phonebook.put("Asma", "777");
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     * 
     */
    public void enterNumber(String name, String number)
    {
        phonebook.put(name, number);
    }
    
    /**
     * 
     */
    public String lookupNumber(String name)
    {
       String number = phonebook.get(name);
       return number;
    }
}