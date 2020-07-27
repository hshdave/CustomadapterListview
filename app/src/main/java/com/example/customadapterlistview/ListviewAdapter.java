package com.example.customadapterlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter {

    Context context;
    ArrayList<Pokemon> pokemonArrayList;

    LayoutInflater inflater;


    public ListviewAdapter(Context context, ArrayList<Pokemon> pokemonArrayList) {
        this.context = context;
        this.pokemonArrayList = pokemonArrayList;
    }

    @Override
    public int getCount() {
        return pokemonArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return pokemonArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.cutomview,parent,false);
        }

        ImageView pimgv = convertView.findViewById(R.id.p_imgv);
        TextView textView = convertView.findViewById(R.id.p_txtV);

        Picasso.get().load(pokemonArrayList.get(position).getImage()).into(pimgv);
        textView.setText(pokemonArrayList.get(position).getName());

        return convertView;
    }
}
