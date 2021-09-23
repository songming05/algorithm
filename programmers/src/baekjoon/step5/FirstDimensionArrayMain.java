package baekjoon.step5;

import java.io.*;
import java.util.Arrays;

public class FirstDimensionArrayMain {

    public static void main(String[] args) throws Exception {

        //최소, 최대
        problem10818();
    }

    private static void problem10818() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = bufferedReader.readLine();
        String input = bufferedReader.readLine();
        int length = Integer.parseInt(n);
        int[] array = new int[length];
        String[] splitedInputs = input.split(" ");
        for (int i = 0; i < splitedInputs.length; i++) {
            array[i] = Integer.parseInt(splitedInputs[i]);
        }
        Arrays.sort(array);
        int min = array[0];
        int max = array[length-1];

        System.out.println(min+" "+max);
    }
}
