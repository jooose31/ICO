package com.example.jdavi.ico;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {
    View mView;
    public ViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

    }

    public void setDetails(Context ctx,String tarjeta,String image){
        TextView mTarjeta = mView.findViewById(R.id.rtarjeta);
        ImageView mImage = mView.findViewById(R.id.imageView);
        mTarjeta.setText(tarjeta);
        Picasso.get().load(image).into(mImage);
    }

}
