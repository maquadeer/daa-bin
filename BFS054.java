/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs054;

/**
 *
 * @author Student
 */
public class BFS054 {

    /**
     * @param args the command line arguments
     */

    static int[] visited; // Array to track visited nodes
    
    public static void main(String[] args) {
        int[][] graph = {
            {1, 1, 0, 1, 1, 0, 0},
            {1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 0, 1, 0},
            {1, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1, 1, 1},
            {0, 0, 1, 0, 0, 1, 1}
        };
        
        int start = 3;
        visited = new int[graph.length]; // Initialize visited array
        
        bfs(graph, start);
        
        // After BFS completes, reset visited array
        for (int i = 0; i < visited.length; i++) {
            visited[i] = 0;
        }
    }
    
    static void bfs(int[][] graph, int node) {
        if (visited[node] == 0) {
            System.out.print(node + " ");
            visited[node] = 1;
            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && visited[i] == 0) {
                    bfs(graph, i);
                }
            }
        }
    }
}

