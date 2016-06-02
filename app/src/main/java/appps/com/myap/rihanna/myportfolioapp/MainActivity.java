package appps.com.myap.rihanna.myportfolioapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    LinearLayout custom_toast;
    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater = getLayoutInflater();

        TextView textView = (TextView) findViewById(R.id.text);

        layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.custom_toast_layout));
        custom_toast= (LinearLayout)findViewById(R.id.custom_toast_layout);

        Button button = (Button)findViewById(R.id.movies);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customToast("movies clicked!");
            }
        });
        Button button1 = (Button)findViewById(R.id.stock);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customToast("Stock Hawk clicked!");
            }
        });
        Button button2 = (Button)findViewById(R.id.bigger);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customToast("Buil it bigger clicked!");
            }
        });
        Button button3 = (Button)findViewById(R.id.material);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customToast("Make your app material clicked!");
            }
        });
        Button button4 = (Button)findViewById(R.id.ubiquitous);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customToast("Go Ubiquitous clicked!");
            }
        });
        Button button5 = (Button)findViewById(R.id.capstone);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customToast("Capstone clicked!");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void customToast(String str){
        Drawable im = getResources().getDrawable(R.drawable.click);
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(str);
        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setImageDrawable(im);
        Toast toast = new Toast(getApplication());
        toast.setGravity(Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }


}
