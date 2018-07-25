package upump.info.sinscount.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import upump.info.sinscount.R;
import upump.info.sinscount.model.SinTDO;

public class AdapterSins extends RecyclerView.Adapter<SinVH> {
    public final static int DEFAULT = 0;
    public final  static int CURRENT = 1;

    private int type;

    private List<SinTDO> sinList = new ArrayList<>();

    public AdapterSins(List<SinTDO> sinList, int type) {
        this.type = type;
        this.sinList = sinList;
    }

    @NonNull
    @Override
    public SinVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.sins_card_layout, parent, false);
        SinVH sinVH = null;
        switch (viewType) {
            case DEFAULT:

                break;
            case CURRENT:
                sinVH = new SinCurrentVH(inflate);

                break;
        }

        return sinVH;
    }

    @Override
    public void onBindViewHolder(@NonNull SinVH holder, int position) {
        holder.bind(sinList.get(position));


    }

    @Override
    public int getItemViewType(int position) {
        return type;
    }

    @Override
    public int getItemCount() {
        return sinList.size();
    }
}
