package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class continuaton2 extends AppCompatActivity implements View.OnClickListener{

    int storymain = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continuaton2);

        Button btnNext = findViewById(R.id.buttoncontinuation2);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView7);
        Intent next = new Intent(continuaton2.this, DesicionAxe.class);

        switch (view.getId()) {
            case R.id.buttoncontinuation2:
                if ( storymain == 1) {
                    Story.setText("You began to rush outside your tent and saw a post with another note on it that says");
                    storymain ++;
                }
                else if ( storymain == 2) {
                    Story.setText(" ” Wander as you please but tread carefully as the spirits will be released, head to the lake and sense it shall make.” ");
                    storymain++;
                }

                else if ( storymain == 3 ) {
                    Story.setText("(You saw a human shadowed figure inside the forest and a lit torch from the path to the lake.)");
                    storymain++;
                }
                else if (storymain == 4 ) {
                    startActivity(next);
                }
                break;
        }

    }

}