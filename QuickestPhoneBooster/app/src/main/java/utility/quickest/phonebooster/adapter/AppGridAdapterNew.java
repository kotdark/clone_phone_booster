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

public class AppGridAdapterNew extends BaseAdapter {
    private List<C2446d> f12851a = new ArrayList();
    private LayoutInflater f12852b = LayoutInflater.from(MyApplicationLike.getApplication());

    public class ViewHolder {
        final /* synthetic */ AppGridAdapterNew f12849a;
        @BindView
        protected ImageView appIcon;
        @BindView
        protected TextView appName;

        protected ViewHolder(AppGridAdapterNew appGridAdapterNew) {
            this.f12849a = appGridAdapterNew;
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12850b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12850b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17326a(i);
    }

    public int getCount() {
        return this.f12851a.size();
    }

    public C2446d m17326a(int i) {
        return (C2446d) this.f12851a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f12852b.inflate(R.layout.item_app_grid, null);
        }
        C2446d a = m17326a(i);
        ViewHolder a2 = m17325a(view);
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

    private ViewHolder m17325a(View view) {
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
