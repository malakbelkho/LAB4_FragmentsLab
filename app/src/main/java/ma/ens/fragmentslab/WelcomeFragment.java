package ma.ens.fragmentslab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WelcomeFragment extends Fragment {

    private TextView messageView;
    private Button actionButton;

    public WelcomeFragment() {
        super(R.layout.fragment_welcome);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        messageView = view.findViewById(R.id.welcomeMessage);
        actionButton = view.findViewById(R.id.sayHelloButton);

        actionButton.setOnClickListener(v ->
                messageView.setText("Bonjour depuis Fragment 1 !")
        );
    }
}