package com.zuluft.sample;

import android.os.Bundle;

import com.zuluft.safeFragmentTransaction.components.SafeFragmentTransactorActivity;

public class MainActivity
        extends
        SafeFragmentTransactorActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
