package com.idstar.latihan3;

public class main {

	public static void main(String[] args) {
		
		String[] sd = {"12345", "67845"};

		int totalDiff = 0;
		String differentCharIndex = "";

		for (int i = 0; i < sd[0].length(); i++) {
		    if (sd[0].charAt(i) != sd[1].charAt(i)) {
		        totalDiff++;
		        differentCharIndex += i + ",";
		    }
		}

		if (totalDiff > 0) {
		    differentCharIndex = differentCharIndex.substring(0, differentCharIndex.length() - 1);
		    System.out.println("total karakter tidak sama adalah " + totalDiff + ". yaitu index " + differentCharIndex);
		} else {
		    System.out.println("tidak ada karakter yang berbeda");
		}

	}

}
