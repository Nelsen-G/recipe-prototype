package com.example.recipeprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recipeprototype.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button breakfastButton = findViewById(R.id.breakfastButton);
        Button lunchButton = findViewById(R.id.lunchButton);
        Button dinnerButton = findViewById(R.id.dinnerButton);

        breakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, recipe.class);
                startActivity(intent);
            }
        });

        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, recipe2.class);
                startActivity(intent);
            }
        });

        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, recipe3.class);
                startActivity(intent);
            }
        });


//        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}