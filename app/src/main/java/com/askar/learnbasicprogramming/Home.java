package com.askar.learnbasicprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.askar.learnbasicprogramming.Soal.Permainan;
import com.askar.learnbasicprogramming.Soal.Soal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Home extends AppCompatActivity {

    TextView textViewTime;
    Date date;
    String status = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewTime = findViewById(R.id.tvTime);
        DateFormat dateFormat = new SimpleDateFormat("HH");
        //get current date time with Date()
        date = new Date();
        System.out.println(dateFormat.format(date));


        Double waktu = Double.parseDouble(dateFormat.format(date));

        if (waktu > 6 && waktu <= 10){
            status = "Selamat Pagi";
        } else if (waktu > 10 && waktu < 15){
            status = "Selamat Siang";
        } else if (waktu >= 15 && waktu <= 18){
            status = "Selamat Sore";
        } else if (waktu > 18 && waktu <= 24){
            status = "Selamat Malam";
        } else {
            status = "Jangan Lupa Istirahat";
        }

        textViewTime.setText(status);

    }

    public void clickMateri(View view) {
        startActivity(new Intent(Home.this, Materi.class));
    }

    public void clickSoal(View view) {
        startActivity(new Intent(Home.this, Soal.class));
    }

    public void clickPermainan(View view) {
        startActivity(new Intent(Home.this, Permainan.class));
    }

    public void clickTentang(View view) {
        startActivity(new Intent(Home.this, Tentang.class));
    }

    @Override
    public void onBackPressed() {
        exitDialog();
    }

    public void clickKI(View view) {
        startActivity(new Intent(Home.this, KompetensiInti.class));
    }

    public void clickTujuan(View view) {
        startActivity(new Intent(Home.this, Tujuan.class));
    }

    public void clickExit(View view) {
        exitDialog();
    }

    private void exitDialog(){
        LayoutInflater factory = LayoutInflater.from(Home.this);
        final View view = factory.inflate(R.layout.warningmerah, null);
        new AlertDialog.Builder(Home.this, R.style.alertDialogStyle)
                .setView(view)
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                })
                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
    }
}


