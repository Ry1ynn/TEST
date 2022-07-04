package task_1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arrayOfNum = {2,7,10,11,1,5,30};
        int sum=0;
        for(int i=0; i<arrayOfNum.length; i++) {
           sum += arrayOfNum[i];
        }

        Arrays.sort(arrayOfNum);

        System.out.println(sum);
        System.out.println(arrayOfNum[0]);
        System.out.println(arrayOfNum[arrayOfNum.length-1]);
    }
}
