package vn.fstyle.com.androidWheelPickerView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import vn.fstyle.whellpicker.WheelPickerView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WheelPickerView pickerView = (WheelPickerView) findViewById(R.id.wheelPicker);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("A" + i);
        }
        pickerView.setPicker(strings);
        pickerView.setOnOptionChangedListener(new WheelPickerView.OnOptionChangedListener() {
            @Override
            public void onOptionChanged(WheelPickerView view, int option) {
                Log.d(TAG, "DebugLog onOptionChanged " + option);
            }
        });
    }
}
