package com.example.covid_19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class myCustomAdapter extends ArrayAdapter<CountryModel> {

    private Context context;
    private List<CountryModel> countryModelList;


    public myCustomAdapter( Context context , List<CountryModel> countryModelList) {
        super ( context , R.layout.list_custom_item,countryModelList );

        this.context = context;
        countryModelList = countryModelList;


    }

    @NonNull
    @Override
    public View getView(int position , @Nullable View convertView , @NonNull ViewGroup parent) {

        View  view  = LayoutInflater.from(parent.getContext ()).inflate(R.layout.list_custom_item,null,true);
        TextView tvCountryName = view.findViewById ( R.id.tvCountryName );
        ImageView imageView = view.findViewById ( R.id.imgFlag );

        tvCountryName.setText ( countryModelList.get ( position ).getCountry () );
        Glide.with ( context).load ( countryModelList.get(position).getFlags ()).into ( imageView ) ;




        return view;
    }
}
