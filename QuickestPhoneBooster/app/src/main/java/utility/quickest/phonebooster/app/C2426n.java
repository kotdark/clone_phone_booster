package utility.quickest.phonebooster.app;

import utility.quickest.phonebooster.model_helper.cw;
import utility.quickest.phonebooster.model_helper.db;
import com.mopub.nativeads.ViewBinder;
import com.mopub.nativeads.ViewBinder.Builder;
import utility.quickest.phonebooster.R;

/* compiled from: MyApplicationLike */
class C2426n implements cw {
    final /* synthetic */ MyApplicationLike f12995a;

    C2426n(MyApplicationLike c2416d) {
        this.f12995a = c2416d;
    }

    public ViewBinder mo3078a(db dbVar) {
        switch (C2419g.f12988b[dbVar.ordinal()]) {
            case 1:
                return new Builder(R.layout.item_ad_for_normal_full_screen).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 2:
                return new Builder(R.layout.item_ad_for_normal_01).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 3:
            case 4:
                return new Builder(R.layout.item_ad_for_normal_full_screen_06).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 5:
                return new Builder(R.layout.item_ad_for_normal_04).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 6:
                return new Builder(R.layout.item_ad_for_normal_full_screen_01).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 7:
                return new Builder(R.layout.item_ad_for_normal_05).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 8:
                return new Builder(R.layout.item_ad_for_normal_06).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 9:
                return new Builder(R.layout.item_ad_for_normal_full_screen_02).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 10:
                return new Builder(R.layout.item_ad_for_normal_full_screen_03).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 11:
                return new Builder(R.layout.item_ad_for_normal_full_screen_04).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            case 12:
                return new Builder(R.layout.item_ad_for_normal_full_screen_05).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
            default:
                return new Builder(R.layout.item_ad_for_normal).mainImageId(R.id.ad_image).iconImageId(R.id.ad_icon).callToActionId(R.id.ad_call).textId(R.id.ad_desc).titleId(R.id.ad_name).build();
        }
    }
}
