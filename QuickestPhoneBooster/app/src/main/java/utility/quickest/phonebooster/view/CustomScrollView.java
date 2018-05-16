package utility.quickest.phonebooster.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class CustomScrollView extends ScrollView {
    private ad f14894a;

    public CustomScrollView(Context context) {
        this(context, null);
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnScrollListener(ad adVar) {
        this.f14894a = adVar;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f14894a != null) {
            this.f14894a.mo3099a(i2, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
