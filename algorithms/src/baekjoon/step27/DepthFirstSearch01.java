package baekjoon.step27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class DepthFirstSearch01 {
    public static void main(String[] args) throws Exception {
        //알고리즘 수업 - 깊이 우선 탐색 1
        //https://www.acmicpc.net/problem/24479
        problem24479();
    }

    private static void problem24479() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int node = Integer.parseInt(input[0]);
        int edge = Integer.parseInt(input[1]);
        int start = Integer.parseInt(input[2]);
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>());
        for (int i = 0; i < node; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            String[] dataArray = bufferedReader.readLine().split(" ");
            ArrayList<Integer> info = graph.get(Integer.parseInt(dataArray[0]));
            info.add(Integer.parseInt(dataArray[1]));
        }

        graph.parallelStream().forEach(Collections::sort);

        ArrayList<Integer> visited = new ArrayList<>();


//        Stack<Integer> needVisit = new Stack<>();
//        needVisit.add(start);
//        while (needVisit.size() > 0) {
//            //visited[R] <- YES;
//            Integer current = needVisit.remove(0);
//            if (visited.contains(current)) continue;
//            visited.add(current);
//
//
//            //for each x ∈ E(R)  # E(R) : 정점 R의 인접 정점 집합.(정점 번호를 오름차순으로 방문한다)
//            ArrayList<Integer> myLinks = graph.get(current);
//            needVisit.addAll(0, myLinks);
//            for (int i = current-1; i > 0; i--) {
//                //System.out.println("current: "+current+", i: "+i+", graph.i = " + graph.get(i));
//                if(graph.get(i).contains(current)) needVisit.add(0, i);
//            }
//        }


        dfsExecute(start, graph, visited);

        //System.out.println("visited = " + visited);

        int order = 1;
        int[] result = new int[node + 1];
        for (int i = 0; i < visited.size(); i++) {
            Integer nodeNum = visited.get(i);
            result[nodeNum] = order;
            order++;
        }

        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static void dfsExecute(int cursor, ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> visited) {

        visited.add(cursor);


        for (int i = 1; i < cursor; i++) {
            if(visited.contains(i)) continue;
            dfsExecute(i, graph, visited);
        }

        Stack<Integer> needVisit = new Stack<>();
        ArrayList<Integer> myLinks = graph.get(cursor);
        needVisit.addAll(myLinks.parallelStream()
                .filter(node -> !visited.contains(node))
                .collect(Collectors.toList())
        );
//        for (int i = cursor - 1; i > 0; i--) {
//            if(visited.contains(i)) continue;
//            //System.out.println("cursor: "+cursor+", i: "+i+", graph.i = " + graph.get(i));
//            if (graph.get(i).contains(cursor)) needVisit.add(0, i);
//        }


        while (needVisit.size() > 0) {
            Integer next = needVisit.remove(0);
            if (!visited.contains(next)) dfsExecute(next, graph, visited);
        }
    }
}
