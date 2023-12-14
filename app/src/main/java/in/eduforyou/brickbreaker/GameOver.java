package in.eduforyou.brickbreaker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {

    TextView tvPoints;
    ImageView ivNewHighest;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        tvPoints = findViewById(R.id.tvPoints);
        ivNewHighest = findViewById(R.id.ivNewHighest);

        int points = getIntent().getExtras().getInt("points");

        if (points == 240){

            ivNewHighest.setVisibility(View.VISIBLE);
        }

        tvPoints.setText("" + points);
    }

    public void restart(View view) {

        Intent intent = new Intent(GameOver.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void exitGame(View view) {
        finish();
    }
}
