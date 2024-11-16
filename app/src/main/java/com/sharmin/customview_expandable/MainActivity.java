package com.sharmin.customview_expandable;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> listDataHeader;
    HashMap<String, List<FoodItem>> listDataChild;
    MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandableListView);
        prepareListData();
        menuAdapter = new MenuAdapter(this, listDataHeader, listDataChild);
        expandableListView.setAdapter(menuAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Add headers
        listDataHeader.add("Breakfast");
        listDataHeader.add("Lunch");
        listDataHeader.add("Dinner");
// Add food items for each category
// Breakfast Items
        List<FoodItem> breakfast = new ArrayList<>();
        breakfast.add(new FoodItem("Panta Bhat",
                "Fermented rice with mustard oil, onions, and green chilies.\n" +
                        "Price: $5.99\n" +
                        "Restaurant: Local Village Eatery\n" +
                        "Origin: Bangladesh\n" +
                        "Food Value: Vitamins A, C, Iron | 300 Calories | 12g Fat",
                R.drawable.panta_bhat));
        breakfast.add(new FoodItem("Paratha",
                "Flatbread, plain or stuffed with mutton or chicken.\n" +
                        "Price: $3.99\n" +
                        "Restaurant: Dhaka Delights\n" +
                        "Origin: India, Pakistan\n" +
                        "Food Value: Vitamins B, E | 250 Calories | 10g Fat",
                R.drawable.paratha));
        breakfast.add(new FoodItem("Nihari",
                "Slow-cooked beef or lamb stew with spices.\n" +
                        "Price: $7.99\n" +
                        "Restaurant: Mughal Cuisine\n" +
                        "Origin: Pakistan\n" +
                        "Food Value: Protein-rich | 450 Calories | 30g Fat",
                R.drawable.nihari));
        breakfast.add(new FoodItem("Luchi and Alur Dom",
                "Deep-fried puris with spicy potato curry.\n" +
                        "Price: $4.50\n" +
                        "Restaurant: Bengali Bites\n" +
                        "Origin: Bengal, India\n" +
                        "Food Value: Vitamin C, Potassium | 500 Calories | 20g Fat",
                R.drawable.luchi_alur_dom));
        breakfast.add(new FoodItem("Moglai Porota",
                "Stuffed paratha with minced meat and eggs.\n" +
                        "Price: $6.50\n" +
                        "Restaurant: Kebab Corner\n" +
                        "Origin: Kolkata, India\n" +
                        "Food Value: Protein, Iron | 600 Calories | 25g Fat",
                R.drawable.moglai_porota));
        breakfast.add(new FoodItem("Omelette",
                "Omelettes with local spices, served with bread or rice.\n" +
                        "Price: $3.50\n" +
                        "Restaurant: Sunrise Café\n" +
                        "Origin: Global\n" +
                        "Food Value: Protein, Vitamins B & D | 350 Calories | 20g Fat",
                R.drawable.omelette));

// Lunch Items
        List<FoodItem> lunch = new ArrayList<>();
        lunch.add(new FoodItem("Kacchi Biriyani",
                "Fragrant rice dish with marinated mutton.\n" +
                        "Price: $9.99\n" +
                        "Restaurant: Royal Biryani\n" +
                        "Origin: Bangladesh\n" +
                        "Food Value: Protein, Vitamin C | 700 Calories | 30g Fat",
                R.drawable.biriyani));
        lunch.add(new FoodItem("Shorshe Ilish",
                "Hilsa fish in mustard sauce with rice.\n" +
                        "Price: $8.50\n" +
                        "Restaurant: Fish House\n" +
                        "Origin: Bengal, Bangladesh\n" +
                        "Food Value: Omega-3, Vitamins A & D | 500 Calories | 25g Fat",
                R.drawable.shorshe_ilish));
        lunch.add(new FoodItem("Kala Bhuna",
                "Spicy beef curry with onions and spices.\n" +
                        "Price: $7.50\n" +
                        "Restaurant: Bengal Spice\n" +
                        "Origin: Bangladesh\n" +
                        "Food Value: Protein, Iron | 600 Calories | 35g Fat",
                R.drawable.kala_bhuna));
        lunch.add(new FoodItem("Bhuna Khichuri",
                "Rice and lentils cooked with spices, often with meat.\n" +
                        "Price: $6.00\n" +
                        "Restaurant: Daily Diner\n" +
                        "Origin: Bengal, India\n" +
                        "Food Value: Fiber, Vitamin B | 400 Calories | 15g Fat",
                R.drawable.bhuna_khichuri));
        lunch.add(new FoodItem("Morog Polao",
                "Aromatic chicken and rice dish.\n" +
                        "Price: $7.00\n" +
                        "Restaurant: The Chicken Spot\n" +
                        "Origin: Bangladesh\n" +
                        "Food Value: Protein, Vitamin A | 500 Calories | 20g Fat",
                R.drawable.morog_polao));

// Dinner Items
        List<FoodItem> dinner = new ArrayList<>();
        dinner.add(new FoodItem("Mutton Rezala",
                "Creamy mutton curry with yogurt.\n" +
                        "Price: $10.99\n" +
                        "Restaurant: Mughlai Kitchen\n" +
                        "Origin: India\n" +
                        "Food Value: Protein, Iron | 700 Calories | 45g Fat",
                R.drawable.mutton_rezala));
        dinner.add(new FoodItem("Ilish Curry",
                "Hilsa fish cooked in gravy.\n" +
                        "Price: $8.00\n" +
                        "Restaurant: Fish Tales\n" +
                        "Origin: Bengal, Bangladesh\n" +
                        "Food Value: Omega-3, Vitamin D | 450 Calories | 20g Fat",
                R.drawable.ilish_curry));
        dinner.add(new FoodItem("Bharta",
                "Mashed vegetables or fish with mustard oil.\n" +
                        "Price: $5.00\n" +
                        "Restaurant: Healthy Eats\n" +
                        "Origin: India, Bangladesh\n" +
                        "Food Value: Fiber, Vitamin C | 200 Calories | 10g Fat",
                R.drawable.bharta));
        dinner.add(new FoodItem("Haleem",
                "Thick stew made from lentils and meat.\n" +
                        "Price: $7.99\n" +
                        "Restaurant: Traditional Tastes\n" +
                        "Origin: Middle East, India\n" +
                        "Food Value: Protein, Fiber | 600 Calories | 30g Fat",
                R.drawable.haleem));



        // Map categories to items
        listDataChild.put(listDataHeader.get(0), breakfast);
        listDataChild.put(listDataHeader.get(1), lunch);
        listDataChild.put(listDataHeader.get(2), dinner);
    }
}
