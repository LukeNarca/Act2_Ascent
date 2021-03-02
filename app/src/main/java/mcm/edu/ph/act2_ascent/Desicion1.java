package mcm.edu.ph.act2_ascent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Desicion1 extends AppCompatActivity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desicion1);
        Intent intent = getIntent();

        Button flashlightOutcome = findViewById(R.id.btnflashlight);
        flashlightOutcome.setOnClickListener(this);
        Button axeOutcome = findViewById(R.id.btnaxe);
        axeOutcome.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
       int choice;
        Intent newshift = new Intent(this, continuation.class);
        Intent next2 = new Intent(this, continuaton2.class);

        switch (view.getId()){
            case R.id.btnflashlight:
                Intent intent = new Intent(this, continuation.class);
                startActivity(intent);
                break;
            case R.id.btnaxe:
                Intent intent1 = new Intent(this, continuaton2.class);
                startActivity(intent1);
                break;
        }
        this.startActivity(newshift);
        this.startActivity(next2);
    }

}