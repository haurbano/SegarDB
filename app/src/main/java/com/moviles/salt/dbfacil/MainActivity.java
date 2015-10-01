package com.moviles.salt.dbfacil;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.moviles.salt.dbfacil.adapters.CarroAdapter;
import com.moviles.salt.dbfacil.entidades.Carro;
import com.orm.SugarContext;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView listCarros;
    FloatingActionButton btnAgregar;

    List<Carro> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SugarContext.init(this);

        listCarros = (ListView) findViewById(R.id.list_carros);
        btnAgregar = (FloatingActionButton) findViewById(R.id.btn_agregar);

        CargarCarros();

        btnAgregar.setOnClickListener(this);

    }

    public void CargarCarros()
    {
        Carro car = new Carro();
        data = car.listAll(Carro.class);
        CarroAdapter adapter = new CarroAdapter(this,data);
        listCarros.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        AlertAgregar alertAgregar = new AlertAgregar();
        alertAgregar.init(this);
        alertAgregar.show(getFragmentManager(),"hola");
    }
}
