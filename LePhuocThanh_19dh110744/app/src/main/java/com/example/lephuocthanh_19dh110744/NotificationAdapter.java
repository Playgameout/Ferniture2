package com.example.lephuocthanh_19dh110744;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationVH> {
    ArrayList<Furniture> arrayList;

    public NotificationAdapter(ArrayList<Furniture> arrayList) {

        this.arrayList = arrayList;


    }
    @NonNull
    @Override
    public NotificationVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item,parent,false);
        return new NotificationVH(view);
    }
    @Override
    public void onBindViewHolder(@NonNull NotificationVH holder, int position) {

        Furniture furniture=arrayList.get(position);
        holder.txtName.setText(furniture.name);
        holder.txtDescription.setText(furniture.des);
        holder.imgFurniture.setImageResource(furniture.image);

    }
    @Override
    public int getItemCount() {

        return arrayList.size();
    }
    class NotificationVH extends RecyclerView.ViewHolder {
        TextView txtName, txtDescription;
        ImageView imgFurniture;

        public NotificationVH(@NonNull View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.txtName);
            txtDescription=itemView.findViewById(R.id.txtDescription);
            imgFurniture=itemView.findViewById(R.id.imageFurniture);
        }
    }
}
