package com.practice.java.oldquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackerRankQuestion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
//		int arr[][] = new int[6][6];
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				list.add(sum);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}
}
