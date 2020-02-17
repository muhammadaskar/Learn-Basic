package com.askar.learnbasicprogramming.Soal.SoalPilihanGanda;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.askar.learnbasicprogramming.Home;
import com.askar.learnbasicprogramming.R;
import com.askar.learnbasicprogramming.Soal.Soal;

public class QuizActivity extends AppCompatActivity {

    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mScoreView;   // Untuk menampilkan skor saat ini
    private TextView mQuestionView;  //menampilkan jawaban
    private Button mButtonChoice1; // jawaban 1
    private Button mButtonChoice2; // jawaban 2
    private Button mButtonChoice3; //jawaban 3
    private Button mButtonChoice4; //jawaban 4

    private String mAnswer;  // untuk cek jawaban benar atau tidaknya
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; //

    TextView textViewTimer;
    private CountDownTimer countDownTimer;
    private long timeLeftMillSecond = 1500000;
    private boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textViewTimer = findViewById(R.id.tv_timer);

        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        updateQuestion();

        updateScore(mScore);

        starTimer();
        updateTimer();
    }

    private void updateQuestion() {
        if (mQuestionNumber < mQuestionLibrary.getLength()) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber, 4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {
            nextDialog();
        }
    }

    private void starTimer() {
        countDownTimer = new CountDownTimer(timeLeftMillSecond, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftMillSecond = l;
                updateTimer();
            }

            @Override
            public void onFinish() {
                textViewTimer.setText("00:00");
                alertTimeIsUp();
            }
        }.start();
        timerRunning = true;
    }

    private void updateTimer() {
        int menit = (int) timeLeftMillSecond / 60000;
        int detik = (int) timeLeftMillSecond % 60000 / 1000;

        String timeLeftText;

        timeLeftText = "" + menit;
        timeLeftText += ":";
        if (detik < 10) {
            timeLeftText += "0";
        }
        timeLeftText += detik;
        textViewTimer.setText(timeLeftText);
    }

    private void alertTimeIsUp() {
        LayoutInflater factory = LayoutInflater.from(QuizActivity.this);
        final View view = factory.inflate(R.layout.waktu_habis, null);
        new AlertDialog.Builder(QuizActivity.this, R.style.alertDialogStyle)
                .setCancelable(false)
                .setView(view)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(QuizActivity.this, HighestScoreActivity.class);
                        intent.putExtra("score", mScore); // pass the current score to the second screen
                        startActivity(intent);
                        finish();
                    }
                }).show();
    }

    private void updateScore(int point) {
//        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer) {
            mScore = mScore + 5;
//            Toast.makeText(QuizActivity.this, "Benar!", Toast.LENGTH_SHORT).show();
        } else
//            Toast.makeText(QuizActivity.this, "Salah!", Toast.LENGTH_SHORT).show();
            updateScore(mScore);
        updateQuestion();
    }

    private void nextDialog() {
        LayoutInflater factory = LayoutInflater.from(QuizActivity.this);
        final View view = factory.inflate(R.layout.sample, null);
        new AlertDialog.Builder(QuizActivity.this, R.style.alertDialogStyle)
                .setView(view)
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(QuizActivity.this, HighestScoreActivity.class);
                        intent.putExtra("score", mScore); // pass the current score to the second screen
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
    }

    private void exitDialog() {
        LayoutInflater factory = LayoutInflater.from(QuizActivity.this);
        final View view = factory.inflate(R.layout.warning, null);
        new AlertDialog.Builder(QuizActivity.this, R.style.alertDialogStyle)
                .setView(view)
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(QuizActivity.this, Soal.class));
                        finish();
                    }
                })
                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
    }

    @Override
    public void onBackPressed() {
        exitDialog();
    }
}
