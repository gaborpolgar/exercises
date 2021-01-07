package hackerrank.salexbymarch;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales {

    public static void main(String[] args) {
        int[] ar = {10, 30, 10, 20, 40};
        sockMerchant(5, ar);
    }

    static int sockMerchant(int n, int[] ar) {
        //List<Integer> sortedSocks = Arrays.stream(ar).sorted().boxed().collect((Collectors.toList()));
        int sum = 0;
        Map<Integer, Integer> pairedSocks = new HashMap<>();
        for (int sock : ar) {
            pairedSocks.put(sock, pairedSocks.containsKey(sock) ?
                    pairedSocks.get(sock) + 1 : 1);
        }
        List<Integer> listOfSocksFrequency = new ArrayList<>(pairedSocks.values());
        for (int freq : listOfSocksFrequency) {
            sum += freq / 2;
            }
        return sum;
    }
}
