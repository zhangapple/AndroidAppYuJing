/*
 * Copyright (C) 2012 yueyueniao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.slidingmenu.fragment.pice.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.slidingmenu.R;
import com.example.slidingmenu.test.CornerListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ConfigPiceFragment1 extends Fragment {

//    ListView listView ;
    private CornerListView listView= null;
    ArrayList<HashMap<String, String>> map_list1 = null;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.main_config, null);
        initView(view);
		return view;
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
    private void initView(View view){
//        listView.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_expandable_list_item_1,getData()));


        getDataSource1();
        // getDataSource2();

        SimpleAdapter adapter1 = new SimpleAdapter(ConfigPiceFragment1.this.getActivity(), map_list1,
                R.layout.simple_list_item_1, new String[] { "item" },
                new int[] { R.id.item_title });
        listView = (CornerListView)view.findViewById(R.id.lv_main_config);
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(new OnItemListSelectedListener());



    }




    public ArrayList<HashMap<String, String>> getDataSource1() {

        map_list1 = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        HashMap<String, String> map3 = new HashMap<String, String>();
        HashMap<String, String> map4 = new HashMap<String, String>();
        HashMap<String, String> map5 = new HashMap<String, String>();
        HashMap<String, String> map6 = new HashMap<String, String>();
        HashMap<String, String> map7 = new HashMap<String, String>();

        map1.put("item", "个人信息");
        map2.put("item", "提醒设置");
        map3.put("item", "主题设置");
        map4.put("item", "密码锁定");
        map5.put("item", "意见反馈");
        map6.put("item", "工具");
        map7.put("item", "关于");

        map_list1.add(map1);
        map_list1.add(map2);
        map_list1.add(map3);
        map_list1.add(map4);
        map_list1.add(map5);
        map_list1.add(map6);
        map_list1.add(map7);

        return map_list1;
    }


    class OnItemListSelectedListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                long arg3) {
            if (arg2 == 0) {
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
    }

}

