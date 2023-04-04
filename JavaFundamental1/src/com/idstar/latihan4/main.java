package com.idstar.latihan4;

public class main {

	public static void main(String[] args) {
		String[] supportedPhones = {"1,2,3,4,5", "6,7,8,4,5"};

		String[] phones1 = supportedPhones[0].split(",");
		String[] phones2 = supportedPhones[1].split(",");

		String result = "Data yang sama = ";

		for (int i = 0; i < phones1.length; i++) {
		    for (int j = 0; j < phones2.length; j++) {
		        if (phones1[i].equals(phones2[j])) {
		            result += phones1[i] + ",";
		            break;
		        }
		    }
		}

		// hapus coma terakhir
		result = result.substring(0, result.length() - 1);

		System.out.println(result);

	}

}
