package com.idstar.latihan1;

import java.util.Scanner;

import javax.swing.event.MenuListener;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int mainMenu = -1;
		
		
		while (mainMenu!=0) {
			System.out.println("--Kalkulator Penghitung--");
			System.out.println("Menu");
			System.out.println("1.Hitung Luas Bidang");
			System.out.println("2.Hitung Volume");
			System.out.println("0.Exit");
			System.out.print("Masukan Pilihan: ");
			mainMenu = scanner.nextInt();
			switch (mainMenu) {
			case 1:
				menuLuasBidang(scanner);
				break;
			case 2:
				menuVolume(scanner);
				break;
			case 0:
				System.out.println("Exit...");
				break;

			default:
				System.out.println("Wrong Input!");
				break;
			}
			
		}
		scanner.close();
	}
	
	public static void menuLuasBidang(Scanner scanner) {
		// Clear console
		int subMenuLuas = -1;
		
		while (subMenuLuas != 0) {
			System.out.println("--Pilih Bidang Yang Dihitung--");
			System.out.println("1.Persegi");
			System.out.println("2.Lingkaran");
			System.out.println("3.Segitiga");
			System.out.println("4.Persegi Panjang");
			System.out.println("0.Kembali ke menu sebelumnya");
			System.out.print("Masukan Pilihan: ");
			subMenuLuas = scanner.nextInt();
			
			switch (subMenuLuas) {
                case 1:
                    luasPersegi(scanner);
                    break;
                case 2:
                    luasLingkaran(scanner);
                    break;
                case 3:
                    luasSegitiga(scanner);
                    break;
                case 4:
                    luasPersegiPanjang(scanner);
                    break;
                case 0:
                    System.out.println("Kembali ke menu sebelumnya...");
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
					
			
		}
		
	}
	public static void menuVolume(Scanner scanner) {
		int subMenuVolume = -1;
		
		while (subMenuVolume != 0) {
			System.out.println("--Pilih Bidang Yang Dihitung--");
			System.out.println("1.Kubus");
			System.out.println("2.Balok");
			System.out.println("3.Tabung");
			System.out.println("0.Kembali ke menu sebelumnya");
			System.out.print("Masukan Pilihan: ");
			subMenuVolume = scanner.nextInt();
			scanner.nextLine();
			
			switch (subMenuVolume) {
                case 1:
                    volumKubus(scanner);
                    break;
                case 2:
                    volumBalok(scanner);
                    break;
                case 3:
                    volumTabung(scanner);
                    break;
                case 0:
                    System.out.println("Kembali ke menu sebelumnya...");
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
					
			
		}
		
	}
	
	
	public static void luasPersegi(Scanner scanner) {
        System.out.print("Masukan panjang sisi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas);
        System.out.println("--press anything to go to the main menu--");
        scanner.nextLine();
        scanner.nextLine();
        
    }
    
    public static void luasLingkaran(Scanner scanner) {
        System.out.print("Masukan panjang jari-jari: ");
        double r = scanner.nextDouble();
        double luas = Math.PI * r * r;
        System.out.println("Luas Lingkaran adalah: " + luas);
        System.out.println("--press anything to go to the main menu--");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void luasSegitiga(Scanner scanner) {
        System.out.print("Masukan Alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukan Tinggi: ");
        double tinggi = scanner.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("The luas of the triangle is: " + luas);
        System.out.println("--press anything to go to the main menu--");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void luasPersegiPanjang(Scanner scanner) {
        System.out.print("Masukan Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukan Lebar: ");
        double lebar = scanner.nextDouble();
        double luas = panjang * lebar;
        System.out.println("The luas of the rectangle is: " + luas);
        System.out.println("--press anything to go to the main menu--");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void volumKubus(Scanner scanner) {
    	System.out.print("Masukan panjang sisi: ");
        double sisi = scanner.nextDouble();
        double volum = sisi * sisi* sisi;
        System.out.println("Volum Kubus adalah: " + volum);
        System.out.println("--press anything to go to the main menu--");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void volumBalok(Scanner scanner) {
    	System.out.print("Masukan Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukan Lebar: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukan Tinggi: ");
        double tinggi = scanner.nextDouble();
    	double volum = panjang * lebar * tinggi;
    	System.out.println("Volum balok adalah: " + volum);
    	System.out.println("--press anything to go to the main menu--");
    	scanner.nextLine();
    	scanner.nextLine();
    }
    
    public static void volumTabung(Scanner scanner) {
        System.out.print("Masukan panjang jari-jari: ");
        double r = scanner.nextDouble();
        System.out.print("Masukan Tinggi: ");
        double t = scanner.nextDouble();
        double volum = Math.PI * r * r * t;
        System.out.println("Volum Tabung adalah: " + volum);
        System.out.println("--press anything to go to the main menu--");
        scanner.nextLine();
        scanner.nextLine();
    }
}

