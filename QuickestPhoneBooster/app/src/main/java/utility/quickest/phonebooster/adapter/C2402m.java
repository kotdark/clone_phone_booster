package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;
import utility.quickest.phonebooster.adapter.ShareGridAdapter.ViewHolder;

/* compiled from: ShareGridAdapter */
class C2402m implements OnGlobalLayoutListener {
    final /* synthetic */ ViewHolder f12942a;

    C2402m(ViewHolder viewHolder) {
        this.f12942a = viewHolder;
    }

    public void onGlobalLayout() {
        if (this.f12942a.f12873b > 0) {
            int height = this.f12942a.mContainer.getHeight();
            try {
                View childAt = this.f12942a.f12874c.f12877b.getChildAt(this.f12942a.f12873b - 1);
                int height2 = childAt.getHeight();
                if (height > height2) {
                    childAt.setLayoutParams(new LayoutParams(-1, height));
                    this.f12942a.f12874c.f12877b.setLayoutParams(new LinearLayout.LayoutParams(-1, height * (((this.f12942a.f12874c.getCount() - 1) / 4) + 1)));
                } else if (height < height2) {
                    this.f12942a.mContainer.setLayoutParams(new LayoutParams(-1, height2));
                    this.f12942a.f12874c.f12877b.setLayoutParams(new LinearLayout.LayoutParams(-1, height2 * (((this.f12942a.f12874c.getCount() - 1) / 4) + 1)));
                }
            } catch (Throwable th) {
            }
        }
    }
}
