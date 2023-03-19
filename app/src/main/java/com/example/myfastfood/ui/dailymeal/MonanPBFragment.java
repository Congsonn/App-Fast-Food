package com.example.myfastfood.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfastfood.Adapter.DailyMealAdapter;
import com.example.myfastfood.Model.DailyMealModel;
import com.example.myfastfood.R;

import java.util.ArrayList;
import java.util.List;


public class MonanPBFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.mon_anpb_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Bữa sáng","30% OFF","Chúc bạn có bữa ăn ngon miệng","Bữa sáng"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Bữa trưa","20% OFF","Chúc bạn có bữa ăn ngon miệng","Bữa trưa"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Bữa tối","50% OFF","Chúc bạn có bữa ăn ngon miệng","Bữa tối"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Đồ ngọt","39% OFF","Chúc bạn có bữa ăn ngon miệng","Đồ ngọt"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffe","20% OFF","Chúc bạn có bữa ăn ngon miệng","Coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }

}