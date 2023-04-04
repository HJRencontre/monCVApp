package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExperienceBaseAdapter extends BaseAdapter {

    private ArrayList<Experience> experiences;
    private Context context;

    public ExperienceBaseAdapter(ArrayList<Experience> experiences, Context context) {
        this.experiences = experiences;
        this.context = context;
    }

    @Override
    public int getCount() {
        return experiences.size();
    }

    @Override
    public Object getItem(int i) {
        return experiences.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_experience, viewGroup, false);
        }
        TextView textViewUYearStart = view.findViewById(R.id.textViewYearStart);
        textViewUYearStart.setText(experiences.get(i).getYearStart());

        TextView textViewYearEnd = view.findViewById(R.id.textViewYearEnd);
        textViewYearEnd.setText(experiences.get(i).getYearEnd());

        TextView textViewCompany = view.findViewById(R.id.textViewCompany);
        textViewCompany.setText(experiences.get(i).getCompany());

        TextView textViewDescription = view.findViewById(R.id.textViewDescription);
        textViewDescription.setText(experiences.get(i).getDescription());

        return view;
    }
}
