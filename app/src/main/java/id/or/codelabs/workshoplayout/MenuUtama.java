package id.or.codelabs.workshoplayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }


    public void clickButtonLinear(View v){
        Intent i = new Intent(this,LinearLayout.class);
        startActivity(i);
    }

    public void clickButtonRelative(View v){
        Intent i = new Intent(this,RelativeLayout.class);
        startActivity(i);
    }

    public void clickButtonFrame(View v){
        Intent i = new Intent(this,FrameLayout.class);
        startActivity(i);
    }

    public void clickButtonAbsolute(View v){
        Intent i = new Intent(this,AbsoluteLayout.class);
        startActivity(i);
    }
}
