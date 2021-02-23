package com.example.mydemorecycler;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created on 2/23/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class RvlistAdapter extends RecyclerView.Adapter<RvlistAdapter.ViewHolder> {


    List<NewsBean> dataList;

    Context context;


    public RvlistAdapter(List<NewsBean> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public RvlistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.list_item_show, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(R.drawable.ic_launcher_background);
        holder.textView.setText(dataList.get(position).name);


        //   holder.linearLayout.setBackgroundColor(Color.parseColor("#ff7945"));

        GradientDrawable gd = (GradientDrawable) holder.linearLayout.getBackground();
        gd.setColor(Color.parseColor(dataList.get(position).color));
        holder.linearLayout.setBackground(gd);


    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_show);
            imageView = itemView.findViewById(R.id.iv_show);

            linearLayout = itemView.findViewById(R.id.lv_show);
        }
    }

//    public static GradientDrawable setShapeColor(int color, float[] radii) {
//        GradientDrawable drawable = new GradientDrawable();
//        drawable.setShape(GradientDrawable.RECTANGLE);
//        drawable.setCornerRadii(radii);
//        drawable.setColor(color);
//        return drawable;
//    }
}
