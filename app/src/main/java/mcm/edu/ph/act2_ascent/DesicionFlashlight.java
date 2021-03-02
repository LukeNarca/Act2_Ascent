package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesicionFlashlight extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desicion_flashlight);
        Intent intent = getIntent();


        findViewById(R.id.forestflashlight).setOnClickListener(this);
        findViewById(R.id.lakeflashlight).setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
        int choice;
        Intent yawaka = new Intent(DesicionFlashlight.this, FlashlightOuctomeForest.class);
        Intent amaw = new Intent(DesicionFlashlight.this, FlashlightOuctomeForest.class);


        switch (view.getId()) {
            case R.id.forestflashlight:
                Intent next1 = new Intent(this, FlashlightOuctomeForest.class);
                startActivity(next1);
                break;
            case R.id.lakeflashlight:
                Intent next2 = new Intent(this, FlashlightOutcomeLake.class);
                startActivity(next2);
                break;
        }
        this.startActivity(yawaka);
        this.startActivity(amaw);

    }

}