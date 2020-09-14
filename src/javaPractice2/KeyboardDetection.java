package javaPractice2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyboardDetection {
	
	int upCount = 0;
	int downCount = 0;
	int leftCount = 0;
	int rightCount = 0;

	public KeyboardDetection() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setSize(400, 400);
		frame.setResizable(false);
		
		JLabel upArrow = new JLabel();
		JLabel downArrow = new JLabel();
		JLabel leftArrow= new JLabel();
		JLabel rightArrow = new JLabel();
		
		
		
		upArrow.setText("Up: "+upCount);
		downArrow.setText("Down: "+downCount);
		leftArrow.setText("Left: "+leftCount);
		rightArrow.setText("Right: "+rightCount);
		
		
		JPanel panel = new JPanel();
		panel.add(upArrow);
		panel.add(downArrow);
		panel.add(leftArrow);
		panel.add(rightArrow);
		
		frame.add(panel);
		
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.VK_UP == e.getKeyCode()) {
					upArrow.setText("Up: "+(++upCount));
				}else if(e.VK_DOWN == e.getKeyCode()) {
					downArrow.setText("Down: "+(++downCount));
				}else if(e.VK_LEFT == e.getKeyCode()) {
					leftArrow.setText("Left: "+(++leftCount));
				}else if(e.VK_RIGHT == e.getKeyCode()) {
					rightArrow.setText("Right: "+(++rightCount));
				}
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyboardDetection();
	}

}
