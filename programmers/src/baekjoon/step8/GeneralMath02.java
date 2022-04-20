package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class GeneralMath02 {
    public static void main(String[] args) throws Exception {
        //소수찾기
        //https://www.acmicpc.net/problem/1978
        //problem1978();

        //소수
        //https://www.acmicpc.net/problem/2581
        //problem2581();

        //소인수분해
        //https://www.acmicpc.net/problem/11653
        //problem11653();

        //소수 구하기
        //https://www.acmicpc.net/problem/1929
        //problem1929();

        //베르트랑 공준
        //https://www.acmicpc.net/problem/4948
        problem4948();

    }

    private static void problem4948() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        while(n != 0) {
            int result = 0;
            int[] nPrimes = findAllPrimeNumbers(n);
            int[] twiceNPrimes = findAllPrimeNumbers(2 * n);

            Function<int[], ArrayList<Integer>> existsValueArray = ints -> {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < ints.length; i++) {
                    if(ints[i] != 0) list.add(ints[i]);
                    else break;
                }
                return list;
            };

            result = existsValueArray.apply(twiceNPrimes).size() - existsValueArray.apply(nPrimes).size();

            System.out.println(result);
            n = Integer.parseInt(bufferedReader.readLine());
        }

    }

    private static void problem1929() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] datas = bufferedReader.readLine().split(" ");
        int m = Integer.parseInt(datas[0]);
        int n = Integer.parseInt(datas[1]);
        int[] primes = findAllPrimeNumbers(n);

        for (int i = 0; i < primes.length; i++) {
            if(m <= primes[i]) System.out.println(primes[i]);
        }
    }

    private static void problem11653() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        switch (n) {
            case 1: return;
            case 2:
            case 3:
            case 5:
            case 7: {
                System.out.println(n);
                return;
            }
            default: break;
        }
        int[] primes = findAllPrimeNumbers(n);
        for (int i = 0; i < primes.length; i++) {
            if(n % primes[i] == 0) {
                System.out.println(primes[i]);
                n = n / primes[i];
                if(n == 1) break;
                i--;
                continue;
            }
        }
    }

    private static void problem2581() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] primes = findAllPrimeNumbers(10000);
        int sum = 0;
        int min = 0;
        int nonExists = -1;

        for (int i = 0; i < primes.length; i++) {
            if(m <= primes[i] && primes[i] <= n) {
                sum += primes[i];
                if(min == 0) min = primes[i];
            }
        }
        if(sum == 0 && min == 0) {
            System.out.println(nonExists);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }

    private static void problem1978() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //condition
        // 1) n <= 100
        // 2) number <= 1000
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] datas = bufferedReader.readLine().split(" ");
        int[] primes = findAllPrimeNumbers(1000);

        int result = 0;
        for (int i = 0; i < datas.length; i++) {
            int number = Integer.parseInt(datas[i]);
            for (int j = 0; j < primes.length; j++) {
                if(number < primes[j] || primes[j] == 0) break; //해당 수가 소수가 아니거나 배열 초기값
                if(number == primes[j]) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    private static int[] findAllPrimeNumbers(int maxNumber) {
        int[] primes = new int[maxNumber / 2]; //소수 배열
        if(maxNumber < 10) primes = new int[maxNumber];
        int count = 0;

        if(maxNumber >= 2) primes[count++] = 2;
        if(maxNumber >= 3) primes[count++] = 3;

        for (int num = 5; num <= maxNumber; num += 2) { //홀수만 체크

            boolean isPrime = true;
            //제곱근 이하의 어떤 소수로 나누어떨어지지 않으면 소수이다.
            for (int i = 0; primes[i] * primes[i] <= num; i++) {
                if(num % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes[count++] = num;
            }
        }

        return primes;
    }
}
