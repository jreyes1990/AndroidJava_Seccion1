package com.example.seccion_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class ThirdActivity extends AppCompatActivity {
  // Captura de los elementos
  private EditText editTextPhone;
  private EditText editTextWeb;
  private ImageButton imgBtnPhone;
  private ImageButton imgBtnWeb;
  private ImageButton imgBtnCamera;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_third);
  }
}