class GFG
{
    public static void bfs(int s, ArrayList<Integer> adj[],boolean visited[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");
            Iterator it = adj[temp].iterator();
            while (it.hasNext()) {
                int n = (int)it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }
}