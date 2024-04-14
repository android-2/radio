package com.example.radio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    RadioGroup radiogroup;

    private RadioButton  radiobuttonselected;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        radiogroup=findViewById(R.id.radiogroup);

        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected=radiogroup.getCheckedRadioButtonId();
                if(selected==-1){
                    Toast.makeText(MainActivity.this,"please select your gender",Toast.LENGTH_SHORT).show();
                }else{
                    radiobuttonselected=findViewById(selected);
                    String selectedgender=radiobuttonselected.getText().toString();
                    Toast.makeText(MainActivity.this, "your gender is "+selectedgender, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}