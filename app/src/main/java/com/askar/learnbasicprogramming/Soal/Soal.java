package com.askar.learnbasicprogramming.Soal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.askar.learnbasicprogramming.R;
import com.askar.learnbasicprogramming.Soal.SoalPilihanGanda.QuizActivity;

public class Soal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
    }

    public void clickLatihanSoal(View view) {

    }

    public void clickSoal(View view) {
        startActivity(new Intent(Soal.this, MulaiSoal.class));
        finish();
    }

    public void clickBack(View view) {
        onBackPressed();
    }
}
