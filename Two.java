import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Two {

	private JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Two window = new Two();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Two() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setSize(1500, 800);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adult Zone");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(594, 40, 147, 28);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hello Adults!! Welcome to Adult zone");
		lblNewLabel_1.setBounds(558, 94, 520, 14);
		frame2.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Equinox");
		rdbtnNewRadioButton.setBounds(131, 145, 127, 23);
		frame2.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Maverick");
		rdbtnNewRadioButton_1.setBounds(520, 145, 147, 23);
		frame2.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Images\\equinox.jpeg"));
		lblNewLabel_2.setBounds(59, 186, 384, 281);
		frame2.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setIcon(new ImageIcon("E:\\Images\\maverick.jpeg"));
		lblNewLabel_3.setBounds(444, 175, 384, 281);
		frame2.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Recoil");
		rdbtnNewRadioButton_2.setBounds(958, 145, 111, 23);
		frame2.getContentPane().add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_4= new JLabel();
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Images\\Recoil.jpeg"));
		lblNewLabel_4.setBounds(859, 195, 328, 248);
		frame2.getContentPane().add(lblNewLabel_4);
		
		
		JRadioButton r2 = new JRadioButton();
  		r2.setBounds(60, 497, 111, 23);
  		JRadioButton r3 = new JRadioButton();
  		r3.setBounds(60, 517, 111, 23);
  		ButtonGroup grp2=new ButtonGroup();
        grp2.add(r2);
        grp2.add(r3);
        
        JRadioButton r4 = new JRadioButton();
  		r4.setBounds(450, 497, 111, 23);
  		JRadioButton r5 = new JRadioButton();
  		r5.setBounds(450, 517, 111, 23);
  		ButtonGroup grp3=new ButtonGroup();
        grp3.add(r4);
        grp3.add(r5);
        
        JButton r6 = new JButton();
  		r6.setBounds(640, 580, 111, 23);
  		
  		JRadioButton r7 = new JRadioButton();
  		r7.setBounds(860, 497, 111, 23);
  		JRadioButton r8 = new JRadioButton();
  		r8.setBounds(860, 517, 111, 23);
  		ButtonGroup grp4=new ButtonGroup();
        grp4.add(r7);
        grp4.add(r8);
        
        JLabel jl1 = new JLabel();
		jl1.setBounds(60, 477, 400, 23);
		JLabel jl2 = new JLabel();
		jl2.setBounds(60, 537, 400, 23);
		
		JLabel jl3 = new JLabel();
		jl3.setBounds(450, 477, 400, 23);
		JLabel jl4 = new JLabel();
		jl4.setBounds(450, 537, 400, 23);
		
		JLabel jl5 = new JLabel();
		jl5.setBounds(860, 477, 400, 23);
		JLabel jl6 = new JLabel();
		jl6.setBounds(860, 537, 400, 23);
        
        rdbtnNewRadioButton.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton.isSelected())
                {
       			 frame2.getContentPane().add(jl1);
               	 jl1.setText("Are you afraid of swinging");
               	 frame2.getContentPane().add(r2);
                    r2.setText("Yes");
                    frame2.getContentPane().add(r3);
                    r3.setText("No");
                    r2.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r2.isSelected())
                    		 {
                    			frame2.getContentPane().add(jl2);
                    			jl2.setText("Sorry :( You are not Allowed to Play the game");
                    			frame2.getContentPane().add(r6);
                                r6.setText("Exit");
                                r6.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r6)
                              			{
                                			System.exit(0);
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r3.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r3.isSelected())
                    		 {
                    			frame2.getContentPane().add(jl2);
                    			jl2.setText("You are Allowed to Play the game");
                    			frame2.getContentPane().add(r6);
                                r6.setText("Exit");
                                r6.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r6)
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
        rdbtnNewRadioButton_1.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton_1.isSelected())
                {
       			 frame2.getContentPane().add(jl3);
               	 jl3.setText("Are you afraid of height and rotating speed");
               	 frame2.getContentPane().add(r4);
                    r4.setText("Yes");
                    frame2.getContentPane().add(r5);
                    r5.setText("No");
                    r4.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r4.isSelected())
                    		 {
                    			frame2.getContentPane().add(jl4);
                    			jl4.setText("Sorry :( You are not Allowed to Play the game");
                    			frame2.getContentPane().add(r6);
                                r6.setText("Exit");
                                r6.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r6)
                              			{
                                			System.exit(0);
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r5.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r5.isSelected())
                    		 {
                    			frame2.getContentPane().add(jl4);
                    			jl4.setText("You are not Allowed to Play the game");
                         		frame2.getContentPane().add(r6);
                                r6.setText("Exit");
                                r6.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r6)
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
        rdbtnNewRadioButton_2.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton_2.isSelected())
                {
       			 frame2.getContentPane().add(jl5);
               	 jl5.setText("Are you afraid of spinning and twisting");
               	 frame2.getContentPane().add(r7);
                    r7.setText("Yes");
                    frame2.getContentPane().add(r8);
                    r8.setText("No");
                    r7.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r7.isSelected())
                    		 {
                    			frame2.getContentPane().add(jl6);
                    			jl6.setText("Sorry :( You are not Allowed to Play the game");
                    			frame2.getContentPane().add(r6);
                                r6.setText("Exit");
                                r6.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r6)
                              			{
                                			System.exit(0);
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r8.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r8.isSelected())
                    		 {
                    			frame2.getContentPane().add(jl6);
                    			jl6.setText("You are not Allowed to Play the game");
                         		frame2.getContentPane().add(r6);
                                r6.setText("Exit");
                                r6.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r6)
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
        frame2.setVisible(true);
	}
}
