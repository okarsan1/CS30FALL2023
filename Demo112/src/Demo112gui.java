import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Demo112gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo112gui window = new Demo112gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//000
	/**
	 * Create the application.
	 */
	public Demo112gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel Display = new JLabel("");
		Display.setBounds(21, 123, 386, 75);
		frame.getContentPane().add(Display);
		JButton Submit = new JButton("Submit");
		Submit.setBounds(89, 11, 255, 55);
		Submit.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				Display.setText("Hello computer science students!");
			
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Submit);
		
	
	}
}
