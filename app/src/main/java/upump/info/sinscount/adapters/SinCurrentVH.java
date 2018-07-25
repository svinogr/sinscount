package upump.info.sinscount.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import upump.info.sinscount.R;
import upump.info.sinscount.model.SinTDO;

public class SinCurrentVH extends SinVH {
    private SinTDO sinTDO;

    public SinCurrentVH(View itemView) {
        super(itemView);
    }

    @Override
    void bind(SinTDO sinTDO) {
        this.sinTDO = sinTDO;
        name.setText(sinTDO.getEnumSins().getSin().getName());
        RequestOptions options = new RequestOptions()
                .transforms(new RoundedCorners(150))

                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH);

            int ident = context.getResources().getIdentifier(sinTDO.getEnumSins().getSin().getImg(), "drawable", context.getPackageName());
            Glide.with(context).load(ident).apply(options).into(imageView);

    }

    @Override
    void click() {

    }
}
