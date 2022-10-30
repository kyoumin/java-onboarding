package onboarding;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(solution("I love you"));
    }



    public static String solution(String wordg) {

        /*
        char[] arr = new char[26];
        for(int i=0;i<26;i++) {
            arr[i] = (char) (65 + i);
            System.out.println(arr[i]);
        }
        */


        String[] arr = {"A", "B", "C", "D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] arr2 = {"a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        String[] n = word.split("");
        String answer= "";


        for(int i=0;i<word.length();i++) {
            all:
            for(int j =0;j<arr.length;j++) {

                if(n[i].equals(arr[j])){
                    answer+=arr[arr.length-1-j];
                    break all;
                }

                else if(n[i].equals(arr2[j])) {
                    answer += arr2[arr2.length - 1 - j];
                    break all;
                }
                else if(n[i].equals(" ")) {
                    answer += " ";
                    break all;
                }
            }
        }
        return answer;
    }
}
