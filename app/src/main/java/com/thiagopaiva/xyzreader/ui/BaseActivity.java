package com.thiagopaiva.xyzreader.ui;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.thiagopaiva.xyzreader.R;

public class BaseActivity extends AppCompatActivity {

    Toolbar toolbar;
    CoordinatorLayout coordinatorLayout;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        injectViews();
        ActionBar actionBar = getSupportActionBar();

        if (isDisplayHomeAsUpEnabled() && actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    protected void injectViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        setupToolbar();
    }

    protected void setupToolbar() {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onActionBarHomeIconClicked();
                return true;

            default:
        }
        return super.onOptionsItemSelected(item);
    }

    protected boolean isDisplayHomeAsUpEnabled() {
        return false;
    }

    private void onActionBarHomeIconClicked() {
        if (isDisplayHomeAsUpEnabled()) {
            onBackPressed();
        } else {
            finish();
        }
    }
}
