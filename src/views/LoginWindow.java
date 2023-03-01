package views;
import javax.swing.*;
import engine.Game;
import engine.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class LoginWindow extends JFrame implements ActionListener {

	JFrame frame = new JFrame();
	JLabel player1 = new JLabel();
	JLabel player2 = new JLabel();
	JButton back = new JButton("Back");
	JButton next = new JButton("Next");
	static Player p1;
	static Player p2;
	static JTextField p1field;
	static JTextField p2field;
	JOptionPane error= new JOptionPane();
	
	public LoginWindow()
	{
		// Edits to the main frame:
		frame.setSize(600,600); // Window size 
		frame.setResizable(true); // to be able to resize it.
		frame.setTitle("Marvel's Fight Club"); // Title of the game.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ImageIcon image = new ImageIcon("project.png");
		frame.setIconImage(image.getImage()); // Icon Image.
		//this.setLayout(new FlowLayout());
		frame.setResizable(false);
		
		//The following part was used to add a background:
		
		ImageIcon first = new ImageIcon("background.jpg");
		Image first2 = first.getImage();
		Image modifiedImage = first2.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
		first = new ImageIcon(modifiedImage);
		
//		frame.setLayout(new BorderLayout());
		frame.setLayout(null);
		frame.setContentPane(new JLabel(first));
		
		
		
		// Edits on Player 1 Label:
		
		player1.setText("Enter First Player Name: ");
		player1.setBounds(0,0,300,70);
		player1.setFont(new Font("Comic Sans", Font.BOLD, 20));
		player1.setForeground(Color.black);
		player1.setOpaque(true);
		Dimension size1 = player1.getPreferredSize();
		player1.setBounds(20,150,size1.width, size1.height);
		
		// Edits on Player 2 Label:
		
		player2.setText("Enter Second Player Name: ");
		player2.setBounds(0,0,400,70);
		player2.setFont(new Font("Comic Sans", Font.BOLD, 20));
		player2.setForeground(Color.black);
		Dimension size2 = player2.getPreferredSize();
		player2.setBounds(20,250,size2.width, size2.height);
		player2.setOpaque(true);
	
		// Edits on Next Button:
		
		next.addActionListener(this);
		next.setBounds(380,500,200,50); // size of the button
		next.setFocusable(false); // no borders around the text 
		next.setFont(new Font("Comic Sans", Font.BOLD, 30)); // font of the text  
		next.setForeground(Color.black); // font colour
		next.setBackground(Color.red); // background colour
		next.setBorderPainted(false);
		next.setVisible(true);
		
		// Edits on Back Button:
		
		back.addActionListener(this);
		back.setBounds(0,500,200,50); // size of the button
		back.setFocusable(false); // no borders around the text 
		back.setFont(new Font("Comic Sans", Font.BOLD, 30)); // font of the text  
		back.setForeground(Color.black); // font colour
		back.setBackground(Color.red); // background colour
		back.setBorderPainted(false);
		back.setVisible(true);
		
		// Here we are adding Text fields:
		
		 p1field = new JTextField();
		 p1field.setPreferredSize(new Dimension(400,50));
		 p1field.setBounds(310,150,size1.width,size1.height);
		
		
		 p2field = new JTextField();
		 p2field.setPreferredSize(new Dimension(400,50));
		 p2field.setBounds(310,250,size2.width,size2.height);
		
		
		// To Show what I have Done:
		
		frame.add(back);
		frame.add(next);
		frame.add(player1);
		frame.add(player2);
	    frame.add(p1field);
	    frame.add(p2field);
	    frame.pack();
	    
	    frame.setVisible(true);
	    
	    
	    
	    // Initialising new Players:
	    
	    
	    
	}
	
	
	public static Player getP1() {
	    p1 = new Player(LoginWindow.p1field.getText());
		return p1;
	}





	public static Player getP2() {
	    p2 = new Player(p2field.getText());
		return p2;
	}
	

	@Override
	public void actionPerformed(ActionEvent e)  {

		if (e.getSource() == next)
			
		{
			if (p1field.getText().isEmpty() || p2field.getText().isEmpty())
			{
				error.showMessageDialog(null, "Please Add Your Names !","Please Read The Following",JOptionPane.ERROR_MESSAGE);
			}
			
			else {
				frame.dispose();
			try {
				new PickChampions();
			}
			catch(IOException e1)
			{
				System.out.println("HHH");
				e1.getStackTrace();
			}
			
			}
		}
		
		
		else if (e.getSource() == back)
		{
			p1 = null;
			p2 = null;
			frame.dispose();
			new StartWindow();
			
		}
		
	}

}
