package Skillbuilders10;

 import java.awt.EventQueue;
 import java.awt.FlowLayout;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener; 
import javax.swing.JButton;
 import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;
 public class DivisibleBy3 { private JFrame frame; private JTextField numberField; private JButton checkButton;
 private JLabel resultLabel; public static void main(String[] args) { EventQueue.invokeLater(new Runnable() { public void run() { try { DivisibleBy3 window = new DivisibleBy3(); 
window.frame.setVisible(true); 
} catch (Exception e) { e.printStackTrace();
 } } }); 
} public DivisibleBy3() { frame = new JFrame(); 
frame.setTitle("DivisibleBy3");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setLayout(new FlowLayout()); 
JLabel numberLabel = new JLabel("Enter a number:");
 numberField = new JTextField(10); 
checkButton = new JButton("Check");
 resultLabel = new JLabel();
 checkButton.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { int number = Integer.parseInt(numberField.getText()); 
if (number % 3 == 0) { resultLabel.setText(number + " is divisible by 3!");
 } else { resultLabel.setText(number + " is not divisible by 3."); } } }); 
frame.add(numberLabel);
 frame.add(numberField); 
frame.add(checkButton);
 frame.add(resultLabel); 
frame.pack(); } }


