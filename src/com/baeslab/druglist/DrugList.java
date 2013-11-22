package com.baeslab.druglist;

import com.baeslab.hpnfc.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrugList extends Fragment{
	
	public static final String ARG_SECTION_NUMBER = "section_number";
	private int position;
	private String[] mList = {
			"Abilify",
			"Aciphex",
			"Actonel",
			"Actoplus MET",
			"Actos",
			"Adacel",
			"Adderall XR",
			"Advair Diskus",
			"Aggrenox",
			"Aloxi",
			"Amphetamine Salts ER",
			"Alimta",
			"AndroGel",
			"Niaspan",
			"NovoLog",
			"Norvir",
			"NovoSeven RT",
			"Nuvaring",
			"Nutropin AQ",
			"Opana ER",
			"Orencia",
			"Ortho Tri-Cyclen Lo",
			"Oxycontin",
			"Pegasys",
			"Plavix"
	};
	
	public static DrugList newInstance(int position) {
		DrugList f = new DrugList();
        Bundle b = new Bundle();
        b.putInt(ARG_SECTION_NUMBER, position);
        f.setArguments(b);
        return f;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		position = getArguments().getInt(ARG_SECTION_NUMBER);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.drug_list,container, false);
		ListView drugList = (ListView)rootView.findViewById(R.id.drugListView);
		drugList.setAdapter(new ArrayAdapter<String>(getActivity(),
                R.layout.drawer_list_item, mList));
		
		
		return rootView;
	}
}
