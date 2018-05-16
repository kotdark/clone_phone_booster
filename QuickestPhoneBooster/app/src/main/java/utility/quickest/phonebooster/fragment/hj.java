package utility.quickest.phonebooster.fragment;

import android.util.Pair;
import utility.quickest.phonebooster.model_helper.gw;
import utility.quickest.phonebooster.model_helper.gx;
import utility.quickest.phonebooster.model_helper.gy;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class hj implements gw {
    final /* synthetic */ StorageJunkCleanFragment f13819a;

    hj(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13819a = storageJunkCleanFragment;
    }

    public void mo3111a(gy gyVar, gx gxVar) {
        switch (hl.f13821a[gxVar.ordinal()]) {
            case 1:
                this.f13819a.f13484b.m18597a(this.f13819a.f13488f.m17369c(), 0, 0);
                return;
            case 3:
                this.f13819a.mMemoryJunk.setImageResource(R.drawable.ic_load_finished);
                this.f13819a.m17919b(this.f13819a.mMemoryJunk);
                this.f13819a.mJunkCleanButtonBg.setCardBackgroundColor(this.f13819a.m17699c().getColor(R.color.main_color));
                this.f13819a.mJunkCleanButtonBg.setCardElevation((float) ViewUtil.m18918a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                this.f13819a.mJunkCleanButton.setClickable(true);
                this.f13819a.mGroupContainer.setVisibility(8);
                this.f13819a.mStorageJunkListView.setVisibility(0);
                this.f13819a.m17930h();
                if (((this.f13819a.f13483a.m18598c() + this.f13819a.f13484b.m18598c()) + this.f13819a.m17931i()) + this.f13819a.f13486d.m18479b() <= 0) {
                    this.f13819a.m17923e();
                    return;
                }
                this.f13819a.f13488f.m17367a(this.f13819a.f13483a.m18599d(), this.f13819a.f13484b.m18600e(), this.f13819a.f13494l, this.f13819a.f13486d.m18480c(), true);
                try {
                    this.f13819a.mStorageJunkListView.collapseGroup(0);
                    ThreadUtil.m19098a(new hk(this), 500);
                } catch (Throwable th) {
                }
                Pair a = C2542m.m19075a(this.f13819a.f13488f.m17364a());
                this.f13819a.mStorageJunkSize.setText((CharSequence) a.first);
                this.f13819a.mStorageJunkSizeUnit.setText((CharSequence) a.second);
                this.f13819a.mStorageJunkSizeTotalContainer.setVisibility(0);
                this.f13819a.mStorageJunkSizeTotal.setText(C2542m.m19088b(((this.f13819a.f13483a.m18598c() + this.f13819a.f13484b.m18598c()) + this.f13819a.m17931i()) + this.f13819a.f13486d.m18479b()));
                return;
            case 4:
                this.f13819a.mStorageJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3112a(gy gyVar, String str, int i) {
        this.f13819a.m17916a(str);
    }

    public void mo3113b(gy gyVar, String str, int i) {
    }
}
