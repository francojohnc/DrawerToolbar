package com.apkmarvel.drawertoolbar;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
/**
 * Created by john carlo franco on 11/13/15.
 * johncarlofranco.com
 */
public abstract class BaseActivity extends AppCompatActivity {
    public final String TAG = this.getClass().getSimpleName();
    /*toolbar*/
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Toolbar toolbar;
    private DrawerLayout drawer;
    protected void enableToolBar(int toolbarId){
        toolbar = (Toolbar)findViewById(toolbarId);
        setSupportActionBar(toolbar);//enable menu
    }
    protected void enableDrawer(int drawerId){
        drawer = (DrawerLayout) findViewById(drawerId);
        ActionBarDrawerToggle toggle =  new ActionBarDrawerToggle(this,drawer, toolbar, 0, 0);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }
    protected void enableNavigation(int NavigationId,NavigationView.OnNavigationItemSelectedListener listener){
        NavigationView navigationView = (NavigationView) findViewById(NavigationId);
        navigationView.setNavigationItemSelectedListener(listener);
    }
    protected void setTitleTextColor( int color){
        toolbar.setTitleTextColor(color);

    }
    protected void setTitle(String title){
        getSupportActionBar().setTitle(title);
    }
    protected void setNavigationIcon(int icon){
        toolbar.setNavigationIcon(icon);
    }
    protected void hideTitle(){
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
    protected void enableBackMenu(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//back button
    }
    protected  boolean isDrawerOpen(){
        if(drawer==null)return false;
       return (drawer.isDrawerOpen(GravityCompat.START));
    }
    protected void closeDrawer(){
        drawer.closeDrawer(GravityCompat.START);
    }
}

