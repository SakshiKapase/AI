import java.util.*;
import java.util.Scanner;
public class Graph {
	 private int V;
	 private LinkedList<Integer> adj[];
	 public Graph(int v)
	 {
		 
	      V=v;
	      adj = new LinkedList[v];
	      for (int i = 0; i < v; ++i)
	      {
	           adj[i] = new LinkedList();
	      }
	 }
	 
	 //DFS
	 
	 void DFSUtil(int vertex, boolean visit[])
	 {
	      visit[vertex] = true;
	      System.out.print(vertex + " ");
	      int a = 0;
	      for (int i = 0; i < adj[vertex].size(); i++)
	      {
	          a = adj[vertex].get(i);
	          if (!visit[a])
	          {
	             DFSUtil(a, visit);
	          }
	       }
	 }
	 void DFS(int v)
	 {
	      boolean already[] = new boolean[V];
	      DFSUtil(v, already);
	 }
	 
	 
	 
	 
	 
	 //void BFS
	 void BFSUtil(int s, boolean visited[])
	 {
	      LinkedList<Integer> queue = new LinkedList<Integer>();
	      visited[s] = true;
	      queue.add(s);
	      while (queue.size() != 0) 
	      {
	            s = queue.poll();
	            System.out.print(s + " ");
	            Iterator<Integer> i = adj[s].listIterator();
	            while (i.hasNext())
	            {
	                   int n = i.next();
	                   if (!visited[n])
	                   {
	                        visited[n] = true;
	                        queue.add(n);
	                   }
	            }
	       }
	 }
	 
	 void BFS(int s)
	 {
	       boolean visited[] = new boolean[V];
	       BFSUtil(s, visited);
	 }
	 
	 
	 
	 
	 
	 void addEdge(int v, int w)
	 {
	      adj[v].add(w);
	 }
	 
	
	  
	 
	 
	 
	 
	 
	public static void main(String[] args)
	  {
	         Scanner sc= new Scanner(System.in);
	         System.out.print("Enter the size of the input: ");
	         int n = sc.nextInt();
	         System.out.print("Enter the size of graph: ");
	         int size=sc.nextInt();
	         Graph g=new Graph(n);
	         for(int i=0;i<size;i++)
	         {
	             System.out.print("Enter edges "+(i+1)+ " of graph: ");
	             int j=sc.nextInt();
	             int k=sc.nextInt();
	             if(j<n && k<n)
	             {
	                g.addEdge(j, k);
	             }
	             else
	             {
	                System.out.println("Invalid Input");
	             }
	         }
	             System.out.println("Enter the starting vertex: ");
	             int start=sc.nextInt();
	             System.out.println("DFS of Graph");
	             g.DFS(start);
	             System.out.println();
	             System.out.println("BFS of Graph");
	             g.BFS(start);
	  }
	 }
