package com.askar.learnbasicprogramming.Soal.SoalPilihanGanda;

public class QuestionBank {

    private String textQuestions[] = {
            "1. Variabel yang hanya dikenali pada suatu method dimana variable tersebut dideklarasikan disebut sebagai variabel ?",
            "2. Statement pada method yang dapat digunakan untuk mengembalikan sebuah nilai ketika sebuah method dipanggil adalah ?",
            "3. Perhatikan program berikut ini : \n" +
                    "static int fungsi1(int n){\n" +
                    "        int hasil=0;\n" +
                    "        for(int i=1;i<=n;i++){\n" +
                    "           if (i%2==0){\n" +
                    "               hasil++;\n" +
                    "           }\n" +
                    "        }\n" +
                    "        return(hasil);\n" +
                    " }\n" +
                    "Bila diberikan perintah  System.out.print(fungsi1(10)); menghasilkan :",
            "4. Perhatikan program berikut ini ? \n" +
                    "static boolean fungsi1(int n){\n" +
                    "  boolean b=false;\n" +
                    "  int i=2;\n" +
                    "  while ((b==false) &&\n" +
                    "         (i<=1+(int)Math.sqrt(n))\n" +
                    "        ){\n" +
                    "            b=((n %i)==0);\n" +
                    "            i++;\n" +
                    "        }\n" +
                    "        return(b);\n" +
                    "  }\n" +
                    "Fungsi Math.sqrt(n) berguna untuk menghitung akar dari n. Bila diberikan perintah  System.out.println (fungsi1(10)); menghasilkan :",
            "5. Siapakah penemu bahasa pemrograman java ?",
            "6. Berikut ini yang termasuk tipe data primitive adalah…",
            "7. Untuk menyimpan data nim mahasiswa, tipe data yang paling tepat digunakan adalah...",
            "8. Berikut ini adalah hak akses yang dapat ditambahkan didepan method Java, kecuali...",
            "9. Keyword yang digunakan untuk membuat nilai tetap dan tidak dapat berubah adalah…",
            "10. Stream yang berguna untuk mengirim keluaran ke layar adalah",
            "11. Tipe data untuk TRUE FALSE adalah...",
            "12. Tipe data untuk bilangan bulat dalam bahasa java dikenal sebagai ...",
            "13. Istilah” perulangan “ dalam pemograman java dikenal dengan ...",
            "14. Bentuk dari suatu statment IF berada di dalam lingkungan statmean IF yang lainya,disebut IF dalam kondisi ...",
            "15. Berikut ini yang termasuk operator aritmatika yaitu ….",
            "16. Berikut adalah penamaan class pada java yang diperbolehkan, kecuali…",
            "17. Apa yang akan tercetak dari hasil penggalan program berikut ini:\n" +
                    "int All;\n" +
                    "int a=2, b=3, c=6, d=5;\n" +
                    "All = b * d - c / a + b;\n" +
                    "System.out.print (“All:”+All);\n",
            "18. Method yang digunakan untuk membandingkan dua buah data string adalah …",
            "19. Method yang digunakan untuk mengubah seluruh huruf dalam string menjadi huruf besar/kapital adalah ...",
            "20. Tipe data untuk bilangan desimal adalah ..."

    };

    // array of multiple choices for each question
    private String multipleChoice[][] = {
            {"Primitif", "Lokal", "Global", "Kelas"},
            {"void", "public", "static", "return"},
            {"10", "5", "2", "0"},
            {"false", "10", "true", "1"},
            {"Muhammad Askar", "Askar", "James Gosling", "Rasmus Lerdorf"},
            {"boolean", "char", "byte", "String"},
            {"int", "short", "char", "String"},
            {"static", "public", "final", "protected"},
            {"public", "static", "protected", "final"},
            {"System.in", "System.err", "System.out", "System.exit"},
            {"String", "char", "boolean", "byte"},
            {"integer", "byte", "char", "boolean"},
            {"repeating", "again", "replay", "looping"},
            {"If Bersarang", "If Bercabang", "If Tunggal", "If-Then"},
            {"*", "+", "%", "Semua Benar"},
            {"3_One", "O_3ne", "S13h", "B3_Ta"},
            {"All:14", "All:10", "All: 15", "All: 9"},
            {"equal()", "concat()", "equals()", "length()"},
            {"UpperCase()", "toUperCase()", "toUpperCase()", "isUpperCase()"},
            {"int", "boolean", "float", "String"}
    };

    private String mCorrectAnswers[] = {"Lokal", "return", "5", "true", "James Gosling", "byte", "String",
            "static", "final", "System.out", "boolean", "integer", "looping", "If Bersarang",
            "Semua Benar", "3_One", "All: 9", "equals()", "toUpperCase()", "float"};

    public int getLength() {
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num - 1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
