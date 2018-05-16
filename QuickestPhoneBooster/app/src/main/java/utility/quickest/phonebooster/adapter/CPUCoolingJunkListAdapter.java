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
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;
import java.util.List;

public class CPUCoolingJunkListAdapter extends BaseAdapter {
    private List<C2397h> f12863a;
    private boolean f12864b;
    private LayoutInflater f12865c;

    public class ViewHolder {
        final /* synthetic */ CPUCoolingJunkListAdapter f12861a;
        @BindView
        protected ImageView appIcon;
        @BindView
        protected TextView appJunkSize;
        @BindView
        protected TextView appName;
        @BindView
        protected TextView appTag;
        @BindView
        protected ImageView stateButton;

        protected ViewHolder(CPUCoolingJunkListAdapter cPUCoolingJunkListAdapter) {
            this.f12861a = cPUCoolingJunkListAdapter;
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12862b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12862b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
            t.appTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_tag, "field 'appTag'", TextView.class);
            t.stateButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button, "field 'stateButton'", ImageView.class);
            t.appJunkSize = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_junk_size, "field 'appJunkSize'", TextView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17340a(i);
    }

    public int getCount() {
        return this.f12863a.size();
    }

    public C2397h m17340a(int i) {
        return (C2397h) this.f12863a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 8;
        C2397h a = m17340a(i);
        C2446d a2 = a.m17388a();
        if (view == null) {
            view = this.f12865c.inflate(R.layout.adapter_junk_list_cpu_cooling, null);
        }
        ViewHolder a3 = m17337a(view);
        a3.appIcon.setImageDrawable(C2535e.m19029a(a2.m17629a()));
        a3.appName.setText(C2535e.m19033b(a2.m17629a()));
        a3.appJunkSize.setText(C2542m.m19088b(a2.m17630b()));
        a3.stateButton.setVisibility(this.f12864b ? 0 : 8);
        TextView textView = a3.appTag;
        if (a.m17391c()) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (a.m17390b()) {
            a3.stateButton.setSelected(true);
            a3.appName.setTextColor(MyApplicationLike.getApplication().getResources().getColor(R.color.black));
            a3.appJunkSize.setTextColor(MyApplicationLike.getApplication().getResources().getColor(R.color.black));
            a3.appTag.setTextColor(MyApplicationLike.getApplication().getResources().getColor(R.color.black));
        } else {
            a3.stateButton.setSelected(false);
            a3.appName.setTextColor(MyApplicationLike.getApplication().getResources().getColor(R.color.gray_dark));
            a3.appJunkSize.setTextColor(MyApplicationLike.getApplication().getResources().getColor(R.color.gray_dark));
            a3.appTag.setTextColor(MyApplicationLike.getApplication().getResources().getColor(R.color.gray_dark));
        }
        view.setOnClickListener(new C2395f(this, a3, a, i));
        view.setOnLongClickListener(new C2396g(this, a2));
        return view;
    }

    private ViewHolder m17337a(View view) {
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
