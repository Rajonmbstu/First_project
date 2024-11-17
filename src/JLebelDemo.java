import javax.swing.*;
import java.awt.*;

public class JLebelDemo extends JFrame {
    ImageIcon icon,img;
    Container c;
    JLabel user,userpass,userphoto;
    Font f;
    JLebelDemo()
    {
       input();
    }
    public void input()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
         icon=new ImageIcon(getClass().getResource("pic.png"));
       this. setIconImage(icon.getImage());
       f=new Font("Arial",Font.BOLD,15);
       user=new JLabel();
       user.setText("Enter your Username: ");
       user.setBounds(30,40,250,15);
       user.setFont(f);
       user.setForeground(Color.red);
       c.add(user);

       userpass=new JLabel("Enter your password: ");
       userpass.setBounds(30,80,250,15);
       userpass.setFont(f);
       c.add(userpass);
       img=new ImageIcon(getClass().getResource("pass.png"));
       userphoto=new JLabel(img);
       userphoto.setBounds(30,120,img.getIconWidth(),img.getIconHeight());
       c.add(userphoto);



    }
    public static void main(String[] args) {
        JLebelDemo frame = new JLebelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 800);
        frame.setTitle("JLebel Demo");
        frame.setResizable(false);


    }
}
