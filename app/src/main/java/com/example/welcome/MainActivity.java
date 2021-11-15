package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {
    Button reset;
    Button test;
    Button play;
    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = (Button) findViewById(R.id.reset);
        test = (Button) findViewById(R.id.test);
        play = (Button) findViewById(R.id.play);
        nome = (EditText) findViewById(R.id.nome);
    }

    public void resetGame (View v){
        nome.setText("");
    }

    public void test (View v){
        Toast t = Toast.makeText(getApplicationContext(), nome.getText(), Toast.LENGTH_LONG);
        t.show();
    }

    public void playSecondary(View v) {
        Intent i = new Intent(getApplicationContext(), secondary.class);
        i.putExtra("name", nome.getText());
        startActivity(i);
    }
}