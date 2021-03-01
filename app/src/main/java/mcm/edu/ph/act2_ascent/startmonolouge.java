package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class startmonolouge extends AppCompatActivity implements View.OnClickListener {

    int story = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startmonolouge);

        Button btnNext = findViewById(R.id.button);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView4);
        Intent next = new Intent(startmonolouge.this, pm3.class);

        switch (view.getId()) {
            case R.id.button:
                if ( story == 1) {
                    Story.setText("A tale so epic and intense you may not see the world the same way again");
                    story ++;
                }
                else if ( story == 2) {
                    Story.setText("no seriously do you really want to continue? ");
                   story ++;
                }
                else if ( story == 3) {
                    Story.setText("i mean there are other stories worth telling you know");
                    story ++;
                }
                else if ( story == 4) {
                    Story.setText("Really? you still wanna go? I heard the latest episode of WandaVision is out now.");
                    story++;
                }
                 else if ( story == 5) {
                    Story.setText("I heard Kurama dies in Boruto and Sauske's Rinnegan gone");
                    story++;
                }
                else if ( story == 6) {
                    Story.setText("Alright alright I'll tell you the story jeez, and they say im a push over");
                    story++;
                }
                 else if ( story == 7) {
                    startActivity(next);
                }
                break;
        }

    }

}