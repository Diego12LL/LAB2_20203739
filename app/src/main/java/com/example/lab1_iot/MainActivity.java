package com.example.lab1_iot;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] colores = {R.color.color1, R.color.color2, R.color.color3};

        final int[] colorIndex = {0};

        TextView textView = findViewById(R.id.textView2);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(getResources().getColor(colores[colorIndex[0]]));

                colorIndex[0]++;

                if (colorIndex[0] >= colores.length) {
                    colorIndex[0] = 0;
                }
            }
        });

        Button buttonIndicaciones = findViewById(R.id.button);
        buttonIndicaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IndicacionesActivity.class);
                startActivity(intent);
            }
        });

        Button buttonCalcular = findViewById(R.id.button2);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalcularActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId() == R.id.textView2) {
            getMenuInflater().inflate(R.menu.context_menu, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        TextView textViewTeleMath = findViewById(R.id.textView2);
        int colorResId;


        return true;
    }

}
