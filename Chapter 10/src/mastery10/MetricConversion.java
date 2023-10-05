package mastery10;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 public class MetricConversion extends JFrame { private JLabel resultLabel;
 public MetricConversion() { setTitle("Metric Conversion"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); getContentPane().setLayout(new FlowLayout());//set title
 JLabel inputLabel = new JLabel("Enter a number: "); //prompt user to enter number
 JTextField inputField = new JTextField(10); JLabel conversionLabel = new JLabel("Select a conversion: "); //prompt user for conversion type
 String[] conversions = {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}; //show conversions
 JComboBox conversionComboBox = new JComboBox(conversions);
 JButton convertButton = new JButton("Convert"); convertButton.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { double input = Double.parseDouble(inputField.getText()); 
 String conversion = (String) conversionComboBox.getSelectedItem(); 
 double result = 0;
 if (conversion.equals("Inches to Centimeters")) { result = input * 2.54; //I-C
 } else if (conversion.equals("Feet to Meters")) { result = input * 0.3048; //F-M
 } else if (conversion.equals("Gallons to Liters")) { result = input * 4.5461; //G-L
 } else if (conversion.equals("Pounds to Kilograms")) { result = input * 0.4536;//P-K
 } 
 resultLabel.setText("Result: " + input+"  "+conversion+"  "+ result); //show user results
 }
 }); resultLabel = new JLabel("Result: "); getContentPane().add(inputLabel); 
 getContentPane().add(inputField); getContentPane().add(conversionLabel); getContentPane().add(conversionComboBox); //user imput here
 getContentPane().add(convertButton); // user presses to convert
 getContentPane().add(resultLabel); //results go here
 pack(); 
 setVisible(true);
 } 
 public static void main(String[] args) { SwingUtilities.invokeLater(new Runnable() { @Override public void run() { new MetricConversion(); 
 } }); } } 
