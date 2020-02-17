package com.askar.learnbasicprogramming.Soal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.askar.learnbasicprogramming.R;
import com.askar.learnbasicprogramming.Soal.SoalPilihanGanda.QuizActivity;

public class MulaiSoal extends AppCompatActivity {

    Button buttonMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_soal);

        buttonMulai = findViewById(R.id.btn_mulai);

        buttonMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MulaiSoal.this, QuizActivity.class));
                finish();
            }
        });
    }
}
