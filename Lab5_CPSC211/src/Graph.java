import java.util.Arrays;

public class Graph 
{
	static int[][] matrix; //Adjacency matrix
	static int numVertices;
	
	public Graph(int vertices)
	{
		numVertices = vertices;
		matrix = new int[vertices][vertices];
	}
	
	//Method to add an edge between two vertices
    public void addEdge(int source, int destination) 
    {
        matrix[source][destination] = 1;
    }
    
    public void bfs(int startingVertex, Queue<Integer> queue, boolean[] visited) 
    {
    	Arrays.fill(visited, false);
    	
    	queue.add(startingVertex);
    	visited[startingVertex] = true;
    	
    	int current;
    	
    	while (queue.isEmpty() == false) //while the queue isn't empty
    	{
    		current = queue.remove(); //pop it
    		
    		for (int i = 0; i < numVertices; i++) //go through each column of i
    		{
    			if (matrix[current][i] == 1 && (visited[i] == false))
                {
                    queue.add(i);
                    visited[i] = true;
                }
    			
    		}
    		if (visited[current] == false) //if current hasnt been visited yet, add it to visited
    		{
    			visited[current] = true;
    		}
    		
    	}
   
    }
    

    public void Solve(int startingVertex) 
    {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        boolean[] visited = new boolean[numVertices];

        System.out.println(Arrays.deepToString(matrix));

        bfs(startingVertex, queue, visited);

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
	
	