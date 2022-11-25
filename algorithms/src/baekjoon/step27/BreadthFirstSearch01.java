package baekjoon.step27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch01 {
    public static void main(String[] args) throws IOException {
        //알고리즘 수업 - 너비 우선 탐색 1
        //https://www.acmicpc.net/problem/24444
        problem24444();
    }

    private static void problem24444() throws IOException {
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
        bfsExecute(start, graph, visited);

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

    private static void bfsExecute(int cursor, ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> visited) {
        visited.add(cursor);

        Queue<Integer> needVisit = new LinkedList<>();
        for (int i = 1; i < cursor; i++) {
            if (graph.get(i).contains(cursor)) needVisit.add(i);
        }
        ArrayList<Integer> links = graph.get(cursor);
        needVisit.addAll(links);
        ArrayList<Integer> nextLevels = new ArrayList<>();
        while (needVisit.size() > 0) {
            Integer next = needVisit.poll();
            if (visited.contains(next)) continue;
            visited.add(next);
            nextLevels.add(next);
        }
        nextLevels.forEach(num -> {
            ArrayList<Integer> children = graph.get(num);
            children.stream()
                    .filter(node -> !visited.contains(node))
                    .forEach(node -> bfsExecute(node, graph, visited));
        });
    }
}
