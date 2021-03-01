package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DesicionAxe extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desicion_axe);

        Button Flashlightoutcome = findViewById(R.id.btnflashlight);
        Button Axeoutcome = findViewById(R.id.btnaxe);
        Flashlightoutcome.setOnClickListener((View.OnClickListener) this);
        Axeoutcome.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick (View view) {
        int choice;
        Intent Out1 = new Intent(DesicionAxe.this, continuation.class);

        switch (view.getId()) {
            case R.id.forestflashlightbtn:
                Intent next1 = new Intent(DesicionAxe.this, AxeOutcomeForest.class);
                startActivity(next1);


            case R.id.lakeflashlightbtn:
                Intent next = new Intent(DesicionAxe.this, AxeOutcomeLake.class);
                startActivity(next);
                break;
        }

    }

}