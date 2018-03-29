package com.jingpipei.app.demoflexboxitemdecoration;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * ItemViewHolder.
 * <ul>
 * <li>date: 2018/3/29</li>
 * </ul>
 *
 * @author tongjin
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_index;

    public ItemViewHolder(View itemView) {
        super(itemView);

        tv_index = itemView.findViewById(R.id.tv_index);
    }
}
