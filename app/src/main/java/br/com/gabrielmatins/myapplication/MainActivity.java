package br.com.gabrielmatins.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoEnviar = findViewById(R.id.btnEnviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                intencao.putExtra("Entrada Double", 312.54);
                intencao.putExtra("Entrada String", "Ola Marilene!!");
                intencao.putExtra("Entrada Inteiro", 200);
                intencao.putExtra("Entrada Float", 30.8f);
                startActivity(intencao);
            }
        });
    }
}
