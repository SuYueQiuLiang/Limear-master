package org.suyueqiuliang.qingning;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class settingfragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settingfragment, container, false);
        String[] data = {"主题色更改","课程主题色更改"};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)view.findViewById(R.id.list_view1);
        listView.setAdapter(adapter);
        return view;
    }

}
