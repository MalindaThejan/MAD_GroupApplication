package mali.example.vicinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button1 = (Button) findViewById(R.id.editbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity6();
            }
        });
        button2 = (Button) findViewById(R.id.btndel);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });
    }
    public void openMainActivity6() {

        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void openMainActivity7() {

        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}