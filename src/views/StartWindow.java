package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow implements ActionListener {

	JFrame frame  = new JFrame();
	JButton startButton  = new JButton("Start");
	JLabel welcome_msg = new JLabel();
	
	public StartWindow()
	{
			
		// The following was basic edits on the frame:
		
		frame.setSize(900,750); // Window size 
		//frame.setResizable(false); // to be able to resize it.
		frame.setTitle("Marvel's Fight Club"); // Title of the game.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ImageIcon image = new ImageIcon("project.png");
		frame.setIconImage(image.getImage()); // Icon Image.
		frame.setResizable(false);
		
		//The following part was used to add a background:
		
		ImageIcon first = new ImageIcon("background.jpg");
		Image first2 = first.getImage();
		Image modifiedImage = first2.getScaledInstance(900,750,java.awt.Image.SCALE_SMOOTH);
		first = new ImageIcon(modifiedImage);
		
		frame.setLayout(new BorderLayout());
		frame.setContentPane(new JLabel(first));
		
		// The following part edits on a start button:
		
		startButton.setBounds(380,600,200,50); // size of the button
		startButton.setFocusable(false); // no borders around the text 
		startButton.setFont(new Font("Comic Sans", Font.BOLD, 30)); // font of the text  
		startButton.setForeground(Color.white); // font colour
		startButton.setBackground(Color.darkGray); // background colour
		startButton.setBorderPainted(false);
		startButton.addActionListener(this);
		frame.add(startButton);
		
		
		// The following makes edits to the text I added:
		
		
		welcome_msg.setText("Welcome to Marvel's Fight Club !");
		welcome_msg.setBounds(280,500,400,50);
		welcome_msg.setFont(new Font(null, Font.BOLD, 25));
		welcome_msg.setForeground(Color.black);
	    welcome_msg.setOpaque(true);
		frame.add(welcome_msg);
		
		
		
		
		// The following line will make us able to see what we did in all the previous lines of code:
		
		frame.setVisible(true); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Open the next window:
		
		
		if (e.getSource() == startButton)
		{
			frame.dispose(); // close the main frame.
			new LoginWindow();
		}
		
	}
	
	
}
