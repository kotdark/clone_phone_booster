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
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class MemoryJunkListAdapter extends BaseAdapter {
    private List<C2401l> f12868a = new ArrayList();
    private boolean f12869b = false;
    private LayoutInflater f12870c = LayoutInflater.from(MyApplicationLike.getApplication());
    private jt f12871d = jt.m18785a();

    public class ViewHolder {
        final /* synthetic */ MemoryJunkListAdapter f12866a;
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

        protected ViewHolder(MemoryJunkListAdapter memoryJunkListAdapter) {
            this.f12866a = memoryJunkListAdapter;
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12867b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12867b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
            t.appTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_tag, "field 'appTag'", TextView.class);
            t.stateButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button, "field 'stateButton'", ImageView.class);
            t.appJunkSize = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_junk_size, "field 'appJunkSize'", TextView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17344a(i);
    }

    public void m17346a(List<C2446d> list, boolean z) {
        this.f12868a.clear();
        for (C2446d c2446d : list) {
            if (this.f12871d.m18806a(c2446d.m17629a())) {
                this.f12868a.add(new C2401l(c2446d, false, true));
            } else {
                this.f12868a.add(new C2401l(c2446d, true, false));
            }
        }
        this.f12869b = z;
        notifyDataSetChanged();
    }

    public List<C2446d> m17345a() {
        List<C2446d> arrayList = new ArrayList();
        for (C2401l c2401l : this.f12868a) {
            if (c2401l.m17394b()) {
                arrayList.add(c2401l.m17392a());
            }
        }
        return arrayList;
    }

    public int getCount() {
        return this.f12868a.size();
    }

    public C2401l m17344a(int i) {
        return (C2401l) this.f12868a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 8;
        C2401l a = m17344a(i);
        C2446d a2 = a.m17392a();
        if (view == null) {
            view = this.f12870c.inflate(R.layout.adapter_junk_list, null);
        }
        ViewHolder a3 = m17341a(view);
        a3.appIcon.setImageDrawable(C2535e.m19029a(a2.m17629a()));
        a3.appName.setText(C2535e.m19033b(a2.m17629a()));
        a3.appJunkSize.setText(C2542m.m19088b(a2.m17630b()));
        a3.stateButton.setVisibility(this.f12869b ? 0 : 8);
        TextView textView = a3.appTag;
        if (a.m17395c()) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (a.m17394b()) {
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
        view.setOnClickListener(new C2399j(this, a3, a, i));
        view.setOnLongClickListener(new C2400k(this, a2));
        return view;
    }

    private ViewHolder m17341a(View view) {
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
