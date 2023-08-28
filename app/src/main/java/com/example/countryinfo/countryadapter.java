package com.example.countryinfo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countryinfo.databinding.RecyclerowBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class countryadapter extends RecyclerView.Adapter<countryadapter.countryholder> {

    ArrayList<country> countryArrayListial;
    public countryadapter(ArrayList<country> countryArrayListial){
        this.countryArrayListial=countryArrayListial;
    }



    @NonNull
    @Override
    public  countryholder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerowBinding recyclerRowBinding = RecyclerowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new countryholder(recyclerRowBinding);
    }

    @Override  // layout içinde hangi veriler gosterilecekse burada gosterilecek
    public void onBindViewHolder(countryadapter.countryholder holder, @SuppressLint("RecyclerView") int position) {

            holder.binding.test.setText(countryArrayListial.get(position).name);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(),countryinfo.class);
                Singleton singleton = Singleton.getInstance();
                singleton.setChosencountry(countryArrayListial.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });



    }

    @Override // kaçtane verinin olduğu
    public int getItemCount() {
        return countryArrayListial.size();
    }

    public class countryholder extends RecyclerView.ViewHolder{
        private RecyclerowBinding binding;
        public countryholder(RecyclerowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
