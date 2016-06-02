package vn.fstyle.com.androidWheelPickerView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import vn.fstyle.com.androidWheelPickerView.widget.WheelPickerView;

public class MainActivity extends AppCompatActivity {

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

            }
        });
    }
}
