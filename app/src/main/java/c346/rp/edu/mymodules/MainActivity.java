package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView TvPass;
TextView TvPass2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TvPass=findViewById(R.id.TextView);
        TvPass2 = findViewById(R.id.textView);


        TvPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code", "Module Code: C346");
                intent.putExtra("name", "Module name: Android Programming");
                intent.putExtra("year","Academic Year:2018");
                intent.putExtra("sem", "Semester: 1");
                intent.putExtra("credit", "Module Credit: 4");
                intent.putExtra("venue","Venue:W66M");
                startActivity(intent);
            }
        });
        TvPass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code", "Module Code: C349");
                intent.putExtra("name", "Module name: iPad Programming");
                intent.putExtra("year","Academic Year: 2018");
                intent.putExtra("sem", "Semester: 1");
                intent.putExtra("credit", "Module Credit: 4");
                intent.putExtra("venue","Venue: W66M");
                startActivity(intent);
            }
        });
    }
}
