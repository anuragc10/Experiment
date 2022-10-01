import java.util.*;
class Node implements Comparator<Node>
{
    private int v,weight;
    Node(int _v,int _w)
    {
        v=_v;
        weight=_w;
    }

    int getV()
    {
        return v;
    }

    int getWeight()
    {
        return weight;
    }

    @Override
    public int compare(Node node1,Node node2)
    {
        if(node1.weight < node2.weight)
            return -1;
        if(node1.weight >node2.weight)
            return 1;
        return 0;
    }
}
public class Dijkstra
{
    void shortestPath(int s,ArrayList<ArrayList<Node>>adj,int N)
    {
        int dist[]=new int[N];
        int i;
        for(i=0;i<N;i++)
            dist[i]=Integer.MAX_VALUE;
        dist[s]=0;
        PriorityQueue<Node> pq=new PriorityQueue<>();
        pq.add(new Node(s,0));
        while(pq.size()>0)
        {
            Node node=pq.poll();
            for(Node it:adj.get(node.getV()))
            {
                if(dist[node.getV()]+it.getWeight()<dist[it.getV()])
                {
                    dist[it.getV()]=dist[node.getV()]+it.getWeight();
                    pq.add(new Node(it.getV(),dist[it.getV()]));
                }
            }
        }
        for(i=0;i<N;i++)
        System.out.println(dist[i]+" ");
    }
    public static void main(String args[])
    {
        ArrayList<ArrayList<Node>>adj=new ArrayList<ArrayList<Node>>();
        int i,n;
        n=5;
        for(i=0;i<n;i++)
        adj.add(new ArrayList<Node>());
        adj.get(0).add(new Node(1,2));
        
    }
}
