package utility.quickest.phonebooster.adapter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.StorageJunkCleanFragment;
import utility.quickest.phonebooster.p114d.C2444b;
import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.p114d.C2450h;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageJunkExpandableListAdapter extends BaseExpandableListAdapter {
    private LayoutInflater f12888a = LayoutInflater.from(MyApplicationLike.getApplication());
    private List<C2409t> f12889b = new ArrayList();
    private ExpandableListView f12890c;
    private Resources f12891d;
    private boolean f12892e = false;
    private Map<String, Integer> f12893f = new HashMap();
    private int f12894g = 0;
    private boolean f12895h = false;
    private StorageJunkCleanFragment f12896i;

    public class ViewHolderChild {
        C2408s f12881a = null;
        @BindView
        protected ImageView appIcon;
        @BindView
        protected TextView appJunkSize;
        @BindView
        protected TextView appName;
        @BindView
        protected TextView appTag1;
        @BindView
        protected TextView appTag2;
        @BindView
        protected TextView appTag3;
        int f12882b;
        int f12883c;
        final /* synthetic */ StorageJunkExpandableListAdapter f12884d;
        @BindView
        protected ImageView stateButton;
        @BindView
        protected ViewGroup tagContainer;

        protected ViewHolderChild(StorageJunkExpandableListAdapter storageJunkExpandableListAdapter) {
            this.f12884d = storageJunkExpandableListAdapter;
        }
    }

    public class ViewHolderChild_ViewBinding<T extends ViewHolderChild> implements Unbinder {
        protected T f12885b;

        public ViewHolderChild_ViewBinding(T t, View view) {
            this.f12885b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
            t.stateButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button, "field 'stateButton'", ImageView.class);
            t.appJunkSize = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_junk_size, "field 'appJunkSize'", TextView.class);
            t.appTag1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_tag1, "field 'appTag1'", TextView.class);
            t.appTag2 = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_tag2, "field 'appTag2'", TextView.class);
            t.appTag3 = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_tag3, "field 'appTag3'", TextView.class);
            t.tagContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.tag_container, "field 'tagContainer'", ViewGroup.class);
        }
    }

    public class ViewHolderGroup {
        final /* synthetic */ StorageJunkExpandableListAdapter f12886a;
        @BindView
        protected TextView junkSizeText;
        @BindView
        protected ImageView stateButton;
        @BindView
        protected ImageView stateButton1;
        @BindView
        protected TextView title;
        @BindView
        protected ImageView titleIcon;
        @BindView
        protected TextView zeroTag;

        protected ViewHolderGroup(StorageJunkExpandableListAdapter storageJunkExpandableListAdapter) {
            this.f12886a = storageJunkExpandableListAdapter;
        }
    }

    public class ViewHolderGroup_ViewBinding<T extends ViewHolderGroup> implements Unbinder {
        protected T f12887b;

        public ViewHolderGroup_ViewBinding(T t, View view) {
            this.f12887b = t;
            t.title = (TextView)  Utils.findRequiredViewAsType(view, R.id.title, "field 'title'", TextView.class);
            t.stateButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button, "field 'stateButton'", ImageView.class);
            t.stateButton1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.state_button1, "field 'stateButton1'", ImageView.class);
            t.zeroTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.zero_tag, "field 'zeroTag'", TextView.class);
            t.titleIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.title_icon, "field 'titleIcon'", ImageView.class);
            t.junkSizeText = (TextView)  Utils.findRequiredViewAsType(view, R.id.junk_size_text, "field 'junkSizeText'", TextView.class);
        }
    }

    public /* synthetic */ Object getChild(int i, int i2) {
        return m17365a(i, i2);
    }

    public /* synthetic */ Object getGroup(int i) {
        return m17366a(i);
    }

    public StorageJunkExpandableListAdapter(ExpandableListView expandableListView, StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f12890c = expandableListView;
        this.f12891d = MyApplicationLike.getApplication().getResources();
        this.f12896i = storageJunkCleanFragment;
        this.f12893f = C2535e.m19030a(true);
    }

    public void m17367a(List<C2445c> list, List<C2450h> list2, List<C2444b> list3, List<C2446d> list4, boolean z) {
        this.f12892e = z;
        this.f12889b.clear();
        List arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (C2445c c2408s : list) {
                arrayList.add(new C2408s(c2408s, null, null, null, true));
            }
            this.f12889b.add(new C2409t(this.f12891d.getString(R.string.power_saving_group1), arrayList, 1));
        }
        arrayList = new ArrayList();
        if (list2 != null && list2.size() > 0) {
            for (C2450h c2408s2 : list2) {
                arrayList.add(new C2408s(null, c2408s2, null, null, true));
            }
            this.f12889b.add(new C2409t(this.f12891d.getString(R.string.power_saving_group3), arrayList, 2));
        }
        List arrayList2 = new ArrayList();
        if (list3 != null && list3.size() > 0) {
            for (C2444b c2444b : list3) {
                boolean z2 = this.f12893f.containsKey(c2444b.m17616c()) && ((Integer) this.f12893f.get(c2444b.m17616c())).intValue() == c2444b.m17619f();
                boolean z3 = this.f12893f.containsKey(c2444b.m17616c()) && ((Integer) this.f12893f.get(c2444b.m17616c())).intValue() < c2444b.m17619f();
                boolean z4 = !this.f12893f.containsKey(c2444b.m17616c()) || (this.f12893f.containsKey(c2444b.m17616c()) && ((Integer) this.f12893f.get(c2444b.m17616c())).intValue() > c2444b.m17619f());
                Object obj = (!this.f12893f.containsKey(c2444b.m17616c()) || ((Integer) this.f12893f.get(c2444b.m17616c())).intValue() < c2444b.m17619f()) ? null : 1;
                boolean z5 = true;
                if (z && obj == null) {
                    z5 = false;
                }
                arrayList2.add(new C2408s(null, null, c2444b, null, z5, z2, z3, z4));
            }
            try {
                Collections.sort(arrayList2, new C2403n(this));
            } catch (Throwable th) {
            }
            this.f12889b.add(new C2409t(this.f12891d.getString(R.string.power_saving_group4), arrayList2, 3));
        }
        arrayList = new ArrayList();
        if (list4 != null && list4.size() > 0) {
            for (C2446d c2408s3 : list4) {
                arrayList.add(new C2408s(null, null, null, c2408s3, true));
            }
            this.f12889b.add(new C2409t(this.f12891d.getString(R.string.power_saving_group2), arrayList, 4));
        }
        notifyDataSetChanged();
    }

    public long m17364a() {
        long j = 0;
        for (C2445c c : m17368b()) {
            j = c.m17626c() + j;
        }
        for (C2450h d : m17369c()) {
            j += d.m17673d();
        }
        for (C2444b b : m17370d()) {
            j += b.m17615b();
        }
        for (C2446d b2 : m17371e()) {
            j += b2.m17630b();
        }
        return j;
    }

    public List<C2445c> m17368b() {
        List<C2445c> arrayList = new ArrayList();
        for (C2409t c2409t : this.f12889b) {
            if (c2409t.m17408c() == 1) {
                break;
            }
        }
        C2409t c2409t2 = null;
        if (c2409t2 == null) {
            return arrayList;
        }
        for (C2408s c2408s : c2409t2.m17407b()) {
            if (c2408s.m17403f() != null && c2408s.m17398a()) {
                arrayList.add(c2408s.m17403f());
            }
        }
        return arrayList;
    }

    public List<C2450h> m17369c() {
        List<C2450h> arrayList = new ArrayList();
        for (C2409t c2409t : this.f12889b) {
            if (c2409t.m17408c() == 2) {
                break;
            }
        }
        C2409t c2409t2 = null;
        if (c2409t2 == null) {
            return arrayList;
        }
        for (C2408s c2408s : c2409t2.m17407b()) {
            if (c2408s.m17404g() != null && c2408s.m17398a()) {
                arrayList.add(c2408s.m17404g());
            }
        }
        return arrayList;
    }

    public List<C2444b> m17370d() {
        List<C2444b> arrayList = new ArrayList();
        for (C2409t c2409t : this.f12889b) {
            if (c2409t.m17408c() == 3) {
                break;
            }
        }
        C2409t c2409t2 = null;
        if (c2409t2 == null) {
            return arrayList;
        }
        for (C2408s c2408s : c2409t2.m17407b()) {
            if (c2408s.m17405h() != null && c2408s.m17398a()) {
                arrayList.add(c2408s.m17405h());
            }
        }
        return arrayList;
    }

    public List<C2446d> m17371e() {
        List<C2446d> arrayList = new ArrayList();
        for (C2409t c2409t : this.f12889b) {
            if (c2409t.m17408c() == 4) {
                break;
            }
        }
        C2409t c2409t2 = null;
        if (c2409t2 == null) {
            return arrayList;
        }
        for (C2408s c2408s : c2409t2.m17407b()) {
            if (c2408s.m17402e() != null && c2408s.m17398a()) {
                arrayList.add(c2408s.m17402e());
            }
        }
        return arrayList;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (!this.f12892e) {
            int groupCount = getGroupCount();
            for (int i = 0; i < groupCount; i++) {
                try {
                    if (!this.f12890c.isGroupExpanded(i)) {
                        this.f12890c.expandGroup(i);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    public int getGroupCount() {
        return this.f12889b.size();
    }

    public int getChildrenCount(int i) {
        return ((C2409t) this.f12889b.get(i)).m17407b().size();
    }

    public C2409t m17366a(int i) {
        return (C2409t) this.f12889b.get(i);
    }

    public C2408s m17365a(int i, int i2) {
        return (C2408s) ((C2409t) this.f12889b.get(i)).m17407b().get(i2);
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public boolean hasStableIds() {
        return false;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        long j;
        if (view == null) {
            view = this.f12888a.inflate(R.layout.adapter_junk_title, null);
        }
        C2409t a = m17366a(i);
        ViewHolderGroup a2 = m17355a(view);
        a2.title.setText(a.m17406a());
        a2.stateButton.setImageResource(z ? R.drawable.ic_arrow_up : R.drawable.ic_arrow_down);
        a2.stateButton1.setSelected(m17360a(a));
        List<C2408s> b = a.m17407b();
        long c;
        if (a.m17408c() == 1) {
            j = 0;
            for (C2408s c2408s : b) {
                if (c2408s.m17403f() != null) {
                    c = c2408s.m17403f().m17626c() + j;
                } else {
                    c = j;
                }
                j = c;
            }
        } else if (a.m17408c() == 2) {
            j = 0;
            for (C2408s c2408s2 : b) {
                if (c2408s2.m17404g() != null) {
                    c = c2408s2.m17404g().m17673d() + j;
                } else {
                    c = j;
                }
                j = c;
            }
        } else if (a.m17408c() == 3) {
            j = 0;
            for (C2408s c2408s22 : b) {
                if (c2408s22.m17405h() != null) {
                    c = c2408s22.m17405h().m17615b() + j;
                } else {
                    c = j;
                }
                j = c;
            }
        } else {
            j = 0;
            for (C2408s c2408s222 : b) {
                if (c2408s222.m17402e() != null) {
                    c = c2408s222.m17402e().m17630b() + j;
                } else {
                    c = j;
                }
                j = c;
            }
        }
        a2.junkSizeText.setText(C2542m.m19088b(j));
        if (this.f12892e) {
            a2.stateButton.setVisibility(0);
            if (a.m17407b() == null || a.m17407b().size() <= 0) {
                a2.stateButton1.setVisibility(4);
                a2.zeroTag.setVisibility(0);
            } else {
                a2.stateButton1.setVisibility(0);
                a2.zeroTag.setVisibility(8);
            }
        } else {
            a2.stateButton.setVisibility(8);
            a2.stateButton1.setVisibility(4);
            a2.zeroTag.setVisibility(8);
        }
        if (a.m17408c() == 1) {
            a2.titleIcon.setImageResource(R.drawable.ic_junk_clean3);
        } else if (a.m17408c() == 2) {
            a2.titleIcon.setImageResource(R.drawable.ic_junk_file);
        } else if (a.m17408c() == 3) {
            a2.titleIcon.setImageResource(R.drawable.ic_junk_apk);
        } else {
            a2.titleIcon.setImageResource(R.drawable.ic_phone_boost4);
        }
        a2.stateButton1.setOnClickListener(new C2404o(this, a));
        return view;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        Object obj;
        if (view == null) {
            view = this.f12888a.inflate(R.layout.adapter_junk_list, null);
        }
        C2408s a = m17365a(i, i2);
        CharSequence charSequence = "";
        long j = 0;
        String str = "";
        if (a.m17403f() != null) {
            charSequence = a.m17403f().m17623a();
            j = a.m17403f().m17626c();
            str = "cache";
        }
        if (a.m17404g() != null) {
            charSequence = a.m17404g().m17669a();
            j = a.m17404g().m17673d();
            str = "file";
        }
        if (a.m17405h() != null) {
            charSequence = a.m17405h().m17616c();
            j = a.m17405h().m17615b();
            str = "apk";
        }
        if (a.m17402e() != null) {
            charSequence = a.m17402e().m17629a();
            j = a.m17402e().m17630b();
            str = "running";
        }
        ViewHolderChild b = m17361b(view);
        Drawable a2 = C2535e.m19029a((String) charSequence);
        if (str.equals("apk")) {
            try {
                a2 = a.m17405h().m17618e();
            } catch (Throwable th) {
            }
        }
        if (a2 == null) {
            obj = -1;
            switch (str.hashCode()) {
                case 96796:
                    if (str.equals("apk")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (str.equals("file")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 94416770:
                    if (str.equals("cache")) {
                        obj = null;
                        break;
                    }
                    break;
                case 1550783935:
                    if (str.equals("running")) {
                        obj = 3;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    a2 = this.f12891d.getDrawable(R.drawable.ic_junk_apk1);
                    break;
                case 1:
                    a2 = this.f12891d.getDrawable(R.drawable.ic_junk_file1);
                    break;
                case 2:
                    a2 = this.f12891d.getDrawable(R.drawable.ic_junk_apk1);
                    break;
                case 3:
                    a2 = this.f12891d.getDrawable(R.drawable.ic_junk_apk1);
                    break;
            }
        }
        CharSequence b2 = C2535e.m19033b(charSequence);
        if (TextUtils.isEmpty(b2)) {
            obj = -1;
            switch (str.hashCode()) {
                case 96796:
                    if (str.equals("apk")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 3143036:
                    if (str.equals("file")) {
                        obj = null;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    charSequence = a.m17404g().m17671b();
                    break;
                case 1:
                    charSequence = a.m17405h().m17617d();
                    break;
            }
        }
        charSequence = b2;
        b.appIcon.setImageDrawable(a2);
        b.appName.setText(charSequence);
        b.appJunkSize.setText(C2542m.m19088b(j));
        b.stateButton.setSelected(a.m17398a());
        b.stateButton.setVisibility(this.f12892e ? 0 : 8);
        if (!str.equals("apk") || a.m17405h() == null) {
            b.tagContainer.setVisibility(8);
        } else {
            b.tagContainer.setVisibility(0);
            C2444b h = a.m17405h();
            if (a.m17400c()) {
                b.appTag1.setText(this.f12891d.getString(R.string.new_version));
            }
            if (a.m17401d()) {
                b.appTag1.setText(this.f12891d.getString(R.string.not_installed));
            }
            b.appTag2.setText(this.f12891d.getString(R.string.version));
            b.appTag3.setText(h.m17620g());
            b.appTag3.setTextColor(this.f12891d.getColor(R.color.gray_dark));
            if (a.m17399b()) {
                b.appTag1.setText(this.f12891d.getString(R.string.installed));
                b.appTag2.setText("");
                b.appTag3.setText(this.f12891d.getString(R.string.clean_apk_tip));
                b.appTag3.setTextColor(this.f12891d.getColor(R.color.gray5));
            }
        }
        b.f12882b = i;
        b.f12883c = i2;
        b.f12881a = a;
        view.setOnClickListener(new C2405p(this, a, i, i2));
        return view;
    }

    public boolean isChildSelectable(int i, int i2) {
        return false;
    }

    private boolean m17360a(C2409t c2409t) {
        for (C2408s a : c2409t.m17407b()) {
            if (!a.m17398a()) {
                return false;
            }
        }
        return true;
    }

    private void m17357a(C2409t c2409t, boolean z) {
        for (C2408s a : c2409t.m17407b()) {
            a.m17397a(z);
        }
    }

    private ViewHolderGroup m17355a(View view) {
        ViewHolderGroup viewHolderGroup = (ViewHolderGroup) view.getTag();
        if (viewHolderGroup != null) {
            return viewHolderGroup;
        }
        viewHolderGroup = new ViewHolderGroup(this);
        ButterKnife.m2793a(viewHolderGroup, view);
        view.setTag(viewHolderGroup);
        return viewHolderGroup;
    }

    private ViewHolderChild m17361b(View view) {
        ViewHolderChild viewHolderChild = (ViewHolderChild) view.getTag();
        if (viewHolderChild != null) {
            return viewHolderChild;
        }
        viewHolderChild = new ViewHolderChild(this);
        ButterKnife.m2793a(viewHolderChild, view);
        view.setTag(viewHolderChild);
        return viewHolderChild;
    }

    public void m17372f() {
        if (this.f12894g >= this.f12890c.getChildCount()) {
            this.f12895h = true;
            this.f12896i.m17935d();
            return;
        }
        View childAt;
        try {
            childAt = this.f12890c.getChildAt(this.f12894g);
        } catch (Throwable th) {
            childAt = null;
        }
        if (childAt != null) {
            ViewHolderChild viewHolderChild;
            this.f12894g++;
            if (childAt.getTag() instanceof ViewHolderChild) {
                m17363c(childAt);
                viewHolderChild = (ViewHolderChild) childAt.getTag();
                C2408s c2408s = viewHolderChild.f12881a;
                if (c2408s != null) {
                    c2408s.m17397a(false);
                    try {
                        ((C2409t) this.f12889b.get(viewHolderChild.f12882b)).m17407b().set(viewHolderChild.f12883c, c2408s);
                    } catch (Throwable th2) {
                    }
                    C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a((Object) "");
                }
            }
            if (this.f12890c.getChildCount() > 38) {
                try {
                    childAt = this.f12890c.getChildAt(this.f12894g);
                } catch (Throwable th3) {
                    childAt = null;
                }
                if (childAt != null) {
                    this.f12894g++;
                    if (childAt.getTag() instanceof ViewHolderChild) {
                        m17363c(childAt);
                        viewHolderChild = (ViewHolderChild) childAt.getTag();
                        C2408s c2408s2 = viewHolderChild.f12881a;
                        if (c2408s2 != null) {
                            c2408s2.m17397a(false);
                            try {
                                ((C2409t) this.f12889b.get(viewHolderChild.f12882b)).m17407b().set(viewHolderChild.f12883c, c2408s2);
                            } catch (Throwable th4) {
                            }
                            C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a((Object) "");
                        }
                    }
                }
            }
        }
        ThreadUtil.m19098a(new C2406q(this), 200);
    }

    private void m17363c(View view) {
        Animation c2407r = new C2407r(this, view, view.getMeasuredWidth());
        c2407r.setDuration(200);
        view.startAnimation(c2407r);
    }

    public boolean m17373g() {
        return this.f12895h;
    }
}
