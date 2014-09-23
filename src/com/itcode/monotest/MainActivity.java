package com.itcode.monotest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
	private ListView listView;
	private EditText editText;
	private List<String> dataList;
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dataList = new ArrayList<String>();
		initView();
	}

	private void initView() {
		listView = (ListView) findViewById(R.id.listView);
		editText = (EditText) findViewById(R.id.editText);
		String stringData = editText.getText().toString().trim();
		dataList.add(stringData);
		adapter = new MyAdapter(getLayoutInflater(), dataList.toArray());
		listView.setAdapter(adapter);
	}

	public void addToList(View view){
		String stringData = editText.getText().toString().trim();
		dataList.add(stringData);
		Log.i(TAG,"dataList:"+dataList);
		adapter = new MyAdapter(getLayoutInflater(), dataList.toArray());
		adapter.notifyDataSetChanged();
		adapter.notifyDataSetInvalidated();
		listView.setAdapter(adapter);
		listView.setSelection(adapter.getCount());
	}
}
