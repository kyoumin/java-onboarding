package onboarding;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(solution(33));
    }

    //13 : 3 6 9 13
    //33 : 3,6,9,13,16,19,23,26,29,30,31,32,33 :14
    public static int solution(int number) {
        int answer = 0;

        for(int i=1;i<number+1;i++) {
            String temp = Integer.toString(i); //3
            String[] n = temp.split(""); //3

            for(int j = 0;j<n.length;j++) {
                if (n[j].equals("3") || n[j].equals("6") || n[j].equals("9"))
                    answer ++;
            }
        }
        return answer;
    }
}
