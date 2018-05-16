package utility.quickest.phonebooster.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView {
    FontMetricsInt f14895a;

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f14895a == null) {
            this.f14895a = new FontMetricsInt();
            getPaint().getFontMetricsInt(this.f14895a);
        }
        canvas.translate(0.0f, 0.0f);
        super.onDraw(canvas);
    }
}
