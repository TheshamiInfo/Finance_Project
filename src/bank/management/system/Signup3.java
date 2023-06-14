package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;

    String formno;
    Signup3( String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150 ,5,100,100);
        add(image);

        JLabel l1 =new JLabel("Page 3:-");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 =new JLabel("Account Details");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 =new JLabel("Account Type:");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(120,120,200,30);
        add(l3);

        r1=new JRadioButton("Saving-Account");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBackground(new Color(106,90,205));
        r1.setBounds(120,160,150,30);
        add(r1);

        r2=new JRadioButton("Current-Account");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBackground(new Color(106,90,205));
        r2.setBounds(300,160,150,30);
        add(r2);

        r3=new JRadioButton("Salary-Account");
        r3.setFont(new Font("Railway",Font.BOLD,14));
        r3.setBackground(new Color(106,90,205));
        r3.setBounds(120,190,150,30);
        add(r3);

        r4=new JRadioButton("Fixed Deposit Account");
        r4.setFont(new Font("Railway",Font.BOLD,14));
        r4.setBackground(new Color(106,90,205));
        r4.setBounds(300,190,180,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);


        JLabel l4 =new JLabel("Card-No:-");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(120,230,200,30);
        add(l4);


        JLabel l5 =new JLabel("(Your 16 Digits Card No:-)");
        l5.setFont(new Font("Railway",Font.BOLD,12));
        l5.setBounds(120,260,200,30);
        add(l5);

        JLabel l6 =new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(350,230,250,30);
        add(l6);


        JLabel l7 =new JLabel("(it would appear on atm card/cheque book and statement)");
        l7.setFont(new Font("Railway",Font.BOLD,12));
        l7.setBounds(300,260,500,30);
        add(l7);


        JLabel l8 =new JLabel("ATM-Pin:-");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(120,300,200,30);
        add(l8);

        JLabel l9 =new JLabel("XXXX");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(350,300,200,30);
        add(l9);

        JLabel l10 =new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Railway",Font.BOLD,12));
        l10.setBounds(120,330,200,30);
        add(l10);


        JLabel l11 =new JLabel("Services Required:-");
        l11.setFont(new Font("Railway",Font.BOLD,18));
        l11.setBounds(120,380,200,30);
        add(l11);


       c1 = new JCheckBox("ATM CARD");
       c1.setBackground(new Color(106,90,205));
       c1.setFont(new Font("Railway",Font.BOLD,16));
       c1.setBounds(120,420,200,30);
         add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(106,90,205));
        c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBounds(300,420,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(106,90,205));
        c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBounds(480,420,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alert");
        c4.setBackground(new Color(106,90,205));
        c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBounds(120,460,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(106,90,205));
        c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBounds(300,460,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(106,90,205));
        c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBounds(480,460,200,30);
        add(c6);

JCheckBox c7 = new JCheckBox("I have declares that the above entered details correct to the best of my knowledge");
        c7.setBackground(new Color(106,90,205));
        c7.setFont(new Font("Railway",Font.BOLD,12));
        c7.setBounds(80,570,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No: -");
        l12.setFont(new Font("Railway",Font.BOLD,12));
        l12.setBounds(500,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Railway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);


        s= new JButton("Submit");
        s.setFont(new Font("Railway", Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        s.setBounds(420,630,100,30);
        s.addActionListener(this);
        add(s);


        c= new JButton("Cancel");
        c.setFont(new Font("Railway", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.setBounds(520,630,100,30);
        c.addActionListener(this);

        add(c);
        setSize(750 ,720);
        setLayout(null);
        setLocation(400,0);
        getContentPane().setBackground( new Color(106,90,205));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype =null;
        if(r1.isSelected()){
            atype = "Saving-Account";
        } else if (r2.isSelected()) {
            atype = "Current-Account";
        } else if (r3.isSelected()) {
            atype = "Salary-Account";
        } else if (r4.isSelected()) {
            atype = "Fixed Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);


        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }
        try {
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('"+formno+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
new Signup3(" ");

    }
}
