package com.itcode.monotest;

import com.itcode.monotest.R.id;

import android.view.LayoutInflater;
import android.view.View;

public class MyAdapter extends MyBaseAdapter<String> {

	public MyAdapter(LayoutInflater inflater, Object[] elements) {
		super(com.itcode.monotest.R.layout.listview_item, inflater, elements);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected View initialize(View view) {
		// TODO Auto-generated method stub
		view =  super.initialize(view);
		return view;
	}

	@Override
	protected int[] getChildViewIds() {
		// TODO Auto-generated method stub
        return new int[] {id.tvName,id.tvDescription};
	}

	@Override
	protected void update(int position, String description) {
		// TODO Auto-generated method stub
		setText(0, "第"+position+"条数据");
		setText(1, description);
		
	}

}
