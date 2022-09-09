/*Nama: Fitrah Rahmadhani Ahmad 
  NIM: 2141762092
  No.Absen 07
  Kelas: SIB 2E
*/
package Jobsheet1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class penjumlahan {
    public static void main(String[] args) {
        File file = new File("output.txt");

        int sum = 0;
        int[] nim = new int[10];
    
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String barisData; int i = 0;            
            while((barisData = br.readLine())!= null){
                nim[i] = Integer.parseInt(barisData);
                sum += nim[i];
                i++;
            }
            System.out.println("Jumlah nilai dari nim = " + sum);
        }catch(FileNotFoundException ex1){
            System.out.println("File tidak ditemukan "+ file.toString());
        
        }catch(Exception ex2){
            System.out.println("File tidak dapat dibaca "+ file.toString());
        }
    }  
} 
