package edu.csueb.codepath.fitness_tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import edu.csueb.codepath.fitness_tracker.fragments.BmiFragment;
import edu.csueb.codepath.fitness_tracker.fragments.HomeFragment;
import edu.csueb.codepath.fitness_tracker.fragments.TrackFragment;
import edu.csueb.codepath.fitness_tracker.fragments.VideoFragment;

public class MainActivity extends AppCompatActivity {

    final FragmentManager mFragmentManager = getSupportFragmentManager();
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("GoFit");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.back_color)));

        mBottomNavigationView = findViewById(R.id.bottomNavigation);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.action_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.action_learn:
                        fragment = new VideoFragment();
                        break;
                    case R.id.action_track:
                        fragment = new TrackFragment();
                        break;
                    case R.id.action_calculate:
                    default:
                        fragment = new BmiFragment();
                        break;
                }
                mFragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });
        mBottomNavigationView.setSelectedItemId(R.id.action_home);
    }
}