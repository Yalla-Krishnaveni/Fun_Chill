import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;

class Bank implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String uname,pwd;
	Bank(String uname,String pwd){
		this.uname=uname;
		this.pwd=pwd;
	}
	public String getUname() {
		return uname;
	}
	public String getPwd() {
		return pwd;
	}
}
public class BasicScreen{
	private FileOutputStream fout;
	private ObjectOutputStream oos;
	private FileInputStream fin;
	private ObjectInputStream ois;


	File file;
	ArrayList<Bank> bn;
	
	JFrame frmBankLoginPage;
	static JTextField textField;
	static JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicScreen window = new BasicScreen(textField, passwordField);
					window.frmBankLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	    BasicScreen(JTextField textField,JPasswordField passwordField) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bn =new ArrayList<Bank>();
		frmBankLoginPage = new JFrame();
		frmBankLoginPage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gk-09\\Pictures\\Screenshots\\Screenshot (132).png"));
		frmBankLoginPage.setTitle("Welcome to FUN && CHILL");
		frmBankLoginPage.setSize(1500, 800);
		frmBankLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankLoginPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Username:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setBounds(137, 149, 160, 23);
		frmBankLoginPage.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(378, 146, 123, 26);
		frmBankLoginPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Password:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_2.setBounds(136, 225, 161, 23);
		frmBankLoginPage.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(378, 225, 123, 26);
		frmBankLoginPage.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag=false;
				try {
					file=new File("login.dat");
					fin=new FileInputStream(file);
					ois= new ObjectInputStream(fin);
					ArrayList<Bank> bn=new ArrayList<Bank>();
					String uname=textField.getText();
					String pwd=passwordField.getText();
					while((bn=(ArrayList)ois.readObject())!=null){
						Bank b=bn.get(0);
						if(uname.equalsIgnoreCase(b.getUname())&&pwd.equals(b.getPwd())) {
							flag=true;
							break;
						}
						else {
							flag=false;
						}
						}
						if(flag==true) {
							//JOptionPane.showMessageDialog(frmBankLoginPage,"Login Successful");
							new Exhibhition();
							frmBankLoginPage.setVisible(false);
						}
						else{
							JOptionPane.showMessageDialog(frmBankLoginPage,"Login Failed");
						}
				}catch(Exception ae) {
							ae.printStackTrace();
						}
			}
		});
		btnNewButton.setBounds(409, 317, 107, 38);
		frmBankLoginPage.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create New Account");
		btnNewButton_1.setBounds(151, 317, 166, 38);
		frmBankLoginPage.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(309, 26, 240, 38);
		frmBankLoginPage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\Images\\login.png"));
		lblNewLabel_3.setBounds(609, 24, 358, 336);
		frmBankLoginPage.getContentPane().add(lblNewLabel_3);
		
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				file=new File("login.dat");
				String name=textField.getText();
				String pwd=passwordField.getText();
				bn.add(new Bank(name,pwd));
				textField.setText("");
				passwordField.setText("");
				try {
					if(file.exists()) {
						oos=new ObjectOutputStream(new FileOutputStream(file,true)) {
						protected void writeStreamHeader() throws IOException{
							reset();
						}
					};
				}
					else {
						oos=new ObjectOutputStream(new FileOutputStream(file));
					}
					oos.writeObject(bn);
					JOptionPane.showMessageDialog(frmBankLoginPage,"Account Created Successfully");
			}
				catch(Exception ae) {
					ae.printStackTrace();
				}
			}
		});
		//new FirstScreen();
		frmBankLoginPage.setVisible(false);
	}
}