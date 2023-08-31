package com.example.countryinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.countryinfo.databinding.ActivityCountryinfoBinding;
import com.example.countryinfo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<country> countryArrayList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        countryArrayList=new ArrayList<>();

        //veriler - kendimiz yazdık
        country almanya=new country("Almanya","Berlin",R.drawable.almanyaflag,R.drawable.almanyamap);
        country brezilya=new country("Brezilya","Brazilya",R.drawable.brezilyaflag,R.drawable.brezilyamap);
        country arjantin=new country("Arjantin","Buenos Aires",R.drawable.arjantinflag,R.drawable.arjantinmap);
        country amerika=new country("Amerika","Washington DC",R.drawable.amerikaflag,R.drawable.amerikamap);
        country avustralya=new country("Avustralya","Kanberra",R.drawable.avustralyaflag,R.drawable.avustralyamap);
        country belcika=new country("Belçika","Brüksel",R.drawable.belcikaflag,R.drawable.belcikamap);
        country birlesikkrallik=new country("Birleşik Krallık","Londra",R.drawable.birlesikkralikflag,R.drawable.birlesikkralikmap);
        country çin=new country("Çin","Pekin",R.drawable.cinflag,R.drawable.cinmap);
        country danimarka=new country("Danimarka","Kopenhag",R.drawable.danimarkaflag,R.drawable.danimarkamap);
        country ekvador=new country("Ekvador","Qutio",R.drawable.ekvadorflag,R.drawable.ekvadormap);
        country Endonezya=new country("Endonezya","Cakarta",R.drawable.endnzyaflag,R.drawable.endonezyamap);
        country fas=new country("Fas","Rabat",R.drawable.fasflag,R.drawable.fasmap);
        country fildisisahili=new country("Fildişi Sahili","Yamoussoukro",R.drawable.fildisisahiliflag,R.drawable.fildisimap);
        country fransa=new country("Fransa","Paris",R.drawable.fransaflag,R.drawable.fransamap);
        country gana=new country("Gana","Akra",R.drawable.ganaflag,R.drawable.ganamap);
        country guneykore=new country("Güney Kore","Seul",R.drawable.guneykoreflag,R.drawable.mapguneykore);
        country gurcıstan=new country("Gürcistan","Tiflis",R.drawable.gurcistanflag,R.drawable.gurcistanmap);
        country hirvatistan=new country("Hırvatistan","Zagreb",R.drawable.hirvatistanflag,R.drawable.hirvatistanmap);
        country hindistan=new country("Hindistan","Yeni Delhi",R.drawable.hindistanflag,R.drawable.hindistanmap);
        country hollanda=new country("Hollanda","Amsterdam", R.drawable.hollandaflag,R.drawable.hollandamap);
        country ırak=new country("Irak","Bağdat",R.drawable.irakflag,R.drawable.irakmap);
        country iran=new country("İran","Tahran", R.drawable.iranflag,R.drawable.iranmap);
        country irlanda=new country("İrlanda","Dublin",R.drawable.irlandaflag,R.drawable.irlandamap);
        country italya=new country("İtalya","Roma",R.drawable.italyaflag,R.drawable.italyamap);


        countryArrayList.add(almanya);
        countryArrayList.add(brezilya);
        countryArrayList.add(arjantin);
        countryArrayList.add(amerika);
        countryArrayList.add(avustralya);
        countryArrayList.add(belcika);
        countryArrayList.add(birlesikkrallik);
        countryArrayList.add(çin);
        countryArrayList.add(danimarka);
        countryArrayList.add(ekvador);
        countryArrayList.add(Endonezya);
        countryArrayList.add(fas);
        countryArrayList.add(fildisisahili);
        countryArrayList.add(fransa);
        countryArrayList.add(gana);
        countryArrayList.add(guneykore);
        countryArrayList.add(gurcıstan);
        countryArrayList.add(hirvatistan);
        countryArrayList.add(hindistan);
        countryArrayList.add(hollanda);
        countryArrayList.add(ırak);
        countryArrayList.add(iran);
        countryArrayList.add(irlanda);
        countryArrayList.add(italya);
        Comparator<country> nameComparator = new Comparator<country>() {
            @Override
            public int compare(country country1, country country2) {
                return country1.name.compareTo(country2.name);
            }
        };

        // Comparator kullanarak ArrayList'i sırala
        Collections.sort(countryArrayList, nameComparator);


        /*ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                countryArrayList.stream().map(country -> country.name).collect(Collectors.toList())

        );*/
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        countryadapter countryadapter=new countryadapter(countryArrayList);
        binding.recyclerView.setAdapter(countryadapter);




    }
}