package com.geektech.hw73.fragments.fragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.hw73.R;
import com.geektech.hw73.databinding.Fragment1Binding;
import com.geektech.hw73.fragments.fragment1.Fragment1Adapter.Fragment1Adapter;
import com.geektech.hw73.fragments.fragment1.model.Fragment1Model;

import java.util.ArrayList;


public class Fragment1 extends Fragment {

    private Fragment1Binding binding;
    private Fragment1Adapter adapter = new Fragment1Adapter();
    private ArrayList<Fragment1Model> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        createList();
    }

    private void initView() {
        adapter.addItems(list);
        binding.lents.setAdapter(adapter);


    }

    private void createList() {
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
        list.add(new Fragment1Model(R.drawable.photo,"Alive", "Morrison"));
    }
}