package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationBaseAdapter extends BaseAdapter {

    private ArrayList<Formation> formations;
    private Context context;

    public FormationBaseAdapter(ArrayList<Formation> formations, Context context) {
        this.formations = formations;
        this.context = context;
    }

    @Override
    public int getCount() {
        return formations.size();
    }

    @Override
    public Object getItem(int i) {
        return formations.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.item_formation,viewGroup, false);
        }
        TextView textViewYearEnd = view.findViewById((R.id.textViewYearEnd));
        textViewYearEnd.setText(formations.get(i).getYearEnd());

        TextView textViewDiplome = view.findViewById((R.id.textViewDiplome));
        textViewDiplome.setText(formations.get(i).getSchool());

        TextView textViewPlace = view.findViewById((R.id.textViewPlace));
        textViewPlace.setText(formations.get(i).getPlace());

        return view;

    }
}
