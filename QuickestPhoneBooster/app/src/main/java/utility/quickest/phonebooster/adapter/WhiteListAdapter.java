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
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class WhiteListAdapter extends BaseAdapter {
    private List<String> f12904a = new ArrayList();
    private LayoutInflater f12905b = LayoutInflater.from(MyApplicationLike.getApplication());
    private int f12906c = 1;
    private jt f12907d = jt.m18785a();

    public class ViewHolder {
        final /* synthetic */ WhiteListAdapter f12902a;
        @BindView
        protected ImageView actionButton;
        @BindView
        protected ViewGroup actionButtonContainer;
        @BindView
        protected ImageView appIcon;
        @BindView
        protected TextView appName;

        protected ViewHolder(WhiteListAdapter whiteListAdapter) {
            this.f12902a = whiteListAdapter;
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T f12903b;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f12903b = t;
            t.appIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'appIcon'", ImageView.class);
            t.appName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'appName'", TextView.class);
            t.actionButtonContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_button_container, "field 'actionButtonContainer'", ViewGroup.class);
            t.actionButton = (ImageView)  Utils.findRequiredViewAsType(view, R.id.action_button, "field 'actionButton'", ImageView.class);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m17381a(i);
    }

    public void m17382a(List<String> list, int i) {
        this.f12904a = list;
        this.f12906c = i;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f12904a.size();
    }

    public String m17381a(int i) {
        return (String) this.f12904a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String a = m17381a(i);
        if (view == null) {
            view = this.f12905b.inflate(R.layout.adapter_white_list, null);
        }
        ViewHolder a2 = m17379a(view);
        a2.appIcon.setImageDrawable(C2535e.m19029a(a));
        a2.appName.setText(C2535e.m19033b(a));
        if (1 == this.f12906c) {
            a2.actionButton.setImageResource(R.drawable.ic_delete_blue);
        } else if (2 == this.f12906c) {
            a2.actionButton.setImageResource(R.drawable.ic_add_blue);
        }
        a2.actionButtonContainer.setOnClickListener(new C2412w(this, a));
        return view;
    }

    private ViewHolder m17379a(View view) {
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
