package com.istiaq66.andoridtask.Ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.istiaq66.andoridtask.R;

import java.util.List;

public class Onboarding_adapter extends RecyclerView.Adapter<Onboarding_adapter.OnboardingViewholder> {


    private List<Item> items;

    public Onboarding_adapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public OnboardingViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new OnboardingViewholder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_container,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OnboardingViewholder holder, int position) {

        holder.setOnboardingData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class OnboardingViewholder extends RecyclerView.ViewHolder{

        private TextView txt1,txt2;
        private ImageView img1,img2;
        public OnboardingViewholder(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
            img1 = itemView.findViewById(R.id.ubaz);
            img2 = itemView.findViewById(R.id.basket);
        }

        void setOnboardingData(Item item){
            txt1.setText(item.getTxt1());
            txt2.setText(item.getTxt2());
            img1.setImageResource(item.getImage1());
            img2.setImageResource(item.getImage2());

        }
    }
}
