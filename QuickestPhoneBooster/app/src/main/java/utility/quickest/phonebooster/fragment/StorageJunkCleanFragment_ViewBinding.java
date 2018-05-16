package utility.quickest.phonebooster.fragment;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.view.NoScrollListView;
import utility.quickest.phonebooster.R;

public class StorageJunkCleanFragment_ViewBinding<T extends StorageJunkCleanFragment> implements Unbinder {
    protected T f13497b;
    private View f13498c;
    private View f13499d;

    public StorageJunkCleanFragment_ViewBinding(T t, View view) {
        this.f13497b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13498c = a;
        a.setOnClickListener(new hm(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mStorageJunkSize = (CustomRiseNumberTextView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size, "field 'mStorageJunkSize'", CustomRiseNumberTextView.class);
        t.mStorageJunkSizeContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size_container, "field 'mStorageJunkSizeContainer'", ViewGroup.class);
        t.mStorageJunkListView = (NoScrollListView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_list_view, "field 'mStorageJunkListView'", NoScrollListView.class);
        t.mScrollView = (ScrollView)  Utils.findRequiredViewAsType(view, R.id.scroll_view, "field 'mScrollView'", ScrollView.class);
        a =  Utils.findRequiredView(view, R.id.storage_junk_clean_button, "field 'mJunkCleanButton' and method 'doClean'");
        t.mJunkCleanButton = (TextView)  Utils.castView(a, R.id.storage_junk_clean_button, "field 'mJunkCleanButton'", TextView.class);
        this.f13499d = a;
        a.setOnClickListener(new hn(this, t));
        t.mJunkCleanButtonBg = (CardView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_clean_button_bg, "field 'mJunkCleanButtonBg'", CardView.class);
        t.mStorageJunkSizeUnit = (TextView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size_unit, "field 'mStorageJunkSizeUnit'", TextView.class);
        t.mStorageJunkSizeTotal = (TextView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size_total, "field 'mStorageJunkSizeTotal'", TextView.class);
        t.mStorageJunkSizeTotalContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size_total_container, "field 'mStorageJunkSizeTotalContainer'", ViewGroup.class);
        t.mStorageJunkSizeSuggested = (TextView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size_suggested, "field 'mStorageJunkSizeSuggested'", TextView.class);
        t.mStorageJunkSizeTotalTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.storage_junk_size_total_tag, "field 'mStorageJunkSizeTotalTag'", TextView.class);
        t.mJunkFileProgress =  Utils.findRequiredView(view, R.id.junk_file_progress, "field 'mJunkFileProgress'");
        t.mGroupContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.group_container, "field 'mGroupContainer'", ViewGroup.class);
        t.mCacheJunk = (ImageView)  Utils.findRequiredViewAsType(view, R.id.cache_junk, "field 'mCacheJunk'", ImageView.class);
        t.mFileJunk = (ImageView)  Utils.findRequiredViewAsType(view, R.id.file_junk, "field 'mFileJunk'", ImageView.class);
        t.mApkJunk = (ImageView)  Utils.findRequiredViewAsType(view, R.id.apk_junk, "field 'mApkJunk'", ImageView.class);
        t.mMemoryJunk = (ImageView)  Utils.findRequiredViewAsType(view, R.id.memory_junk, "field 'mMemoryJunk'", ImageView.class);
    }
}
