package com.example.assignment4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<String> {
    private Context context;
    private List<String> items;

    public CustomListAdapter(Context context, List<String> items) {
        super(context, R.layout.custom_list_item, items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.itemTextView);
        textView.setText(items.get(position));

        return convertView;
    }
}

