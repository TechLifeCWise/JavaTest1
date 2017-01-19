import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CW
{

    string name;

    public static void main(String[] args)
    {
        //Instantiate main
        CW neo = new CW();
        
        //start first method
        neo.choice();
        //when user has finished, they will be directed to this method
        neo.conclusion();
   
    }
    
    public void choice()
    {
       //Prompt for name
       name = JOptionPane.InputDialog(null,"Hello there, what is your name?");
       
    }

    public void badChoices()
    {

    }

    public void goodChoices()
    {

    }



}
