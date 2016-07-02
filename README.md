# Android-Wheel-PickerView

![device-2016-06-10-221504](https://cloud.githubusercontent.com/assets/6355989/15969315/b7a64096-2f59-11e6-86ec-36ad5319a200.png)

------------------------------------------------------------------------

#####How to use:
```xml
<vn.fstyle.whellpicker.WheelPickerView
        android:id="@+id/wheelPicker"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:color/white"
        app:itemTextColor="@android:color/darker_gray"
        app:itemTextColorSelect="@color/itemTextColor"
        app:itemTextSize="20dp" />
```
```java
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

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency
```gradle
dependencies {
    compile 'com.github.DaoLQ:Android-Wheel-PickerView:1.0.1'
}
```
