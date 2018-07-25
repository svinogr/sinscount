package upump.info.sinscount.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import upump.info.sinscount.R;
import upump.info.sinscount.model.Day;

public class AdapterDay extends RecyclerView.Adapter<DayVH> {

    private List<Day> days = new ArrayList<>();

    public AdapterDay(List<Day> days) {
        this.days = days;
    }

    @NonNull
    @Override
    public DayVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_layout, parent, false);
        return new DayVH(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DayVH holder, int position) {
            holder.bind(days.get(position));
    }

    @Override
    public int getItemCount() {
        return days.size();
    }
}
