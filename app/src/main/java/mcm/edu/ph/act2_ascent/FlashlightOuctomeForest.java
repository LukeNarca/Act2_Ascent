package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FlashlightOuctomeForest extends AppCompatActivity implements View.OnClickListener {

    int story = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight_ouctome_forest);

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView11);
        Intent next = new Intent(this, WinnerWinnerChickenDinner.class);

        switch (view.getId()) {
            case R.id.button6:
                if ( story == 1) {
                    Story.setText("You rushed the human shadowed figure and used the flashlight you saw that it is an evil spirit, screaming and shouting as the evil spirit walks towards you, it slapped you.");
                    story ++;
                }
                else if ( story == 2) {
                    Story.setText("You snapped out from the hallucination and came through your senses, as you began to open your eyes you realize that it was just your friend, and he was explaining that you just hallucinated because from a mysterious plant that shoots out fumes that makes you see things.");
                    story ++;
                }
                else if ( story == 3) {
                    Story.setText("As of the notes he was just pranking you to make you feel scared. They were just chilling beside the lake waiting for you to wake up because they did not want to disturb your slumber. ");
                    story ++;
                }
                else if ( story == 4) {
                    startActivity(next);
                }
                break;
        }

    }

}