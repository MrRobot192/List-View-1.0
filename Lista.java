package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.io.DataOutputStream;
import java.util.List;

public class Lista extends AppCompatActivity {
    ListView listaView;
    String titulos[]={"Jack y Jill","La red social","Anabelle","Yo antes de ti","Avengers","Viaje al centro de la tierra","Oso ted 2","Conjuro 2","3 metros sobre el cielo","Focus"};
    String generos[]={"Comedia","Drama","Terror","Romance","Ficcion","Ficcion","Comedia","Terror","Romance","Accion"};
    int avatar[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_activity);
        listaView=findViewById(R.id.Lista);
        listaView.setAdapter(new Datos(this,titulos,generos,avatar));
    }
    public void RegresarM (View view){
        Intent RegM= new Intent(this,MainActivity.class);
        startActivity(RegM);

    }
}