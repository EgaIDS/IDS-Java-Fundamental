package com.idstar.latihan2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.idstar.latihan2.model.Karyawan;
import com.idstar.latihan2.model.Training;

public class main {
	public static String KARYAWAN_CSV_FILE = "D://IDS//karyawan.csv";
    public static String TRAINING_CSV_FILE = "D://IDS//training.csv";
    public static String outputFilePath = "D://IDS//output.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to CsvToTxtConverter!");
		System.out.println("Data karyawan CSV file directory: " + new File(KARYAWAN_CSV_FILE).getAbsolutePath());
		System.out.println("Training CSV file directory: " + new File(TRAINING_CSV_FILE).getAbsolutePath());
		System.out.println("TXT file directory: " + outputFilePath);
		
		Scanner scanner = new Scanner(System.in);

		int choice = -1;
		while (choice != 0) {
			System.out.println("\nMenu mencetak file csv menjadi txt");
			System.out.println("1. Generate file txt dari data karyawan");
			System.out.println("2. Generate file txt dari data training");
			System.out.println("3. Generate file txt dari keduanya");
			System.out.println("0. Exit");

			System.out.print("\nEnter your choice: ");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				generateTxtFromKaryawanCsv();
				break;
			case 2:
				generateTxtFromTrainingCsv();
				break;
			case 3:
				generateCombinedTxtFromCsv();
				break;
			case 0:
				System.out.println("Terima kasih telah menggunakan aplikasi ini!");
				break;
			default:
				System.out.println("Pilihan tidak valid. Silakan coba lagi.");
				break;
			}
		}
		scanner.close();
	}
	public static void generateTxtFromKaryawanCsv() {
        try {
            Scanner scanner = new Scanner(new File(KARYAWAN_CSV_FILE));
            FileWriter writer = new FileWriter(outputFilePath);

            // Skip header row
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(",");
                Karyawan karyawan = new Karyawan(values[0], values[1], values[2], values[3]);
                writer.write(karyawan.toString() + "\n");
            }

            writer.close();
            scanner.close();

            System.out.println("File successfully generated, directory: " + outputFilePath);
            System.out.print("Press anything to go to the main menu...");
            new Scanner(System.in).nextLine();
        } catch (IOException e) {
            System.out.println("Error generating file: " + e.getMessage());
        }
    }
	
	public static void generateTxtFromTrainingCsv() {
        try {
            Scanner scanner = new Scanner(new File(TRAINING_CSV_FILE));
            FileWriter writer = new FileWriter(outputFilePath);

            // Skip header row
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(",");
                Training training = new Training(values[0], values[1], values[2], values[3]);
                writer.write(training.toString() + "\n");
            }

            writer.close();
            scanner.close();

            System.out.println("File successfully generated, directory: " + outputFilePath);
            System.out.print("Press anything to go to the main menu...");
            new Scanner(System.in).nextLine();
        } catch (IOException e) {
            System.out.println("Error generating file: " + e.getMessage());
        }
    }
	
	public static void generateCombinedTxtFromCsv() {
	    try {
	        List<Karyawan> karyawanList = readKaryawanFromCsv();
	        List<Training> trainingList = readTrainingFromCsv();

	        String outputFilePath = "combined.txt";
	        FileWriter writer = new FileWriter(outputFilePath);

	        for (Karyawan karyawan : karyawanList) {
	            writer.write(karyawan.toString() + "\n");
	        }

	        for (Training training : trainingList) {
	            writer.write(training.toString() + "\n");
	        }

	        writer.close();

	        System.out.println("File successfully generated, directory: " + outputFilePath);
	        System.out.println("Press anything to go to the main menu...");
	        new Scanner(System.in).nextLine();
	    } catch (IOException e) {
	        System.out.println("Error generating file: " + e.getMessage());
	    }
	}
	
	public static List<Karyawan> readKaryawanFromCsv() {
        List<Karyawan> karyawanList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(KARYAWAN_CSV_FILE))) {
            String line;
            boolean headerRow = true;

            while ((line = br.readLine()) != null) {
                if (headerRow) {
                    // Skip the header row
                    headerRow = false;
                    continue;
                }

                String[] data = line.split(",");
                String nama = data[0].trim();
                String nik = data[1].trim();
                String gender = data[2].trim();
                String status = data[3].trim();

                Karyawan karyawan = new Karyawan(nama, nik, gender, status);
                karyawanList.add(karyawan);
            }
        } catch (IOException e) {
        	System.out.println("Failed to read file: " + KARYAWAN_CSV_FILE);
            e.printStackTrace();
        }

        return karyawanList;
    }
	
	public static List<Training> readTrainingFromCsv() {
	    List<Training> trainingList = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(TRAINING_CSV_FILE))) {
	        String line;
	        boolean isFirstLine = true;
	        while ((line = br.readLine()) != null) {
	            if (isFirstLine) { // Skip the header row
	                isFirstLine = false;
	                continue;
	            }
	            String[] data = line.split(",");
	            String pengajar = data[0].trim();
	            String tema = data[1].trim();
	            String judul = data[2].trim();
	            String durasi = data[3].trim();

	            Training training = new Training(pengajar, tema, judul, durasi);
	            trainingList.add(training);
	        }
	    } catch (IOException e) {
	        System.out.println("Failed to read file: " + TRAINING_CSV_FILE);
	        e.printStackTrace();
	    }
	    return trainingList;
	}


}
