//Tugas 1 Pemprograman
import java.util.Scanner;

public class Menghitung_luas_lingkaran {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double luas, phi=3.14;
       int r;
       System.out.print("Masukan Jari-jari : ");
       r=input.nextInt();
       luas=phi*r*r;
       System.out.println("Luas Lingkaran = "+luas);
    } 
}


import java.util.Scanner;

public class Menghitung_luas_segitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.print("Masukan Alas : ");
        a=input.nextInt();
        System.out.print("Masukan Tinggi : ");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }  
}

//////////////////////////////////////////////////////////////////////////////////////////////////

//Tugas 2 Pemprograman
//Latihan No.1
public class PraktikumTigaBb
{
    public static void main(String[] args) 
    {
        double salary = 100;
        double newSalary;
        final double raise_rate= 1.10;
        newSalary = salary * raise_rate;
        System.out.println("current salary: " + salary + " after raise: " + newSalary);    
    }
}


//Tugas 2 Pemprograman
//Latihan No.2
public class PraktikumEmpat{
    public static void main(String[] args) {
        
        int hasil = 1 + 2; //hasil sekarang adalah 3
        System.out.println(hasil);

        hasil = hasil - 1; //hasil sekarang adalah 2
        System.out.println(hasil);

        hasil = hasil * 2; //hasil sekarang adalah 4
        System.out.println(hasil);

        hasil = hasil / 2; //hasil sekarang adalah 2
        System.out.println(hasil);

        hasil = hasil + 8; //hasil sekarang adalah 10
        System.out.println(hasil);

        hasil = hasil % 7; //hasil sekarang adalah 3
        System.out.println(hasil);
    }
}

//Tugas 2 Pemprograman
//Latihan No.4
public class PraktikumLima{
    public static void main(String[] args) {
        
        int a = 1;
        int b = a++; //b mendapat nilai dari a(1), a kemudian bertambah 1
        System.out.println("a = " + a); //2
        System.out.println("b = " + b); //1

        int c = 1;
        int d = ++c; //d mendapatkan nilai setelah c bertambah 1 (2)
        System.out.println("c = " + c); //2
        System.out.println("d = " + d); //2

        int i = 1;
        int j = i--; //j mendapatkan nilai dari 1(1), a kemudian berkurang 1
        System.out.println("i = " + i); //0
        System.out.println("j = " + j); //1

        int k = 1;
        int l = --k; //1 mendapatkan nilai setelah k berkurang 1 (0)
        System.out.println("k = " + k); //0
        System.out.println("l = " + l); //0

        int x = 1;
        int y = 2;
        int z = 2;
        System.out.println("Perbandingan Lebih Kecil Dari (<) :");
        System.out.println("x < y = " + (x < y)); //true
        System.out.println("y < x = " + (y < x)); //false
        System.out.println("z < y = " + (z < y)); //false

        System.out.println("Perbandingan Lebih Kecil Sama Dengan (<=) :");
        System.out.println("x <= y = " + (x <= y)); //true
        System.out.println("y <= x = " + (y <= x)); //false
        System.out.println("z <= y = " + (z <= y)); //true

        System.out.println("Perbandingan Lebih Kecil Sama Dengan (==) :");
        System.out.println("x == y = " + (x == y)); //false
        System.out.println("y == z = " + (y == z)); //true

        System.out.println("Perbandingan Lebih Kecil Sama Dengan (!=) :");
        System.out.println("x != y = " + (x != y)); //true
        System.out.println("y != y = " + (z != y)); //false
        
    }
}

//Tugas 2 Pemprograman
//Latihan No.5

//a. 
class nolpagi{
    public static void main(String[]aa) {
     int a=2;
     int b=20,c=3;
     boolean nama=false;
     //testing
     nama=(a>10)||(++b>35);
     System.out.println(a+=b);
     System.out.println(c=a+b%c);
     System.out.println(b);
     System.out.println(nama);   
    }
}

//b. 
class nolpgb{
    public static void main(String[]args) {
     int a,b;
     float c,d;
     a=35;b=5;c=7;
     boolean nama=false;
     System.out.println(a+=b);
     System.out.println(b-=a);
     System.out.println(c=a+b%c);
     System.out.println(++b);
     System.out.println(d=a*b/c);
     System.out.println(nama);   
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////

//Tugas 3 Pemprograman
//Soal 1 Menghitung luas dan keliling persegi panjang

import java.util.Scanner;

public class keliling_luas_persegipanjangbosquh {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x, z, luas, keliling;

        System.out.print("Masukan Panjang Persegi = ");
        x=input.nextInt();
        System.out.print("Masukan Lebar Persegi = ");
        z=input.nextInt();
        
        luas=x*z;
        System.out.println("Luas persegi Panjang = "+luas);

        keliling=2*x+2*z;
        System.out.println("Keliling persegi Panjang = "+keliling);

    }  
}


//Tugas 3 Pemprograman
//Soal 2 Menghitung luas Segitiga
import java.util.Scanner;

public class luas_segitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x, z;
        double luas;

        System.out.print("Masukan Tinggi Segitiga = ");
        x=input.nextInt();
        System.out.print("Masukan Panjang Alas Segitiga = ");
        z=input.nextInt()
        
        luas=0.5*x*z;
        System.out.println("Luas Segitiga = "+luas);

    }  
}


//Tugas 3 Pemprograman
//Soal 3 celcius to fahreinheit
import java.util.Scanner;
  
public class celciusto_fahreinheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float celcius, fahreinheit;

        System.out.print("Suhu dalam derajat celcius = ");
        celcius = input.nextFloat();

        fahreinheit = celcius*9/5+32;
        System.out.println("Maka, suhu dalam derajat fahreinheit = "+fahreinheit);

    }  
}


//Tugas 4 Pemprograman
//Soal No 1
import java.util.Scanner;
public class PraktikumduaBelas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hari;
        String namaHari;

        hari=input.nextInt();
        
        if (hari == 1) {
            namaHari = "Senin";
        } else if (hari == 2) {
            namaHari = "Selasa";
        } else if (hari == 3) {
            namaHari = "Rabu";
        } else if (hari == 4) {
            namaHari = "Kamis";
        } else if (hari == 5) {
            namaHari = "Jumat";
        } else if (hari == 6) {
            namaHari = "Sabtu";
        }   else {
            namaHari = "Minggu";        
        }
        
        if (hari > 7) {
        namaHari = "Tidak ada";
    }

        System.out.println("Nama Hari = " + namaHari);

    }
}
//Tugas 4 Pemprograman
//Soal No 3
import java.util.Scanner;
public class x {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int usia;
        String kategori;

        
        System.out.print("Masukan Usia Anda = ");
        usia= input.nextInt();

        if (usia <= 16 ) {
            kategori= "Anak-anak";
        } else if (usia < 26) {
            kategori = "Remaja";
        } else {
            kategori = "Dewasa";
        } 
        
        System.out.println("Kategori Usia Anda adalah " + kategori);


    }
}

//Tugas 5 Pemprograman
//Soal No 1
// Import package yang dibutuhkan
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassBufferedReader {
    public static void main(String[] args)throws IOException {
       
        // Deklarasi variabel panjang, lebar, luas dengan tipe data double
        int panjang, lebar, luas, keliling;
        
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        
        // Membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);

        // Meminta masukkan nilai untuk panjang dan lebar
        System.out.print("Masukan Panjang Persegi = ");
        panjang = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan Lebar Persegi = ");
        lebar = Integer.parseInt(br.readLine());
        
        // Menghitung luas persegi panjang
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
        
        // Menghitung keliling persegi panjang
        keliling = 2*(panjang+lebar); 
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }

}

 
//Tugas 6 Pemprograman
//Soal No 1
import java.util.Scanner;
public class Pemrograman {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String hasil = "";
        // mengambil input
        System.out.println("Masukan Jurusan Anda IPA = 1 / BAHASA = 2 = ");
        Integer pilih = input.nextInt();
        System.out.println("Masukan Nilai Anda = ");
        Integer nilai = input.nextInt();
        
        // proses
            if(pilih == 1){
                if(nilai <= 82){
                    hasil = "Anda Tidak Memenuhi Syarat Lulus";
                } if (nilai <= 100){
                    hasil = "Anda Telah Memenuhu Syarat Lulus";
                }   
            }

            if(pilih == 2){
                if(nilai <= 74){
                    hasil = "Anda Tidak Berhak Medapat Program Beasiswa";
                } if (nilai <= 100) {
                    hasil = "Anda Berhak Mendapatkan Program Beasiswa";
                }
            }
            
            
        // output

        System.out.println("Hasil Anda Adalah = " + hasil);
    }  
}
