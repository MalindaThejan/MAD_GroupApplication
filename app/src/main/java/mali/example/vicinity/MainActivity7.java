package mali.example.vicinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        button = (Button) findViewById(R.id.btndell);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity8();
            }
        });
    }
    public void openMainActivity8() {

        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}