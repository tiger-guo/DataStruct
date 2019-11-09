package Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 图
 * @date: 2019/11/4
 */
public class Graph {

    private int v;  // 顶点个数
    private LinkedList<Integer> adj[]; // 邻接表

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    // 无向图存储 一条边存储2次
    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }

    public void createTest() {
        addEdge(0, 1);
        addEdge(0, 3);
        addEdge(3, 4);
        addEdge(1, 4);
        addEdge(1, 2);
        addEdge(4, 5);
        addEdge(4, 6);
        addEdge(2, 5);
        addEdge(6, 7);
        addEdge(5, 7);
    }

    public void bfs(int s, int t) {
        if (s == t)
            return;
        // 储存路径的数组
        int[] pre = new int[v];
        for (int i = 0; i < v; i++) {
            pre[i] = -1;
        }
        boolean[] visit = new boolean[v];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visit[s] = true;

        while (!queue.isEmpty()) {
            int w = queue.poll();
            for (int i = 0; i < adj[w].size(); i++) {
                int q = adj[w].get(i);
                if (!visit[q]) {
                    pre[q] = w;
                    if (q == t) {
                        print(pre, s, t);
                    }
                    queue.add(q);
                    visit[q] = true;
                }

            }
        }
    }

    // 输出路径函数
    public void print(int[] pre, int s, int t) {
        if (pre[t] != -1 && s != t) {
            print(pre, s, pre[t]);
        }
        System.out.print(t + " ");
    }



    boolean found = false; // 全局变量或者类成员变量

    public void dfs(int s, int t) {
        found = false;
        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        for (int i = 0; i < v; ++i) {
            prev[i] = -1;
        }
        recurDfs(s, t, visited, prev);
        print(prev, s, t);
    }

    private void recurDfs(int w, int t, boolean[] visited, int[] prev) {
        if (found == true) return;
        visited[w] = true;
        if (w == t) {
            found = true;
            return;
        }
        for (int i = 0; i < adj[w].size(); ++i) {
            int q = adj[w].get(i);
            if (!visited[q]) {
                prev[q] = w;
                recurDfs(q, t, visited, prev);
            }
        }
    }
}
