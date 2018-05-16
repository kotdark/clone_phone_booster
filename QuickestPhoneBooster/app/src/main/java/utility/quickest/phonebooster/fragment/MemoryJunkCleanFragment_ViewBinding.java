package utility.quickest.phonebooster.fragment;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.R;

public class MemoryJunkCleanFragment_ViewBinding<T extends MemoryJunkCleanFragment> implements Unbinder {
    protected T f13403b;
    private View f13404c;
    private View f13405d;

    public MemoryJunkCleanFragment_ViewBinding(T t, View view) {
        this.f13403b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13404c = a;
        a.setOnClickListener(new fa(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mMemoryJunkSize = (CustomRiseNumberTextView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size, "field 'mMemoryJunkSize'", CustomRiseNumberTextView.class);
        t.mMemoryJunkSizeContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size_container, "field 'mMemoryJunkSizeContainer'", ViewGroup.class);
        t.mMemoryJunkListView = (ListView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_list_view, "field 'mMemoryJunkListView'", ListView.class);
        a =  Utils.findRequiredView(view, R.id.memory_junk_clean_button, "field 'mMemoryJunkCleanButton' and method 'doClean'");
        t.mMemoryJunkCleanButton = (TextView)  Utils.castView(a, R.id.memory_junk_clean_button, "field 'mMemoryJunkCleanButton'", TextView.class);
        this.f13405d = a;
        a.setOnClickListener(new fb(this, t));
        t.mMemoryJunkCleanButtonBg = (CardView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_clean_button_bg, "field 'mMemoryJunkCleanButtonBg'", CardView.class);
        t.mMemoryJunkSizeUnit = (TextView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size_unit, "field 'mMemoryJunkSizeUnit'", TextView.class);
        t.mMemoryJunkSizeTotal = (TextView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size_total, "field 'mMemoryJunkSizeTotal'", TextView.class);
        t.mMemoryJunkSizeTotalContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size_total_container, "field 'mMemoryJunkSizeTotalContainer'", ViewGroup.class);
        t.mMemoryJunkSizeSuggested = (TextView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size_suggested, "field 'mMemoryJunkSizeSuggested'", TextView.class);
        t.mMemoryJunkSizeTotalTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_size_total_tag, "field 'mMemoryJunkSizeTotalTag'", TextView.class);
        t.mJunkFileProgress =  Utils.findRequiredView(view, R.id.junk_file_progress, "field 'mJunkFileProgress'");
    }
}
