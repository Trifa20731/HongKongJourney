package udacity.projectpractice1.hongkongjourney.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import udacity.projectpractice1.hongkongjourney.R;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    Button logInButton;
    Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // assigning button ID to the objects.
        logInButton = findViewById(R.id.log_in_button);
        skipButton = findViewById(R.id.skip_button);

        // Set onClickListener for buttons.
        logInButton.setOnClickListener(this);
        skipButton.setOnClickListener(this);
    }

    /**
     * onClick method to make performance the element has been click.
     *
     * @param view is the element has been clicking by user.
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.log_in_button:
                Intent logInActivityIntent = new Intent(this, MainActivity.class);
                startActivity(logInActivityIntent);
                break;
            case R.id.skip_button:
                Intent skipActivityIntent = new Intent(this, MainActivity.class);
                startActivity(skipActivityIntent);
                break;
        }
    }
}