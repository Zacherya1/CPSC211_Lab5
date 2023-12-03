import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Controller 
{
	public static void main(String[] args) 
	{
		Controller controller = new Controller();
		controller.go();
	}
	
	public void go()
	{
		Scanner input = null;
		
		try {
			input = new Scanner(getMapFileFromUser());
		} catch (FileNotFoundException e) {
			System.out.println("Could not read file");
			return;
		}
		
		int numVertices = input.nextInt();
		Graph graph = new Graph(numVertices);
		
		for (int i = 0; i < numVertices;)
		{
			if (input.hasNextLine() == true)
			{
				System.out.println("worked");
				graph.addEdge(i, input.nextInt());
				String next = input.next();
				if (next.equals("\n"))
				{
					i++;
				}
			}
			else
			{
				i++;
			}
			
		}
		
	}
	
	public File getMapFileFromUser()
	{
		//J file chooser
		JFileChooser chooser = new JFileChooser();
	    
	    int returnVal = chooser.showOpenDialog(null);
	    
	    if(returnVal == JFileChooser.APPROVE_OPTION) 
	    {
	    	File file = chooser.getSelectedFile();
	    	
	    	Scanner input = null;
	    	
	    	try {
				input = new Scanner(file);
			} catch (FileNotFoundException e) {
				System.out.println("Could not find the file" + file.getName());
				return null;
			}
	    	return file;
	    }
		return null;
	}
}