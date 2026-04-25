package ma.ens.fragmentslab;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    private Button greetingTab, sliderTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTab = findViewById(R.id.openGreetingScreen);
        sliderTab = findViewById(R.id.openSliderScreen);

        if (savedInstanceState == null) {
            showFragment(new WelcomeFragment(), false);
        }

        greetingTab.setOnClickListener(v -> showFragment(new WelcomeFragment(), true));
        sliderTab.setOnClickListener(v -> showFragment(new MoodFragment(), true));
    }

    private void showFragment(Fragment selectedFragment, boolean saveNavigation) {
        var transaction = getSupportFragmentManager()
                .beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.dynamicFragmentZone, selectedFragment);

        if (saveNavigation) {
            transaction.addToBackStack(null);
        }

        transaction.commit();
    }
}