package com.jingpipei.app.demoflexboxitemdecoration;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * ItemAdapter.
 * <ul>
 * <li>date: 2018/3/29</li>
 * </ul>
 *
 * @author tongjin
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Integer> dataList;

    public ItemAdapter(List<Integer> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.component_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Integer integer = dataList.get(position);

        holder.tv_index.setText(String.valueOf(integer));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
