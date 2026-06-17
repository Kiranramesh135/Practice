package com.practice.java.oldquestions;

import java.util.Scanner;

public class MonkRotation {

    public static void main(String args[] ) throws Exception {
        // Write your code here

        Scanner s = new Scanner(System.in);
        String testString = s.nextLine();
        int tests = Integer.parseInt(testString);

        while(tests>0) {
            String st = s.nextLine();
            String[] values = st.split(" ");
            int n = Integer.parseInt(values[0]);
            int k = Integer.parseInt(values[1]);
            String arr = s.nextLine();
            int[] i = new int[n];
            String[] integers = arr.split(" ");

            for(int j=0;j<n;j++) {
                i[j] = Integer.parseInt(integers[j]);
            }

            int[] c = new int[n];
            k = k+1;

            for(int l=0;l<n;l++) {
                int b = l-k;
                if(b<0) {
                    b = n+b;
                    if(b<0) {
                        b = n+b;
                    }
                }
                c[b] = i[l];
            }

            for(int h:c) {
                System.out.print(h+" ");
            }

            tests--;
        }

    }
}
