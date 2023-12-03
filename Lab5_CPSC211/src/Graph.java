
public class Graph 
{
	static boolean[][] matrix; //Adjacency matrix
	static int numVertices; //Number of vertices
	
	public Graph(int vertices)
	{
		matrix = new boolean[vertices][vertices];
	}
	
	//Method to add an edge between two vertices
    public void addEdge(int source, int destination) 
    {
        matrix[source][destination] = true;
    }
    
    
	
    
    
    
}
	
	