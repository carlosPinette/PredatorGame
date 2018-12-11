package predator.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class mapa extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mapa, menu);
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

    public void onMap1(View v){

        Intent i = new Intent(this,map1.class);
        startActivity(i);

    }
    public void onMap2(View v){

        Intent i = new Intent(this,map2.class);
        startActivity(i);

    }
    public void onMap3(View v){

        Intent i = new Intent(this,map3.class);
        startActivity(i);

    }
    public void onMap4(View v){

        Intent i = new Intent(this,map4.class);
        startActivity(i);

    }
    public void onMap5(View v){

        Intent i = new Intent(this,map5.class);
        startActivity(i);

    }

}
