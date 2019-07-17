package mojbackup;

import javax.swing.UIManager;

public class MojBackup 
{

    public static void main(String[] args) 
    {
        try 
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } 
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        } 
        
        new Window().setVisible(true);
    }
    
}
