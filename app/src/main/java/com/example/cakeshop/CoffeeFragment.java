package com.example.cakeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class CoffeeFragment extends Fragment {
    public CoffeeFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("LATE","6$", R.drawable.late));
        items.add(new Item("IRISH","7$", R.drawable.irish));
        items.add(new Item("FREDO","7$", R.drawable.freddo));
        items.add(new Item("FRAPPE","7$", R.drawable.frappe));
        items.add(new Item("ESPRESSO MACCHIATO","4$", R.drawable.espresso_macchiato));
        items.add(new Item("ESPRESSO CONPANA","4$", R.drawable.espresso_conpana));
        items.add(new Item("AMERICANO","5$", R.drawable.americano));
        items.add(new Item("CAPPUCCINO","6$", R.drawable.cappuccino));
        items.add(new Item("ESPRESSO","2$", R.drawable.espresso));
        items.add(new Item("DOPPIO","4$", R.drawable.doppio));


        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_coffee);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // listlayout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);
        return rootView;


    }

}
