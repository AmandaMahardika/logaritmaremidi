/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uapremidi;
import java.util.Scanner;
/**
 *
 * @author Amanda Mahardikaa
 */
public class UAPREMIDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masukan = new Scanner(System.in);
    int tahun;
    String jurusan =null;
    String choice;
            System.out.println("============================================");
   do{        
            System.out.print("Masukkan Nim:");
            String nim = masukan.nextLine();
            
            System.out.print("Masukkan Nama:");
            String nama = masukan.nextLine();
          
         
            System.out.println("Nim  =" +nim);
            System.out.println("Nama  =" +nama);
            
            String[] arrayke = nim.split("\\.");
            
            tahun = Integer.parseInt(arrayke[0]);
             
            System.out.println("Tahun Ajaran :" + "20" + tahun + "-20" + (tahun + 1) );
            
            if( arrayke[1].equals("31")){
                 jurusan = "D3-Sistem Informasi"; 
            } else if (arrayke[1].equals("51")){
                jurusan = "S1-Sistem Informasi";
            }else if (arrayke[1].equals("52")){
                jurusan = "S1-Teknologi Informatika";
            } else {
                jurusan = "Tidak dapat menemukan jurusan dari nim anda";
            }
               
            System.out.println("Jurusan =" + jurusan);
            System.out.println("No Urut Masuk = " +   arrayke[2].replaceAll("\\b0+(?!\\b)", ""));
            
            System.out.print("Apakah anda ingin memasukkan data lagi [ya/tidak}]:");
            choice = masukan.nextLine(); 
    }while(choice.equals("ya") ||  choice.equals("YA") || choice.equals("y") );
            System.exit(0);
            
    }

}