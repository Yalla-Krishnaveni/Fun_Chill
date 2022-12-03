import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class One {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					One window = new One();
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
	public One() {
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
		
		JLabel lblNewLabel1 = new JLabel("Kids Zone");
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel1.setBounds(594, 40, 147, 28);
		frame.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel1_1 = new JLabel("Hello lilliputs!! Welcome to kids zone");
		lblNewLabel1_1.setBounds(558, 94, 520, 14);
		frame.getContentPane().add(lblNewLabel1_1);
		
		JRadioButton rdbtnNewRadioButton1 = new JRadioButton("Funcky Monkey");
		rdbtnNewRadioButton1.setBounds(140, 145, 127, 23);
		frame.getContentPane().add(rdbtnNewRadioButton1);
		
		JRadioButton rdbtnNewRadioButton1_1 = new JRadioButton("Mini Coco cup");
		rdbtnNewRadioButton1_1.setBounds(558, 145, 147, 23);
		frame.getContentPane().add(rdbtnNewRadioButton1_1);
		
		JLabel lblNewLabel1_2 = new JLabel();
		lblNewLabel1_2.setIcon(new ImageIcon("E:\\Images\\Funcky monkey.jpeg"));
		lblNewLabel1_2.setBounds(48, 207, 384, 223);
		frame.getContentPane().add(lblNewLabel1_2);
		
		JLabel lblNewLabel1_3 = new JLabel();
		lblNewLabel1_3.setIcon(new ImageIcon("E:\\Images\\coco.jpeg"));
		lblNewLabel1_3.setBounds(460, 178, 384, 281);
		frame.getContentPane().add(lblNewLabel1_3);
		
		JRadioButton rdbtnNewRadioButton1_3 = new JRadioButton("Kiddies Wheel");
		rdbtnNewRadioButton1_3.setBounds(1017, 145, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton1_3);
		
		JLabel lblNewLabel1_4 = new JLabel();
		lblNewLabel1_4.setIcon(new ImageIcon("E:\\Images\\Kiddy.jpeg"));
		lblNewLabel1_4.setBounds(891, 207, 338, 223);
		frame.getContentPane().add(lblNewLabel1_4);
		
		
		JRadioButton r12 = new JRadioButton();
  		r12.setBounds(50, 497, 111, 23);
  		JRadioButton r13 = new JRadioButton();
  		r13.setBounds(50, 517, 111, 23);
  		ButtonGroup grp12=new ButtonGroup();
        grp12.add(r12);
        grp12.add(r13);
        
        JRadioButton r14 = new JRadioButton();
  		r14.setBounds(450, 497, 111, 23);
  		JRadioButton r15 = new JRadioButton();
  		r15.setBounds(450, 517, 111, 23);
  		ButtonGroup grp13=new ButtonGroup();
        grp13.add(r14);
        grp13.add(r15);
        
        JRadioButton r18 = new JRadioButton();
  		r18.setBounds(900, 497, 111, 23);
  		JRadioButton r17 = new JRadioButton();
  		r17.setBounds(900, 517, 111, 23);
  		ButtonGroup grp14=new ButtonGroup();
        grp14.add(r18);
        grp14.add(r17);
        
        JLabel jl11 = new JLabel();
		jl11.setBounds(50, 477, 400, 23);
		JLabel jl12 = new JLabel();
		jl12.setBounds(50, 537, 400, 23);
		
		JLabel jl13 = new JLabel();
		jl13.setBounds(450, 477, 400, 23);
		JLabel jl14 = new JLabel();
		jl14.setBounds(450, 537, 400, 23);
		
		JLabel jl15 = new JLabel();
		jl15.setBounds(900, 477, 400, 23);
		JLabel jl16 = new JLabel();
		jl16.setBounds(900, 537, 400, 23);
		
		JButton r16 = new JButton();
  		r16.setBounds(640, 580, 111, 23);
        
        rdbtnNewRadioButton1.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton1.isSelected())
                {
       			 frame.getContentPane().add(jl11);
               	 jl11.setText("Are you afraid of free falling from a height");
               	 frame.getContentPane().add(r12);
                    r12.setText("Yes");
                    frame.getContentPane().add(r13);
                    r13.setText("No");
                    r12.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r12.isSelected())
                    		 {
                    			frame.getContentPane().add(jl12);
                    			jl12.setText("Sorry :( You are not Allowed to Play the game");
                    			frame.getContentPane().add(r16);
                                r16.setText("Exit");
                                r16.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r16)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r13.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r13.isSelected())
                    		 {
                    			frame.getContentPane().add(jl12);
                    			jl12.setText("You are Allowed to Play the game");
                    			frame.getContentPane().add(r16);
                                r16.setText("Exit");
                                r16.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r16)
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
        rdbtnNewRadioButton1_1.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton1_1.isSelected())
                {
       			 frame.getContentPane().add(jl13);
               	 jl13.setText("Are you afraid of spinning around");
               	 frame.getContentPane().add(r14);
                    r14.setText("Yes");
                    frame.getContentPane().add(r15);
                    r15.setText("No");
                    r14.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r14.isSelected())
                    		 {
                    			frame.getContentPane().add(jl14);
                    			jl14.setText("Sorry :( You are not Allowed to Play the game");
                    			frame.getContentPane().add(r16);
                                r16.setText("Exit");
                                r16.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r16)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r15.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r15.isSelected())
                    		 {
                    			frame.getContentPane().add(jl14);
                    			jl14.setText("You are not Allowed to Play the game");
                    			frame.getContentPane().add(r16);
                                r16.setText("Exit");
                                r16.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r16)
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
        rdbtnNewRadioButton1_3.addActionListener(new ActionListener()
        {
       	 public void actionPerformed(ActionEvent e)
       	 {
       		 if(rdbtnNewRadioButton1_3.isSelected())
                {
       			 frame.getContentPane().add(jl15);
               	 jl15.setText("Are you afraid of spinning 360 degrees");
               	 frame.getContentPane().add(r18);
                    r18.setText("Yes");
                    frame.getContentPane().add(r17);
                    r17.setText("No");
                    r18.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r18.isSelected())
                    		 {
                    			frame.getContentPane().add(jl16);
                    			jl16.setText("Sorry :( You are not Allowed to Play the game");
                    			frame.getContentPane().add(r16);
                                r16.setText("Exit");
                                r16.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r16)
                              			{
                                			System.exit(0);
                               				//frame2.dispose();
                              			}                              		
                                	  }
                               		});
                    		 }
                    	 }
                 });
                   r17.addActionListener(new ActionListener()
                    {
                    	 public void actionPerformed(ActionEvent e)
                    	 {
                    		 if(r17.isSelected())
                    		 {
                    			frame.getContentPane().add(jl16);
                    			jl16.setText("You are Allowed to Play the game");
                    			frame.getContentPane().add(r16);
                                r16.setText("Exit");
                                r16.addActionListener(new ActionListener()
                                		{
                                		public void actionPerformed(ActionEvent e)
                                		{
                                		if(e.getSource()==r16)
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
        frame.setVisible(true);
	}
}
