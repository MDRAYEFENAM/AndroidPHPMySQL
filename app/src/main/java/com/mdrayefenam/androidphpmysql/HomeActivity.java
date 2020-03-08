package com.mdrayefenam.androidphpmysql;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("AC Service", R.drawable.battle, "#09A9FF"));
        arrayList.add(new DataModel("Fridge Service", R.drawable.beer, "#3E51B1"));
        arrayList.add(new DataModel("Geyser Service", R.drawable.ferrari, "#673BB7"));
        arrayList.add(new DataModel("Oven Service", R.drawable.jetpack_joyride, "#4BAA50"));
        arrayList.add(new DataModel("TV Servicing", R.drawable.three_d, "#F94336"));
        arrayList.add(new DataModel("Washing Machine Service", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Appliances Cleaning", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Deep Cleaning", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Furniture Cleaning", R.drawable.battle, "#09A9FF"));
        arrayList.add(new DataModel("Hourly Cleaning", R.drawable.beer, "#3E51B1"));
        arrayList.add(new DataModel("Pest Control Service", R.drawable.ferrari, "#673BB7"));
        arrayList.add(new DataModel("Water Tank Cleaning", R.drawable.jetpack_joyride, "#4BAA50"));
        arrayList.add(new DataModel("Carpentry Service", R.drawable.three_d, "#F94336"));
        arrayList.add(new DataModel("Computer Service", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Electrical Service", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Plumbing Service", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Home Shifting", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Office Shifting", R.drawable.terraria, "#0A9B88"));
        arrayList.add(new DataModel("Exterior Painting", R.drawable.battle, "#09A9FF"));
        arrayList.add(new DataModel("Interior Painting", R.drawable.beer, "#3E51B1"));
        arrayList.add(new DataModel("Other Service", R.drawable.ferrari, "#673BB7"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/

/*        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);*/


        /**
         Simple GridLayoutManager that spans two columns
         **/
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
    }

    @Override
    public void onItemClick(DataModel item) {

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();

    }
}
