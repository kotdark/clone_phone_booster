package utility.quickest.phonebooster.fragment;

import android.util.Pair;
import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class hc implements er {
    final /* synthetic */ StorageJunkCleanFragment f13811a;

    hc(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13811a = storageJunkCleanFragment;
    }

    public void mo3094a(es esVar) {
        switch (hl.f13822b[esVar.ordinal()]) {
            case 1:
                hh.m18628a(hm.JUNK);
                this.f13811a.f13489g = true;
                if (this.f13811a.f13488f.m17373g()) {
                    this.f13811a.m17923e();
                    return;
                }
                return;
            case 3:
                this.f13811a.mMemoryJunk.setImageResource(R.drawable.ic_load_finished);
                this.f13811a.m17919b(this.f13811a.mMemoryJunk);
                this.f13811a.mJunkCleanButtonBg.setCardBackgroundColor(this.f13811a.m17699c().getColor(R.color.main_color));
                this.f13811a.mJunkCleanButtonBg.setCardElevation((float) ViewUtil.m18918a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                this.f13811a.mJunkCleanButton.setClickable(true);
                this.f13811a.mGroupContainer.setVisibility(8);
                this.f13811a.mStorageJunkListView.setVisibility(0);
                this.f13811a.m17930h();
                if (((this.f13811a.f13483a.m18598c() + this.f13811a.f13484b.m18598c()) + this.f13811a.m17931i()) + this.f13811a.f13486d.m18479b() <= 0) {
                    this.f13811a.m17923e();
                    return;
                }
                this.f13811a.f13488f.m17367a(this.f13811a.f13483a.m18599d(), this.f13811a.f13484b.m18600e(), this.f13811a.f13494l, this.f13811a.f13486d.m18480c(), true);
                try {
                    this.f13811a.mStorageJunkListView.collapseGroup(0);
                    ThreadUtil.m19098a(new hd(this), 500);
                } catch (Throwable th) {
                }
                Pair a = C2542m.m19075a(this.f13811a.f13488f.m17364a());
                this.f13811a.mStorageJunkSize.setText((CharSequence) a.first);
                this.f13811a.mStorageJunkSizeUnit.setText((CharSequence) a.second);
                this.f13811a.mStorageJunkSizeTotalContainer.setVisibility(0);
                this.f13811a.mStorageJunkSizeTotal.setText(C2542m.m19088b(((this.f13811a.f13483a.m18598c() + this.f13811a.f13484b.m18598c()) + this.f13811a.m17931i()) + this.f13811a.f13486d.m18479b()));
                return;
            case 4:
                this.f13811a.mStorageJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
        this.f13811a.m17916a(str);
    }

    public void mo3096b(String str) {
    }
}
