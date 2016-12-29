package main.java;

import java.util.ArrayList;

/**
 * Created by Роман Лотоцький on 28.12.2016.
 */
class Solution {

    public int solution(int[] a) {

        int count = 0;
        int first;
        int second;

        for (int i = 0; i < a.length; i++) {
            first = 0;
            second = 0;
            for (int j = 0; j < a.length; j++) {
                if(j <= count) {
                    first += a[j];
                } else if(j > count + 1){
                    second += a[j];
                }
            }
            if (first == second) return count + 1;
            count++;
        }
        return -1;
    }

    public ArrayList<Integer> solutionReturnArray(int[] a){
        ArrayList<Integer> arrayCount = new ArrayList<>();
        int count = 0;
        int first = 0;
        int second = 0;

        for (int i = 0; i < a.length; i++) {
            first = 0;
            second = 0;
            for (int j = 0; j < a.length; j++) {
                if(j <= count) {
                    first += a[j];
                } else if(j > count + 1){
                    second += a[j];
                }
            }
            if(first == second){
                arrayCount.add(count + 1);
            }
            count++;
        }
        return arrayCount;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};
        int[] b = {1, 2, 3, -2};
        System.out.println("For b: " + s.solution(b));
        System.out.println("For a: " + s.solution(a));
        ArrayList<Integer> resultWithArray = s.solutionReturnArray(a);
       System.out.println("Returning array is: ");
        for (int i: resultWithArray) {
            System.out.print(i + "  ");
        }
    }
}