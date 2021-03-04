package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class Splashscreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button startgame = findViewById(R.id.btnstart);
        startgame.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent next = new Intent(Splashscreen.this, startmonolouge.class);

        switch (v.getId()) {
            case R.id.btnstart:
                startActivity(next);
                break;
        }


    }
}