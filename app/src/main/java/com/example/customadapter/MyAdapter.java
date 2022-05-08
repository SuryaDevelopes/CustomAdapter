package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    private String[] arr;
    public MyAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr=arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_adapter_layout,parent,false);
        Button b=convertView.findViewById(R.id.button);
        b.setText(getItem(position));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
