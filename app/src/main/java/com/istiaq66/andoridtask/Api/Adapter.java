package com.istiaq66.andoridtask.Api;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.istiaq66.andoridtask.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products1 in a list
    private List<Model> productList;

    public Adapter(Context mCtx, List<Model> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.datamodel, null);
        return new holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        //getting the product1 of the specified position
        Model product = productList.get(position);  //position
        holder.category.setText(product.getCategoryName());
        holder.unit.setText(product.getUnitName());
        holder.name.setText(product.getName());
        holder.code.setText(product.getCode());
        holder.product_bar.setText(product.getProductBarcode());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    class holder extends RecyclerView.ViewHolder{

        TextView category,unit,name,code,product_bar;

        public holder(@NonNull View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.cat_name);
            unit = itemView.findViewById(R.id.unt_name);
            name = itemView.findViewById(R.id.name);
            code = itemView.findViewById(R.id.code);
            product_bar = itemView.findViewById(R.id.br_code);

        }
    }

}
