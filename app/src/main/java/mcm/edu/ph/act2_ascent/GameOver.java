package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameOver extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Button resetgame = findViewById(R.id.btnplayagain);
        resetgame.setOnClickListener(this);

    }
    @Override
    public void onClick (View view) {


        Intent restart = new Intent(GameOver.this, Splashscreen.class);

        switch (view.getId()) {
            case R.id.btnplayagain:
            startActivity(restart);
            break;
        }
    }
}