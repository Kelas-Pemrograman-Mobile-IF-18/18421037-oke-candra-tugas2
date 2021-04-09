package com.chandra.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TxtTampil, TxtJudul;
    EditText EdtNama, EdtEmail, EdtProdi, EdtFakultas;
    Button BtnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtJudul = (TextView) findViewById(R.id.TxtJudul);
        TxtJudul.setText("Data Diri");
        TxtTampil = (TextView) findViewById(R.id.TxtTampil);

        EdtEmail = (EditText) findViewById(R.id.EdtEmail);
        EdtNama = (EditText) findViewById(R.id.EdtNama);
        EdtFakultas = (EditText) findViewById(R.id.EdtFakultas);
        EdtProdi = (EditText) findViewById(R.id.EdtProdi);
        BtnSubmit = (Button) findViewById(R.id.BtnSubmit);

        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strEmail = EdtEmail.getText().toString();
                String strNama = EdtNama.getText().toString();
                String strFakultas = EdtFakultas.getText().toString();
                String strProdi = EdtProdi.getText().toString();
                TxtTampil.setText(strEmail + "\n" + strNama + "\n" + strProdi+ "\n" + strProdi);
            }
        });
    }
}