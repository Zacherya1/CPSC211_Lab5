import java.util.Arrays;

public class Graph 
{
	static boolean[][] matrix; //Adjacency matrix
	static int numVertices;
	
	
	public Graph(int vertices)
	{
		numVertices = vertices;
		matrix = new boolean[vertices][vertices];
	}
	
	//Method to add an edge between two vertices
    public void addEdge(int source, int destination) 
    {
        matrix[source][destination] = true;
    }
    
    public void bfs(Graph graph, Queue<Integer> queue, boolean[] visited) 
    {
    	if (queue.isEmpty()) 
    	{
            return;
        }
    	
        int current = queue.remove();
        
        for (int i = 0; i < matrix[0].length; i++) 
        {
            if (graph.matrix[current][i] == true)
            {

            	if (visited[i] == false)
            	{
            		visited[i] = true;
                    queue.add(i);
                }
            }
        }
 
        bfs(graph, queue, visited);
    }
    

    public void Solve(Graph graph, int startingVertex) 
    {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        boolean[] visited = new boolean[numVertices];

        
        queue.add(0);
        bfs(graph, queue, visited);

        
        boolean allVisited = true;
        
        for (int i = 0; i < visited.length; i++)
        {
        	if (visited[i] == false)
        	{
        		allVisited = false;
        	}
        }
        
        if (allVisited == true)
        {
        	System.out.println("Solveable");
        }
        else
        {
        	System.out.println("Not Solveable");
        }
    }
}
	
	