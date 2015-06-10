package dcf.matcom.listsdfa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onSl1(View v) {
        Intent intent = new Intent(this, SimpleList1.class);
        startActivity(intent);
    }
    //
    public void onSl2(View v) {
        Intent intent = new Intent(this, SimpleList2.class);
        startActivity(intent);
    }
    //
    public void onSl3(View v) {
        Intent intent = new Intent(this, SimpleList3.class);
        startActivity(intent);
    }
    //
    public void onSl4(View v) {
        Intent intent = new Intent(this, SimpleList4.class);
        startActivity(intent);
    }
    //



}
