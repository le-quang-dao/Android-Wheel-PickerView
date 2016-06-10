package vn.fstyle.com.androidWheelPickerView.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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
        setAttributeSet(context, attrs);
    }

    private void setAttributeSet(Context context, AttributeSet attrs) {
        View parentView = LayoutInflater.from(context).inflate(R.layout.item_picker, this);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.WheelPickerView);
        LoopView item = (LoopView) parentView.findViewById(R.id.loopView);
        int textColor = typedArray.getColor(R.styleable.WheelPickerView_itemTextColor, getResources().getColor(android.R.color.darker_gray));
        item.setTextColor(textColor);
        int textColorSelected = typedArray.getColor(R.styleable.WheelPickerView_itemTextColorSelect, getResources().getColor(android.R.color.black));
        item.setTextColorSelected(textColorSelected);
        int textSize = typedArray.getDimensionPixelOffset(R.styleable.WheelPickerView_itemTextSize,
                getResources().getDimensionPixelOffset(R.dimen.activity_horizontal_margin));
        item.setTextSize(textSize);
        wheelOptions = new WheelOptions(this);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public WheelPickerView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setAttributeSet(context, attrs);
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
