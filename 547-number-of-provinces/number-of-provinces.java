class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]=new boolean[isConnected.length];
    int n=isConnected.length;
    int province=0;
    for(int city=0;city<n;city++){
        if(!visited[city]){
            province++;
            dfs(city,isConnected,visited);
        }
    }
    return province;
    }

    public static void dfs(int city,int [][]isConnected,boolean visited[]){
        visited[city]=true;

        for(int nextCity=0;nextCity<isConnected.length;nextCity++){
            if(isConnected[city][nextCity]==1&&!visited[nextCity]){
                dfs(nextCity,isConnected,visited);
            }
        }
    }
}