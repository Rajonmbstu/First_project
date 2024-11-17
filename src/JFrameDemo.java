import javax.swing.*;
//import javax.swing.JFrame;
import java.awt.*;

public class JFrameDemo extends JFrame {
    private ImageIcon icon;
    Container c;
    JFrameDemo()
    {
  initialcomponent();

    }
   public void initialcomponent()
    {
        c=this.getContentPane();
        c.setBackground(Color.yellow);
       icon=new ImageIcon(getClass().getResource("pic.png"));
       this.setIconImage(icon.getImage());


    }
    public static void main(String[] args) {
        JFrameDemo frame = new JFrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLocation(300,20);
        frame.setTitle("JFrame Demo!");
        frame.setResizable(false);
    }
}
