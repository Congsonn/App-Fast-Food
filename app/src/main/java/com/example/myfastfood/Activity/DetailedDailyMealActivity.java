package com.example.myfastfood.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myfastfood.Adapter.DetailedDailyAdapter;
import com.example.myfastfood.Model.DetailedDailyModel;
import com.example.myfastfood.R;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("Bữa sáng")) {

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("Đồ ngọt")) {

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Bữa sáng","description","4.8","30.000","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }


    }
}