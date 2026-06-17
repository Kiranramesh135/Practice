package com.practice.java.oldquestions;

public class ReverseEvenWordsInASentence {
	
	public static void main(String[] args) {
		
		String snt = "Kiran is a good boy";
		
		String[] sArray = snt.split(" ");
		
		for(int i=1;i<sArray.length;i=i+2) {
			
			StringBuffer sb = new StringBuffer(sArray[i]);
			sb.reverse();
			sArray[i] = sb+"";
		}
		
//		for(int i=sArray.length-1;i>=0;i--)
		for(int i=0;i<sArray.length;i++)
		{
			System.out.println(sArray[i]+" ");
		}
 	}

}
