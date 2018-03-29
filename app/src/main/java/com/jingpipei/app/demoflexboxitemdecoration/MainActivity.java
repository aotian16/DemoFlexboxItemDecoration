package com.jingpipei.app.demoflexboxitemdecoration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxItemDecoration;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ConstraintLayout is error
//        setContentView(R.layout.activity_main1); // RelativeLayout is ok

        RecyclerView rv = findViewById(R.id.rv_content);
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(rv.getContext());
        layoutManager.setFlexWrap(FlexWrap.WRAP);
        layoutManager.setFlexDirection(FlexDirection.ROW);
        layoutManager.setJustifyContent(JustifyContent.FLEX_START);
        rv.setLayoutManager(layoutManager);

        FlexboxItemDecoration decoration = new FlexboxItemDecoration(rv.getContext());
        decoration.setOrientation(FlexboxItemDecoration.BOTH);
        decoration.setDrawable(rv.getContext().getResources().getDrawable(R.drawable.shape_divider_flex_long));
        rv.addItemDecoration(decoration);

        List<Integer> dataList = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            dataList.add(i);
        }

        ItemAdapter adapter = new ItemAdapter(dataList);
        rv.setAdapter(adapter);
    }
}
