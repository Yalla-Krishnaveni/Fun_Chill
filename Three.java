import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Three {

	private JFrame frame3;
	int total=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Three window = new Three();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Three() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3 = new JFrame();
		frame3.setSize(1500, 800);
		//frame3.setBounds(100, 100, 1020, 554);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel lblNewLabel3 = new JLabel("Oldage Zone");
		lblNewLabel3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel3.setBounds(591, 33, 147, 28);
		frame3.getContentPane().add(lblNewLabel3);
		
		JLabel lblNewLabel3_1 = new JLabel("Hello Oldagers!! Welcome to Oldage zone");
		lblNewLabel3_1.setBounds(543, 85, 520, 23);
		frame3.getContentPane().add(lblNewLabel3_1);
		
		JRadioButton rdbtnNewRadioButton3 = new JRadioButton("Wave Rider");
		rdbtnNewRadioButton3.setBounds(167, 145, 127, 23);
		frame3.getContentPane().add(rdbtnNewRadioButton3);
		
		JRadioButton rdbtnNewRadioButton3_1 = new JRadioButton("Cine Magic");
		rdbtnNewRadioButton3_1.setBounds(637, 145, 147, 23);
		frame3.getContentPane().add(rdbtnNewRadioButton3_1);
		
		JLabel lblNewLabel3_2 = new JLabel();
		lblNewLabel3_2.setIcon(new ImageIcon("E:\\Images\\waverider.jpeg"));
		lblNewLabel3_2.setBounds(47, 186, 375, 263);
		frame3.getContentPane().add(lblNewLabel3_2);
		
		JLabel lblNewLabel3_3 = new JLabel();
		lblNewLabel3_3.setIcon(new ImageIcon("E:\\Images\\cine.jpeg"));
		lblNewLabel3_3.setBounds(490, 186, 370, 263);
		frame3.getContentPane().add(lblNewLabel3_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Crazy Cars");
		rdbtnNewRadioButton.setBounds(1039, 145, 111, 23);
		frame3.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel3_4 = new JLabel();
		lblNewLabel3_4.setIcon(new ImageIcon("E:\\Images\\Crazy.jpeg"));
		lblNewLabel3_4.setBounds(910, 186, 332, 263);
		frame3.getContentPane().add(lblNewLabel3_4);
		
		
		JRadioButton r32 = new JRadioButton();
  		r32.setBounds(50, 497, 111, 23);
  		JRadioButton r33 = new JRadioButton();
  		r33.setBounds(50, 517, 111, 23);
  		ButtonGroup grp32=new ButtonGroup();
        grp32.add(r32);
        grp32.add(r33);
        
        JRadioButton r34 = new JRadioButton();
  		r34.setBounds(500, 497, 111, 23);
  		JRadioButton r35 = new JRadioButton();
  		r35.setBounds(500, 517, 111, 23);
  		ButtonGroup grp33=new ButtonGroup();
        grp33.add(r34);
        grp33.add(r35);
        
        JButton r36 = new JButton();
  		r36.setBounds(640, 580, 111, 23);
  		
  		JRadioButton r37 = new JRadioButton();
  		r37.setBounds(910, 497, 111, 23);
  		JRadioButton r38 = new JRadioButton();
  		r38.setBounds(910, 517, 111, 23);
  		ButtonGroup grp34=new ButtonGroup();
        grp34.add(r37);
        grp34.add(r38);
        
        JLabel jl31 = new JLabel();
		jl31.setBounds(50, 477, 400, 23);
		JLabel jl32 = new JLabel();
		jl32.setBounds(50, 537, 400, 23);
		
		JLabel jl33 = new JLabel();
		jl33.setBounds(500, 477, 400, 23);
		JLabel jl34 = new JLabel();
		jl34.setBounds(500, 537, 400, 23);
		
		JLabel jl35 = new JLabel();
		jl35.setBounds(910, 477, 400, 23);
		JLabel jl36 = new JLabel();
		jl36.setBounds(910, 537, 400, 23);
		
        
        rdbtnNewRadioButton3.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton3.isSelected())
                {
       			 frame3.getContentPane().add(jl31);
               	 jl31.setText("Are you afraid of pivoting 360 degrees");
               	 frame3.getContentPane().add(r32);
                    r32.setText("Yes");
                    frame3.getContentPane().add(r33);
                    r33.setText("No");
                    r32.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r32.isSelected())
                    		 {
                    			frame3.getContentPane().add(jl32);
                    			jl32.setText("Sorry :( You are not Allowed to Play the game");
                    			frame3.getContentPane().add(r36);
                                r36.setText("Exit");
                                r36.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r36)
                              			{
                                			
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r33.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r33.isSelected())
                    		 {
                    			frame3.getContentPane().add(jl32);
                    			jl32.setText("You are Allowed to Play the game");
                    			//frame3.getContentPane().add(jl35);
                    			//jl35.setText("Enter no. of tickets:");
                    			frame3.getContentPane().add(r36);
                    			//frame3.getContentPane().add(jt1);
                                r36.setText("Exit");
                                r36.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r36)
                              			{
                                			System.exit(0);
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                }
       	 }
        });
        rdbtnNewRadioButton3_1.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton3_1.isSelected())
                {
       			 frame3.getContentPane().add(jl33);
               	 jl33.setText("Are you afraid of watching a virtual movie");
               	 frame3.getContentPane().add(r34);
                    r34.setText("Yes");
                    frame3.getContentPane().add(r35);
                    r35.setText("No");
                    r34.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r34.isSelected())
                    		 {
                    			frame3.getContentPane().add(jl34);
                    			jl34.setText("Sorry :( You are not Allowed to Play the game");
                    			frame3.getContentPane().add(r36);
                                r36.setText("Exit");
                                r36.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r36)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r35.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r35.isSelected())
                    		 {
                    			frame3.getContentPane().add(jl34);
                    			jl34.setText("You are not Allowed to Play the game");
                    			frame3.getContentPane().add(r36);
                                r36.setText("Exit");
                                r36.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r36)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                }
       	 }
        });
        rdbtnNewRadioButton.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton.isSelected())
                {
       			 frame3.getContentPane().add(jl35);
               	 jl35.setText("Are you afraid of watching a virtual movie");
               	 frame3.getContentPane().add(r37);
                    r37.setText("Yes");
                    frame3.getContentPane().add(r38);
                    r38.setText("No");
                    r37.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r37.isSelected())
                    		 {
                    			frame3.getContentPane().add(jl36);
                    			jl36.setText("Sorry :( You are not Allowed to Play the game");
                    			frame3.getContentPane().add(r36);
                                r36.setText("Exit");
                                r36.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r36)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r38.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r38.isSelected())
                    		 {
                    			frame3.getContentPane().add(jl36);
                    			jl36.setText("You are not Allowed to Play the game");
                    			frame3.getContentPane().add(r36);
                                r36.setText("Exit");
                                r36.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r36)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                }
       	 }
        });
        frame3.setVisible(true);
	}

}
