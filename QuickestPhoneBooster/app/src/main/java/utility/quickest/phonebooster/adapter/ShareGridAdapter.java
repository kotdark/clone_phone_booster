package utility.quickest.phonebooster.adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.cache.ImageCache;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.view.cj;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;

public class ShareGridAdapter extends BaseAdapter {
    private LayoutInflater f12876a = LayoutInflater.from(MyApplicationLike.getApplication());
    private GridView f12877b;
    private Activity f12878c;
    private ArrayList<cj> f12879d = new ArrayList();
    private Resources f12880e = MyApplicationLike.getApplication().getResources();

    public class ViewHolder {
        cj f12872a;
        int f12873b;
        final /* synthetic */ ShareGridAdapter f12874c;
        @BindView
        protected ViewGroup mContainer;
        @BindView
        protected ImageView mIcon;

        protected ViewHolder(ShareGridAdapter shareGridAdapter) {
            this.f12874c = shareGridAdapter;
        }

        protected void m17348a() {
            try {
                int dimensionPixelSize = ((C2535e.f14679c - (this.f12874c.f12880e.getDimensionPixelSize(R.dimen.gap_big) * 2)) / 6) - (this.f12874c.f12880e.getDimensionPixelSize(R.dimen.gap_small) * 2);
                this.mIcon.setLayoutParams(new LayoutParams(dimensionPixelSize, dimensionPixelSize));
            } catch (Throwable th) {
            }
            ImageCache.m17562a(this.f12874c.f12878c, this.mIcon, this.f12872a.m19367a());
            m17347b();
        }

        private void m17347b() {
            this.mContainer.getViewTreeObserver().addOnGlobalLayoutListener(new C2402m(this));
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12875b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12875b = t;
            t.mContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mContainer'", ViewGroup.class);
            t.mIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.icon, "field 'mIcon'", ImageView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17353a(i);
    }

    public ShareGridAdapter(Activity activity, GridView gridView) {
        this.f12877b = gridView;
        this.f12878c = activity;
    }

    public void m17354a(ArrayList<cj> arrayList) {
        this.f12879d = arrayList;
        notifyDataSetChanged();
    }

    public cj m17353a(int i) {
        return (cj) this.f12879d.get(i);
    }

    public int getCount() {
        return this.f12879d.size();
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        OnClickListener a = m17353a(i);
        if (view == null) {
            view = this.f12876a.inflate(R.layout.item_share_popup_grid, viewGroup, false);
        }
        m17350a(view, a, i).m17348a();
        view.setOnClickListener(a);
        return view;
    }

    private ViewHolder m17350a(View view, cj cjVar, int i) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder == null) {
            viewHolder = new ViewHolder(this);
            ButterKnife.m2793a(viewHolder, view);
            view.setTag(viewHolder);
        }
        viewHolder.f12872a = cjVar;
        viewHolder.f12873b = i;
        return viewHolder;
    }
}
