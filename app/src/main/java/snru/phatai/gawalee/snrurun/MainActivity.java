package snru.phatai.gawalee.snrurun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //main method นี่คือเมธอดหลัก

    public void clickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this, SignUp.class));
    }

} //main class นี่คือ คลาสหลัก
