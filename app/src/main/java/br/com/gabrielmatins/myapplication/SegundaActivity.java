package br.com.gabrielmatins.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView verDouble = findViewById(R.id.TvDouble);
        TextView verString = findViewById(R.id.TvString);
        TextView verInt = findViewById(R.id.TvInt);
        TextView verFloat = findViewById(R.id.TvFloat);

        double receberDouble = getIntent().getDoubleExtra("Entrada Double", 0.0);
        String receberString = getIntent().getStringExtra("Entrada String");
        int receberInt = getIntent().getIntExtra("Entrada Inteiro", 0);
        float receberFloat = getIntent().getFloatExtra("Entrada Float", 0.0f);

        verDouble.setText("Double: " + receberDouble);
        verString.setText("String: " + receberString);
        verInt.setText("Inteiro: " + receberInt);
        verFloat.setText(("Float: " + receberFloat));
    }
}