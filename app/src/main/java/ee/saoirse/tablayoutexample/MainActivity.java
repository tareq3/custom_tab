package ee.saoirse.tablayoutexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tabLayout = findViewById(R.id.tabLayout);



    }
}
