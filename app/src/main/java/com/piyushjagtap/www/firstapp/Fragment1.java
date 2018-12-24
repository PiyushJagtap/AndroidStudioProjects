package com.piyushjagtap.www.firstapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Fragment1 extends Fragment implements View.OnClickListener {
    private final String TAG = "Fragment1";
    CustomerDataModel customerDataModel0;
//    CustomerDataModel customerDataModel1;
//    CustomerDataModel customerDataModel2;
//    CustomerDataModel customerDataModel3;
//    CustomerDataModel customerDataModel4;
//    CustomerDataModel customerDataModel5;
//    CustomerDataModel customerDataModel6;
//    CustomerDataModel customerDataModel7;
//    CustomerDataModel customerDataModel8;
//    CustomerDataModel customerDataModel9;
    //CustomerDataModel customerDataModel10;
    TextView fragmentTxtView;
    ArrayList<CustomerDataModel> customerDataModels = new ArrayList<CustomerDataModel>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");

        View view = inflater.inflate(R.layout.activity_fragment1, container, false);
        Button submitFragment = view.findViewById(R.id.submitfragmentbtn);
        submitFragment.setOnClickListener(this);
        fragmentTxtView = view.findViewById(R.id.fragmentxtview);
        customerDataModels = getCustomerData();
        Log.d(TAG, "Customer Data Model Size: " + customerDataModels.size());
        //fragmentTxtView.setText(customerDataModel.getCustomerAddress());
        //fragmentTxtView.setText(customerDataModel.getCustomerId());
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submitfragmentbtn:
//                Log.d(TAG, "Customer name is: " + customerDataModel1.getCustomerName());
//                Log.d(TAG, "Customer address is:" + customerDataModel1.getCustomerAddress());
//                Log.d(TAG, "Customer id is: " + customerDataModel1.getCustomerId());
                for(CustomerDataModel customerDataModel : customerDataModels){
                    fragmentTxtView.append(customerDataModel.getCustomerName() + "\n" +
                    customerDataModel.getCustomerAddress() + "\n" +
                    customerDataModel.getCustomerId()+"\n\n\n");
                }
//                fragmentTxtView.setText(customerDataModel0.getCustomerName() +
//                        customerDataModel0.getCustomerAddress() +
//                        customerDataModel0.getCustomerId() + "\n" +
//                        customerDataModel1.getCustomerName() +
//                        customerDataModel1.getCustomerAddress() +
//                        customerDataModel1.getCustomerId() + "\n" +
//                        customerDataModel2.getCustomerName() +
//                        customerDataModel2.getCustomerAddress() +
//                        customerDataModel2.getCustomerId() + "\n" +
//                        customerDataModel3.getCustomerName() +
//                        customerDataModel3.getCustomerAddress() +
//                        customerDataModel3.getCustomerId() + "\n" +
//                        customerDataModel4.getCustomerName() +
//                        customerDataModel4.getCustomerAddress() +
//                        customerDataModel4.getCustomerId() + "\n" +
//                        customerDataModel5.getCustomerName() +
//                        customerDataModel5.getCustomerAddress() +
//                        customerDataModel5.getCustomerId() + "\n" +
//                        customerDataModel6.getCustomerName() +
//                        customerDataModel6.getCustomerAddress() +
//                        customerDataModel6.getCustomerId() + "\n" +
//                        customerDataModel7.getCustomerName() +
//                        customerDataModel7.getCustomerAddress() +
//                        customerDataModel7.getCustomerId() + "\n" +
//                        customerDataModel8.getCustomerName() +
//                        customerDataModel8.getCustomerAddress() +
//                        customerDataModel8.getCustomerId() + "\n" +
//                        customerDataModel9.getCustomerName() +
//                        customerDataModel9.getCustomerAddress() +
//                        customerDataModel9.getCustomerId());
                break;
        }
    }

    private ArrayList<CustomerDataModel> getCustomerData() {
        ArrayList<CustomerDataModel> customerDataModels1 = new ArrayList<>();
        for (long i = 0; i<100;i++){
            customerDataModel0 = new CustomerDataModel();
            customerDataModel0.setCustomerName("Customer name : " +i);
            customerDataModel0.setCustomerAddress("Customer address : "+i);
            customerDataModel0.setCustomerId(i);
            customerDataModels1.add(customerDataModel0);
        }


//        customerDataModel1 = new CustomerDataModel();
//        customerDataModel1.setCustomerName("Suyog");
//        customerDataModel1.setCustomerAddress("Panvel");
//        customerDataModel1.setCustomerId(2);
//        customerDataModels1.add(customerDataModel1);
//
//        customerDataModel2 = new CustomerDataModel();
//        customerDataModel2.setCustomerName("Shubham");
//        customerDataModel2.setCustomerAddress("Panvel");
//        customerDataModel2.setCustomerId(3);
//        customerDataModels1.add(customerDataModel2);
//
//        customerDataModel3 = new CustomerDataModel();
//        customerDataModel3.setCustomerName("Niko");
//        customerDataModel3.setCustomerAddress("Bosnia");
//        customerDataModel3.setCustomerId(4);
//        customerDataModels1.add(customerDataModel3);
//
//        customerDataModel4 = new CustomerDataModel();
//        customerDataModel4.setCustomerName("Olof");
//        customerDataModel4.setCustomerAddress("Bosnia");
//        customerDataModel4.setCustomerId(5);
//        customerDataModels1.add(customerDataModel4);
//
//        customerDataModel5 = new CustomerDataModel();
//        customerDataModel5.setCustomerName("Gaurdian");
//        customerDataModel5.setCustomerAddress("Universe");
//        customerDataModel5.setCustomerId(6);
//        customerDataModels1.add(customerDataModel5);
//
//        customerDataModel6 = new CustomerDataModel();
//        customerDataModel6.setCustomerName("Rain");
//        customerDataModel6.setCustomerAddress("Bosnia");
//        customerDataModel6.setCustomerId(7);
//        customerDataModels1.add(customerDataModel6);
//
//        customerDataModel7 = new CustomerDataModel();
//        customerDataModel7.setCustomerName("Karrigan");
//        customerDataModel7.setCustomerAddress("Bosnia");
//        customerDataModel7.setCustomerId(8);
//        customerDataModels1.add(customerDataModel7);
//
//        customerDataModel8 = new CustomerDataModel();
//        customerDataModel8.setCustomerName("Fallen");
//        customerDataModel8.setCustomerAddress("Brazil");
//        customerDataModel8.setCustomerId(9);
//        customerDataModels1.add(customerDataModel8);
//
//
//        customerDataModel9 = new CustomerDataModel();
//        customerDataModel9.setCustomerName("Coldzera");
//        customerDataModel9.setCustomerAddress("Brazil");
//        customerDataModel9.setCustomerId(10);
//        customerDataModels1.add(customerDataModel9);
        return customerDataModels1;
    }
}
