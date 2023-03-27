package com.example.seccion_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Button btn;
  private final String GREETER = "Hello from the other side!";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btn = (Button) findViewById(R.id.buttonMain);

    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        //Acceder al segundo Activity y mandarle un String
        Intent intent = new Intent(MainActivity.this, SecondActivity.class); //Creamos Intent
        intent.putExtra("greeter2", GREETER); //Aniadimos Intent
        startActivity(intent); //Lanzamos Intent

        //Toast.makeText(MainActivity.this, "Button Clicked from the code!...", Toast.LENGTH_SHORT).show();
      }
    });
  }

}