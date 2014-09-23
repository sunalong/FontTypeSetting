package com.itcode.monotest;

import android.app.Activity;
import android.view.LayoutInflater;

import com.github.kevinsawicki.wishlist.SingleTypeAdapter;

public abstract class MyBaseAdapter<V> extends SingleTypeAdapter<V>
{

	public MyBaseAdapter(Activity activity, int layoutResourceId) {
		super(activity, layoutResourceId);
	}

	public MyBaseAdapter(int viewId,LayoutInflater inflater,Object[] elements) {
		// TODO Auto-generated constructor stub
		super(inflater,viewId);
		setItems(elements);
	}
}
