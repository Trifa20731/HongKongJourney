package udacity.projectpractice1.hongkongjourney.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import udacity.projectpractice1.hongkongjourney.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button exploreButton;
    Button blogButton;
    Button cantoneseButton;
    Button accountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exploreButton = findViewById(R.id.explore_button);
        blogButton = findViewById(R.id.blog_button);
        cantoneseButton = findViewById(R.id.cantonese_button);
        accountButton = findViewById(R.id.account_button);

        exploreButton.setOnClickListener(this);
        blogButton.setOnClickListener(this);
        cantoneseButton.setOnClickListener(this);
        accountButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.explore_button:
                Intent exploreActivityIntent = new Intent(this, ExploreActivity.class);
                startActivity(exploreActivityIntent);
                break;
            case R.id.blog_button:
                Intent blogActivityIntent = new Intent(this, BlogActivity.class);
                startActivity(blogActivityIntent);
                break;
            case R.id.cantonese_button:
                Intent cantoneseActivityIntent = new Intent(this, CantoneseActivity.class);
                startActivity(cantoneseActivityIntent);
                break;
            case R.id.account_button:
                Intent accountActivityIntent = new Intent(this, AccountActivity.class);
                startActivity(accountActivityIntent);
                break;
        }
    }
}