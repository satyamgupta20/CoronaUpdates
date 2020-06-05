package com.satyam.corona;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {

    private Context context;
    private List<Statewise> list2;
    public MyAdapter2(Context context, List<Statewise> list2)
    {
        this.context = context;
        this.list2=list2;
    }

    @NonNull
    @Override
    public MyAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.singlerow2,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyAdapter2.MyViewHolder holder, int position) {

        Statewise state = list2.get(position);
        holder.name.setText(state.getState());
        holder.tConfirmed.setText("Total Confirmed Cases : "+state.getConfirmed());
        holder.tDeath.setText("Total Death Cases : "+state.getDeaths());
        holder.tRecovered.setText("Total Recovered Cases : "+state.getRecovered());
        holder.time.setText(state.getLastupdatedtime());


    }
    @Override
    public int getItemCount() {
        return this.list2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        Button time;
        TextView name,tConfirmed,tDeath,tRecovered;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.state_name);
            tConfirmed=itemView.findViewById(R.id.state_total_confirmed_cases);
            tDeath=itemView.findViewById(R.id.state_total_death_cases);
            tRecovered=itemView.findViewById(R.id.state_total_recovered_cases);
            time=itemView.findViewById(R.id.updated_time);



        }
    }
}
