package BrekoutGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class LatestRuns extends JPanel{
	
	private DefaultListModel<PlayerScore> highScoreModelLatest3;
	private JLabel title;
	private JPanel latestScore;
	
	public LatestRuns() {
		
		setPreferredSize(new Dimension(200, 150)); // Bestäm storlek
		setOpaque(false);
		this.setLayout(new BoxLayout(this, 1));

		JPanel titlePanel = new JPanel();
		titlePanel.setOpaque(false);
		title = new JLabel("PREVIOUS GAMES:");
		Font font = new Font("Arial", Font.BOLD, Const.SCOREBOARD_FONTSIZE_SMALL - 10);
		title.setFont(font);
		title.setForeground(Color.CYAN); // Sätt textfärg
		titlePanel.add(title); // Lägg till titelpanelen i toppen av panelen
		add(titlePanel, BorderLayout.WEST);

		// lägger in startdata för highscore-listorna
		highScoreModelLatest3 = new DefaultListModel<>();
		for (int i = 0; i < 3; i++) {
			
			int DummyScore = 0;
			PlayerScore playerScore;
			highScoreModelLatest3.addElement(playerScore = new PlayerScore("" , DummyScore));
		}


		// panel för att hålla highscore 1-10.
		latestScore = new JPanel();
		latestScore.setOpaque(false);
		add(latestScore, BorderLayout.CENTER);
		
		// skapar modellen av rankinglistan
		DefaultListModel<String> listModel = new DefaultListModel<>();
		for (int i = 0; i < 3; i++) {
		    String listNr = (i + 1) + ". ";
		    listModel.addElement(listNr);
		}
		
		JList<String> listNrs = new JList<>(listModel);
		listNrs.setFont(new Font("Arial", Font.BOLD, 18));
		listNrs.setForeground(new Color(255,255,255,100));
		listNrs.setBackground(new Color(0,0,0,100));
		// Inaktivera interaktion med JList
		listNrs.setEnabled(false);
		listNrs.setFocusable(false);
		
		// JList som används för att visa upp highScoreModelLatest3
		JList<PlayerScore> latestScores = new JList<>(highScoreModelLatest3);
		latestScores.setFont(new Font("Arial", Font.BOLD, 18));
		latestScores.setBackground(new Color(0,0,0,100));
		
		latestScore.add(listNrs);
		latestScore.add(latestScores);
	

		// Inaktivera interaktion med JList
		latestScores.setEnabled(false);
		latestScores.setFocusable(false);
		

	}

	public void addNewScore(int score) {

		PlayerScore playerScore = null;
		playerScore = new PlayerScore( "", score);
		
		
		highScoreModelLatest3.add(0, playerScore);

		highScoreModelLatest3.remove(3);

	}


	
}