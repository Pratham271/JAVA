import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	   int [][]graph = {{0,3,0,0,8},
               {3,0,4,2,0},
               {0,4,0,10,0},
               {0,2,10,11,0},
               {8,0,0,11,0}};
	   getMST(graph,graph.length);
    }

    private static void getMST(int[][] graph, int V) {
        boolean[] selected = new boolean[V];
        Arrays.fill(selected,false);
        selected[0] = true;
        int edges = 0;
        while(edges<V-1){
        int min = Integer.MAX_VALUE;
        int x =0,y=0;
        for(int u =0;u<V;u++){
            if(selected[u]==true){
                for(int v = 0;v<V;v++){
                   if (!selected[v] && graph[u][v]!=0){
                        if(min>graph[u][v]){
                            min = graph[u][v];
                            x=u;
                            y=v;
                        }
                   }
                }
            }
        }
        System.out.println(x + "-"+y+ " : " +graph[x][y]);
        selected[y]=true;
        edges++;
        }
    }
}
