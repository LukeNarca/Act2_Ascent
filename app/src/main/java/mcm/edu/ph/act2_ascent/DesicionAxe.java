package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesicionAxe extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desicion_axe);
        Intent intent = getIntent();

        findViewById(R.id.axeforest).setOnClickListener(this);
        findViewById(R.id.lakeaxebtn).setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
        int choice;
        Intent alright = new Intent(this, AxeOutcomeForest.class);


        switch (view.getId()) {
            case R.id.axeforest:
                Intent chuy = new Intent(this, AxeOutcomeForest.class);
                startActivity(chuy);
                break;
            case R.id.lakeaxebtn:
                Intent chuy2 = new Intent(this, AxeOutcomeLake.class);
                startActivity(chuy2);
                break;
        }



    }

}