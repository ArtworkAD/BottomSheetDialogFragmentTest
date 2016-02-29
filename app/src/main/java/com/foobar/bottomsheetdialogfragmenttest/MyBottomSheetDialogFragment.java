package com.foobar.bottomsheetdialogfragmenttest;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MyBottomSheetDialogFragment extends BottomSheetDialogFragment {

    TextView view;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);

        View root = getActivity().getLayoutInflater().inflate(R.layout.bottom_sheet, null);

        view = (TextView) root.findViewById(R.id.body);
        root.findViewById(R.id.theButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText("text changed");
            }
        });

        dialog.setContentView(root);
    }
}