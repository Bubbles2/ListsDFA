package dcf.matcom.listsdfa;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SimpleList4 extends Activity {
    //
    ArrayList<Leaders> leaders = new ArrayList<Leaders>();
    Leaders lea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list3);
        // Create Data
        lea = new Leaders("Francois","France");
        leaders.add(lea);
        lea = new Leaders("Cameron","UK");
        leaders.add(lea);
        lea = new Leaders("Merkel","Germany");
        leaders.add(lea);
        //
        LeaderListAdapter aa = new LeaderListAdapter(this,R.layout.custom_row,leaders);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(aa);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.simple_list3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //
        Log.i("ESP Test","Button Pressed");
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //==================
    /**
     * ArrayAdapter that displays Property objects.
     */
    private static class LeaderListAdapter extends ArrayAdapter<Leaders> {

        LayoutInflater mInflater;
        //
        private Context context;
        private int layoutResourceId;
        private ArrayList data = new ArrayList();
        // =================================================
        // We need the POI list adapter because the
        // we want to use a custom view the list fragment
        //===================================================

        public LeaderListAdapter(Context context, int layoutResourceId,
                              ArrayList data) {
            super(context, layoutResourceId, data);
            mInflater = LayoutInflater.from(context);
            this.layoutResourceId = layoutResourceId;
            this.context = context;
            this.data = data;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //
            Leaders leader = (Leaders) data.get(position);
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.custom_row, parent, false);
            }

            //
            TextView ldr = (TextView) convertView.findViewById(R.id.txtLeader);
            ldr.setText(leader.leader);
            TextView ctry = (TextView) convertView.findViewById(R.id.txtCountry);
            ctry.setText(leader.country);
            ImageView iv = (ImageView) convertView.findViewById(R.id.txtIcon);
            iv.setImageResource(R.drawable.ic_number1);

            return convertView;
        }
    }

    //==================
}
