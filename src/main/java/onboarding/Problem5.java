package onboarding;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(solution(50237));
    }
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();//Collections.emptyList();

        int[] unit = {50000,10000,5000,1000,500,100,50,10,1};

        for(int i=0;i<unit.length;i++) {
            int count = money / unit[i];
            money -= count*unit[i];
            answer.add(count);
        }
        return answer;
    }
}
