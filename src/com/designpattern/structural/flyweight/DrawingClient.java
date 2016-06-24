package com.designpattern.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.designpattern.structural.flyweight.ShapeFactory.ShapeType;

/**
 * Created by pgangadhar on 6/2/16.
 */
public class DrawingClient extends JFrame{

	private int WIDTH;
	private int HEIGHT;

	private static final ShapeType shapes[] = {ShapeType.LINE, ShapeType.OVAL_EMPTY, ShapeType.OVAL_FILL};

	public DrawingClient(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;

		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		JButton startButton = new JButton();

		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(startButton, BorderLayout.SOUTH);
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		startButton.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				Graphics g = panel.getGraphics();
				for (int i=0; i<20; i++) {
					//Shape shape = ShapeFactory.getShape(getRandomshapeType());
				}
			}
		});

	}
	/*public static void main(String [] args) {

		for(int i=0; i<20; i++) {

		}
	}

	public int getRandomX() {
		Math.random()
	}

	public int getRandomY() {

	}

	public int getRandomWidth() {

	}

	public int getRandomHeight() {

	}

	public ShapeType getRandomshapeType() {
		return 
	}*/
}

