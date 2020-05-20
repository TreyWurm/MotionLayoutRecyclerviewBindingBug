package com.example.motionlayoutrvbinding;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.PlanetViewHolder> {
    public SimpleAdapter(Context context) {
    }

    @Override
    public SimpleAdapter.PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_test, parent, false);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.PlanetViewHolder holder, int position) {
        Log.e("SimpleAdapter", "onBindViewHolder pos: " + position);
        holder.tvText.setText(String.valueOf(position));
    }

    @Override
    public void onViewRecycled(@NonNull PlanetViewHolder holder) {
        Log.e("SimpleAdapter", "onViewRecycled pos: " + holder.getAdapterPosition());
        super.onViewRecycled(holder);
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public static class PlanetViewHolder extends RecyclerView.ViewHolder {

        protected TextView tvText;

        public PlanetViewHolder(View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
        }
    }
}