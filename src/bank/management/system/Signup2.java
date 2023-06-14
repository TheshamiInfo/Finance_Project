package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan_No,textAdharNo;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signup2(String formno){

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150 ,5,100,100);
        add(image);


        this.formno = formno;

JLabel l1 = new JLabel("Page 2:-");
l1.setFont(new Font("Railway",Font.BOLD,22));
l1.setBounds(300,30,600,40);
add(l1);

JLabel l2 = new JLabel("Additional_Details");
l2.setFont(new Font("Railway",Font.BOLD,22));
l2.setBounds(300,60,600,40);
add(l2);

JLabel l3 = new JLabel("Religion: -");
l3.setFont(new Font("Railway",Font.BOLD,18));
l3.setBounds(100,120,100,30);
add(l3);

String religion[] = {"Muslim","Hindu","Sikh","Christian","Sheikh","Shai","Syed","Other"};

comboBox = new JComboBox(religion);
comboBox.setBackground(new Color(106,90,205));
comboBox.setFont(new Font("Railway",Font.BOLD,14));
comboBox.setBounds(350,120,320,30);
add(comboBox);


        JLabel l4 = new JLabel("Category: -");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"General ","OBC","SC","ST","Other"};

        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(106,90,205));
        comboBox2.setFont(new Font("Railway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);


        JLabel l5 = new JLabel("Income: -");
        l5.setFont(new Font("Railway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[] = {"Null ","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,000,000"};

        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(106,90,205));
        comboBox3.setFont(new Font("Railway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


        JLabel l6 = new JLabel("Education: -");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(100,270,110,30);
        add(l6);

        String Education[] = {"10Th ","12Th","Graduation","Vocational","P.G","Engineer","Doctors","Law","Other"};

        comboBox4 = new JComboBox(Education);
        comboBox4.setBackground(new Color(106,90,205));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: -");
        l7.setFont(new Font("Railway",Font.BOLD,18));
        l7.setBounds(100,320,120,30);
        add(l7);

        String Occupation[] = {"Salaried ","Self-Employed","Business","Student","retired","Others"};

        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(106,90,205));
        comboBox5.setFont(new Font("Railway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);


        JLabel l8 = new JLabel("Pan_No: -");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        textPan_No = new JTextField();
        textPan_No.setFont(new Font("Railway",Font.BOLD,18));
        textPan_No.setBackground(new Color(106,90,205));
        textPan_No.setBounds(350,370,300,30);
        add(textPan_No);


        JLabel l9 = new JLabel("AdharNo: -");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(100,420,150,30);
        add(l9);

        textAdharNo = new JTextField();
        textAdharNo.setFont(new Font("Railway",Font.BOLD,18));
        textAdharNo.setBackground(new Color(106,90,205));
        textAdharNo.setBounds(350,420,300,30);
        add(textAdharNo);


        JLabel l10 = new JLabel("Senior-Citizen: -");
        l10.setFont(new Font("Railway",Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

r1=new JRadioButton("Yes");
r1.setFont(new Font("Railway",Font.BOLD,14));
r1.setBackground(new Color(106,90,205));
r1.setBounds(350,470,100,30);
add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBackground(new Color(106,90,205));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing_Ac: -");
        l11.setFont(new Font("Railway",Font.BOLD,18));
        l11.setBounds(100,520,150,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Railway",Font.BOLD,14));
        e1.setBackground(new Color(106,90,205));
        e1.setBounds(350,520,100,30);
        add(e1);

        e2=new JRadioButton("No");
            e2.setFont(new Font("Railway",Font.BOLD,14));
            e2.setBackground(new Color(106,90,205));
            e2.setBounds(460,520,100,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);


            JLabel l12 = new JLabel("Form No: -");
            l12.setFont(new Font("Railway",Font.BOLD,14));
            l12.setBounds(500,10,100,30);
            add(l12);

            JLabel l13 = new JLabel(formno);
            l13.setFont(new Font("Railway",Font.BOLD,12));
            l13.setBounds(760,10,60,30);
            add(l13);


next = new JButton("Next" );
next.setFont(new Font("Railway",Font.BOLD,14));
next.setBackground(Color.white);
next.setForeground(Color.BLACK);
next.setBounds(570,640,100,30);
add(next);



        setLayout(null);

setSize(750 ,720);
setLocation(260,0);
getContentPane().setBackground( new Color(106,90,205));
next.addActionListener(this);
setVisible(true);



    }

        @Override
        public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
            String inc = (String) comboBox3.getSelectedItem();
            String edu = (String) comboBox4.getSelectedItem();
            String occ = (String) comboBox5.getSelectedItem();


            String pan = textPan_No.getText();
            String adhar = textAdharNo.getText();

            String sitizion = " ";
            if((r1.isSelected())){
                sitizion = "yes";

            }else if(r2.isSelected()){
              sitizion =  "No ";
            }
            String eAccount = " ";
            if((r1.isSelected())){
                eAccount = "yes";

            }else if(r2.isSelected()){
                eAccount =  "No ";
            }
            try {
if(textPan_No.getText().equals("")||textAdharNo.getText().equals("")){
    JOptionPane.showMessageDialog(null, "fill the data");
}else {
    Con c1 = new Con();
    String q = " insert  into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+sitizion+"','"+eAccount+"')";
c1.statement.executeUpdate(q);
new Signup3(formno);
setVisible(false);
}
            }catch (Exception E){
                E.printStackTrace();
            }

        }

        public static void main(String[] args) {

new Signup2("");
    }
}
