package com.piyushjagtap.www.firstapp.Navigation;

import android.support.annotation.NonNull;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.piyushjagtap.www.firstapp.CustomerDataModel;
import com.piyushjagtap.www.firstapp.R;

import java.util.ArrayList;

public class CustomerDataAdapter extends RecyclerView.Adapter<CustomerDataAdapter.CustomerViewHolder> {
    private final ArrayList<CustomerDataModel> CustomerDataAL;

    public CustomerDataAdapter(ArrayList<CustomerDataModel> customerData) {
        this.CustomerDataAL = customerData;
    }

    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_single_row,null,false);
        new CustomerViewHolder(v);
        return new CustomerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerViewHolder holder, int position) {
        holder.customerNameTxt.setText(CustomerDataAL.get(position).getCustomerName());
    }

    @Override
    public int getItemCount() {
        return CustomerDataAL.size();
    }

    public class CustomerViewHolder extends RecyclerView.ViewHolder {
        TextView customerNameTxt;//customerAddressTxt,customerContactTxt;
        public CustomerViewHolder(View itemView) {
            super(itemView);
            customerNameTxt = itemView.findViewById(R.id.cstsinglerowtxtview);
//            customerAddressTxt = itemView.findViewById(R.id.cstsinglerowtxtview);
//            customerContactTxt = itemView.findViewById(R.id.cstsinglerowtxtview);
        }//ViewHolder Constructor Closes here
    }//ViewHolder Class Closes here
}
