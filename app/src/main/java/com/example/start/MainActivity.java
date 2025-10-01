package com.example.start;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tekstas;
    Button TxtKeitimas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tekstas = findViewById(R.id.txt);
        Button TxtKeitimas = findViewById(R.id.btnChangeTxt);

        String[] texts = {"Labas, pasauli!", "Hello World!", "¡Hola, mundo!", "Hallo, Welt!", "Pozdrav, svet!"};
        final int[] index = {0};

        TxtKeitimas.setOnClickListener(v -> {
            tekstas.setText(texts[index[0]]);
            index[0] = (index[0] + 1) % texts.length;

        });
    }
}