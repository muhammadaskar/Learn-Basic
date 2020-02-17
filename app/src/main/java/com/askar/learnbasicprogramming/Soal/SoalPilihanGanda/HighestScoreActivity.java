package com.askar.learnbasicprogramming.Soal.SoalPilihanGanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.askar.learnbasicprogramming.R;

public class HighestScoreActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textViewKata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        TextView txtScore = findViewById(R.id.textScore);
        imageView = findViewById(R.id.imgView);
        textViewKata = findViewById(R.id.kata);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        if (score < 50){
            imageView.setImageResource(R.drawable.sad);
            textViewKata.setText("Semangat Belajar Terus");
        } else {
            imageView.setImageResource(R.drawable.happy);
            textViewKata.setText("Jangan Cepat Puas");
        }
        txtScore.setText("Skor Anda: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore", 0);
//        if (highscore >= score)
//            txtHighScore.setText("High score: " + highscore);
//        else {
//            txtHighScore.setText("New highscore: " + score);
//            SharedPreferences.Editor editor = mypref.edit();
//            editor.putInt("highscore", score);
//            editor.commit();
//        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighestScoreActivity.this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}
