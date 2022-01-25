package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ValutaListAdapter extends ArrayAdapter {


    private final Activity context;
    private final Integer[] imageArray;
    private final String[] symArray;
    private final String[] teljesArray;
    private final double[] buyArray;
    private final double[] sellArray;


    public ValutaListAdapter(Activity context, Integer[] imageArray, String[] symArray, String[] teljesArray, double[] buyArray, double[] sellArray) {
        super(context, R.layout.listview_row2, symArray);
        this.context = context;
        this.imageArray = imageArray;
        this.symArray = symArray;
        this.teljesArray = teljesArray;
        this.buyArray = buyArray;
        this.sellArray = sellArray;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row2, null, true);

        ImageView img = rowView.findViewById(R.id.valutakep);
        TextView sym = rowView.findViewById(R.id.valutasym);
        TextView teljes = rowView.findViewById(R.id.valutateljes);
        TextView vasar = rowView.findViewById(R.id.vasarid);
        TextView elad = rowView.findViewById(R.id.eladid);

        img.setImageResource(imageArray[position]);
        sym.setText(symArray[position]);
        teljes.setText(teljesArray[position]);
        vasar.setText(String.format("%,.4f", buyArray[position]));
        elad.setText(String.format("%,.4f", sellArray[position]));

        return rowView;
    }
}