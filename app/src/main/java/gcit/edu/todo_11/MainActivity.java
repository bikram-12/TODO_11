package gcit.edu.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String mcolorArray[]={"purple_200", "purple_500", "teal_200", "marron", "coral", "peru", "rosy_brown",
            "c_blue","cyan","lime","olive"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
    }
    protected void onSavedInstanceState(Bundle outState){
        super.onCreate(outState);

        outState.putInt("color", textView.getCurrentTextColor());
    }

    public void change(View view){
        Random random = new Random();
        String colorName = mcolorArray[random.nextInt(10)];
        int colorResourceName = getResources().getIdentifier(colorName, "color",getApplication().getPackageName());
        int colorRes = ContextCompat.getColor(this,colorResourceName);
        textView.setTextColor(colorRes);

    }
}