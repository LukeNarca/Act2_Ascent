package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pm7 extends AppCompatActivity implements View.OnClickListener{

    int storypm7 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm7);

        Button btnNext = findViewById(R.id.Btnextpls);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView3);
        Intent next = new Intent(pm7.this, Desicion1.class);

        switch (view.getId()) {
            case R.id.Btnextpls:
                if ( storypm7 == 1) {
                    Story.setText("You began to wake up you noticed that no one is around, you began to look around for answers as to why you are stranded alone.");
                    storypm7 ++;
                }
                else if ( storypm7 == 2) {
                    Story.setText("You saw a note by your side saying ");
                    storypm7++;
                }
                else if ( storypm7 == 3 ) {
                    Story.setText(" “Don’t go too deep into the forest it will draw you in, As the night goes by spirits that dwell within lurk amongst the shadows, try to survive as long as you can for it is only just the beginning.” ");
                    storypm7++;
                }
                else if ( storypm7 == 4 ) {
                    Story.setText("You started to panic and saw two items inside your tent which one will you pick. ");
                    storypm7++;
                }
                else if (storypm7== 5) {
                    startActivity(next);
                }
                break;
        }

    }

}