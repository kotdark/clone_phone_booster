package utility.quickest.phonebooster.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class AppGridAdapter extends BaseAdapter {
    private List<C2446d> f12847a = new ArrayList();
    private LayoutInflater f12848b = LayoutInflater.from(MyApplicationLike.getApplication());

    public class ViewHolder {
        final /* synthetic */ AppGridAdapter f12845a;
        @BindView
        protected ImageView appIcon;
        @BindView
        protected TextView appName;

        protected ViewHolder(AppGridAdapter appGridAdapter) {
            this.f12845a = appGridAdapter;
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12846b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12846b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17323a(i);
    }

    public void m17324a(List<C2446d> list) {
        this.f12847a.clear();
        for (C2446d c2446d : list) {
            if (C2535e.m19029a(c2446d.m17629a()) != null) {
                this.f12847a.add(c2446d);
            }
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f12847a.size();
    }

    public C2446d m17323a(int i) {
        return (C2446d) this.f12847a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f12848b.inflate(R.layout.item_app_grid, null);
        }
        C2446d a = m17323a(i);
        ViewHolder a2 = m17322a(view);
        Drawable a3 = C2535e.m19029a(a.m17629a());
        if (a3 != null) {
            a2.appIcon.setImageDrawable(a3);
        } else {
            a2.appIcon.setImageResource(R.drawable.im_default);
        }
        a2.appName.setText(C2535e.m19033b(a.m17629a()));
        int dimensionPixelSize = (C2535e.f14679c - (MyApplicationLike.getApplication().getResources().getDimensionPixelSize(R.dimen.gap_normal) * 14)) / 4;
        a2.appIcon.setLayoutParams(new LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return view;
    }

    private ViewHolder m17322a(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            return viewHolder;
        }
        viewHolder = new ViewHolder(this);
        ButterKnife.m2793a(viewHolder, view);
        view.setTag(viewHolder);
        return viewHolder;
    }
}
