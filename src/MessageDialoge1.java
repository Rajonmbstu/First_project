import javax.swing.*;
class MessageDialoge1 {
    public static void main(String[] args) {
        //ImageIcon pic=new ImageIcon("pic.png");
      // String f_name= JOptionPane.showInputDialog(null,"Enter your first Name: ","Hello",0);
        //String l_name= JOptionPane.showInputDialog(null,"Enter your Last Name: ","Hello",0);
        //String name=f_name+" "+l_name;
        //JOptionPane.showMessageDialog(null,name,"Error",2);
        int choice=JOptionPane.showConfirmDialog(null,"Do you want to exit?","Title", 0);
        if(choice==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else
            System.out.println("You have selected no option ");
    }
}