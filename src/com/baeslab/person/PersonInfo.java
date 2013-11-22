package com.baeslab.person;

import com.baeslab.hpnfc.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PersonInfo extends Fragment{
	
	private static final String ARG_POSITION = "position";

    private int position;
	
	public static PersonInfo newInstance(int position) {
		PersonInfo f = new PersonInfo();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		position = getArguments().getInt(ARG_POSITION);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.person_info,container, false);
		
		TextView name = (TextView) rootView.findViewById(R.id.personName);
		name.setText("My name "+(position+1));
		return rootView;
	}

}
