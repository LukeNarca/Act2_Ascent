package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WinnerWinnerChickenDinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_winner_chicken_dinner);
    }


    public void onClick(View v) {

        Intent restart = new Intent(this, Splashscreen.class);

        switch (v.getId()) {
            case R.id.Gobackbtn:
                startActivity(restart);
                break;
        }
    }
}