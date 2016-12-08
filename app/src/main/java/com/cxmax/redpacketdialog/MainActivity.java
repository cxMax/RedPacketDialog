package com.cxmax.redpacketdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cxmax.library.DialogHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.show_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.show_btn:
                showRedPacket();
                break;
        }
    }

    private void showRedPacket() {
        DialogHelper.with(this).begin().showDilaog(new DialogHelper.DilaogBean());
    }
}
