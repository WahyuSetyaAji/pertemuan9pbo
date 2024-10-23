package Tugasp8;

import java.util.Scanner;

public class TokoSerbaAda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
		  	System.out.println("\nTOKO SERBA ADA");
	        System.out.println("***************");

	        String[] kodeBarang = {"a001", "a002", "a003"};
	        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
	        int[] hargaBarang = {3000, 4000, 5000};

	        System.out.print("Masukkan Item Barang: ");
	        int jumlahBarang = input.nextInt();
	        
	        String[] kodeBeli = new String[jumlahBarang];
	        int[] jumlahBeli = new int[jumlahBarang];
	        int[] jumlahBayar = new int[jumlahBarang];

	        for (int i = 0; i < jumlahBarang; i++) {
	            System.out.println("Data ke " + (i + 1));
	            System.out.print("Masukkan Kode: ");
	            kodeBeli[i] = input.next();
	            System.out.print("Masukkan jumlah Beli: ");
	            jumlahBeli[i] = input.nextInt();
	        }

	        System.out.println("\nTOKO SERBA ADA");
	        System.out.println("*****************************");
	        System.out.printf("%-3s %-12s %-12s %-10s %-12s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
	        System.out.println("===================================================================");

	        int totalBayar = 0;
	        
	        for (int i = 0; i < jumlahBarang; i++) {
	            boolean barangDitemukan = false; 
	            for (int j = 0; j < kodeBarang.length; j++) {
	                if (kodeBeli[i].equals(kodeBarang[j])) {
	                    barangDitemukan = true;
	                    jumlahBayar[i] = jumlahBeli[i] * hargaBarang[j];
	                    totalBayar += jumlahBayar[i];
	                    
	                    System.out.printf("%-3d %-12s %-12s %-10d %-12d %-12d\n", 
	                        (i + 1), kodeBeli[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
	                    break;
	                }
	            }
	            if (!barangDitemukan) {
	                System.out.printf("%-3d %-12s %-12s %-10s %-12d %-12s\n", 
	                    (i + 1), kodeBeli[i], "Tidak Ditemukan", "-", jumlahBeli[i], "-");
	            }
	        }

	        System.out.println("===================================================================");
	        System.out.printf("%-54s %-12d\n", "Total Bayar:", totalBayar);
	}

}
