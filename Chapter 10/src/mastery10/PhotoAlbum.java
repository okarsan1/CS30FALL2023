package mastery10;
import javax.swing.*;
 import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class PhotoAlbum extends JFrame { private JLabel photoLabel; private String[] images = {"C:\\Users\\17058003\\Downloads\\o1.jfif", "C:\\Users\\17058003\\Downloads\\o2.jfif", "C:\\Users\\17058003\\Downloads\\o3.jfif", "C:\\Users\\17058003\\Downloads\\o4.jpg"}; 
private int currentImageIndex = 0; public PhotoAlbum()  // Set the title of the JFrame 
{ setTitle("Photo Album"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set the default close operation setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
// Set the size of the JFrame 
setSize(400, 300); // Set the layout of the JFrame 
setLayout(new BorderLayout()); 
photoLabel = new JLabel();  // Create a JLabel to display the photo
photoLabel.setHorizontalAlignment(JLabel.CENTER);  // Show the initial image 
showImage(); JButton nextButton = new JButton("Next"); // Create a JButton for the next image JButton
nextButton.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { currentImageIndex = (currentImageIndex + 1) % images.length; showImage();// Move to the next image in the array currentImageIndex = (currentImageIndex + 1) % images.length; 
// Show the next image showImage(); 
 }
 }
); 
add(photoLabel, BorderLayout.CENTER);// Add the photoLabel to the center of the JFrame 
 add(nextButton, BorderLayout.SOUTH); // Add the photoLabel to the bottom of the JFrame 
setVisible(true);  // Make the JFrame visible
} private void showImage() { // Method to show the current image
ImageIcon imageIcon = new ImageIcon(images[currentImageIndex]);// Create an ImageIcon from the current image file path 
 Image image = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT); // Get the image from the ImageIcon and scale it to fit the JLabel 
 photoLabel.setIcon(new ImageIcon(image)); 
} public static void main(String[] args) { // Main method to run the application
	SwingUtilities.invokeLater(new Runnable() { public void run() { new PhotoAlbum(); // Create an instance of the PhotoAlbum class 
 } 
}
);
 }
 } 
