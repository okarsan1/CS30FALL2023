package Skillbuilders10;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class LatinPlantNames implements ActionListener {


	private JFrame frame;
	private JPanel contentPane;
	private  JComboBox plantNames;
	private JLabel plantListPrompt, latinName;
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		 /* Create and set up the frame */
		 frame = new JFrame("LatinPlantNames");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 /* Create a content pane with a BoxLayout and
		 empty borders */
		 contentPane = new JPanel();
		 contentPane.setLayout(new BoxLayout(contentPane,
		 BoxLayout.PAGE_AXIS));
		 contentPane.setBorder(BorderFactory.createEmptyBorder
		 (10, 10, 10, 10));
		 /* Create a combo box and a descriptive label */
		 plantListPrompt = new JLabel("Select a plant name: ");
		 plantListPrompt.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		 contentPane.add(plantListPrompt);
		 String[] names = {"basil", "lavender", "parsley",
		 "peppermint", "saffron", "sage"};
		 plantNames = new JComboBox(names);
		 plantNames.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
		 plantNames.setSelectedIndex(0);
		 plantNames.addActionListener(this);
		 contentPane.add(plantNames);
		 /* Create and add a label that will display the
		 Latin names */
		 latinName = new JLabel("Ocimum");
		 latinName.setBorder(BorderFactory.createEmptyBorder
		 (20, 0, 0, 0));
		 contentPane.add(latinName);
		 /* Add content pane to frame */
		 frame.setContentPane(contentPane);
		 /* Size and then display the frame. */
		 frame.pack();
		 frame.setVisible(true);
		}
		 /**
		  * Handle a selection from the combo box
		  * pre: none
		  * post: The Latin name for the selected plant
		  * has been displayed.
		  */
		  public void actionPerformed(ActionEvent event) {
		  JComboBox comboBox = (JComboBox)event.getSource();
		  String plantName = (String)comboBox.getSelectedItem();
		  if (plantName == "basil") {
		  latinName.setText("Ocimum");
		  } else if (plantName == "lavender") {
		  latinName.setText("Lavandula spica");
		  } else if (plantName == "parsley") {
		  latinName.setText("Apium");
		  } else if (plantName == "perppermint") {
		  latinName.setText("Mentha piperita");
		  } else if (plantName == "saffron") {
		  latinName.setText("Crocus");
		  } else if (plantName == "sage") {
		  latinName.setText("Salvia");
		  }
		  }
	}

