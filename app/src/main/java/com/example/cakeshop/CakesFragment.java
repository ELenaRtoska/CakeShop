package com.example.cakeshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class CakesFragment extends Fragment {



    public CakesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("STRAWBERRY CAKE", "24$", R.drawable.strawberry_cream_cake));
        items.add(new Item("CHOCOLATE CAKE", "24$", R.drawable.chocolate_cake));
        items.add(new Item("TIRAMISU CAKE", "25$", R.drawable.tiramisu_cake));
        items.add(new Item("SWEET POTATO TART", "25$", R.drawable.sweet_potato_tart));
        items.add(new Item("DARK CHOCOLATE", "24$", R.drawable.dark_chocolate));
        items.add(new Item("RARE CHEESE", "24$", R.drawable.rare_cheesecake));
        items.add(new Item("CHOCO MOUSSE", "25$", R.drawable.choco_mousse));
        items.add(new Item("LAMINGTON", "10$", R.drawable.lamington));
        items.add(new Item("MANGO TART", "24$", R.drawable.mango_tart));
        items.add(new Item("PUDDING CAKE", "25$", R.drawable.pudding_cake));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_cakes);

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