package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.view.cw;

/* compiled from: MainFragment */
class dx implements Runnable {
    final /* synthetic */ MainFragment f13669a;

    dx(MainFragment mainFragment) {
        this.f13669a = mainFragment;
    }

    public void run() {
        if (!this.f13669a.f13369p) {
            try {
                cw cwVar = new cw(this.f13669a.getActivity());
                cwVar.m19379a(1800);
                cwVar.m19380a(this.f13669a.mViewPager);
                this.f13669a.mViewPager.setCurrentItem(this.f13669a.mViewPager.getAdapter().getCount() - 1);
                cwVar.m19379a(500);
                cwVar.m19380a(this.f13669a.mViewPager);
            } catch (Throwable th) {
            }
        }
    }
}
