

package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
    
     long random;
    JTextField panJTextField,fnameJTextField,aadharJTextField,pinJTextField;
    JButton next;
    //JDateChooser dateChooser ;    , emailJTextField,nameJTextField,stateJTextField,
    JRadioButton male,fmale,other,yes,no,eyes,eno;
    JComboBox religion,education,income, category,occupation ;
    String formno;
    
    
    SignupTwo(String formno){
    
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details " );
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:" );
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]= {"Hindu","Muslim", "Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        
        JLabel fname = new JLabel("Category:" );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[]={"General" , "OBC" , "SC" , "ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income:" );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomeCategory[]={"null" , "< 1,50,000" , "< 2,50,000" , "< 5,00,000","Upto 10,00,000","> 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        //gender
        JLabel educationol = new JLabel("Educational:" );
        educationol.setFont(new Font("Raleway",Font.BOLD,20));
        educationol.setBounds(100,290,200,30);
        add(educationol);
        
        
        //------------------
        
      /*   fnameJTextField = new JTextField();
        fnameJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameJTextField.setBounds(300, 290, 400, 30);
        add(fnameJTextField);   */
        
        //email
        JLabel qualification = new JLabel("Qualification:" );
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String educationValues[]={"Non-Graduation" , "Graduation" , "Post-Graduation" , "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        //marital
        JLabel  occupational  = new JLabel("Occupation:" );
        occupational.setFont(new Font("Raleway",Font.BOLD,20));
        occupational.setBounds(100,390,200,30);
        add(occupational);
        
        
        String occupationalValue[]={"Salaried" , "Self-Employee" , "Bussiness" ,"Student" ,"Other"};
        occupation = new JComboBox(occupationalValue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        //address
        JLabel  panno = new JLabel("PAN Number:" );
        panno.setFont(new Font("Raleway",Font.BOLD,20));
        panno.setBounds(100,440,200,30);
        add(panno);
        //pan number
        
        //addressJTextField
        panJTextField=new JTextField();
        panJTextField.setFont(new Font("Raleway", Font.BOLD,14));
        panJTextField.setBounds(300,440,400,30);
        add(panJTextField);
        
        //city
        JLabel  aadhar= new JLabel("Aadhar Number:" );
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        //aadhar
        //cityJTextField
        aadharJTextField=new JTextField();
        aadharJTextField.setFont(new Font("Raleway", Font.BOLD,14));
        aadharJTextField.setBounds(300,490,400,30);
        add(aadharJTextField);
        
        //state
        JLabel  senior_citizen= new JLabel("Senior Citizen:" );
        senior_citizen.setFont(new Font("Raleway",Font.BOLD,20));
        senior_citizen.setBounds(100,540,200,30);
        add(senior_citizen);
        
        //---------------
        
        /* stateJTextField = new JTextField();
        stateJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateJTextField.setBounds(300, 540, 100, 30);
        add(stateJTextField);
        */
        
        
        yes =new JRadioButton("Yes");
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        
        no =new JRadioButton("No");
        no.setBounds(450,540,100,30);
        no.setBackground(Color.WHITE);
        add(no);
        
        //maritalgroup
        ButtonGroup senior_citizengroup = new ButtonGroup();
        senior_citizengroup.add(yes);
        senior_citizengroup.add(no);
        //maritalgroup.add(other);
        
        //pincode
        JLabel  exisiting_account= new JLabel("Exisiting Account:" );
        exisiting_account.setFont(new Font("Raleway",Font.BOLD,20));
        exisiting_account.setBounds(100,590,200,30);
        add(exisiting_account);
        
        
        eyes =new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        
        eno =new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup exisiting_accountgroup= new ButtonGroup();
        exisiting_accountgroup.add(eyes);
        exisiting_accountgroup.add(eno);
        //maritalgroup.add(other);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
     
        String formno = ""+random;//long
        String sreligion =(String) religion.getSelectedItem();//setText
        String scategory =(String) category.getSelectedItem();
        String sincome =(String) income.getSelectedItem();
        String seducation =(String) education.getSelectedItem();
        String soccuption =(String) occupation.getSelectedItem();
      //  String fname = fnameJTextField.getText();
       // String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String seniorcitizen = null;
        if(yes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(no.isSelected()){
            seniorcitizen="No";
        }
       // String email=emailJTextField.getText();
        String exisitingaccount=null;
        if(eyes.isSelected()){
            exisitingaccount="Yes";
        }
        else if(eno.isSelected()){
            exisitingaccount="No";
        }
        
        String p_no =panJTextField.getText();
        //String state =stateJTextField.getText();
        String aadhar =aadharJTextField.getText();
       // String pin =pinJTextField.getText();
        
        try{
           
                Conn c= new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccuption+"','"+p_no+"','"+aadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                c.s.executeUpdate(query);
        
                //signup3 object
                setVisible(false);
                new SignUpThree(formno).setVisible(true);
                
                
        }catch(Exception ae){
            System.out.println(ae);
        }
        
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}
