package com.example.appdulich.UuDai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.R;

import java.util.List;

public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.OfferViewHolder> {

    private Context context;
    private List<Offer> offerList;

    public OffersAdapter(Context context, List<Offer> offerList) {
        this.context = context;
        this.offerList = offerList;
    }

    @NonNull
    @Override
    public OfferViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.offer_item, parent, false);
        return new OfferViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferViewHolder holder, int position) {
        Offer offer = offerList.get(position);
        holder.offerTitle.setText(offer.getTitle());
        holder.offerPrice.setText("₫ " + offer.getPrice());
        holder.offerImage.setImageResource(offer.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return offerList.size();
    }

    public static class OfferViewHolder extends RecyclerView.ViewHolder {
        ImageView offerImage;
        TextView offerTitle, offerPrice;

        public OfferViewHolder(@NonNull View itemView) {
            super(itemView);
            offerImage = itemView.findViewById(R.id.offerImage);
            offerTitle = itemView.findViewById(R.id.offerTitle);
            offerPrice = itemView.findViewById(R.id.offerPrice);
        }
    }
}
