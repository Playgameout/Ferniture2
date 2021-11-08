package com.example.lephuocthanh_19dh110744;

import android.location.GnssAntennaInfo;
import android.net.sip.SipAudioCall;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFurnitureAdapter extends RecyclerView.Adapter<HomeFurnitureAdapter.HomeFurnitureVH> {

    ArrayList<Furniture> arrayList;
    Listener listener;
    public HomeFurnitureAdapter(ArrayList<Furniture> arrayList,Listener listener) {

        this.arrayList = arrayList;
        this.listener=listener;

    }
    @NonNull
    @Override
    public HomeFurnitureVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.layout_item,parent,false);
        return new HomeFurnitureVH(view);
    }
    @Override
    public void onBindViewHolder(@NonNull HomeFurnitureVH holder, int position) {

        Furniture furniture=arrayList.get(position);
        holder.txtName.setText(furniture.name);
        holder.txtDescription.setText(furniture.des);
        holder.imgFurniture.setImageResource(furniture.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.Onclick(furniture);
            }
        });
    }
    @Override
    public int getItemCount() {

        return arrayList.size();
    }
    class HomeFurnitureVH extends RecyclerView.ViewHolder{
        TextView txtName, txtDescription;
        ImageView imgFurniture;

        public HomeFurnitureVH(@NonNull View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.txtName);
            txtDescription=itemView.findViewById(R.id.txtDescription);
            imgFurniture=itemView.findViewById(R.id.imageFurniture);
        }
    }
    interface Listener{
        void Onclick(Furniture furniture);

    }
}
