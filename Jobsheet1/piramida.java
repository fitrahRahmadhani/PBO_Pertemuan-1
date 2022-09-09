/*Nama: Fitrah Rahmadhani Ahmad 
  NIM: 2141762092
  No.Absen 07
  Kelas: SIB 2E
*/
package Jobsheet1;
import java.net.SocketTimeoutException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class piramida{
    public static void main(String[] args) {
        int[] nim = {2,1,4,1,7,6,2,0,9,2};
        int index = 0, baris = 4, spasi, i = 0,  j = 0;
        
        File file = new File("output.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            do{
                spasi = 4;
                do{
                    System.out.print(" ");
                    spasi--;
                }while(spasi > i);
                do{
                    System.out.print(" " + nim[index]);
                    String nilai = String.valueOf(nim[index]);
                    bw.write(nilai);
                    bw.newLine();
                    index++;
                    j++;
                }while(j <= i);
                j = 0;
                System.out.println();
                i++;
    
            }while(i < baris);            
        }catch(FileNotFoundException ex){
            //Menampilkan pesan jika file tidak ditemukan
            System.out.println("File "+file.getName()+" Tidak Ditemukan"); 
        }catch(IOException ex){
            //Menampilkan pesan jika terjadi error atau file tidak dapat dibaca
            System.out.println("File "+file.getName()+" Tidak Dapat DIbaca");
        }
    }
}