package com.example.fragnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        EditText et = findViewById(R.id.et);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dataText = et.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("data", dataText);

                Fragment_data data = new Fragment_data();
                data.setArguments(bundle);

                FragmentManager fragmentmanager = getSupportFragmentManager();
                FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
                fragmenttransaction.replace(R.id.frag, data);

                fragmenttransaction.commit();








            }
        });

    }
}