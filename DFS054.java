/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs054;

/**
 *
 * @author Student
 */
public class DFS054 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] graph={{1,1,0,1,1,0,0},{1,1,1,1,0,0,0},{0,1,1,1,0,0,1},{1,1,1,1,0,1,0},{1,0,0,0,1,1,0},{0,0,0,1,1,1,1},{0,0,1,0,0,1,1}};
        int start=2;
        dfs(graph,start,graph.length);
    }
    public static void dfs(int graph[][],int start,int n){
        int count=0,k=0;
        int [] stack=new int [100];
        int [] visited=new int [10];
        for(int i=1;i<=n;i++){
            visited[i]=0;
        }
        for(int i=0;i<10;i++){
            stack[i]=0;
        }
        stack[k]=start;
        while(isEmpty(k))
        {
            int u=pop(stack,k);
            System.out.print(u+"-");
            count++;
            visited[u]=1;
            if(count!=n){
                    for(int i=u,j=0;j<n;j++)
                        if(graph[i][j]!=0 && j!=u && visited[j]==0)
                            stack[++k]=j;
            }
            else
                break;
        }
    }
    public static boolean isEmpty(int k){
       if(k==-1)
           return false;
       return true;
    }
    public static int pop(int stack[],int k){
        return stack[k--];
    }
}
