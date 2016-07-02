# Android-Wheel-PickerView

![device-2016-06-10-221504](https://cloud.githubusercontent.com/assets/6355989/15969315/b7a64096-2f59-11e6-86ec-36ad5319a200.png)

------------------------------------------------------------------------

#####How to use:
```
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
```
#####Gradle:

Step 1. Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency
```
dependencies {
	        compile 'com.github.DaoLQ:Android-Wheel-PickerView:1.0'
}
```
