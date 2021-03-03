package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FlashlightOutcomeLake extends AppCompatActivity implements View.OnClickListener {

    int story = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight_outcome_lake);

        Button btnNext = findViewById(R.id.button);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView12);
        Intent next = new Intent(this, WinnerWinnerChickenDinner.class);

        switch (view.getId()) {
            case R.id.button7:
                if ( story == 1) {
                    Story.setText("As you get closer to the lake, you saw 4 spirits chanting with demonic languages having an evil ritual beside the lake. ");
                    story ++;
                }
                else if ( story == 2) {
                    Story.setText("The 4 spirits found you, saying that we have been waiting for you.");
                    story ++;
                }
                else if ( story == 3) {
                    Story.setText("You started to run away scared and screaming but as soon as you look back, the shadowed figure from the woods slapped you and snapped you out of your senses only to discover that it was just your friend. ");
                }
                else if (story == 4 ) {
                    Story.setText("They were explaining that you were just hallucinating because from a mysterious plant that shoots out fumes, making you see things. ");
                }
                else if (story == 5) {
                    Story.setText("As of the notes they were just pranking you to make you feel scared.");
                    story ++;
                }
                else if ( story == 6) {
                    startActivity(next);
                }
                break;
        }

    }

}