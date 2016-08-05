package com.apkmarvel.drawertoolbar;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();
    }
    private void setupToolbar() {
        enableToolBar(R.id.toolbar);
        enableDrawer(R.id.drawer_layout);
        enableNavigation(R.id.nav_view, this);
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_camera:
                Toast.makeText(MainActivity.this, "nav_camera", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_gallery:
                Toast.makeText(MainActivity.this, "nav_gallery", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_slideshow:
                Toast.makeText(MainActivity.this, "nav_slideshow", Toast.LENGTH_SHORT).show();
                break;
        }
        closeDrawer();
        return true;
    }

    @Override
    public void onBackPressed() {
        if (isDrawerOpen()) {
            closeDrawer();
        } else {
            super.onBackPressed();
        }

    }
}
