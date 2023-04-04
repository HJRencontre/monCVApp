package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {

    private ArrayList<Projet> projets;
    private Context context;

    public ProjetBaseAdapter(ArrayList<Projet> projets, Context context) {
        this.projets = projets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int i) {
        return projets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_projets,viewGroup,false);
        }
        TextView textViewProjet = view.findViewById(R.id.textViewProjet);
        textViewProjet.setText(projets.get(i).getProjet());

        TextView textViewDescProjet = view.findViewById(R.id.textViewDescProjet);
        textViewDescProjet.setText(projets.get(i).getDescProjet());

        return view;
    }
}
