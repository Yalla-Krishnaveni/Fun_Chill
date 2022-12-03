import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exhibhition {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exhibhition window = new Exhibhition();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Exhibhition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel0 = new JLabel("FUN && CHILL");
		lblNewLabel0.setBounds(559, 33, 206, 37);
		lblNewLabel0.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblNewLabel0);
		
		JLabel lblNewLabel0_1 = new JLabel("Choose to which age group you belong");
		lblNewLabel0_1.setBounds(505, 81, 288, 29);
		frame.getContentPane().add(lblNewLabel0_1);
		
		JRadioButton rdbtnNewRadioButton0_1 = new JRadioButton("Adult(13-49)");
		rdbtnNewRadioButton0_1.setBounds(539, 129, 178, 23);
		frame.getContentPane().add(rdbtnNewRadioButton0_1);
		
		JRadioButton rdbtnNewRadioButton0_3 = new JRadioButton("Oldage(50 and above)");
		rdbtnNewRadioButton0_3.setBounds(834, 129, 166, 23);
		frame.getContentPane().add(rdbtnNewRadioButton0_3);
		
		JRadioButton rdbtnNewRadioButton0 = new JRadioButton("Babyhood(6-12)");
		rdbtnNewRadioButton0.setBounds(168, 129, 129, 23);
		frame.getContentPane().add(rdbtnNewRadioButton0);
	
		
		ButtonGroup grp=new ButtonGroup();
        grp.add(rdbtnNewRadioButton0_1);
        grp.add(rdbtnNewRadioButton0_3);
        grp.add(rdbtnNewRadioButton0);
        
        JLabel lblNewLabel0_2 = new JLabel();
        lblNewLabel0_2.setBounds(416, 166, 349, 245);
        lblNewLabel0_2.setIcon(new ImageIcon("E:\\Images\\adult.jpeg"));
        frame.getContentPane().add(lblNewLabel0_2);
        
        JLabel lblNewLabel0_4 = new JLabel();
        lblNewLabel0_4.setBounds(42, 166, 340, 245);
        lblNewLabel0_4.setIcon(new ImageIcon("E:\\Images\\kids.jpeg"));
        frame.getContentPane().add(lblNewLabel0_4);
        
        JLabel lblNewLabel0_3 = new JLabel();
        lblNewLabel0_3.setBounds(805, 166, 349, 245);
        lblNewLabel0_3.setIcon(new ImageIcon("E:\\Images\\Oldage.jpeg"));
        frame.getContentPane().add(lblNewLabel0_3);
        
  		
  		rdbtnNewRadioButton0.addActionListener(new ActionListener()
  		{
            public void actionPerformed(ActionEvent e)
            {  
              if(rdbtnNewRadioButton0.isSelected())
              {
            	  	new One();
  					frame.setVisible(false);
              }
            }
  		});
  		rdbtnNewRadioButton0_1.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
            {  
              if(rdbtnNewRadioButton0_1.isSelected())
              {
            	  	new Two();
					frame.setVisible(false);
              }
           }
           });
  		rdbtnNewRadioButton0_3.addActionListener(new ActionListener()
  		{
            public void actionPerformed(ActionEvent e)
            {  
              if(rdbtnNewRadioButton0_3.isSelected())
              {
            	  	new Three();
					frame.setVisible(false);
              }
           }
        });
	}
}