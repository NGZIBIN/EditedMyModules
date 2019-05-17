package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvAnswer2;
TextView tvAnswer3;
TextView tvAnswer4;
TextView tvAnswer5;
TextView tvAnswer6;
TextView tvAnswer7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvAnswer2 = findViewById(R.id.textView2);
        tvAnswer3 =findViewById(R.id.textView3);
        tvAnswer4 = findViewById(R.id.textView4);
        tvAnswer5 = findViewById(R.id.textView5);
        tvAnswer6 = findViewById(R.id.textView6);
        tvAnswer7 = findViewById(R.id.textView7);

        Intent ans = getIntent();
        String ans2 = ans.getStringExtra("code");
        String ans3 = ans.getStringExtra("name");
        String ans4 = ans.getStringExtra("year");
        String ans5 = ans.getStringExtra("sem");
        String ans6 = ans.getStringExtra("credit");
        String ans7 = ans.getStringExtra("venue");

        tvAnswer2.setText(ans2);
        tvAnswer3.setText(ans3);
        tvAnswer4.setText(ans4);
        tvAnswer5.setText(ans5);
        tvAnswer6.setText(ans6);
        tvAnswer7.setText(ans7);
    }
}
