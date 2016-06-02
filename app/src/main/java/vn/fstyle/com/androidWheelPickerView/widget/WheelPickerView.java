package vn.fstyle.com.androidWheelPickerView.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import java.util.List;

import vn.fstyle.com.androidWheelPickerView.R;

/**
 * WheelPickerView
 *
 * @author DaoLQ
 */
public class WheelPickerView extends FrameLayout {

    public interface OnOptionChangedListener {
        void onOptionChanged(WheelPickerView view, int option);
    }

    private WheelOptions wheelOptions;

    public WheelPickerView(Context context) {
        this(context, null);
    }

    public WheelPickerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WheelPickerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public WheelPickerView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        View.inflate(context, R.layout.item_picker, this);
        wheelOptions = new WheelOptions(this);
    }


    public void setPicker(List<String> optionsItems) {
        wheelOptions.setPicker(optionsItems);
    }

    public void setSelectOptions(int option) {
        wheelOptions.setCurrentItems(option);
    }

    public void setCyclic(boolean cyclic) {
        wheelOptions.setCyclic(cyclic);
    }

    public void setCurrentItems(int option) {
        wheelOptions.setCurrentItems(option);
    }

    public int getCurrentItems() {
        return wheelOptions.getCurrentItems();
    }

    public void setOnOptionChangedListener(OnOptionChangedListener listener) {
        this.wheelOptions.setOnOptionChangedListener(listener);
    }
}
