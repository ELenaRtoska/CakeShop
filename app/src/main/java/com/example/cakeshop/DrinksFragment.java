package com.example.cakeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DrinksFragment extends Fragment {

    public DrinksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("MOJITO", "10$", R.drawable.mojito));
        items.add(new Item("MARTINI", "13$", R.drawable.martini));
        items.add(new Item("CUBA LIBRE", "10$", R.drawable.cuba_libre));
        items.add(new Item("GIN TONIC", "11$", R.drawable.gin_tonic));
        items.add(new Item("DAIQUIRI", "12$", R.drawable.daiquiri));
        items.add(new Item("MANHATTAN", "11$", R.drawable.manhattan));
        items.add(new Item("BLUE LAGOON", "10$", R.drawable.blue_lagoon));
        items.add(new Item("COCA-COLA", "3$", R.drawable.coca_cola));
        items.add(new Item("FANTA", "3$", R.drawable.fanta));
        items.add(new Item("ICED TEA", "2$", R.drawable.iced_tea));


        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_drinks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xmlut file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}

