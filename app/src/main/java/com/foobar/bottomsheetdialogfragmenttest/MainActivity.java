package com.foobar.bottomsheetdialogfragmenttest;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.actionBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (new MyBottomSheetDialogFragment()).show(getSupportFragmentManager(), "TAG");
            }
        });

        View bottomSheet = findViewById(R.id.bottom_sheet);
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }
}
