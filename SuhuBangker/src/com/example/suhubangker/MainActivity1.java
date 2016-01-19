package com.example.suhubangker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 
public class MainActivity1 extends Activity {
 public EditText txtCelcius;
 public EditText txtKelvin;
 public EditText txtFahren;
 public EditText txtReamur;
 public Button btnKonversi;
 public Button btnExit; 
  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1);
        txtCelcius = (EditText) findViewById(R.id.textCelcius);
        txtKelvin = (EditText) findViewById(R.id.textKelvin);
        txtFahren = (EditText) findViewById(R.id.textFahren);
        txtReamur = (EditText) findViewById(R.id.textReamur);
        btnKonversi = (Button) findViewById(R.id.buttonKonversi);
        btnExit = (Button) findViewById(R.id.buttonExit);
    }
     
    public void KonversiSuhu(View view){
     try{
      int celcius = Integer.parseInt(txtCelcius.getText().toString());
      double kelvin = celcius + 273.15;
      double fahren = celcius * 1.8 + 32;
      double reamur = celcius * 0.8;
      txtKelvin.setText(String.valueOf(kelvin));
      txtFahren.setText(String.valueOf(fahren));
      txtReamur.setText(String.valueOf(reamur));
     }catch (Exception e) {
   e.printStackTrace();
  }
    }
     
    public void keluar(View view){
     finish();
    }
}