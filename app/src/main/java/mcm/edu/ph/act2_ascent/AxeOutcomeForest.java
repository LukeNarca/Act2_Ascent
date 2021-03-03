package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AxeOutcomeForest extends AppCompatActivity implements View.OnClickListener {

    int story = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axe_outcome_forest);

        findViewById(R.id.button2).setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView5);
        Intent bago = new Intent(AxeOutcomeForest.this, GameOver.class);

        switch (view.getId()) {
            case R.id.button2:
                if ( story == 1) {
                    Story.setText("You began to rush the entity and began bashing its head with your axe only to realize that it was your friend who is now dead.");
                    story ++;
                }
                else if ( story == 2) {
                    Story.setText("Confused and scared all you can do is run away. ");
                    story ++;
                }
                else if ( story == 3) {
                    startActivity(bago);
                }
                break;
        }


    }

}