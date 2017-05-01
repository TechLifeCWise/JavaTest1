import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CW
{

    string name;
    
    string pillchoice;

    public static void main(String[] args)
    {
        //Instantiate main
        CW neo = new CW();
        
        //Prompt for name
        name = JOptionPane.InputDialog(null,"Hello there, what is your name?");
        
        //start first method
        neo.choice();
        
        //when user has finished, they will be directed to this method
        neo.conclusion();
   
    }
    
    public void choice()
    {
       pillchoice = JOptionPane.InputDialog(null,"You have two options; either choose the green pill and become an outstanding citizen who will work their way up to success)
       
        if(pillchoice.equalsIgnoreCase("green")
        {
          JOptionPane.Message   
        }   
               
               
       
    }

    public void badChoices()
    {

    }

    public void goodChoices()
    {

    }
    
    public void conclusion()
    {
        
    }    



}
