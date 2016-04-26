package com.example.souji.sample_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by souji on 26/4/16.
 */
public class ListContacts extends Fragment{


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_contacts, container, false);

        // Get ListView object from xml
      ListView  listView = (ListView) rootView.findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Contact1",
                "Contact2",
                "Contact3",
                "Contact4",
                "Contact5",
                "Contact6",
                "Contact7",
                "Contact8"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);


        Button submit = (Button) rootView.findViewById(R.id.list_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return rootView;
    }


}
