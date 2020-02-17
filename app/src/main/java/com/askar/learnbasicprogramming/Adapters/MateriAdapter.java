package com.askar.learnbasicprogramming.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.askar.learnbasicprogramming.Models.Materi;
import com.askar.learnbasicprogramming.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MateriAdapter extends RecyclerView.Adapter<MateriAdapter.MyViewHolder> {

    private Context context;
    private List<Materi> materiList;

    public MateriAdapter(List<Materi> materiList) {
        this.materiList = materiList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_materi, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Materi materi = materiList.get(position);
        holder.bab.setText(materi.getBabMateri());
        holder.judul.setText(materi.getJudulMateri());
        Picasso.get().load(materi.getPhotoMateri())
                .placeholder(R.drawable.logo)
                .into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return materiList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        TextView bab, judul;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.img_list);
            bab = itemView.findViewById(R.id.bab);
            judul = itemView.findViewById(R.id.judul);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListener.onClick(view, getAdapterPosition());
                }
            });

        }
    }

    private OnClickListener onClickListener;

    public interface OnClickListener{
        void onClick(View view, int position);
    }

    public void setListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

}
