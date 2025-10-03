package com.example.start;

import android.graphics.Color;
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
        Button txtKeitimas = findViewById(R.id.btnChangeTxt);
        Button spalvosKeitimas = findViewById(R.id.btnChangeColor);

        String[] tekstai = {"Labas, pasauli!", "Hello World!", "¡Hola, mundo!", "Hallo, Welt!", "Pozdrav, svet!"};
        final int[] index = {0};

        txtKeitimas.setOnClickListener(v -> {
            tekstas.setText(tekstai[index[0]]);
            index[0] = (index[0] + 1) % tekstai.length;

        });

        int[] spalvos = {Color.YELLOW, Color.GREEN, Color.RED, Color.BLUE, Color.CYAN};
        final int[] colorIndex = {0};

        spalvosKeitimas.setOnClickListener(v -> {
            tekstas.setTextColor(spalvos[colorIndex[0]]);
            colorIndex[0] = (colorIndex[0] + 1) % spalvos.length;
        });
    }
}