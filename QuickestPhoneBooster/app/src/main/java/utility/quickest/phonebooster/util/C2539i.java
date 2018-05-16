package utility.quickest.phonebooster.util;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: EventUtil */
public enum C2539i {
    EVENT_CLOSE_ENABLE_LOCKED_SCREEN_TIP_VIEW,
    EVENT_IGNORE_APP_VIRUS,
    EVENT_CHECK_JUNK_LIST_ITEM,
    EVENT_ADD_TO_WHITE_LIST;
    
    private final Set<C2461k> mOnEventListenerSet;

    public void m19064a(Object obj) {
        m19065a(obj, false);
    }

    public void m19065a(Object obj, boolean z) {
        ThreadUtil.m19099a(z, new C2540j(this, obj));
    }

    public void m19063a(C2461k c2461k) {
        ThreadUtil.m19102b();
        if (c2461k != null) {
            this.mOnEventListenerSet.add(c2461k);
        }
    }

    public void m19066b(C2461k c2461k) {
        ThreadUtil.m19102b();
        if (c2461k != null) {
            this.mOnEventListenerSet.remove(c2461k);
        }
    }

    private void m19062b(Object obj) {
        ThreadUtil.m19102b();
        if (!this.mOnEventListenerSet.isEmpty()) {
            for (C2461k a : new ArrayList(this.mOnEventListenerSet)) {
                a.mo3091a(obj);
            }
        }
    }
}
