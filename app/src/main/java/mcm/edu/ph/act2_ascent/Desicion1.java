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

        findViewById(R.id.btnflashlight).setOnClickListener(this);
        findViewById(R.id.btnaxe).setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
       int choice;
        TextView Story = findViewById(R.id.textView);
        Intent next = new Intent(Desicion1.this, continuation.class);

        switch (view.getId()) {
            case R.id.btnflashlight:
                Intent intent = new Intent(this, continuation.class);
                startActivity(intent);
                break;
            case R.id.btnaxe:
                Intent intent1 = new Intent(this, continuaton2.class);
                startActivity(intent1);
                break;
        }
        this.startActivity(next);
    }

}