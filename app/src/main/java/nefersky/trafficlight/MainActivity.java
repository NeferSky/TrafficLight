package nefersky.trafficlight;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mWndMain;
    private ToggleButton mBtnRed;
    private ToggleButton mBtnYellow;
    private ToggleButton mBtnGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWndMain = (ConstraintLayout)findViewById(R.id.wndMain);
        mBtnRed = (ToggleButton)findViewById(R.id.btnRed);
        mBtnYellow = (ToggleButton)findViewById(R.id.btnYellow);
        mBtnGreen = (ToggleButton)findViewById(R.id.btnGreen);

        mBtnRed.setBackgroundColor(getResources().getColor(R.color.colorRed));
        mBtnYellow.setBackgroundColor(getResources().getColor(R.color.colorYellow));
        mBtnGreen.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }

    public void onClickRed(View view) {
        mBtnRed.setChecked(true);
        mBtnYellow.setChecked(false);
        mBtnGreen.setChecked(false);
        mWndMain.setBackgroundColor(getResources().getColor(R.color.colorRed));
    }

    public void onClickYellow(View view) {
        mBtnRed.setChecked(false);
        mBtnYellow.setChecked(true);
        mBtnGreen.setChecked(false);
        mWndMain.setBackgroundColor(getResources().getColor(R.color.colorYellow));
    }

    public void onClickGreen(View view) {
        mBtnRed.setChecked(false);
        mBtnYellow.setChecked(false);
        mBtnGreen.setChecked(true);
        mWndMain.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }
}