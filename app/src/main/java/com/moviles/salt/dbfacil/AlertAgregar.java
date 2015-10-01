package com.moviles.salt.dbfacil;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;

import com.moviles.salt.dbfacil.entidades.Carro;

/**
 * Created by Diana M on 01/10/2015.
 */
public class AlertAgregar extends DialogFragment {

       MainActivity mainActivity;

    public void init(MainActivity mainActivity ){
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final EditText referencia, marca, modelo;

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Agregar Carro");
        View v;

        v = View.inflate(getActivity(),R.layout.template_alert,null);

        referencia = (EditText) v.findViewById(R.id.edit_referencia);
        marca = (EditText) v.findViewById(R.id.edit_marca);
        modelo = (EditText) v.findViewById(R.id.edit_modelo);

        builder.setView(v);

        builder.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Carro car = new Carro();

                car.setColor("rojo");
                car.setImagen("url");
                car.setMarca(marca.getText().toString());
                car.setReferencia(referencia.getText().toString());
                car.setModelo(2009);

                car.save();

                mainActivity.CargarCarros();
            }
        });

        builder.setNegativeButton("Cancelar",null);

        return builder.create();
    }
}
