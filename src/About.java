import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About(){
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.white);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);

        JLabel heading=new JLabel("<html>University<br/>Managemnet System</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("TAHOMA",Font.BOLD,30));
        add(heading);

        JLabel name=new JLabel("Developed By:DIPU THAKUR");
        name.setBounds(70,220,550,40);
        name.setFont(new Font("TAHOMA",Font.BOLD,30));
        add(name);

        JLabel rollno=new JLabel("ROLL NUMBER:44 ");
        rollno.setBounds(70,260,550,40);
        rollno.setFont(new Font("TAHOMA",Font.BOLD,30));
        add(rollno);

        JLabel faculty=new JLabel("Faculty:BSE");
        faculty.setBounds(70,300,550,40);
        faculty.setFont(new Font("TAHOMA",Font.BOLD,30));
        add(faculty);


        setLayout(null);

        setVisible(true);
    }
    public static void main(String[] args) {
        new About();
    }
}
