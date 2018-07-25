package upump.info.sinscount;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import upump.info.sinscount.model.Day;

class DayVH extends RecyclerView.ViewHolder {
    private Day day;
    private ImageView imageView;
    private TextView dayTextView, yearTextView;
    private Context  context;

    public DayVH(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
    }

    public void bind(Day day) {
        this.day = day;
        dayTextView.setText(day.getDay());
        yearTextView.setText(day.getYear());
        setImg();
    }

    private void setImg() {
        RequestOptions options = new RequestOptions()
                .transforms(new RoundedCorners(50))
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH);

        Bitmap bitmap = createImage(); // сделать наверно лучше картинку
            Glide.with(context).load(bitmap).apply(options).into(imageView);

    }

    public Bitmap createImage() {
        Bitmap bitmap = Bitmap.createBitmap(100 , 100, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(day.getColor()));
        canvas.drawRect(0F, 0F, (float) 100, (float) 100, paint);
        return bitmap;
    }
}
