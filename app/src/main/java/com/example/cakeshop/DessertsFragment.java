package com.example.cakeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DessertsFragment extends Fragment {

    public DessertsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("ECLAIR", "18$", R.drawable.eclair));
        items.add(new Item("HOKKAIDO CHEESE", "20$", R.drawable.hokkaido_cheese));
        items.add(new Item("TIRAMISU CUP", "30$", R.drawable.tiramisu_cup));
        items.add(new Item("PANNA COTTA", "25$", R.drawable.panna_cotta));
        items.add(new Item("STRAWBERRY TART", "24$", R.drawable.strawberry_tart));
        items.add(new Item("CHOCOLATE TRUFFLE", "13$", R.drawable.chocolate_truffle));
        items.add(new Item("CUSTARD PUDDING", "13$", R.drawable.custard_pudding));
        items.add(new Item("CREAM PUFF", "16$", R.drawable.cream_puff));
        items.add(new Item("FRUIT CREAM PUFF", "20$", R.drawable.fruit_cream_puff));
        items.add(new Item("PIE CREAM PUFF", "18$", R.drawable.pie_cream_puff));


        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_desserts);

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
