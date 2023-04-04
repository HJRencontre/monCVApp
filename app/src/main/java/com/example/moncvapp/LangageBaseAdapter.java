package com.example.moncvapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LangageBaseAdapter extends BaseAdapter {

    private ArrayList<Langage> langages;
    private Context context;

    public LangageBaseAdapter(ArrayList<Langage> langages, Context context) {
        this.langages = langages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return langages.size();
    }

    @Override
    public Object getItem(int i) {
        return langages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_langage, viewGroup,false);
        }
        TextView textViewLangage = view.findViewById(R.id.textViewLangage);
        textViewLangage.setText(langages.get(i).getLangage());

        TextView textViewNiveauLangage = view.findViewById(R.id.textViewNiveauLangage);
        textViewNiveauLangage.setText(langages.get(i).getNiveau());

        return view;
    }
}
