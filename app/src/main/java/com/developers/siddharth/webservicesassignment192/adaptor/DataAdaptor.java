package com.developers.siddharth.webservicesassignment192.adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.developers.siddharth.webservicesassignment192.R;
import com.developers.siddharth.webservicesassignment192.models.DataHandler;

import java.util.List;

/**
 * Created by siddharth on 7/20/2017.
 */

public class DataAdaptor extends RecyclerView.Adapter<DataAdaptor.ViewHolder> {

    Context context;
    List<DataHandler> data;
    ClickListener clickListener;

    public DataAdaptor(Context context, List<DataHandler> data) {
        this.context = context;
        this.data = data;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.row,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.name.setText(data.get(position).getOriginal_name());
        holder.popularity.setText(data.get(position).getPopularity()+"");
        holder.vote.setText(data.get(position).getVote_count()+"");
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickListener!=null)
                {
                    clickListener.ItemClicked(view,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,popularity,vote;
        RelativeLayout parent;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            popularity = (TextView) itemView.findViewById(R.id.popularity);
            vote = (TextView) itemView.findViewById(R.id.vote);
            parent = (RelativeLayout)itemView.findViewById(R.id.parent);
        }
    }

    public interface ClickListener
    {
        void ItemClicked(View v, int position);
    }

    public void setClickListener(ClickListener clickListener)
    {
        this.clickListener = clickListener;
    }
}
