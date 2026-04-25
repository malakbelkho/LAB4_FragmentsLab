package ma.ens.fragmentslab;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MoodFragment extends Fragment {

    private TextView scoreText;
    private SeekBar levelSlider;

    private int currentLevel = 0;
    private static final String SAVED_LEVEL = "saved_level";

    public MoodFragment() {
        super(R.layout.fragment_mood);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        scoreText = view.findViewById(R.id.scoreText);
        levelSlider = view.findViewById(R.id.levelSlider);

        if (savedInstanceState != null) {
            currentLevel = savedInstanceState.getInt(SAVED_LEVEL, 0);
        }

        levelSlider.setProgress(currentLevel);
        updateText(currentLevel);

        levelSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int value, boolean fromUser) {
                currentLevel = value;
                updateText(value);
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    private void updateText(int value) {
        scoreText.setText("Valeur : " + value + " / 100");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SAVED_LEVEL, currentLevel);
    }
}
