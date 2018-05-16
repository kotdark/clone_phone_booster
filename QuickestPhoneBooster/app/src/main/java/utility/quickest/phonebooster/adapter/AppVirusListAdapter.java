package utility.quickest.phonebooster.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.view.BacaCircleImageViewNoLimited;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppVirusListAdapter extends BaseAdapter {
    private List<C2393d> f12857a = new ArrayList();
    private LayoutInflater f12858b = LayoutInflater.from(MyApplicationLike.getApplication());
    private boolean f12859c = false;
    private Map< AppVirusInfo, Boolean> f12860d = new HashMap();

    public class ViewHolder {
        int f12853a;
        @BindView
        protected BacaCircleImageViewNoLimited appIcon;
        @BindView
        protected TextView appName;
        final /* synthetic */ AppVirusListAdapter f12854b;
        @BindView
        protected ImageView expandMalwareIcon;
        @BindView
        protected ImageView stateButton;
        @BindView
        protected TextView virusDesc;
        @BindView
        protected ViewGroup virusDetailContainer;

        protected ViewHolder(AppVirusListAdapter appVirusListAdapter) {
            this.f12854b = appVirusListAdapter;
        }

        @OnClick
        public void expandMalwareContainer() {
            boolean z = false;
            C2542m.m19082a("app_virus_adapter", "expand", null);
            if (this.virusDetailContainer.getVisibility() == 0) {
                this.virusDetailContainer.setVisibility(8);
                this.expandMalwareIcon.setImageResource(R.drawable.ic_arrow_down1);
            } else {
                this.virusDetailContainer.setVisibility(0);
                this.expandMalwareIcon.setImageResource(R.drawable.ic_arrow_up1);
            }
            if (this.f12854b.f12857a.get(this.f12853a) != null) {
                C2393d c2393d = (C2393d) this.f12854b.f12857a.get(this.f12853a);
                if (this.virusDetailContainer.getVisibility() == 0) {
                    z = true;
                }
                c2393d.m17383a(z);
            }
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12855b;
        private View f12856c;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12855b = t;
            t.appIcon = (BacaCircleImageViewNoLimited)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", BacaCircleImageViewNoLimited.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
            t.expandMalwareIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.expand_malware_icon, "field 'expandMalwareIcon'", ImageView.class);
            t.stateButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button, "field 'stateButton'", ImageView.class);
            t.virusDetailContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.virus_detail_container, "field 'virusDetailContainer'", ViewGroup.class);
            t.virusDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.virus_desc, "field 'virusDesc'", TextView.class);
            View a =  Utils.findRequiredView(view, R.id.expand_malware_container, "method 'expandMalwareContainer'");
            this.f12856c = a;
            a.setOnClickListener(new C2394e(this, t));
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17333a(i);
    }

    public void m17335a(List< AppVirusInfo> list) {
        Set hashSet = new HashSet();
        for (C2393d c2393d : this.f12857a) {
            if (c2393d.m17384a()) {
                hashSet.add(c2393d.m17385b());
            }
        }
        this.f12857a.clear();
        for ( AppVirusInfo c2448f : list) {
            if (hashSet.contains(c2448f)) {
                this.f12857a.add(new C2393d(c2448f, true, true));
            } else {
                this.f12857a.add(new C2393d(c2448f, true, true));
            }
        }
        this.f12859c = this.f12857a.size() == 1;
        notifyDataSetChanged();
    }

    public List< AppVirusInfo> m17334a() {
        List< AppVirusInfo> arrayList = new ArrayList();
        for (C2393d b : this.f12857a) {
            arrayList.add(b.m17385b());
        }
        return arrayList;
    }

    public List< AppVirusInfo> m17336b() {
        List< AppVirusInfo> arrayList = new ArrayList();
        for (C2393d c2393d : this.f12857a) {
            if (c2393d.m17386c()) {
                arrayList.add(c2393d.m17385b());
            }
        }
        return arrayList;
    }

    public int getCount() {
        return this.f12857a.size();
    }

    public C2393d m17333a(int i) {
        return (C2393d) this.f12857a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2393d a = m17333a(i);
         AppVirusInfo b = a.m17385b();
        View inflate = this.f12858b.inflate(R.layout.adapter_app_virus_list, null);
        ViewHolder a2 = m17327a(inflate);
        a2.f12853a = i;
        a2.appIcon.setImageDrawable(C2535e.m19029a(b.m17659a()));
        a2.appName.setText(C2535e.m19033b(b.m17659a()));
        a2.stateButton.setSelected(a.m17386c());
        a2.stateButton.setVisibility(this.f12859c ? 8 : 0);
        if (a.m17384a()) {
            a2.virusDetailContainer.setVisibility(0);
            a2.expandMalwareIcon.setImageResource(R.drawable.ic_arrow_up1);
        } else {
            a2.virusDetailContainer.setVisibility(8);
            a2.expandMalwareIcon.setImageResource(R.drawable.ic_arrow_down1);
        }
        a2.virusDesc.setText(b.m17660b());
        a2.stateButton.setOnClickListener(new C2390a(this, a2, inflate, b));
        return inflate;
    }

    private ViewHolder m17327a(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            return viewHolder;
        }
        viewHolder = new ViewHolder(this);
        ButterKnife.m2793a(viewHolder, view);
        view.setTag(viewHolder);
        return viewHolder;
    }

    private void m17330a(View view,  AppVirusInfo c2448f) {
        m17329a(view, new C2391b(this, c2448f));
    }

    private void m17329a(View view, AnimationListener animationListener) {
        Animation c2392c = new C2392c(this, view, view.getMeasuredWidth());
        if (animationListener != null) {
            c2392c.setAnimationListener(animationListener);
        }
        c2392c.setDuration(1000);
        view.startAnimation(c2392c);
    }
}
