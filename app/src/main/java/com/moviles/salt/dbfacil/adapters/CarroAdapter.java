package com.moviles.salt.dbfacil.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.moviles.salt.dbfacil.R;
import com.moviles.salt.dbfacil.entidades.Carro;

import java.util.List;

/**
 * Created by Diana M on 01/10/2015.
 */
public class CarroAdapter extends BaseAdapter {

    Context context;
    List<Carro> data;

    public CarroAdapter(Context context, List<Carro> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;

        TextView txtReferencia,txtModelo,txtMarca;

        if (convertView == null)
            v = View.inflate(context, R.layout.template_adapter_carro,null);
        else
            v = convertView;

        txtReferencia = (TextView) v.findViewById(R.id.txt_referencia);
        txtMarca = (TextView) v.findViewById(R.id.txt_marca);
        txtModelo = (TextView) v.findViewById(R.id.txt_modelo);

        Carro carro = data.get(position);

        txtReferencia.setText(carro.getReferencia());
        txtMarca.setText(carro.getMarca());
        txtModelo.setText(""+carro.getModelo());

        return v;
    }
}
