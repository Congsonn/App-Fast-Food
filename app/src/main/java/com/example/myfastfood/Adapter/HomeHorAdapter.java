package com.example.myfastfood.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfastfood.Model.HomeHorModel;
import com.example.myfastfood.Model.HomeVerModel;
import com.example.myfastfood.R;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder>{

    UpdateVerticalRec updateVerticalRec;
    FragmentActivity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, FragmentActivity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "10:00 - 23:00", "5.0", "85.000vnđ"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "10:00 - 23:00", "5.0", "100.000vnđ"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "10:00 - 23:00", "5.0", "125.000vnđ"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "10:00 - 23:00", "5.0", "159.000vnđ"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"Pizza 1","10:00 - 23:00","5.0","85.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"Pizza 2","10:00 - 23:00","5.0","100.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"Pizza 3","10:00 - 23:00","5.0","125.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza 4","10:00 - 23:00","5.0","159.000vnđ"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Burger 1","10:00 - 23:00","5.0","85.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Burger 2","10:00 - 23:00","5.0","100.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Burger 3","10:00 - 23:00","5.0","125.000vnđ"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                    else if (position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries1,"Fries 1","10:00 - 23:00","5.0","85.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2,"Fries 2","10:00 - 23:00","5.0","100.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3,"Fries 3","10:00 - 23:00","5.0","125.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4,"Fries 4","10:00 - 23:00","5.0","125.000vnđ"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                    else if (position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"Ice Cream 1","10:00 - 23:00","5.0","85.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"Ice Cream 2","10:00 - 23:00","5.0","100.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"Ice Cream 3","10:00 - 23:00","5.0","125.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4,"Ice Cream 4","10:00 - 23:00","5.0","125.000vnđ"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                    else if (position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"Sandwich 1","10:00 - 23:00","5.0","85.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"Sandwich 2","10:00 - 23:00","5.0","100.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"Sandwich 3","10:00 - 23:00","5.0","125.000vnđ"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"Sandwich 4","10:00 - 23:00","5.0","125.000vnđ"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_botron);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_botron);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_botron);
                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
