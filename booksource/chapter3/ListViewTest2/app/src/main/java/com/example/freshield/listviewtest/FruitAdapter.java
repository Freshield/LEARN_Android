package com.example.freshield.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by freshield on 31/05/17.
 */

public class FruitAdapter extends ArrayAdapter {
    private int resourceId;//the layout name

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;//get the layout name
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = (Fruit)getItem(position);//get the fruit which will show
        //get the view which will show
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        //get the imageview in the view
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        //get the textview in the view
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        //set the image and text
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}
