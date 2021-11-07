package com.geektech.hw73.fragments.fragment1.Fragment1Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw73.databinding.RecyclerViewItemBinding;
import com.geektech.hw73.fragments.fragment1.model.Fragment1Model;

import java.util.ArrayList;

public class Fragment1Adapter extends RecyclerView.Adapter<Fragment1Adapter.ViewHolder> {

    private ArrayList<Fragment1Model> list = new ArrayList<>();
    private RecyclerViewItemBinding binding;

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = RecyclerViewItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    public void addItems(ArrayList<Fragment1Model> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private @NonNull
        RecyclerViewItemBinding binding = RecyclerViewItemBinding.bind(itemView);

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void onBind(Fragment1Model fragment1Model) {
            binding.avatar.setImageResource(fragment1Model.getPhoto());
            binding.deadOrAlive.setText(fragment1Model.getDeadOrAlive());
            binding.nameAndSurname.setText(fragment1Model.getNameAndSurname());
        }
    }
}
