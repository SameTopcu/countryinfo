package com.example.countryinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.example.countryinfo.databinding.RecyclerowBinding;
import com.example.countryinfo.databinding.ActivityCountryinfoBinding;

public class countryinfo extends AppCompatActivity {
    private ActivityCountryinfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCountryinfoBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        Singleton singleton = Singleton.getInstance();
        country selectedcountry=singleton.getSelectedcountry();
        binding.bayrak.setImageResource(selectedcountry.flag);
        binding.map.setImageResource(selectedcountry.showmap);
        binding.capital.setText("BAŞKENT "+selectedcountry.publicofcountry);
        binding.countryname.setText("ÜLKE "+selectedcountry.name);


    }
}