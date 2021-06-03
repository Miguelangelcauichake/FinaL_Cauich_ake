package com.example.final_cauich_ake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Listadaptador extends RecyclerView.Adapter<Listadaptador.ViewHolder> {

    private List<ListElemet> mData;
    private LayoutInflater mInflater;
    private Context  context;

    public Listadaptador(List<ListElemet>itemList, Context context{
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData =  itemList
    }


    @NonNull
    @Override
    public Listadaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Listadaptador.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
