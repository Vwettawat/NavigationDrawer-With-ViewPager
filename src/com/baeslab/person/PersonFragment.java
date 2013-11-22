package com.baeslab.person;

import com.baeslab.druglist.DrugList;
import com.baeslab.hpnfc.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PersonFragment extends Fragment{
	
	public static final String TAG = PersonFragment.class.getSimpleName();
	
	public static PersonFragment newInstance() {
        return new PersonFragment();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {       
		return inflater.inflate(R.layout.person, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		ViewPager pager = (ViewPager) view.findViewById(R.id.pager);
		PersonPagerAdapter adapter = new PersonPagerAdapter(getChildFragmentManager());
		pager.setAdapter(adapter);
	}
	
	public class PersonPagerAdapter extends FragmentPagerAdapter {

		public PersonPagerAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int index) {
			Fragment fragment = null;
			switch (index) {
			case 0:
				fragment = PersonInfo.newInstance(index);
				break;
			case 1:
				fragment = DrugList.newInstance(index);
				break;
			default:
				break;
			}
			return fragment;
		}

		@Override
		public int getCount() {
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
			case 0:
				return "ประวัติ";
			case 1:
				return "รายการยา";
			default:
				return "";
			}
		}
		
	}
	

}
