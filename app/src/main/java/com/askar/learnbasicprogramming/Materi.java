package com.askar.learnbasicprogramming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.askar.learnbasicprogramming.Adapters.MateriAdapter;

import java.util.ArrayList;
import java.util.List;

public class Materi extends AppCompatActivity implements MateriAdapter.OnClickListener{

    private RecyclerView recyclerView;
    private MateriAdapter materiAdapter;
    private List<com.askar.learnbasicprogramming.Models.Materi> materiList = new ArrayList<>();
    private com.askar.learnbasicprogramming.Models.Materi materi;

    public static final String KEY = "kunci";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        recyclerView = findViewById(R.id.rv_materi);
        initComponents();
    }

    private void initComponents(){
        try {
            data();
            materiAdapter = new MateriAdapter(materiList);
            materiAdapter.setListener(this);
            recyclerView.setAdapter(materiAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }catch (Exception e){
            Toast.makeText(this,"Terjadi Kesalasan", Toast.LENGTH_SHORT).show();
        }
    }

    private void data(){
        com.askar.learnbasicprogramming.Models.Materi materi1 = new com.askar.learnbasicprogramming.Models.Materi("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTxrX99SM6NZmVHpa5GMPa_jeTdym23ChsqfYydAy4LW02ZNhrK", "Pengantar", "Pemrograman Dasar Java", "Sejarah Singkat JAVA\n" +
                "Pada 1991, sekelompok insinyur Sun dipimpin oleh Patrick Naughton dan James" +
                "Gosling ingin merancang bahasa komputer untuk perangkat konsumer seperti cable" +
                "TV Box. Dikarenakan perangkat tersebut tidak memiliki banyak memori, bahasa\n" +
                "harus berukuran kecil dan mengandung kode yang liat. Juga karena manufakturmanufaktur berbeda memilih processor yang berbeda pula, maka bahasa harus\n" +
                "bebas dari manufaktur manapun. Proyek diberi nama kode ”Green”.\n" +
                "Kebutuhan untuk fleksibilitas, kecil, liat dan kode yang netral terhadap platform\n" +
                "mengantar tim mempelajari implementasi Pascal yang pernah dicoba. Niklaus Wirth,\n" +
                "pencipta bahasa Pascal telah merancang bahasa portabel yang menghasilkan\n" +
                "intermediate code untuk mesin hipotesis. Mesin ini sering disebut dengan mesin\n" +
                "maya (virtual machine). Kode ini kemudian dapat digunakan di sembarang mesin\n" +
                "yang memiliki interpreter. Proyek Green menggunakan mesin maya untuk mengatasi\n" +
                "isu utama tentang netral terhadap arsitektur mesin.\n" +
                "Karena orang–orang di proyek Green berbasis C++ dan bukan Pascal maka\n" +
                "kebanyakan sintaks diambil dari C++, serta mengadopsi orientasi objek dan bukan\n" +
                "prosedural. Mulanya bahasa yang diciptakan diberi nama ”Oak” oleh James Gosling\n" +
                "yang mendapat inspirasi dari sebuah pohon yang berada pada seberang kantornya,\n" +
                "namun dikarenakan nama Oak sendiri merupakan nama bahasa pemrograman yang\n" +
                "telah ada sebelumnya, kemudian SUN menggantinya dengan JAVA. Nama JAVA\n" +
                "sendiri terinspirasi pada saat mereka sedang menikmati secangkir kopi di sebuah\n" +
                "kedai kopi yang kemudian dengan tidak sengaja salah satu dari mereka\n" +
                "menyebutkan kata JAVA yang mengandung arti asal bijih kopi. Akhirnya mereka\n" +
                "sepakat untuk memberikan nama bahasa pemrograman tersebut dengan nama Java.\n" +
                "Produk pertama proyek Green adalah Star 7 (*7), sebuah kendali jarak jauh yang\n" +
                "sangat cerdas. Dikarenakan pasar masih belum tertarik dengan produk konsumer\n" +
                "cerdas maka proyek Green harus menemukan pasar lain dari teknologi yang\n" +
                "diciptakan. Pada saat yang sama, implementasi WWW dan Internet sedang\n" +
                "mengalami perkembangan pesat. Di lain pihak, anggota dari proyek Green juga\n" +
                "menyadari bahwa Java dapat digunakan pada pemrograman internet, sehingga\n" +
                "penerapan selanjutnya mengarah menjadi teknologi yang berperan di web.\n", "uHyfQV0kbgo");
        materiList.add(materi1);

        com.askar.learnbasicprogramming.Models.Materi materi2 = new com.askar.learnbasicprogramming.Models.Materi("https://raw.githubusercontent.com/muhammadaskar/Image/master/inputOutput.jpg", "Bab I", "Input Output", "A. Struktur Bahasa Java\n" +
                "Struktur Bahasa Java adalah sebagai berikut :\n" +
                "1. class\n" +
                "Sintaks yang dituliskan untuk membuat class adalah public class\n" +
                "NamaClass penulisan “NamaClass” harus sama dengan nama file yang akan dibuat,\n" +
                "dalam kasus ini nama filenya adalah NamaClass.java\n" +
                "2. method main\n" +
                "Sintaks yang dituliskan adalah public static void main(String[] args)\n" +
                "3. Badan Program\n" +
                "Bagian ini digunakan untuk menuliskan kode program, mulai dari deklarasi\n" +
                "variabel, pemanggilan method, deklarasi objek dan proses perhitungan lainnya,\n" +
                "B. Variabel dan Type Data\n" +
                "Variabel digunakan untuk menyimpan nilai data yang dapat diubah nilai datanya. Variabel\n" +
                "memiliki tipe data dan identifier. Identifier adalah nama variabel yang digunakan sebagai\n" +
                "pengenal. Tipe data menandakan tipe dan jangkauan data yang dapat disimpan pada\n" +
                "variabel tersebut." +
                "Cara pendeklarasian variabel adalah sebagai berikut\n" +
                "Sintaks :\n" +
                "Tipe_data identifier;\n" +
                "Contoh :\n" +
                "int a;\n" +
                "float ipSemester;\n" +
                "String nama;\n" +
                "Untuk menuliskan variabel yang memiliki nilai awal adalah sebagai berikut\n" +
                "Sintaks :\n" +
                "Tipe_data identifier = nilai_awal\n" +
                "Contoh :\n" +
                "int value = 10;\n" +
                "double nilai = 2.5;\n" +
                "String fakultas = “Filkom”;" +
                "OutputModul Praktikum – Pemrograman Dasar\n" +
                "Dalam bahasa pemrograman Java untuk mencetak kedalam layar monitor kita dapat\n" +
                "menggunakan Kelas yang sudah disediakan oleh library Java yaitu dengan menggunakan\n" +
                "Kelas System. Dalam bahasa pemrograman Java untuk menampilkan data keluaran pada\n" +
                "peralatan output standart (layar monitor) adalah :\n" +
                "- System.out.println();\n" +
                "Contoh :\n" +
                "System.out.println(“Belajar”);\n" +
                "System.out.println(“Bahasa ”+”java”);\n" +
                "Keluaran :\n" +
                "Belajar\n" +
                "Bahasa Java\n" +
                "- System.out.print();\n" +
                "Contoh :\n" +
                "System.out.print(“Belajar ”);\n" +
                "System.out.print(“Bahasa ”+”java”);\n" +
                "Keluaran :\n" +
                "Belajar Bahasa Java\n" +
                "- System.out.printf();\n" +
                "Memungkinkan untuk menghasilkan output berupa format dalam Java.\n" +
                "D. Input\n" +
                "Operasi Input untuk menyimpan nilai data ke variabel tertentu melalui peralatan I/O.\n" +
                "Dalam Bahasa Pemrograman Java salah satunya dapat menggunakan Kelas Scanner untuk\n" +
                "melakukan proses input. Penggunaan kelas Scanner memerlukan deklarasi import dan\n" +
                "instansiasi objek sebagai berikut :\n" +
                "Deklarasi import\n" +
                "import java.util.Scanner;\n" +
                "Instansiasi Objek\n" +
                "Scanner input = new Scanner(System.in);", "u0ARzRu9idY");
        materiList.add(materi2);

        com.askar.learnbasicprogramming.Models.Materi materi3 = new com.askar.learnbasicprogramming.Models.Materi("https://raw.githubusercontent.com/muhammadaskar/Image/master/SeleksiKondisi.jpg", "Bab II", "Seleksi Kondisi", "A. Conditional Assignment\n" +
                "Sebelum mengenal menggunakan if kita dikenalkan bagaimana cara menggunakan dan\n" +
                "kode untuk conditional assignment. Berikut kode dari conditional assignment :\n" +
                "type_data variabel = kondisi ? pernyataan_benar : pernyataan_salah\n" +
                "Dari kode diatas dapat dijelaskan bahwa pertama harus dilakukan pendeklarasian variabel\n" +
                "dan type data dari variabel yang kita buat, kemudian kita beri suatu kondisi setelah itu jika\n" +
                "kondisi benar maka program akan berjalan ke pernyaataan benar namun jika salah maka\n" +
                "akan melakukan pernytaan salah. Contoh :\n" +
                "String s = (5>2) ? “Berhasil” : “Gagal”;\n" +
                "Jika program tersebut dijalankan maka akan mencetak “Berhasil karena” kondisi pada\n" +
                "conditional assignment tersebut benar.\n" +
                "B. Seleksi kondisi menggunakan if-else\n" +
                "Untuk melakukan percabangan tunggal kita dapat menggunakan if saja namun untuk\n" +
                "percabangan yang lebih dari satu (percabangan majemuk) maka kita dapat menggunakan ifelse.\n" +
                "Bentuk dasar dari statemen ini adalah :\n" +
                "if (kondisi){\n" +
                "Blok pernyataan;\n" +
                "} else{" +"Blok pernyataan\n" +
                "}\n" +
                "Namun untuk percabangan yang lebih dari 2, bentuk dasar yang digunakan adalah :\n" +
                "if (kondisi){\n" +
                "Blok pernytaan 1;\n" +
                "} e" +"lse if (kondisi){\n" +
                "Blok pernyataan 2;\n" +
                "} e" +"lse if (kondisi){\n" +
                "Blok pernyataan 3;\n" +
                "} else" +"Blok pernyataan 4;\n" +
                "}\n" +
                "C. Nested If\n" +
                "Suatu if memungkinkan untuk terapat if didalan if inilah yang disebut sebagai nested if.\n" +
                "Alur programnya adalah jika kondisi if pertama benar makan program akan mengecek if\n" +
                "kedua jika benar maka mengecek if ketiga begitu seterusnya.\n" +
                "Bentuk dasar dari nested if adalah sebagai berikut :Modul Praktikum – Pemrograman Dasar\n" +
                "if (kondisi){\n" +
                "if(kondisi){\n" +
                "if(kondisi){\n" +
                "blok pernyataan;\n" +
                "}\n" +
                "Else{\n" +
                "Blok pernyataan;\n" +
                "}\n" +
                "}\n" +
                "Else{\n" +
                "Blok pernyataan;\n" +
                "}\n" +
                "}\n" +
                "Else{\n" +
                "Blok pernyataan;\n" +
                "}\n" +
                "D. Switch Case\n" +
                "Selain menggunakan if untuk seleksi kondisi terdapat sintaks lain yaitu menggunakan\n" +
                "Switch case. Program akan menampilkan output sesuai dengan inputan yang diberikan\n" +
                "dengan batasan input berupa nilai awal sampai nilai akhir tertentu.\n" +
                "Bentuk dasar dari switch case adalah sebagai berikut :\n" +
                "Switch(kondisi){\n" +
                "Case nilai1 : statemen-1; break;\n" +
                "Case nilai2 : statemen-2; break;\n" +
                "Case nilai3 : statemen-3; break;\n" +
                "Default : Statemen-4;\n" +
                "}\n", "492A2poEoow");
        materiList.add(materi3);

        com.askar.learnbasicprogramming.Models.Materi materi4 = new com.askar.learnbasicprogramming.Models.Materi("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTxrX99SM6NZmVHpa5GMPa_jeTdym23ChsqfYydAy4LW02ZNhrK", "Bab III", "Perulangan", "A. Perulangan dengan menggunakan For\n" +
                "Kata kunci for digunakan untuk mengulang pengeksekusian satu atau sejumlah\n" +
                "pernyataan. Perulangan menggunakan for mempunyai batas awal, batas akhir dan kenaikan\n" +
                "yang telah ditentukan terlebih dahulu. Perulangan akan dilakukan dengan membandingkan\n" +
                "pencacah dengan batas akhir hingga ditemukan kondisi benar pada batas akhir, Bentuk umum\n" +
                "penulisan perulangan menggunakan for adalah :\n" +
                "for (InitializationExpression; LoopCondition; StepExpression){\n" +
                "statement1;\n" +
                "statement2;\n" +
                "}\n" +
                "InitializationExpression : inisialisasi dari variabel loop (memberikan nilai awal loop)\n" +
                "LoopCondition : Membandingkan variabel loop pada nilai batas tertentu\n" +
                "StepExpression : Melakukan update pada variabel loop\n" +
                "B. Perulangan dengan menggunakan while\n" +
                "Kata kunci while digunakan untuk melakukan suatu proses perulangan yang memerlukan\n" +
                "suatu kondisi tertentu untuk menghentukan perulangan. Perulangan akan dilakukan dengan\n" +
                "membandingkan syarat perulangan dengan kondisi saat itu hingga ditemukan kodisi salah satu\n" +
                "pada syarat perulangan. Bentuk umum penulisannya adalah :\n" +
                "while(syarat_perulangan){\n" +
                "Statemen1;\n" +
                "Statemen2;\n" +
                "}\n" +
                "C. Perulangan dengan menggunakan do-while\n" +
                "Hampir sama dengan perulangan menggunakan while, perulangan dengan do-while\n" +
                "juga digunakan untuk melakukan perulangan yang memerlukan suatu kondisi tertentu untuk\n" +
                "menghentikan perulangan. Perbedaan mendasar dengan perulangan menggunakan while\n" +
                "adalah, dengan do-while, pengecekan kondisi dilakukan di belakang setelah baris statemen\n" +
                "dalam blok do-while dijalankan (minimal 1 kali). Bentuk umum penulisan dengan do-while\n" +
                "sebagai berikut :\n" +
                "Do{\n" +
                "Statement1;\n" +
                "Statement2;\n" +
                "}while(syarat_perulangan);\n" +
                "D. Pernyataan Break dan Continue\n" +
                "- Break\n" +
                "Pernyataan break adalah pernyataan untuk mengentikan perulangan, sehingga akan\n" +
                "keluar dari perulangan tersebut walaupun proses perulangan belum berakhir.\n" +
                "- Continue\n" +
                "Bentuk pernyataan continue akan melewati bagian pernyataan setelah pernyataan ini\n" +
                "dituliskan dan memeriksa ekspresi logika (boolean) yang mengkontrol pengulangan. JikaModul Praktikum – Pemrograman Dasar\n" +
                "operasi logika bernilai true, maka pengulangan tetap dilanjutkan. Pada dasarnya\n" +
                "pernyataan ini akan melanjutkan bagian pengulangan pada pernyatana loop.", "OAiZZqiSzxo");
        materiList.add(materi4);

        com.askar.learnbasicprogramming.Models.Materi materi5 = new com.askar.learnbasicprogramming.Models.Materi("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTxrX99SM6NZmVHpa5GMPa_jeTdym23ChsqfYydAy4LW02ZNhrK", "Bab IV", "Array", "A. Array\n" +
                "Array adalah variabel yang dapat menyimpan beberapa nilai dengan tipe data yang sama.\n" +
                "Suatu array yang berjumlah n elemen, indeksnya selalu dimulai dari 0 sampai dengan n-1.\n" +
                "Misalkan ada sebuah array bernama A dengan jumlah 7 elemen, maka elemen-elemen array\n" +
                "tersebut dapat digambarkan sebagai berikut :\n" +
                "A[0] A[1] A[2] A[3] A[4] A[5] A[6]\n" +
                "Cara pendeklarasian array adalah sebagai berikut\n" +
                "Sintaks :\n" +
                "Tipe_Data[] Nama_Array = new Tipe_Data [Jumlah_Elemen];\n" +
                "Contoh :\n" +
                "int [ ] A = new int [ 7 ];\n" +
                "float [ ] nilai = new float [ 10 ];\n" +
                "B. Array 1 dimensi\n" +
                "Array 1 dimensi adalah array yang mempunyai 1 set kurung siku.\n" +
                "Contoh :\n" +
                "String [ ] nama = new String [ 45 ];\n" +
                "int [ ] umur = new int [ 45 ];\n" +
                "Untuk menuliskan array 1 dimensi yang memiliki nilai awal adalah sebagai berikut\n" +
                "Contoh :\n" +
                "Int [ ] nilai = { 85, 83, 79, 92 };\n" +
                "Penjelasan\n" +
                "nilai [ 0 ] = 85\n" +
                "nilai [ 2 ] = 79\n" +
                "C. Array 2 dimensi\n" +
                "Array 2 dimensi adalah array yang mempunyai 2 set kurung siku. Array ini memiliki indeks\n" +
                "baris dan kolom.\n" +
                "Contoh :\n" +
                "String [ ] [ ] nama = new String [ 5 ] [ 9 ];\n" +
                "int [ ] [ ] umur = new int [ 5 ] [ 9 ];\n" +
                "Penjelasan\n" +
                "Indeks baris array nama mulai dari 0 sampai 4\n" +
                "Indeks kolom array nama mulai dari 0 sampai 8\n" +
                "Untuk menuliskan array 2 dimensi yang memiliki nilai awal adalah sebagai berikut\n" +
                "Contoh :\n" +
                "Int [ ] [ ] no = { { 1, 2 }, { 3, 4 }, { 5, 6 } } ;\n" +
                "Penjelasan\n" +
                "nilai [ 0 ] [ 0 ] = 1\n" +
                "nilai [ 0 ] [ 1 ] = 2\n" +
                "nilai [ 1 ] [ 0 ] = 3\n" +
                "nilai [ 1 ] [ 1 ] = 4\n" +
                "nilai [ 2 ] [ 0 ] = 5\n" +
                "nilai [ 2 ] [ 1 ] = 6", "Oa4FvgsCByw");
        materiList.add(materi5);
    }

    public void clickBack(View view) {
        onBackPressed();
    }

    @Override
    public void onClick(View view, int position) {
        materi = new com.askar.learnbasicprogramming.Models.Materi();
        materi = materiList.get(position);
        startActivity(new Intent(Materi.this, DetailMateri.class)
            .putExtra(KEY, materi));
    }
}
