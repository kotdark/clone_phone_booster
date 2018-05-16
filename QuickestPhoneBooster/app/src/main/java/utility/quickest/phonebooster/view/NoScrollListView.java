package utility.quickest.phonebooster.view;

import android.content.Context;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;

public class NoScrollListView extends ExpandableListView {
    private int f14965a = -1;
    private int f14966b = -1;
    private int f14967c = -1;

    public NoScrollListView(Context context) {
        super(context);
    }

    public NoScrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoScrollListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        if (getAdapter() == null || this.f14965a != getAdapter().getCount()) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(536870911, ExploreByTouchHelper.INVALID_ID));
            this.f14965a = getAdapter() != null ? getAdapter().getCount() : -1;
            this.f14966b = getMeasuredHeight();
            this.f14967c = getMeasuredWidth();
            return;
        }
        setMeasuredDimension(this.f14967c, this.f14966b);
    }
}
