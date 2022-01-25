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

public class AnimalListAdapter  extends ArrayAdapter {

    private final Activity context;
    private final String[] nameArray;
    private final String[] infoArray;
    private final Integer[] imageArray;

    public AnimalListAdapter(Activity context, String[] nameArray, String[] infoArray, Integer[] imageArray) {
        super(context, R.layout.listview_row, nameArray);
        this.context = context;
        this.nameArray = nameArray;
        this.infoArray = infoArray;
        this.imageArray = imageArray;
    }
  @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);
        TextView nev = rowView.findViewById(R.id.nev);
        TextView leiras = rowView.findViewById(R.id.leiras);
        ImageView kep = rowView.findViewById(R.id.kep);

        nev.setText(nameArray[position]);
        leiras.setText(infoArray[position]);
        kep.setImageResource(imageArray[position]);

        return rowView;
    }



}
