package com;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.Box;
import java.awt.Dimension;

public class ChessBoard {

	private JFrame window;
	private Color backgroundColor;
	private BorderLayout windowLayout;
	private GridLayout boardLayout;
	private JPanel board;
	private JPanel sideMenu;

	public ChessBoard()
	{
		this.init();
	}

	public void init()
	{
		// setup window
		window = new JFrame("JChess!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAlwaysOnTop(true);
		window.setSize(800, 600);
		window.setBackground(backgroundColor);
		windowLayout = new BorderLayout(0, 0);
		window.setLayout(windowLayout);
		window.setResizable(false);

		// setup split pane
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		window.getContentPane().add(splitPane, BorderLayout.CENTER);

		// create side menu
		sideMenu = new JPanel();
		sideMenu.setMinimumSize(new Dimension(150,0));
		sideMenu.setBackground(new Color(0, 139, 139));
		sideMenu.setForeground(new Color(32, 178, 170));
		sideMenu.setLayout(new GridLayout(15, 1, 5, 10));

		// setup game board
		board = new JPanel();
		backgroundColor = new Color(255,255,255,10);
		board.setBackground(backgroundColor);
		boardLayout = new GridLayout(8,8,1,1);
		board.setLayout(boardLayout);

		// setup chess board grid


		// render components
		splitPane.setLeftComponent(sideMenu);
		splitPane.setRightComponent(board);
		window.setVisible(true);
	}

	public void reset()
	{

	}
}
