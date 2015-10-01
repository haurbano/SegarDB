package com.moviles.salt.dbfacil;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;

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

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Agregar Carro");

        builder.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Carro car = new Carro();


                car.save();
            }
        });

        builder.setNegativeButton("Cancelar",null);

        return builder.create();
    }
}
