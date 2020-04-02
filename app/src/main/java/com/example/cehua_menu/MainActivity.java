package com.example.cehua_menu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView nav_View;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        hideScrollBar();
        setActionBar();
        setToggle();
        setListener();


    }

    private void initView() {
        toolbar = findViewById(R.id.drawer_toolbar);
        drawer = findViewById(R.id.drawer);
        nav_View = findViewById(R.id.nav_view);
    }

    private void hideScrollBar() {
        View headerView = nav_View.getHeaderView(0);
        if (headerView != null) {
            headerView.setScrollbarFadingEnabled(false);
        }
    }

    private void setActionBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setToggle() {
        toggle = new ActionBarDrawerToggle(this, drawer, 0, 0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setListener() {
        nav_View.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.clean:
                        break;
                    case R.id.color:
                        break;
                    case R.id.eraser_width_1:
                        break;
                }
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
