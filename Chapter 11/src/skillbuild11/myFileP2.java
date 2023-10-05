package skillbuild11;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myFileP2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		File textFile;
		String response;
		
		//Creating a file
		textFile = new File("C:\\Users\\17058003\\git\\CS30FALL2023\\Chapter 11\\src\\skillbuild11\\sep28.txt");
	
		//Check to see if file exists
		if(textFile.exists())
		{
			System.out.print("sep28.txt file exists. ");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("sep28.txt file has been created! ");
			}
			catch(IOException e)
			{
				System.out.println("File could not be created. ");
				System.err.print("IOException: " + e.getMessage());
			}
			
			
		}
		
		//Delete the file if user chooses
		System.out.println("Would you like to (K)eep or (D)elete the file? ");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))//Delete file
		{
			if(textFile.delete()) 
			{
				System.out.println("File has been deleted.");
			}
		}
		

	}

}