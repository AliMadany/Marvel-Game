package views;

import javax.swing.*;
import javax.swing.border.Border;

import engine.*;
import model.world.Champion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class PickChampions extends JFrame implements ActionListener {

	static Player firstPlayer;
	static Player secondPlayer;

	JOptionPane error = new JOptionPane();

	// Main
	JFrame frame;

	JLabel chooseYourChamps = new JLabel("Choose Your Champions"); // To be added later

	// Champions
	JButton captainAmerica = new JButton();
	JButton deadPool = new JButton();
	JButton drStrange = new JButton();
	JButton electro = new JButton();
	JButton ghostRider = new JButton();
	JButton hela = new JButton();
	JButton hulk = new JButton();
	JButton iceMan = new JButton();
	JButton ironMan = new JButton();
	JButton loki = new JButton();
	JButton quickSilver = new JButton();
	JButton spiderMan = new JButton();
	JButton thor = new JButton();
	JButton venom = new JButton();
	JButton yellowJacket = new JButton();
	JButton next = new JButton();
	JButton back = new JButton();

	JPanel left = new JPanel();
	JPanel right = new JPanel();
	JPanel mid = new JPanel();
	// Texts
	JLabel title1 = new JLabel("First Player Team");
	JLabel title2 = new JLabel("Second Player Team");
	// Champions
	JButton team11 = new JButton("Champion 1");
	JButton team12 = new JButton("Champion 2");
	JButton team13 = new JButton("Champion 3");
	JButton team21 = new JButton("Champion 1");
	JButton team22 = new JButton("Champion 2");
	JButton team23 = new JButton("Champion 3");
	// Make him Leader
	JButton leader1 = new JButton("make Leader");
	JButton leader2 = new JButton("make Leader");
	JButton leader3 = new JButton("make Leader");
	JButton leader4 = new JButton("make Leader");
	JButton leader5 = new JButton("make Leader");
	JButton leader6 = new JButton("make Leader");
	// Select
	JButton select1 = new JButton("Select");
	JButton select2 = new JButton("Select");
	JButton select3 = new JButton("Select");
	JButton select4 = new JButton("Select");
	JButton select5 = new JButton("Select");
	JButton select6 = new JButton("Select");
	JButton select7 = new JButton("Select");
	JButton select8 = new JButton("Select");
	JButton select9 = new JButton("Select");
	JButton select10 = new JButton("Select");
	JButton select11 = new JButton("Select");
	JButton select12 = new JButton("Select");
	JButton select13 = new JButton("Select");
	JButton select14 = new JButton("Select");
	JButton select15 = new JButton("Select");
	// Champion details
	JLabel name = new JLabel();
	JLabel maxHP = new JLabel();
	JLabel mana = new JLabel();
	JLabel maxActionPointsPerTurn = new JLabel();
	JLabel attackRange = new JLabel();
	JLabel attackDamage = new JLabel();
	JLabel speed = new JLabel();
	JLabel abilities = new JLabel();

	public PickChampions() throws IOException {

		error.setBackground(Color.white);
		Game.loadAbilities("Abilities.csv");
		Game.loadChampions("Champions.csv");

		firstPlayer = LoginWindow.getP1();
		secondPlayer = LoginWindow.getP2();
		System.out.println(firstPlayer.getName());
		// The following was basic edits on the frame:

		frame = new JFrame();
		frame.setSize(900, 750); // Window size
		// frame.setResizable(false); // to be able to resize it.
		frame.setTitle("Marvel's Fight Club"); // Title of the game.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("project.png");
		frame.setIconImage(image.getImage()); // Icon Image.
		frame.setResizable(false);

		// The following part is used to edit the left Panel:

		left.setLayout(null);
		left.setBackground(Color.black);
		left.setBounds(0, 0, 200, 750);

		title1.setBounds(1, 0, 198, 40);
		title1.setFont(new Font("Comic Sans", Font.BOLD, 20));
		title1.setForeground(Color.white);
		left.add(title1);

		leader1.setLayout(null);
		leader1.setBackground(Color.green);
		leader1.setFont(new Font("Comic Sans", Font.BOLD, 10));
		leader1.setFocusable(false);
		leader1.setBorderPainted(true);
		leader1.addActionListener(this);
		leader1.setVisible(true);
		leader1.setBounds(95, 10, 100, 50);

		leader2.setLayout(null);
		leader2.setBackground(Color.green);
		leader2.setFont(new Font("Comic Sans", Font.BOLD, 10));
		leader2.setFocusable(false);
		leader2.setBorderPainted(true);
		leader2.addActionListener(this);
		leader2.setVisible(true);
		leader2.setBounds(95, 10, 100, 50);

		leader3.setLayout(null);
		leader3.setBackground(Color.green);
		leader3.setFont(new Font("Comic Sans", Font.BOLD, 10));
		leader3.setFocusable(false);
		leader3.setBorderPainted(true);
		leader3.addActionListener(this);
		leader3.setVisible(true);
		leader3.setBounds(95, 10, 100, 50);

		leader4.setLayout(null);
		leader4.setBackground(Color.green);
		leader4.setFont(new Font("Comic Sans", Font.BOLD, 10));
		leader4.setFocusable(false);
		leader4.setBorderPainted(true);
		leader4.addActionListener(this);
		leader4.setVisible(true);
		leader4.setBounds(95, 10, 100, 50);

		leader5.setLayout(null);
		leader5.setBackground(Color.green);
		leader5.setFont(new Font("Comic Sans", Font.BOLD, 10));
		leader5.setFocusable(false);
		leader5.setBorderPainted(true);
		leader5.addActionListener(this);
		leader5.setVisible(true);
		leader5.setBounds(95, 10, 100, 50);

		leader6.setLayout(null);
		leader6.setBackground(Color.green);
		leader6.setFont(new Font("Comic Sans", Font.BOLD, 10));
		leader6.setFocusable(false);
		leader6.setBorderPainted(true);
		leader6.addActionListener(this);
		leader6.setVisible(true);
		leader6.setBounds(95, 10, 100, 50);

		team11.setFont(new Font("Comic Sans", Font.BOLD, 10));
		team11.setForeground(Color.white);
		team11.setFocusable(false);
		team11.setBorderPainted(true);
		team11.setBackground(Color.black);
		// color of the border
		// thickness of the border
		// Question Mark Placing
		team11.setBounds(1, 50, 198, 100);

		team12.setFont(new Font("Comic Sans", Font.BOLD, 10));
		team12.setForeground(Color.white);
		team12.setFocusable(false);
		team12.setBorderPainted(true);
		team12.setBackground(Color.black);
		// color of the border
		// thickness of the border
		// Question Mark Placing
		team12.setBounds(1, 155, 198, 100);

		team13.setFont(new Font("Comic Sans", Font.BOLD, 10));
		team13.setForeground(Color.white);
		team13.setFocusable(false);
		team13.setBorderPainted(true);
		team13.setBackground(Color.black);
		// color of the border
		// thickness of the border
		// Question Mark Placing
		team13.setBounds(1, 260, 198, 100);

		title2.setBounds(1, 372, 198, 40);
		title2.setFont(new Font("Comic Sans", Font.BOLD, 20));
		title2.setForeground(Color.white);
		left.add(title2);

		team21.setFont(new Font("Comic Sans", Font.BOLD, 10));
		team21.setForeground(Color.white);
		team21.setFocusable(false);
		team21.setBorderPainted(true);
		team21.setBackground(Color.black);
		// color of the border
		// thickness of the border
		// Question Mark Placing
		team21.setBounds(1, 420, 198, 100);

		team22.setFont(new Font("Comic Sans", Font.BOLD, 10));
		team22.setForeground(Color.white);
		team22.setFocusable(false);
		team22.setBorderPainted(true);
		team22.setBackground(Color.black);
		// color of the border
		// thickness of the border
		// Question Mark Placing
		team22.setBounds(1, 525, 198, 100);

		team23.setFont(new Font("Comic Sans", Font.BOLD, 10));
		team23.setForeground(Color.white);
		team23.setFocusable(false);
		team23.setBorderPainted(true);
		team23.setBackground(Color.black);
		// color of the border
		// thickness of the border
		// Question Mark Placing
		team23.setBounds(1, 630, 198, 100);

		left.add(team11);
		left.add(team12);
		left.add(team13);
		left.add(team21);
		left.add(team22);
		left.add(team23);

		// The following part edits on CaptainAmerica button:

		captainAmerica.setBounds(250, 1, 100, 100); // size of the button
		captainAmerica.setFocusable(false); // no borders around the text
		captainAmerica.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		captainAmerica.setForeground(Color.black); // font colour
		captainAmerica.setBackground(Color.darkGray); // background colour
		captainAmerica.setBorderPainted(false);
		captainAmerica.addActionListener(this);

		captainAmerica.setText("Captain");

		// The following part edits on deadPool button:

		deadPool.setBounds(400, 1, 100, 100); // size of the button
		deadPool.setFocusable(false); // no borders around the text
		deadPool.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		deadPool.setForeground(Color.black); // font colour
		deadPool.setBackground(Color.darkGray); // background colour
		deadPool.setBorderPainted(false);
		deadPool.addActionListener(this);

		deadPool.setText("deadPool");

		// The following part edits on drStrange button:

		drStrange.setBounds(550, 1, 100, 100); // size of the button
		drStrange.setFocusable(false); // no borders around the text
		drStrange.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		drStrange.setForeground(Color.black); // font colour
		drStrange.setBackground(Color.darkGray); // background colour
		drStrange.setBorderPainted(false);
		drStrange.addActionListener(this);

		drStrange.setText("drStrange");

		// The following part edits on electro button:

		electro.setBounds(250, 105, 100, 100); // size of the button
		electro.setFocusable(false); // no borders around the text
		electro.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		electro.setForeground(Color.black); // font colour
		electro.setBackground(Color.darkGray); // background colour
		electro.setBorderPainted(false);
		electro.addActionListener(this);

		electro.setText("electro");

		// The following part edits on ghostRider button:

		ghostRider.setBounds(400, 105, 100, 100); // size of the button
		ghostRider.setFocusable(false); // no borders around the text
		ghostRider.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		ghostRider.setForeground(Color.black); // font colour
		ghostRider.setBackground(Color.darkGray); // background colour
		ghostRider.setBorderPainted(false);
		ghostRider.addActionListener(this);

		ghostRider.setText("ghostRider");

		// The following part edits on hela button:

		hela.setBounds(550, 105, 100, 100); // size of the button
		hela.setFocusable(false); // no borders around the text
		hela.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		hela.setForeground(Color.black); // font colour
		hela.setBackground(Color.darkGray); // background colour
		hela.setBorderPainted(false);
		hela.addActionListener(this);

		hela.setText("hela");

		// The following part edits on hela button:

		hulk.setBounds(250, 210, 100, 100); // size of the button
		hulk.setFocusable(false); // no borders around the text
		hulk.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		hulk.setForeground(Color.black); // font colour
		hulk.setBackground(Color.darkGray); // background colour
		hulk.setBorderPainted(false);
		hulk.addActionListener(this);

		hulk.setText("hulk");

		// The following part edits on iceMan button:

		iceMan.setBounds(400, 210, 100, 100); // size of the button
		iceMan.setFocusable(false); // no borders around the text
		iceMan.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		iceMan.setForeground(Color.black); // font colour
		iceMan.setBackground(Color.darkGray); // background colour
		iceMan.setBorderPainted(false);
		iceMan.addActionListener(this);

		iceMan.setText("iceMan");

		// The following part edits on ironMan button:

		ironMan.setBounds(550, 210, 100, 100); // size of the button
		ironMan.setFocusable(false); // no borders around the text
		ironMan.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		ironMan.setForeground(Color.black); // font colour
		ironMan.setBackground(Color.darkGray); // background colour
		ironMan.setBorderPainted(false);
		ironMan.addActionListener(this);

		ironMan.setText("ironMan");

		// The following part edits on loki button:

		loki.setBounds(250, 315, 100, 100); // size of the button
		loki.setFocusable(false); // no borders around the text
		loki.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		loki.setForeground(Color.black); // font colour
		loki.setBackground(Color.darkGray); // background colour
		loki.setBorderPainted(false);
		loki.addActionListener(this);

		loki.setText("loki");

		// The following part edits on quickSilver button:

		quickSilver.setBounds(400, 315, 100, 100); // size of the button
		quickSilver.setFocusable(false); // no borders around the text
		quickSilver.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		quickSilver.setForeground(Color.black); // font colour
		quickSilver.setBackground(Color.darkGray); // background colour
		quickSilver.setBorderPainted(false);
		quickSilver.addActionListener(this);

		quickSilver.setText("quickSilver");

		// The following part edits on spiderMan button:

		spiderMan.setBounds(550, 315, 100, 100); // size of the button
		spiderMan.setFocusable(false); // no borders around the text
		spiderMan.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		spiderMan.setForeground(Color.black); // font colour
		spiderMan.setBackground(Color.darkGray); // background colour
		spiderMan.setBorderPainted(false);
		spiderMan.addActionListener(this);

		spiderMan.setText("spiderMan");

		// The following part edits on thor button:

		thor.setBounds(250, 420, 100, 100); // size of the button
		thor.setFocusable(false); // no borders around the text
		thor.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		thor.setForeground(Color.black); // font colour
		thor.setBackground(Color.darkGray); // background colour
		thor.setBorderPainted(false);
		thor.addActionListener(this);

		thor.setText("thor");

		// The following part edits on venom button:

		venom.setBounds(400, 420, 100, 100); // size of the button
		venom.setFocusable(false); // no borders around the text
		venom.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		venom.setForeground(Color.black); // font colour
		venom.setBackground(Color.darkGray); // background colour
		venom.setBorderPainted(false);
		venom.addActionListener(this);

		venom.setText("venom");

		// The following part edits on yellowJacket button:

		yellowJacket.setBounds(550, 420, 100, 100); // size of the button
		yellowJacket.setFocusable(false); // no borders around the text
		yellowJacket.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		yellowJacket.setForeground(Color.black); // font colour
		yellowJacket.setBackground(Color.darkGray); // background colour
		yellowJacket.setBorderPainted(false);
		yellowJacket.addActionListener(this);

		yellowJacket.setText("yellowJacket");

		// The following part edits on next button:

		next.setBounds(500, 635, 150, 75); // size of the button
		next.setFocusable(false); // no borders around the text
		next.setFont(new Font("Comic Sans", Font.BOLD, 15)); // font of the text
		next.setForeground(Color.black); // font colour
		next.setBackground(Color.red); // background colour
		next.setBorderPainted(false);
		next.addActionListener(this);

		next.setText("Next >>");

		// The following part edits on back button:

		back.setBounds(250, 635, 150, 75); // size of the button
		back.setFocusable(false); // no borders around the text
		back.setFont(new Font("Comic Sans", Font.BOLD, 15)); // font of the text
		back.setForeground(Color.black); // font colour
		back.setBackground(Color.red); // background colour
		back.setBorderPainted(false);
		back.addActionListener(this);

		back.setText("<< Back");

		// The following part was used to edit on middle panel

		mid.setLayout(null);
		mid.setBackground(Color.red);
		mid.setBounds(200, 0, 500, 750);

		mid.add(captainAmerica);
		mid.add(deadPool);
		mid.add(drStrange);
		mid.add(electro);
		mid.add(ghostRider);
		mid.add(hela);
		mid.add(hulk);
		mid.add(iceMan);
		mid.add(ironMan);
		mid.add(loki);
		mid.add(quickSilver);
		mid.add(spiderMan);
		mid.add(thor);
		mid.add(venom);
		mid.add(yellowJacket);

		mid.add(next);
		mid.add(back);

		// Edits to the select buttons:

		select1.setFocusable(false); // no borders around the text
		select1.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select1.setForeground(Color.white); // font colour
		select1.setBackground(Color.green); // background colour
		select1.setBorderPainted(false);
		select1.addActionListener(this);
		select1.setBounds(10, 650, 150, 50);

		select2.setFocusable(false); // no borders around the text
		select2.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select2.setForeground(Color.white); // font colour
		select2.setBackground(Color.green); // background colour
		select2.setBorderPainted(false);
		select2.addActionListener(this);
		select2.setBounds(10, 650, 150, 50);

		select3.setFocusable(false); // no borders around the text
		select3.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select3.setForeground(Color.white); // font colour
		select3.setBackground(Color.green); // background colour
		select3.setBorderPainted(false);
		select3.addActionListener(this);
		select3.setBounds(10, 650, 150, 50);

		select4.setFocusable(false); // no borders around the text
		select4.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select4.setForeground(Color.white); // font colour
		select4.setBackground(Color.green); // background colour
		select4.setBorderPainted(false);
		select4.addActionListener(this);
		select4.setBounds(10, 650, 150, 50);

		select5.setFocusable(false); // no borders around the text
		select5.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select5.setForeground(Color.white); // font colour
		select5.setBackground(Color.green); // background colour
		select5.setBorderPainted(false);
		select5.addActionListener(this);
		select5.setBounds(10, 650, 150, 50);

		select6.setFocusable(false); // no borders around the text
		select6.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select6.setForeground(Color.white); // font colour
		select6.setBackground(Color.green); // background colour
		select6.setBorderPainted(false);
		select6.addActionListener(this);
		select6.setBounds(10, 650, 150, 50);

		select7.setFocusable(false); // no borders around the text
		select7.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select7.setForeground(Color.white); // font colour
		select7.setBackground(Color.green); // background colour
		select7.setBorderPainted(false);
		select7.addActionListener(this);
		select7.setBounds(10, 650, 150, 50);

		select8.setFocusable(false); // no borders around the text
		select8.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select8.setForeground(Color.white); // font colour
		select8.setBackground(Color.green); // background colour
		select8.setBorderPainted(false);
		select8.addActionListener(this);
		select8.setBounds(10, 650, 150, 50);

		select9.setFocusable(false); // no borders around the text
		select9.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select9.setForeground(Color.white); // font colour
		select9.setBackground(Color.green); // background colour
		select9.setBorderPainted(false);
		select9.addActionListener(this);
		select9.setBounds(10, 650, 150, 50);

		select10.setFocusable(false); // no borders around the text
		select10.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select10.setForeground(Color.white); // font colour
		select10.setBackground(Color.green); // background colour
		select10.setBorderPainted(false);
		select10.addActionListener(this);
		select10.setBounds(10, 650, 150, 50);

		select11.setFocusable(false); // no borders around the text
		select11.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select11.setForeground(Color.white); // font colour
		select11.setBackground(Color.green); // background colour
		select11.setBorderPainted(false);
		select11.addActionListener(this);
		select11.setBounds(10, 650, 150, 50);

		select12.setFocusable(false); // no borders around the text
		select12.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select12.setForeground(Color.white); // font colour
		select12.setBackground(Color.green); // background colour
		select12.setBorderPainted(false);
		select12.addActionListener(this);
		select12.setBounds(10, 650, 150, 50);

		select13.setFocusable(false); // no borders around the text
		select13.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select13.setForeground(Color.white); // font colour
		select13.setBackground(Color.green); // background colour
		select13.setBorderPainted(false);
		select13.addActionListener(this);
		select13.setBounds(10, 650, 150, 50);

		select14.setFocusable(false); // no borders around the text
		select14.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select14.setForeground(Color.white); // font colour
		select14.setBackground(Color.green); // background colour
		select14.setBorderPainted(false);
		select14.addActionListener(this);
		select14.setBounds(10, 650, 150, 50);

		select15.setFocusable(false); // no borders around the text
		select15.setFont(new Font("Comic Sans", Font.BOLD, 10)); // font of the text
		select15.setForeground(Color.white); // font colour
		select15.setBackground(Color.green); // background colour
		select15.setBorderPainted(false);
		select15.addActionListener(this);
		select15.setBounds(10, 650, 150, 50);

		// The following are edits on the right panel:

		right.setLayout(null);
		right.setBounds(700, 0, 200, 750);
		right.setBackground(Color.white);

		ImageIcon first = new ImageIcon("vertical.jpg");
		Image first2 = first.getImage();
		Image modifiedImage = first2.getScaledInstance(200, 750, java.awt.Image.SCALE_SMOOTH);
		first = new ImageIcon(modifiedImage);

		frame.add(left);
		frame.add(right);
		frame.add(mid);
		frame.setVisible(true);

	}

	public static Player getFirstPlayer() {
		return firstPlayer;
	}

	public static Player getSecondPlayer() {
		return secondPlayer;
	}

	private String AbilityHelper(int i) {
		String result = null;
		for (int j = 0; j < Game.getAvailableChampions().get(i).getAbilities().size(); j++) {
			if (j == Game.getAvailableChampions().get(i).getAbilities().size() - 1) {
				result += Game.getAvailableChampions().get(i).getAbilities().get(j).getName();
			}

			else {
				result += Game.getAvailableChampions().get(i).getAbilities().get(j).getName() + ", ";
			}
		}
		return result;
	}

	public String toString(int i) {
		return "Name: " + Game.getAvailableChampions().get(i).getName() + "\n" + "Max Health Points: "
				+ Game.getAvailableChampions().get(i).getMaxHP() + "\n" + "Mana: "
				+ Game.getAvailableChampions().get(i).getMana() + "\n" + "Action Points Per Turn: "
				+ Game.getAvailableChampions().get(i).getMaxActionPointsPerTurn() + "\n" + "Attack Damage: "
				+ Game.getAvailableChampions().get(i).getAttackDamage() + "\n" + "Attack Range: "
				+ Game.getAvailableChampions().get(i).getAttackRange() + "\n" + "Speed: "
				+ Game.getAvailableChampions().get(i).getSpeed() + "\n" + "Abilities: " + this.AbilityHelper(i);
	}

	public static void cleanUp(JPanel p) {
		Component[] array = p.getComponents();

		for (Component c : array) {
			p.remove(c);
		}

		p.revalidate();
		p.repaint();
	}

	public static void cleanUp(JButton b) {
		if (b == null)
			return;
		Component[] array = b.getComponents();

		for (Component c : array) {
			b.remove(c);
		}
		b.setIcon(null);
		b.setText("");
		b.revalidate();
		b.repaint();
	}

	private void pick(JButton b) {
		int i = 0;

		if (b == captainAmerica)
			i = 0;
		else if (b == deadPool)
			i = 1;
		else if (b == drStrange)
			i = 2;
		else if (b == electro)
			i = 3;
		else if (b == ghostRider)
			i = 4;
		else if (b == hela)
			i = 5;
		else if (b == hulk)
			i = 6;
		else if (b == iceMan)
			i = 7;
		else if (b == ironMan)
			i = 8;
		else if (b == loki)
			i = 9;
		else if (b == quickSilver)
			i = 10;
		else if (b == spiderMan)
			i = 11;
		else if (b == thor)
			i = 12;
		else if (b == venom)
			i = 13;
		else if (b == yellowJacket)
			i = 14;

		JTextArea attributes = new JTextArea();
		attributes.setText(this.toString(i));
		attributes.setBounds(2, 200, 180, 300);
		attributes.setFont(new Font("Comic Sans", Font.BOLD, 15));
		attributes.setLayout(null);
		right.add(attributes);
	}

	private JButton whichBox() {
		JButton b = new JButton();

		if (firstPlayer.getTeam().size() == 0) {
			b = team11;
		}

		else if (firstPlayer.getTeam().size() == 1) {
			b = team12;
		}

		else if (firstPlayer.getTeam().size() == 2) {
			b = team13;
		}

		else if (firstPlayer.getTeam().size() == 3 && secondPlayer.getTeam().size() == 0) {
			b = team21;
		}

		else if (secondPlayer.getTeam().size() == 1) {
			b = team22;
		}

		else if (secondPlayer.getTeam().size() == 2) {
			b = team23;
		}

		return b;
	}

	public static ImageIcon resize(ImageIcon i, int w, int h) {
		Image pic = i.getImage();
		Image modified = pic.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
		i = new ImageIcon(modified);

		return i;
	}

	private void edit(JButton b, ImageIcon i, Champion c) {
		b.setLayout(null);
		b.setText(null);
		ImageIcon i2 = resize(i, 80, 80);
		JLabel icon = new JLabel();
		icon.setIcon(i2);
		icon.setBounds(8, 10, 80, 80);
		b.add(icon);

		if (b == team11) {
			firstPlayer.getTeam().add(c);
			b.add(leader1);
		} else if (b == team12) {
			firstPlayer.getTeam().add(c);
			b.add(leader2);
		} else if (b == team13) {
			firstPlayer.getTeam().add(c);
			b.add(leader3);
		} else if (b == team21) {
			System.out.println("ALO");
			secondPlayer.getTeam().add(c);
			b.add(leader4);
		} else if (b == team22) {
			System.out.println("HI");
			secondPlayer.getTeam().add(c);
			b.add(leader5);
		} else if (b == team23) {
			secondPlayer.getTeam().add(c);
			b.add(leader6);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == back) {
			firstPlayer = null;
			secondPlayer = null;
			frame.dispose();
			new LoginWindow();
		} else if (e.getSource() == next) {
			if (firstPlayer.getTeam().size() != 3 || secondPlayer.getTeam().size() != 3) {
				error.showMessageDialog(null, "Please Select 3 Champions For Each Player", "Please read the following",
						JOptionPane.ERROR_MESSAGE);
			}

			else {
				frame.dispose();
				new GameWindow();
			}

		}

		else if (e.getSource() == captainAmerica) {

			cleanUp(right);

			JLabel ca = new JLabel();
			ca.setIcon(resize(new ImageIcon("CA logo"), 150, 150));
			ca.setBounds(3, 2, 150, 150);
			right.add(ca);

			this.pick(captainAmerica);
			right.add(select1);

		}

		else if (e.getSource() == deadPool) {
			cleanUp(right);

			JLabel dp = new JLabel();
			dp.setIcon(resize(new ImageIcon(""), 150, 150));
			dp.setBounds(3, 2, 150, 150);
			right.add(dp);

			this.pick(deadPool);
			right.add(select2);
		}

		else if (e.getSource() == drStrange) {
			cleanUp(right);

			JLabel dr = new JLabel();
			dr.setIcon(resize(new ImageIcon(""), 150, 150));
			dr.setBounds(3, 2, 150, 150);
			right.add(dr);

			this.pick(drStrange);
			right.add(select3);
		}

		else if (e.getSource() == electro) {
			cleanUp(right);

			JLabel elec = new JLabel();
			elec.setIcon(resize(new ImageIcon("electro.png"), 150, 150));
			elec.setBounds(3, 2, 150, 150);
			right.add(elec);

			this.pick(electro);
			right.add(select4);
		}

		else if (e.getSource() == ghostRider) {
			cleanUp(right);

			JLabel gr = new JLabel();
			gr.setIcon(resize(new ImageIcon(""), 150, 150));
			gr.setBounds(3, 2, 150, 150);
			right.add(gr);

			this.pick(ghostRider);
			right.add(select5);
		}

		else if (e.getSource() == hela) {
			cleanUp(right);

			JLabel helaa = new JLabel();
			helaa.setIcon(resize(new ImageIcon("hela.jpeg"), 150, 150));
			helaa.setBounds(3, 2, 150, 150);
			right.add(helaa);

			this.pick(hela);
			right.add(select6);
		}

		else if (e.getSource() == hulk) {
			cleanUp(right);

			JLabel hulkk = new JLabel();
			hulkk.setIcon(resize(new ImageIcon(""), 150, 150));
			hulkk.setBounds(3, 2, 150, 150);
			right.add(hulkk);

			this.pick(hulk);
			right.add(select7);
		}

		else if (e.getSource() == iceMan) {
			cleanUp(right);

			JLabel ice = new JLabel();
			ice.setIcon(resize(new ImageIcon(""), 150, 150));
			ice.setBounds(3, 2, 150, 150);
			right.add(ice);

			this.pick(iceMan);
			right.add(select8);
		}

		else if (e.getSource() == ironMan) {
			cleanUp(right);

			JLabel im = new JLabel();
			im.setIcon(resize(new ImageIcon(""), 150, 150));
			im.setBounds(3, 2, 150, 150);
			right.add(im);

			this.pick(ironMan);
			right.add(select9);
		}

		else if (e.getSource() == loki) {

			cleanUp(right);
			JLabel lokii = new JLabel();
			lokii.setIcon(resize(new ImageIcon(""), 150, 150));
			lokii.setBounds(3, 2, 150, 150);
			right.add(lokii);

			this.pick(loki);
			right.add(select10);
		}

		else if (e.getSource() == quickSilver) {
			cleanUp(right);
			JLabel qs = new JLabel();
			qs.setIcon(resize(new ImageIcon(""), 150, 150));
			qs.setBounds(3, 2, 150, 150);
			right.add(qs);

			this.pick(quickSilver);
			right.add(select11);
		}

		else if (e.getSource() == spiderMan) {
			cleanUp(right);
			JLabel sm = new JLabel();
			sm.setIcon(resize(new ImageIcon(""), 150, 150));
			sm.setBounds(3, 2, 150, 150);
			right.add(sm);

			this.pick(spiderMan);
			right.add(select12);
		}

		else if (e.getSource() == thor) {
			cleanUp(right);
			JLabel thorr = new JLabel();
			thorr.setIcon(resize(new ImageIcon(""), 150, 150));
			thorr.setBounds(3, 2, 150, 150);
			right.add(thorr);

			this.pick(thor);
			right.add(select13);
		}

		else if (e.getSource() == venom) {
			cleanUp(right);
			JLabel venomm = new JLabel();
			venomm.setIcon(resize(new ImageIcon(""), 150, 150));
			venomm.setBounds(3, 2, 150, 150);
			right.add(venomm);

			this.pick(venom);
			right.add(select14);
		}

		else if (e.getSource() == yellowJacket) {
			cleanUp(right);
			JLabel yellow = new JLabel();
			yellow.setIcon(resize(new ImageIcon(""), 150, 150));
			yellow.setBounds(3, 2, 150, 150);
			right.add(yellow);

			this.pick(yellowJacket);
			right.add(select15);
		}

		else if (e.getSource() == select1) {

			ImageIcon icon1 = new ImageIcon("CA logo.jpg");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(0));
			captainAmerica.setEnabled(false);
			select1.setEnabled(false);
		}

		else if (e.getSource() == select2) {
			ImageIcon icon1 = new ImageIcon("Deadpool logo.png");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(1));
			deadPool.setEnabled(false);
			select2.setEnabled(false);
		} else if (e.getSource() == select3) {
			ImageIcon icon1 = new ImageIcon("drs logo.png");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(2));
			drStrange.setEnabled(false);
			select3.setEnabled(false);
		} else if (e.getSource() == select4) {
			ImageIcon icon1 = new ImageIcon("electro logo.png");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(3));
			electro.setEnabled(false);
			select4.setEnabled(false);
		} else if (e.getSource() == select5) {
			ImageIcon icon1 = new ImageIcon("ghost rider logo.jfif");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(4));
			ghostRider.setEnabled(false);
			select5.setEnabled(false);
		} else if (e.getSource() == select6) {
			ImageIcon icon1 = new ImageIcon("hela logo.jpg");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(5));
			hela.setEnabled(false);
			select6.setEnabled(false);
		} else if (e.getSource() == select7) {
			ImageIcon icon1 = new ImageIcon("");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(6));
			hulk.setEnabled(false);
			select7.setEnabled(false);
		} else if (e.getSource() == select8) {
			ImageIcon icon1 = new ImageIcon("iceman logo.jpg");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(7));
			iceMan.setEnabled(false);
			select8.setEnabled(false);
		} else if (e.getSource() == select9) {
			ImageIcon icon1 = new ImageIcon("");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(8));
			ironMan.setEnabled(false);
			select9.setEnabled(false);
		} else if (e.getSource() == select10) {
			ImageIcon icon1 = new ImageIcon("loki logo.png");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(9));
			loki.setEnabled(false);
			select10.setEnabled(false);
		} else if (e.getSource() == select11) {
			ImageIcon icon1 = new ImageIcon("quicksilver logo.jpg");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(10));
			quickSilver.setEnabled(false);
			select11.setEnabled(false);
		} else if (e.getSource() == select12) {
			ImageIcon icon1 = new ImageIcon("spiderman logo.png");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(11));
			spiderMan.setEnabled(false);
			select12.setEnabled(false);
		} else if (e.getSource() == select13) {
			ImageIcon icon1 = new ImageIcon("");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(12));
			thor.setEnabled(false);
			select13.setEnabled(false);
		} else if (e.getSource() == select14) {
			ImageIcon icon1 = new ImageIcon("venom logo.jpg");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(13));
			venom.setEnabled(false);
			select14.setEnabled(false);
		} else if (e.getSource() == select15) {
			ImageIcon icon1 = new ImageIcon("yellow jacket logo.jpg");
			this.edit(this.whichBox(), icon1, Game.getAvailableChampions().get(14));
			yellowJacket.setEnabled(false);
			select15.setEnabled(false);
		} else if (e.getSource() == leader1) {
			firstPlayer.setLeader(firstPlayer.getTeam().get(0));
			leader1.setEnabled(false);
			leader2.setEnabled(false);
			leader3.setEnabled(false);
		} else if (e.getSource() == leader2) {
			firstPlayer.setLeader(firstPlayer.getTeam().get(1));
			leader1.setEnabled(false);
			leader2.setEnabled(false);
			leader3.setEnabled(false);
		} else if (e.getSource() == leader3) {
			firstPlayer.setLeader(firstPlayer.getTeam().get(2));
			leader1.setEnabled(false);
			leader2.setEnabled(false);
			leader3.setEnabled(false);
		} else if (e.getSource() == leader4) {
			secondPlayer.setLeader(secondPlayer.getTeam().get(0));
			leader4.setEnabled(false);
			leader5.setEnabled(false);
			leader6.setEnabled(false);
		} else if (e.getSource() == leader5) {
			secondPlayer.setLeader(secondPlayer.getTeam().get(1));
			leader4.setEnabled(false);
			leader5.setEnabled(false);
			leader6.setEnabled(false);
		} else if (e.getSource() == leader6) {
			secondPlayer.setLeader(secondPlayer.getTeam().get(2));
			leader4.setEnabled(false);
			leader5.setEnabled(false);
			leader6.setEnabled(false);
		}

	}

}
