package skillbuild11; 
 import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
 public class Assignment { public static void main(String[] args) { String filePath = "C:\\Users\\17058003\\git\\CS30FALL2023\\Chapter 11\\src\\skillbuild11\\AssignmentNote.txt";//find text 
 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { String line; 
 while ((line = br.readLine()) != null) { System.out.println(line); //show text
 } } catch (IOException e) { e.printStackTrace(); 
 } } } 