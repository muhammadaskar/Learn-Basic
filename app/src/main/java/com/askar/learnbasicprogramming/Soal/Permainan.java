package com.askar.learnbasicprogramming.Soal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.askar.learnbasicprogramming.Home;
import com.askar.learnbasicprogramming.Models.ModelKotakAjaib;
import com.askar.learnbasicprogramming.R;

public class Permainan extends AppCompatActivity {

    ModelKotakAjaib modelKotakAjaib;

    Button buttonSatu, buttonDua, buttonTiga, buttonEmpat, buttonLima,
            buttonEnam, buttonTujuh, buttonDelapan, buttonSembilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan);

        modelKotakAjaib = new ModelKotakAjaib();

        buttonSatu = findViewById(R.id.btnSatu);
        buttonDua = findViewById(R.id.btnDua);
        buttonTiga = findViewById(R.id.btnTiga);
        buttonEmpat = findViewById(R.id.btnEmpat);
        buttonLima = findViewById(R.id.btnLima);
        buttonEnam = findViewById(R.id.btnEnam);
        buttonTujuh = findViewById(R.id.btnTujuh);
        buttonDelapan = findViewById(R.id.btnDelapan);
        buttonSembilan = findViewById(R.id.btnSembilan);

        initialComponents();

    }

    private void initialComponents() {

        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSatu.setText(String.valueOf(modelKotakAjaib.getAngkaPojokKiri_Atas()));
                getWinner();
            }
        });

        buttonDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonDua.setText(String.valueOf(modelKotakAjaib.getAngkaTengah_Atas()));
                getWinner();
            }
        });

        buttonTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonTiga.setText(String.valueOf(modelKotakAjaib.getAngkaPojokKanan_Atas()));
                getWinner();
            }
        });

        buttonEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonEmpat.setText(String.valueOf(modelKotakAjaib.getAngkaKiri_Tengah()));
                getWinner();
            }
        });

        buttonLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonLima.setText(String.valueOf(modelKotakAjaib.getAngka_Tengah()));
                getWinner();
            }
        });

        buttonEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonEnam.setText(String.valueOf(modelKotakAjaib.getAngkaKanan_Tengah()));
                getWinner();
            }
        });

        buttonTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonTujuh.setText(String.valueOf(modelKotakAjaib.getAngkaKiri_Bawah()));
                getWinner();
            }
        });

        buttonDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonDelapan.setText(String.valueOf(modelKotakAjaib.getAngkaTengah_Bawah()));
                getWinner();
            }
        });

        buttonSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSembilan.setText(String.valueOf(modelKotakAjaib.getAngkaKanan_Bawah()));
                getWinner();
            }
        });


    }

    private void getWinner() {
        modelKotakAjaib.getHitung();

        if (modelKotakAjaib.isCekWinner() == true) {
            winnerDialog();
        }
    }

    // Winner
    private void winnerDialog() {
        LayoutInflater factory = LayoutInflater.from(Permainan.this);
        final View view = factory.inflate(R.layout.winner, null);
        new AlertDialog.Builder(Permainan.this, R.style.alertDialogStyle)
                .setView(view)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(Permainan.this, Permainan.class));
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();
    }


    public void clickKembali(View view) {
        keluarDialog();
    }

    @Override
    public void onBackPressed() {
        keluarDialog();
    }

    private void keluarDialog() {
        new AlertDialog.Builder(Permainan.this, R.style.alertDialogStyle)
                .setMessage("Apakah Anda Yakin ?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(Permainan.this, Home.class));
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();
    }

    public void clickCaraMain(View view) {
        caraMainDialog();
    }

    private void caraMainDialog() {
        LayoutInflater factory = LayoutInflater.from(Permainan.this);
        final View view = factory.inflate(R.layout.cara_main, null);
        new AlertDialog.Builder(Permainan.this, R.style.alertDialogStyle)
                .setView(view)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();
    }
}
