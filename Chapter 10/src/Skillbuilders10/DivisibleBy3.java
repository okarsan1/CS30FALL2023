package Skillbuilders10;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DivisibleBy3 extends JFrame { private JLabel numberLabel; 

	private JFrame frame;
	private JTextField numberField; 
	private JButton checkButton; 
	private JLabel resultLabel; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {setTitle("DivisibleBy3 App"); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	getContentPane().setLayout(new FlowLayout()); 
	numberLabel = new JLabel("Enter a number:"); 
	numberField = new JTextField(10); 
	numberLabel.setBounds(100, 100, 450, 300);
	checkButton = new JButton("Check"); resultLabel = new JLabel(); checkButton.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) 
	{ int number = Integer.parseInt(numberField.getText()); 
	if (number % 3 == 0) { resultLabel.setText(number + " is divisible by 3!"); 
	} else { resultLabel.setText(number + " is not divisible by 3."); 
	} } }); getContentPane().add(numberLabel); 
	getContentPane().add(numberField); 
	getContentPane().add(checkButton);
	getContentPane().add(resultLabel); 
	pack(); 
	setVisible(true); 
	}
	private void initialize()
	
	{ SwingUtilities.invokeLater(new Runnable() 
	{ @Override public void run() 
	{ new DivisibleBy3App();
	

	} }); 
	} } 
