package com;

import java.awt.EventQueue;

public class Game {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ChessBoard board = new ChessBoard();
					board.reset();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
