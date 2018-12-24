package com.piyushjagtap.www.firstapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piyushjagtap.www.firstapp.Navigation.CustomerDataAdapter;

import java.util.ArrayList;

public class Fragment2 extends Fragment {
    CustomerDataModel customerDataModel0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment2, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        CustomerDataAdapter customerDataAdapter = new CustomerDataAdapter(getCustomerData());
        recyclerView.setHasFixedSize(true); //((RecyclerView) recyclerView).setHasFixedSize(true); this is downcasting
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(customerDataAdapter);
        return view;
    }

    private ArrayList<CustomerDataModel> getCustomerData() {
        ArrayList<CustomerDataModel> customerDataModels1 = new ArrayList<>();
        for (long i = 0; i < 100; i++) {
            customerDataModel0 = new CustomerDataModel();
            customerDataModel0.setCustomerName("Customer name : " + i);
//            customerDataModel0.setCustomerAddress("Customer address : "+i);
//            customerDataModel0.setCustomerId(i);
            customerDataModels1.add(customerDataModel0);
        }
        return customerDataModels1;
    }
}
