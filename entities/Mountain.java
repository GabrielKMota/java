package entities;

import java.util.Scanner;

public class Mountain {

    public static int highest_mountain(int[] a){
        int n = a.length;
        int largest = 0;

        for (int i = 1; i <= n-2;){
            if (a[i] > a[i-1] && a[i] > a[i+1]) {
                int count = 1;
                int j = i;

                //contadores
                while (j >= 1 && a[j] > a[j-1]){
                    j--;
                    count++;
                }
                while (i <= n-2 && a[i] > a[i+1]){
                    i++;
                    count++;
                }
                largest = Math.max(largest, count);
            }
            else i++;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mountains = new int[n];

        for (int i = 0; i < n; i++){
            mountains[i] = sc.nextInt();
        }

        int x = highest_mountain(mountains);
        System.out.print(x);
    }
}


