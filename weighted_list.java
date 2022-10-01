import java.util.*;
class weighted_list
{
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    static private int V;
    static private LinkedList <Edge> adj[];
    void addEdge(int s, int d, int w) {
        Edge edge = new Edge(s, d, w);
        Edge edge1=new Edge(d,s,w);
        adj[s].addFirst(edge); 
        adj[d].addFirst(edge1);
    }

    weighted_list(int v)
    {

        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<V;i++)
            adj[i]=new LinkedList();

    }

    static int dfs(int v,boolean visited[])
    {
        Iterator <Edge> i=adj[v].listIterator();
        int n,min;
        min=Integer.MAX_VALUE;
        Edge e;
        while(i.hasNext())
        {
            e=i.next();
            if(visited[e.destination]!=true)
            {
                n=e.weight;
                if(n<min)
                    min=n;
            }
        }
        return min;
    }

    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int n,m,k,u,v,l,i;
        n=d.nextInt();
        m=d.nextInt();
        k=d.nextInt();
        weighted_list g=new weighted_list(n);
        for(i=0;i<m;i++)
        {
            u=d.nextInt();
            v=d.nextInt();
            l=d.nextInt();
            g.addEdge(u,v,l);
            g.addEdge(v,u,l);
        }
        if(k==0)
            System.out.println(-1);
        else
        {
            int c[]=new int[k];
            for(i=0;i<k;i++)
                c[i]=d.nextInt()-1;
            boolean visited[]=new boolean[V];
            for(i=0;i<k;i++)
                visited[c[i]]=true;
            int x,min;
            min=Integer.MAX_VALUE;
            for(i=0;i<k;i++)
            {
                x=dfs(c[i],visited);
                if(x<min)
                    min=x;
            }
            if(min==Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(min);
        }
    }
}
