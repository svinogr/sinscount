package upump.info.sinscount;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import upump.info.sinscount.adapters.AdapterSins;
import upump.info.sinscount.model.Day;
import upump.info.sinscount.model.EnumSins;
import upump.info.sinscount.model.SinTDO;

public class DayActivity extends AppCompatActivity {

    private static final String ID = "id";
    private static final String COLOR_DEFAULT = "#ffffad"; //золотой
    private Day day;
    private List<SinTDO> sinTDOS = new ArrayList<>();
    private AdapterSins adapterSins;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;

    public static Intent creatIntent(Context context, Day day) {
        Intent intent = new Intent(context, DayActivity.class);
        intent.putExtra(ID, day.getId());
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);

        getDay();

        getSins();
        recyclerView = findViewById(R.id.day_activity_rec_view);

        linearLayoutManager = new LinearLayoutManager(this);

        adapterSins = new AdapterSins(sinTDOS, AdapterSins.CURRENT);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterSins);
        setColor();
    }

    private void setColor() {
        if (sinTDOS.size() <= 0) {
            recyclerView.setBackgroundColor(Color.parseColor(COLOR_DEFAULT));
        } else getColorForDay();
    }

    private void getColorForDay() {
        // временоо ставить цвет
        recyclerView.setBackgroundColor(Color.parseColor("#e10531"));

    }

    private void getSins() {
        for (int i = 0; i < EnumSins.values().length; i++) {
            SinTDO sinTDO = new SinTDO();
            sinTDO.setEnumSins(EnumSins.values()[i]);
            sinTDOS.add(sinTDO);
        }
    }

    private void getDay() {
        //temp
        day = new Day();
        day.setId(1);
        day.setYear("2019");
        day.setDay("22 июня");
        day.setColor("#ff5a6e");
        ///


    }
}
