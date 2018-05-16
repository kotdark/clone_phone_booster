package utility.quickest.phonebooster.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;
import java.util.List;

public class StorageJunkListAdapter extends BaseAdapter {
    private List<C2411v> f12899a;
    private boolean f12900b;
    private LayoutInflater f12901c;

    public class ViewHolder {
        final /* synthetic */ StorageJunkListAdapter f12897a;
        @BindView
        protected ImageView appIcon;
        @BindView
        protected TextView appJunkSize;
        @BindView
        protected TextView appName;
        @BindView
        protected ImageView stateButton;

        protected ViewHolder(StorageJunkListAdapter storageJunkListAdapter) {
            this.f12897a = storageJunkListAdapter;
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12898b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12898b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
            t.stateButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button, "field 'stateButton'", ImageView.class);
            t.appJunkSize = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_junk_size, "field 'appJunkSize'", TextView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17377a(i);
    }

    public int getCount() {
        return this.f12899a.size();
    }

    public C2411v m17377a(int i) {
        return (C2411v) this.f12899a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2411v a = m17377a(i);
        C2445c a2 = a.m17409a();
        if (view == null) {
            view = this.f12901c.inflate(R.layout.adapter_junk_list, null);
        }
        ViewHolder a3 = m17374a(view);
        a3.appIcon.setImageDrawable(C2535e.m19029a(a2.m17623a()));
        a3.appName.setText(C2535e.m19033b(a2.m17623a()));
        a3.appJunkSize.setText(C2542m.m19088b(a2.m17626c()));
        a3.stateButton.setSelected(a.m17411b());
        a3.stateButton.setVisibility(this.f12900b ? 0 : 8);
        view.setOnClickListener(new C2410u(this, a3, a, i));
        return view;
    }

    private ViewHolder m17374a(View view) {
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
