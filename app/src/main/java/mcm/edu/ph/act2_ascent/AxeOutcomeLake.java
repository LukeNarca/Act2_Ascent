package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AxeOutcomeLake extends AppCompatActivity implements View.OnClickListener {

    int story = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axeoutcome_lake);

        findViewById(R.id.button3).setOnClickListener(this);


    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView6);
        Intent next = new Intent(AxeOutcomeLake.this, GameOver.class);

        switch (view.getId()) {
            case R.id.button3:
                if ( story == 1) {
                    Story.setText("As you get closer to the lake, you saw 4 spirits chanting with demonic languages having an evil ritual beside the lake. ");
                    story ++;
                }
                else if ( story == 2) {
                    Story.setText("You snuck up to them and started to go berserk to kill the 4 spirits only to realize they were just your friends. ");
                    story ++;
                }
                else if ( story == 3) {
                    Story.setText("The Shadowed figure was one of your friends and witnessed the whole massacre. ");
                }
                else if ( story == 7) {
                    startActivity(next);
                }
                break;
        }

    }

}