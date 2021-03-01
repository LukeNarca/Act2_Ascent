package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pm3 extends AppCompatActivity implements View.OnClickListener{

    int storymain = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm3);

        Button btnNext = findViewById(R.id.btnnext);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        TextView Story = findViewById(R.id.textView2);
        Intent next = new Intent(pm3.this, pm7.class);

        switch (view.getId()) {
            case R.id.btnnext:
                if ( storymain == 1) {
                    Story.setText("You were camping with your friends in the middle of the woods.");
                    storymain ++;
                }
                else if ( storymain == 2) {
                    Story.setText("Wandering through the forest, you saw a mysterious plant that releases out fumes and suddenly you felt drowsy and so you went to your tent to sleep. ");
                    storymain++;
                }

                else if ( storymain == 3 ) {
                    startActivity(next);
                }
                break;
        }

    }

}