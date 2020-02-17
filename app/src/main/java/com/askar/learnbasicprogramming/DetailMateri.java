package com.askar.learnbasicprogramming;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.askar.learnbasicprogramming.Models.Materi;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import static com.askar.learnbasicprogramming.Materi.KEY;

public class DetailMateri extends YouTubeBaseActivity {

    ImageView imgView;
    TextView textViewBab, textViewJudul, textViewIsi;
    Button buttonPlay;
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi);

        imgView = findViewById(R.id.detailImg);
        textViewBab = findViewById(R.id.detailBab);
        textViewJudul = findViewById(R.id.detailJudul);
        textViewIsi = findViewById(R.id.detailIsi);
        buttonPlay = findViewById(R.id.buttonPlay);
        youTubePlayerView = findViewById(R.id.youTubeView);
        getDetail();
    }

    private void getDetail(){
        final Materi materi = (Materi) getIntent().getParcelableExtra(KEY);
        if (materi != null){
            Picasso.get().load(materi.getPhotoMateri()).into(imgView);
            textViewBab.setText(materi.getBabMateri());
            textViewJudul.setText(materi.getJudulMateri());
            textViewIsi.setText(materi.getIsiMateri());
            buttonPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    playVideo(materi.getVideo(), youTubePlayerView);
                }
            });
        }
    }

    public void playVideo(final String videoId, YouTubePlayerView youTubePlayerView){
        youTubePlayerView.initialize("AIzaSyCHOuiSqghikS-DnJotmw-c1eqp6CQ-6BI", new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cueVideo(videoId);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(DetailMateri.this, "Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
