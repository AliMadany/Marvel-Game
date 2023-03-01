package views;
import javax.swing.*;
import javax.swing.border.Border;

import engine.*;
import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.world.Champion;
import model.world.Cover;
import model.world.Direction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class GameWindow extends JFrame implements ActionListener {

Game game;
Player first;
Player second;

//panels
	JPanel turnorder = new JPanel();
	JPanel board = new JPanel();
	JPanel players = new JPanel();
	JPanel Remaininginfo = new JPanel();
	JPanel current = new JPanel();
	JPanel actions = new JPanel();
	JPanel otherinfo = new JPanel();
//player buttons
	JButton p1c1 = new JButton();
	JButton p1c2 = new JButton();
	JButton p1c3 = new JButton();
	JButton p2c1 = new JButton();
	JButton p2c2 = new JButton();
	JButton p2c3 = new JButton();
//Action buttons
	JButton attack = new JButton("Attack");
	JButton move = new JButton("Move");
	JButton endturn = new JButton("EndTurn");
	JButton use = new JButton("Use Leader Ability");
	JButton castAbility = new JButton("Cast Ability");	
// Main frame
	JFrame frame = new JFrame();	
//Players Panel:
	JLabel player1name = new JLabel();
	JLabel player2name = new JLabel();
	JButton champ1 = new JButton();
	JButton champ2 = new JButton();
	JButton champ3 = new JButton();
	JButton champ4 = new JButton();
	JButton champ5 = new JButton();
	JButton champ6 = new JButton();
	JButton info1 = new JButton("info");
	JButton info2 = new JButton("info");
	JButton info3 = new JButton("info");
	JButton info4 = new JButton("info");
	JButton info5 = new JButton("info");
	JButton info6 = new JButton("info");

// Board Buttons:
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	JButton b12 = new JButton();
	JButton b13 = new JButton();
	JButton b14 = new JButton();
	JButton b15 = new JButton();
	JButton b16 = new JButton();
	JButton b17 = new JButton();
	JButton b18 = new JButton();
	JButton b19 = new JButton();
	JButton b20 = new JButton();
	JButton b21 = new JButton();
	JButton b22 = new JButton();
	JButton b23 = new JButton();
	JButton b24 = new JButton();
	JButton b25 = new JButton();
	JButton [] [] indices = new JButton[5] [5];
	
	
	public GameWindow()
	{
		
		game = new Game(PickChampions.getFirstPlayer(),PickChampions.getSecondPlayer());
		
		
		//Dividing the main window to panels:
		
		// Main Frame
		frame = new JFrame();
        frame.setSize(900,750); // Window size 
		//frame.setResizable(false); // to be able to resize it.
		frame.setTitle("Marvel's Fight Club "); // Title of the game.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);	
		frame.setLayout(null);
		frame.setVisible(true);

		//Turn Order:
		turnorder.setBounds(200,0,500,80);
		turnorder.setLayout(null);
		turnorder.setBackground(Color.black);
		JLabel turnOrder = new JLabel("Turn Order:");
		turnOrder.setVisible(true);
		turnOrder.setBounds(0,1,150,40);
		turnOrder.setForeground(Color.white);
		turnOrder.setFont(new Font("Comic Sans",Font.BOLD,13));
		turnorder.add(turnOrder);
		JTextArea ChampsOrder = new JTextArea(this.toString(game.getTurnOrder())); 
		ChampsOrder.setVisible(true); 
		ChampsOrder.setBounds(152,0,300,40);
		ChampsOrder.setFont(new Font("Comic Sans",Font.BOLD,11));
		ChampsOrder.setForeground(Color.white);
		turnorder.add(ChampsOrder);
		
		//Edits to the Board:
		board.setBounds(200,81,500,500);
		board.setLayout(new GridLayout(5,5,3,3));
		board.setBackground(Color.white);
		board.add(b1);
		board.add(b2);
		board.add(b3);
		board.add(b4);
		board.add(b5);
		board.add(b6);
		board.add(b7);
		board.add(b8);
		board.add(b9);
		board.add(b10);
		board.add(b11);
		board.add(b12);
		board.add(b13);
		board.add(b14);
		board.add(b15);
		board.add(b16);
		board.add(b17);
		board.add(b18);
		board.add(b19);
		board.add(b20);
		board.add(b21);
		board.add(b22);
		board.add(b23);
		board.add(b24);
		board.add(b25);
	
		b1.setVisible(true);
		b1.setLayout(null);
		b1.setBackground(Color.white);
		
		b2.setVisible(true);
		b2.setLayout(null);
		b2.setBackground(Color.white);
		
		b3.setVisible(true);
		b3.setLayout(null);
		b3.setBackground(Color.white);
		
		b4.setVisible(true);
		b4.setLayout(null);
		b4.setBackground(Color.white);
		
		b5.setVisible(true);
		b5.setLayout(null);
		b5.setBackground(Color.white);
		
		b6.setVisible(true);
		b6.setLayout(null);
		b6.setBackground(Color.white);
		
		b7.setVisible(true);
		b7.setLayout(null);
		b7.setBackground(Color.white);
		
		b8.setVisible(true);
		b8.setLayout(null);
		b8.setBackground(Color.white);
		
		b9.setVisible(true);
		b9.setLayout(null);
		b9.setBackground(Color.white);
		
		b10.setVisible(true);
		b10.setLayout(null);
		b10.setBackground(Color.white);
		
		b11.setVisible(true);
		b11.setLayout(null);
		b11.setBackground(Color.white);
		
		b12.setVisible(true);
		b12.setLayout(null);
		b12.setBackground(Color.white);
		
		b13.setVisible(true);
		b13.setLayout(null);
		b13.setBackground(Color.white);
		
		b14.setVisible(true);
		b14.setLayout(null);
		b14.setBackground(Color.white);
		
		b15.setVisible(true);
		b15.setLayout(null);
		b15.setBackground(Color.white);
		
		b16.setVisible(true);
		b16.setLayout(null);
		b16.setBackground(Color.white);
		
		b17.setVisible(true);
		b17.setLayout(null);
		b17.setBackground(Color.white);
		
		b18.setVisible(true);
		b18.setLayout(null);
		b18.setBackground(Color.white);
		
		b19.setVisible(true);
		b19.setLayout(null);
		b19.setBackground(Color.white);
		
		b20.setVisible(true);
		b20.setLayout(null);
		b20.setBackground(Color.white);
		
		b21.setVisible(true);
		b21.setLayout(null);
		b21.setBackground(Color.white);
		
		b22.setVisible(true);
		b22.setLayout(null);
		b22.setBackground(Color.white);
		
		b23.setVisible(true);
		b23.setLayout(null);
		b23.setBackground(Color.white);
		
		b24.setVisible(true);
		b24.setLayout(null);
		b24.setBackground(Color.white);
		
		b25.setVisible(true);
		b25.setLayout(null);
		b25.setBackground(Color.white);
		
		indices[0][0]=b21;indices[0][1]=b22;indices[0][2]=b23;indices[0][3]=b24;indices[0][4]=b25;
		indices[1][0]=b16;indices[1][1]=b17;indices[1][2]=b18;indices[1][3]=b19;indices[1][4]=b20;
		indices[2][0]=b11;indices[2][1]=b12;indices[2][2]=b13;indices[2][3]=b14;indices[2][4]=b15;
		indices[3][0]=b6;indices[3][1]=b7;indices[3][2]=b8;indices[3][3]=b9;indices[3][4]=b10;
		indices[4][0]=b1;indices[4][1]=b2;indices[4][2]=b3;indices[4][3]=b4;indices[4][4]=b5;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			   if (game.getBoard() [i] [j] == null)
			   {
				   PickChampions.cleanUp(indices[i][j]);
			   }
				else if (game.getBoard() [i] [j] instanceof Champion)
				{
					indices [i] [j].setIcon(getChampLogoAndResize((Champion) (game.getBoard() [i] [j]),80,80));
				}
				else if (game.getBoard() [i] [j] instanceof Cover)
				{
					indices [i] [j].setIcon(PickChampions.resize(new ImageIcon("cover.jpg"),80,80));
					JTextField chp = new JTextField(this.toString((Cover) game.getBoard() [i] [j]));
					chp.setVisible(true);
					chp.setOpaque(true);
					chp.setFont(new Font("Comic Sans",Font.BOLD,8));
				}
			}
		}
		
		
		
		// Edits to players panel:
		players.setBounds(0,0,200,350);
		players.setLayout(null);
		players.setBackground(Color.white);
		player1name.setText(PickChampions.getFirstPlayer().getName() + ", " + "Leader: " + PickChampions.getFirstPlayer().getLeader().getName() );
		player1name.setBounds(5,5,198,40);
		player1name.setFont(new Font("Comic Sans",Font.BOLD,15));
		player1name.setVisible(true);
		players.add(player1name);
		
		champ1.setLayout(null);
		info1.setBounds(1,68,20,20);
		info1.setFont(new Font("Comic Sans",Font.BOLD,10));
		info1.setBackground(Color.black);
		info1.setForeground(Color.white);
		info1.setVisible(true);
		info1.addActionListener(this);
		champ1.setBounds(1,50,60,90);
		champ1.setIcon(getChampLogoAndResize(PickChampions.getFirstPlayer().getTeam().get(0),60,90));
		champ1.add(info1);
		champ1.setVisible(true);
		players.add(champ1);
		
		champ2.setLayout(null);
		info2.setBounds(1,68,20,20);
		info2.setFont(new Font("Comic Sans",Font.BOLD,10));
		info2.setBackground(Color.black);
		info2.setForeground(Color.white);
		info2.setVisible(true);
		info2.addActionListener(this);
		champ2.setBounds(66,50,60,90);
		champ2.setIcon(getChampLogoAndResize(PickChampions.getFirstPlayer().getTeam().get(1),60,90));
		champ2.add(info2);
		champ2.setVisible(true);
		players.add(champ2);
		
		champ3.setLayout(null);
		info3.setBounds(1,68,20,20);
		info3.setFont(new Font("Comic Sans",Font.BOLD,10));
		info3.setBackground(Color.black);
		info3.setForeground(Color.white);
		info3.setVisible(true);
		info3.addActionListener(this);
		champ3.setBounds(127,50,60,90);
		champ3.setIcon(getChampLogoAndResize(PickChampions.getFirstPlayer().getTeam().get(2),60,90));
		champ3.add(info3);
		champ3.setVisible(true);
		players.add(champ3);
		
		player2name.setText(PickChampions.getSecondPlayer().getName() + ", " + "Leader: " + PickChampions.getSecondPlayer().getLeader().getName() );
		player2name.setBounds(5,145,198,40);
		player2name.setFont(new Font("Comic Sans",Font.BOLD,15));
		player2name.setVisible(true);
		players.add(player2name);
		
		champ4.setLayout(null);
		info4.setBounds(1,68,20,20);
		info4.setFont(new Font("Comic Sans",Font.BOLD,10));
		info4.setBackground(Color.black);
		info4.setForeground(Color.white);
		info4.setVisible(true);
		info4.addActionListener(this);
		champ4.setBounds(1,190,60,90);
		champ4.setIcon(getChampLogoAndResize(PickChampions.getSecondPlayer().getTeam().get(0),60,90));
		champ4.add(info4);
		champ4.setVisible(true);
		players.add(champ4);
		
		champ5.setLayout(null);
		info5.setBounds(1,68,20,20);
		info5.setFont(new Font("Comic Sans",Font.BOLD,10));
		info5.setBackground(Color.black);
		info5.setForeground(Color.white);
		info5.setVisible(true);
		info5.addActionListener(this);
		champ5.setBounds(66,190,60,90);
		champ5.setIcon(getChampLogoAndResize(PickChampions.getSecondPlayer().getTeam().get(1),60,90));
		champ5.add(info5);
		champ5.setVisible(true);
		players.add(champ5);
		
		champ6.setLayout(null);
		info6.setBounds(1,68,20,20);
		info6.setFont(new Font("Comic Sans",Font.BOLD,10));
		info6.setBackground(Color.black);
		info6.setForeground(Color.white);
		info6.setVisible(true);
		info6.addActionListener(this);
		champ6.setBounds(127,190,60,90);
		champ6.setIcon(getChampLogoAndResize(PickChampions.getSecondPlayer().getTeam().get(2),60,90));
		champ6.add(info6);
		champ6.setVisible(true);
		players.add(champ6);
		
		
		Remaininginfo.setBounds(0,350,200,400);
		Remaininginfo.setLayout(null);
		Remaininginfo.setBackground(Color.green);
		
		current.setBounds(700,0,200,400);
		current.setLayout(null);
		current.setBackground(Color.blue);
		
		// Edits to Buttons:
		actions.setBounds(200,582,500,170);
		actions.setLayout(null);
		actions.setBackground(Color.red);
		
		attack.setVisible(true);
		attack.setBounds(0,5,100,40);
		attack.setBorderPainted(true);
		attack.addActionListener(this);
		attack.setFont(new Font("Comic Sans",Font.BOLD,10));
		attack.setBackground(Color.black);
		attack.setForeground(Color.white);
		actions.add(attack);
		
		move.setVisible(true);
		move.setBounds(0,50,100,40);
		move.setBorderPainted(true);
		move.addActionListener(this);
		move.setFont(new Font("Comic Sans",Font.BOLD,10));
		move.setBackground(Color.black);
		move.setForeground(Color.white);
		actions.add(move);
		
		endturn.setVisible(true);
		endturn.setBounds(0,95,100,40);
		endturn.setBorderPainted(true);
		endturn.addActionListener(this);
		endturn.setFont(new Font("Comic Sans",Font.BOLD,10));
		endturn.setBackground(Color.black);
		endturn.setForeground(Color.white);
		actions.add(endturn);
		
		use.setVisible(true);
		use.setBounds(250,10,200,40);
		use.setBorderPainted(true);
		use.addActionListener(this);
		use.setFont(new Font("Comic Sans",Font.BOLD,10));
		use.setBackground(Color.black);
		use.setForeground(Color.white);
		actions.add(use);
		
		castAbility.setVisible(true);
		castAbility.setBounds(250,60,200,40);
		castAbility.setBorderPainted(true);
		castAbility.addActionListener(this);
		castAbility.setFont(new Font("Comic Sans",Font.BOLD,10));
		castAbility.setBackground(Color.black);
		castAbility.setForeground(Color.white);
		actions.add(castAbility);
		
		otherinfo.setBounds(200,1,500,50);
		otherinfo.setLayout(null);
		otherinfo.setBackground(Color.magenta);
		
		frame.add(turnorder);
		frame.add(board);
		frame.add(players);
		frame.add(Remaininginfo);
		frame.add(current);
		frame.add(actions);
		frame.add(otherinfo);
		frame.setVisible(true);
	}
		
	

	
private String toString(PriorityQueue turnOrder2) {
		// TODO Auto-generated method stub
		return null;
	}




public String toString(ArrayList<Champion> arr)
{
	return arr.get(0).getName() + arr.get(1).getName() + arr.get(2).getName() + arr.get(3).getName() + arr.get(4).getName() + arr.get(5).getName();
}
	
	private ImageIcon getChampLogoAndResize(Champion c,int x, int y)
	{
		ImageIcon i = null;
		
		switch(c.getName())
		{
		
		case "Captain America" : i=new ImageIcon("CA logo.jpg");break;
		case "Deadpool": i=new ImageIcon("Deadpool logo.png");break;
		case "Dr Strange": i=new ImageIcon("DR logo.png");break;
		case "Electro": i=new ImageIcon("electro logo.png");break;
		case "Ghost Rider": i=new ImageIcon("ghost rider logo.jfif");break;
		case "Hela": i=new ImageIcon("hela logo.jpg");break;
		case "Hulk": i=new ImageIcon("");break;
		case "Iceman": i=new ImageIcon("iceman logo.jpg");break;
		case "Ironman": i=new ImageIcon("");break;
		case "Loki": i=new ImageIcon("loki logo.png");break;
		case "Quicksilver": i=new ImageIcon("quick silver logo.jpg");break;
		case "Spiderman": i=new ImageIcon("spiderman logo.jpg");break;
		case "Thor": i=new ImageIcon("");break;
		case "Venom": i=new ImageIcon("venom logo.jpg");break;
		case "Yellow Jacket" : i=new ImageIcon("yellow jacket logo.jpg");break;
		
		}
		
		ImageIcon i2 = PickChampions.resize(i,x,y);
		return i2;
	}
	
	public String toString(Cover c)
	{
		return "Current Health Points: " + "\n"+ c.getCurrentHP();
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// To Display Remaining Champion Info
		if (e.getSource() == info1)
		{
			
		}
		else if (e.getSource() == info2)
		{
			
		}
		else if (e.getSource() == info3)
		{
			
		}
		else if (e.getSource() == info4)
		{
			
		}
		else if (e.getSource() == info5)
		{
			
		}
		else if (e.getSource() == info6)
		{
			
		}
		
		//Actions
		else if(e.getSource() == attack)
		{
			
			String[] temp = {"up" ,"down" ,"left" ,"right"};
			int hh = JOptionPane.showOptionDialog(null, "Choose direction", "" , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, temp, 0);
			try {
				if (hh == 0)
					game.attack(Direction.UP);
				if (hh == 1)
					game.attack(Direction.DOWN);
				if (hh == 2)
					game.attack(Direction.LEFT);
				else
					game.attack(Direction.RIGHT);
			}
			catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage(),"Please read the following",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == castAbility)
		{
			String[] temp = new String[game.getCurrentChampion().getAbilities().size()];
			for (int i = 0 ; i<temp.length ; i++) {
				temp[i] = game.getCurrentChampion().getAbilities().get(i).getName();
			}
			int hh = JOptionPane.showOptionDialog(null, "Choose Ability", "" , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, temp, 0);
			try {
					Ability a = game.getCurrentChampion().getAbilities().get(hh);
					if(a.getCastArea() == AreaOfEffect.DIRECTIONAL)
					{
						String[] abilityDirec = {"up" ,"down" ,"left" ,"right"};
						int optionNumber = JOptionPane.showOptionDialog(null, "Choose direction", "" , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, abilityDirec, 0);
					try
					{
						if (optionNumber == 0)
							game.castAbility(a,Direction.UP);
						if (optionNumber == 1)
							game.castAbility(a,Direction.DOWN);
						if (optionNumber == 2)
							game.castAbility(a,Direction.LEFT);
						else
							game.castAbility(a,Direction.RIGHT);
					}
					catch(Exception e1)
					{
						e1.getMessage();
					}
					}
					else if (a.getCastArea() == AreaOfEffect.SINGLETARGET)
					{
	                   String xCoor = JOptionPane.showInputDialog("Choose x Coordinate");
	                   String yCoor = JOptionPane.showInputDialog("Choose y Coordinate");
	                   int xCoordinate = Integer.parseInt(xCoor);
	                   int yCoordinate = Integer.parseInt(yCoor);
	                   
	                   game.castAbility(a, xCoordinate, yCoordinate);
	                   
					}
					else
					{
						try
						{
						 game.castAbility(a);	
						}
						catch (Exception e1)
						{
							e1.getMessage();
						}
					}
				
			}
			catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage(),"Please read the following",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == use)
		{
			try {
				game.useLeaderAbility();
			} 
			catch (Exception e2) 
			{
				JOptionPane.showMessageDialog(null, e2.getMessage(),"Please read the following",JOptionPane.ERROR_MESSAGE);
			}
				
			}
		
		
	else if(e.getSource() == move)
		{
		String[] temp = {"up" ,"down" ,"left" ,"right"};
		int hh = JOptionPane.showOptionDialog(null, "Choose direction", "" , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, temp, 0);
		try {
			if (hh == 0)
				game.move(Direction.UP);
			if (hh == 1)
				game.move(Direction.DOWN);
			if (hh == 2)
				game.move(Direction.LEFT);
			else
				game.move(Direction.RIGHT);
		}
		catch (Exception e2) {
			JOptionPane.showMessageDialog(null, e2.getMessage(),"Please read the following",JOptionPane.ERROR_MESSAGE);
		}
			
		}
		else if(e.getSource() == endturn)
		{
			game.endTurn();
		}
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			   if (game.getBoard() [i] [j] == null)
			   {
				   PickChampions.cleanUp(indices[i][j]);
			   }
				else if (game.getBoard() [i] [j] instanceof Champion)
				{
					indices [i] [j].setIcon(getChampLogoAndResize((Champion) (game.getBoard() [i] [j]),80,80));
				}
				else if (game.getBoard() [i] [j] instanceof Cover)
				{
					indices [i] [j].setIcon(PickChampions.resize(new ImageIcon("cover.jpg"),80,80));
					JTextField chp = new JTextField(this.toString((Cover) game.getBoard() [i] [j]));
					chp.setVisible(true);
					chp.setOpaque(true);
					chp.setFont(new Font("Comic Sans",Font.BOLD,8));
				}
			}
		}
		
	}

}
