package edu.csueb.codepath.fitness_tracker.fragments;

import static com.parse.Parse.getApplicationContext;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import java.util.Locale;

import edu.csueb.codepath.fitness_tracker.R;

public class BmiFragment extends Fragment {

    private TextView currentHeightTextView;
    private SeekBar heightSeekBar;
    private TextView currentWeightTextView;
    private ImageView decrementWeightImageView;
    private ImageView incrementWeightImageView;
    private TextView currentAgeTextView;
    private ImageView decrementAgeImageView;
    private ImageView incrementAgeImageView;
    private TextView bmiTextView;
    private Button calculateBmiButton;

    RelativeLayout mmale,mfemale;

    private static final int MIN_HEIGHT = 120; // Minimum height in cm
    private static final int MAX_HEIGHT = 250; // Maximum height in cm
    private static final int MIN_WEIGHT = 0; // Minimum weight in kg
    private static final int MAX_WEIGHT = 200; // Maximum weight in kg
    private static final int MIN_AGE = 10; // Minimum age
    private static final int MAX_AGE = 100; // Maximum age

    private int currentHeight = MIN_HEIGHT; // Initial height in cm
    private int currentWeight = 60; // Initial weight in kg
    private int currentAge = 20; // Initial age

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);

        currentHeightTextView = view.findViewById(R.id.currentheight);
        heightSeekBar = view.findViewById(R.id.seekbarforheight);
        currentWeightTextView = view.findViewById(R.id.currentweight);
        decrementWeightImageView = view.findViewById(R.id.decrementweight);
        incrementWeightImageView = view.findViewById(R.id.incremetweight);
        currentAgeTextView = view.findViewById(R.id.currentage);
        decrementAgeImageView = view.findViewById(R.id.decrementage);
        incrementAgeImageView = view.findViewById(R.id.incrementage);
        bmiTextView = view.findViewById(R.id.bmiTextView);
        calculateBmiButton = view.findViewById(R.id.calculatebmi);
        mmale= view.findViewById(R.id.male);
        mfemale= view.findViewById(R.id.female);

        heightSeekBar.setMax(MAX_HEIGHT - MIN_HEIGHT); // Set the maximum seek bar value range

        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                String typerofuser = "Male";

            }
        });


        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                String typerofuser = "Female";
            }
        });



        heightSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Update the current height text view with the seek bar progress
                currentHeight = progress + MIN_HEIGHT; // Add the minimum height to the progress
                currentHeightTextView.setText(String.valueOf(currentHeight));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Not needed for this implementation
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Not needed for this implementation
            }
        });

        heightSeekBar.setProgress(0); // Set the initial progress to the minimum height

        currentWeightTextView.setText(String.valueOf(currentWeight));

        decrementWeightImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementWeight();
            }
        });

        incrementWeightImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementWeight();
            }
        });

        currentAgeTextView.setText(String.valueOf(currentAge));

        decrementAgeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementAge();
            }
        });

        incrementAgeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementAge();
            }
        });

        calculateBmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBmi();
            }
        });

        return view;
    }

    private void decrementWeight() {
        if (currentWeight > MIN_WEIGHT) {
            currentWeight--;
            currentWeightTextView.setText(String.valueOf(currentWeight));
        }
    }

    private void incrementWeight() {
        if (currentWeight < MAX_WEIGHT) {
            currentWeight++;
            currentWeightTextView.setText(String.valueOf(currentWeight));
        }
    }

    private void decrementAge() {
        if (currentAge > MIN_AGE) {
            currentAge--;
            currentAgeTextView.setText(String.valueOf(currentAge));
        }
    }

    private void incrementAge() {
        if (currentAge < MAX_AGE) {
            currentAge++;
            currentAgeTextView.setText(String.valueOf(currentAge));
        }
    }

    private void calculateBmi() {
        // Calculate BMI
        float heightInMeters = currentHeight / 100f; // Convert height from cm to meters
        float bmi = currentWeight / (heightInMeters * heightInMeters);

        // Format the BMI value
        String bmiFormatted = String.format(Locale.getDefault(), "%.2f", bmi);

        // Determine the BMI category
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi < 25) {
            bmiCategory = "Normal";
        } else if (bmi < 30) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        // Display BMI and category in the TextView
        String bmiResult = getString(R.string.bmi_result, bmiFormatted);
        String bmiWithCategory = bmiResult + " (" + bmiCategory + ")";
        bmiTextView.setText(bmiWithCategory);
    }


}
