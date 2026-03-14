class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]it:edges){
            int v=it[0];
            int u=it[1];
            int w=it[2];
            adj.get(v).add(new int[]{u,w});
            adj.get(u).add(new int[]{v,w});
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int []dist=new int[V];
        int[]vis=new int[V];
        Arrays.fill(dist,(int)1e9);
       
        dist[src]=0;
       pq.add(new int[]{0,src});
       while(!pq.isEmpty()){
           int []it=pq.poll();
           int wt =it[0];
           int node=it[1];
           if(vis[node] == 1){
               continue;
           }
           vis[node]=1;
           for(int[]neigh:adj.get(node)){
               int v=neigh[0];
               int cur=neigh[1];
               
               if(vis[v]==0&&dist[node]+cur<dist[v]){
                   dist[v]=dist[node]+cur;
                   pq.add(new int[]{dist[v],v});
               }
           }
           
       }
       return dist;
    }
}