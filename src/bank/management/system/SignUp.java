package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JRadioButton r1,r2, r3,m1,m2;
JButton next;


    JTextField textName,textFName,textEmail,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;

    Random ran = new Random();

    long first4=(ran.nextLong() %9000L)+1000L;
    String first = "  " +Math.abs(first4);
    SignUp(){

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:-"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Railway",Font.BOLD,28));
        add(label1);

        JLabel label2 = new JLabel("Page 1:");
        label2.setFont(new Font("Railway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details ");
        label3.setFont(new Font("Railway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Railway",Font.BOLD,20));
        labelName.setBounds(100,160,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway",Font.BOLD,14));
        textName.setBounds(300,160,400,30);
        add(textName);


        JLabel labelfName = new JLabel("Father's Name:");
        labelfName.setFont(new Font("Railway",Font.BOLD,20));
        labelfName.setBounds(100,200,200,30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Railway",Font.BOLD,14));
        textFName.setBounds(300,200,400,30);
        add(textFName);


        JLabel DOB = new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Railway",Font.BOLD,20));
        DOB.setBounds(100,280,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,280,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Railway",Font.BOLD,20));
        labelG.setBounds(100,240,200,30);
        add(labelG);

        r1  = new JRadioButton("Male");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBackground(new Color(106, 90, 205));
        r1.setBounds(300,240,60,30);
        add(r1);


        r2  = new JRadioButton("Female");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBackground(new Color(106, 90, 205));
        r2.setBounds(450,240,90,30);
        add(r2);

        r3  = new JRadioButton("Others");
        r3.setFont(new Font("Railway",Font.BOLD,14));
        r3.setBackground(new Color(106, 90, 205));
        r3.setBounds(620,240,100,30);
        add(r3);

ButtonGroup buttonGroup = new ButtonGroup();
buttonGroup.add(r1);
buttonGroup.add(r2);
buttonGroup.add(r3);

JLabel labelEmail = new JLabel("Email_Id:");
labelEmail.setFont(new Font("Railway",Font.BOLD,20));
labelEmail.setBounds(100,320,200,30);
add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Railway",Font.BOLD,14));
        textEmail.setBounds(300,320,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Railway",Font.BOLD,20));
        labelMs.setBounds(100,360,200,30);
        add(labelMs);

        m1  = new JRadioButton("Married");
        m1.setFont(new Font("Railway",Font.BOLD,14));
        m1.setBackground(new Color(106, 90, 205));
        m1.setBounds(300,360,100,30);
        add(m1);


        m2  = new JRadioButton("Unmarried");
        m2.setFont(new Font("Railway",Font.BOLD,14));
        m2.setBackground(new Color(106, 90, 205));
        m2.setBounds(450,360,100,30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);


        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Railway",Font.BOLD,20));
        labelAdd.setBounds(100,400,200,30);
        add(labelAdd);

        textAdd= new JTextField();
        textAdd.setFont(new Font("Railway",Font.BOLD,14));
        textAdd.setBounds(300,400,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Railway",Font.BOLD,20));
        labelCity.setBounds(100,440,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Railway",Font.BOLD,14));
        textCity.setBounds(300,440,400,30);
        add(textCity);


        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setFont(new Font("Railway",Font.BOLD,20));
        labelPin.setBounds(100,480,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Railway",Font.BOLD,14));
        textPin.setBounds(300,480,400,30);
        add(textPin);


        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Railway",Font.BOLD,20));
        labelState.setBounds(100,520,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Railway",Font.BOLD,14));
        textState.setBounds(300,520,400,30);
        add(textState);

next = new JButton("Next");
next.setFont(new Font("Railway",Font.BOLD,14));
next.setBackground(Color.BLACK);
next.setForeground(Color.white);
next.setBounds(620,610,80,30);
next.addActionListener(this);

add(next);

        getContentPane().setBackground(new Color(106, 90, 205));
        setLayout(null);

setSize(750,720);
setLocation(260,0);
setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        String formno = first;
        String name = textName.getText();
        String fName=textFName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gendar = null;
        if(r1.isSelected()){
            gendar ="Male";
        }
       else if (r1.isSelected()){
            gendar = "Female";
        }
       else if(r3.isSelected()){
           gendar = "Others";
        }
String email = textEmail.getText();
       String marital= null;
       if(m1.isSelected()){
           marital = "Married";
       }else if(m2.isSelected()){
           marital = "Unmarried";
       }
       String address  =  textAdd.getText();
       String city = textCity.getText();
       String pin = textPin.getText();
       String state = textState.getText();
try {

    if(textName.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Please Fill The Data");
    }else {
        Con con1 = new Con();
        String q = "Insert into Signup values('"+formno+"','"+name+"','"+fName+"','"+dob+"','"+gendar+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
con1.statement.executeUpdate(q);

new Signup2(first);
setVisible(false);
    }
}catch (Exception E){
    E.printStackTrace();
}
    }

    public static void main(String[] args) {

        new SignUp();

    }
}
