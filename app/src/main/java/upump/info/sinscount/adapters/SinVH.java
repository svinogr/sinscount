package upump.info.sinscount.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import upump.info.sinscount.R;
import upump.info.sinscount.model.SinTDO;

abstract class SinVH extends RecyclerView.ViewHolder implements View.OnClickListener {
    protected Context context;
    protected TextView name;
    protected ImageView imageView;

    public SinVH(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
        itemView.setOnClickListener(this);
        this.name = itemView.findViewById(R.id.sins_card_layout_name);
        this.imageView = itemView.findViewById(R.id.sins_card_layout_img);
    }

    abstract void bind(SinTDO sinTDO);
    abstract void click();

    @Override
    public void onClick(View v) {
        click();
    }
}
