package utility.quickest.phonebooster.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.facebook.ads.C0939b;
import com.facebook.ads.MediaView;
import com.facebook.ads.ad;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.activity.BaseActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.cache.ImageCache;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.cx;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hn;
import utility.quickest.phonebooster.model_helper.im;
import utility.quickest.phonebooster.p114d.OwnCampaignInfo;
import utility.quickest.phonebooster.view.BacaCircleImageView;
import utility.quickest.phonebooster.view.C2598x;
import com.mopub.mobileads.resource.DrawableConstants.CloseButton;
import com.mopub.nativeads.NativeAd;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public final class ViewUtil {

    public class ViewHolderAdBlank {
        int f14530a;
        int f14531b;
        boolean f14532c = false;
        @BindView(R.id.ad_call)
        protected TextView mAdCall;
        @BindView(R.id.container)
        protected ViewGroup mAdContainer;
        @BindView(R.id.ad_desc)
        protected TextView mAdDesc;
        @BindView(R.id.ad_icon)
        protected BacaCircleImageView mAdIcon;
        @BindView(R.id.ad_image)
        protected ImageView mAdImage;
        @BindView(R.id.ad_name)
        protected TextView mAdName;
        @BindView(R.id.ad_tag)
        protected TextView mAdTag;

        protected ViewHolderAdBlank() {
        }

        void m18871a() {
            this.mAdImage.setLayoutParams(new LayoutParams(this.f14530a, this.f14531b));
            if (this.f14532c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(View.INVISIBLE);
            }
        }
    }

    public class ViewHolderAdBlank_ViewBinding<T extends ViewHolderAdBlank> implements Unbinder {
        protected T f14533b;

        public ViewHolderAdBlank_ViewBinding(T t, View view) {
            this.f14533b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }

        @Override
        public void unbind() {

        }
    }

    public class ViewHolderAdMobPower01 extends ac {
        @BindView(R.id.ad_call)
        protected TextView mAdCall;
        @BindView(R.id.container)
        protected ViewGroup mAdContainer;
        @BindView(R.id.ad_desc)
        protected TextView mAdDesc;
        @BindView(R.id.ad_icon)
        protected BacaCircleImageView mAdIcon;
        @BindView(R.id.ad_image)
        protected ImageView mAdImage;
        @BindView(R.id.ad_name)
        protected TextView mAdName;
    }

    public class ViewHolderAdMobPower01_ViewBinding<T extends ViewHolderAdMobPower01> implements Unbinder {
        protected T f14534b;

        public ViewHolderAdMobPower01_ViewBinding(T t, View view) {
            this.f14534b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }

        @Override
        public void unbind() {
        }
    }

    public class ViewHolderAdMobPower02 extends ad {
        @BindView(R.id.ad_call)
        protected TextView mAdCall;
        @BindView(R.id.container)
        protected ViewGroup mAdContainer;
        @BindView(R.id.ad_desc)
        protected TextView mAdDesc;
        @BindView(R.id.ad_icon)
        protected BacaCircleImageView mAdIcon;
        @BindView(R.id.ad_image)
        protected ImageView mAdImage;
        @BindView(R.id.ad_name)
        protected TextView mAdName;
    }

    public class ViewHolderAdMobPower02_ViewBinding<T extends ViewHolderAdMobPower02> implements Unbinder {
        protected T f14535b;

        public ViewHolderAdMobPower02_ViewBinding(T t, View view) {
            this.f14535b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }

        @Override
        public void unbind() {

        }
    }

    public class ViewHolderAdMobPower03 extends ae {
        @BindView(R.id.ad_call)
        protected TextView mAdCall;
        @BindView(R.id.container)
        protected ViewGroup mAdContainer;
        @BindView(R.id.ad_desc)
        protected TextView mAdDesc;
        @BindView(R.id.ad_icon)
        protected BacaCircleImageView mAdIcon;
        @BindView(R.id.ad_name)
        protected TextView mAdName;
    }

    public class ViewHolderAdMobPower03_ViewBinding<T extends ViewHolderAdMobPower03> implements Unbinder {
        protected T f14536b;

        public ViewHolderAdMobPower03_ViewBinding(T t, View view) {
            this.f14536b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }

        @Override
        public void unbind() {

        }
    }

    public class ViewHolderAdMobPower04 extends af {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdMobPower04() {
            super();
        }

        void m18872a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17563a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                ImageCache.m17563a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdMobPower04_ViewBinding<T extends ViewHolderAdMobPower04> implements Unbinder {
        protected T f14543b;

        public ViewHolderAdMobPower04_ViewBinding(T t, View view) {
            this.f14543b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdMobPower05 extends ag {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdMobPower05() {
            super();
        }

        void m18873a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdMobPower05_ViewBinding<T extends ViewHolderAdMobPower05> implements Unbinder {
        protected T f14549b;

        public ViewHolderAdMobPower05_ViewBinding(T t, View view) {
            this.f14549b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdMobPower06 extends ah {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdMobPower06() {
            super();
        }

        void m18874a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17565a(this.b, this.mAdImage, this.a.m18404b().m19403f());
                ImageCache.m17565a(this.b, this.mAdIcon, this.a.m18404b().m19405g());
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdMobPower06_ViewBinding<T extends ViewHolderAdMobPower06> implements Unbinder {
        protected T f14556b;

        public ViewHolderAdMobPower06_ViewBinding(T t, View view) {
            this.f14556b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdMobPower extends ab {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderAdMobPower_ViewBinding<T extends ViewHolderAdMobPower> implements Unbinder {
        protected T f14557b;

        public ViewHolderAdMobPower_ViewBinding(T t, View view) {
            this.f14557b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook01 extends ac {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDFacebook01_ViewBinding<T extends ViewHolderAdNDFacebook01> implements Unbinder {
        protected T f14558b;

        public ViewHolderAdNDFacebook01_ViewBinding(T t, View view) {
            this.f14558b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook02 extends ad {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDFacebook02_ViewBinding<T extends ViewHolderAdNDFacebook02> implements Unbinder {
        protected T f14559b;

        public ViewHolderAdNDFacebook02_ViewBinding(T t, View view) {
            this.f14559b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook03 extends ae {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDFacebook03_ViewBinding<T extends ViewHolderAdNDFacebook03> implements Unbinder {
        protected T f14560b;

        public ViewHolderAdNDFacebook03_ViewBinding(T t, View view) {
            this.f14560b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook04 extends af {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdNDFacebook04() {
            super();
        }

        void m18875a() {
            this.mAdMediaView.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, this.f, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                ImageCache.m17563a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDFacebook04_ViewBinding<T extends ViewHolderAdNDFacebook04> implements Unbinder {
        protected T f14561b;

        public ViewHolderAdNDFacebook04_ViewBinding(T t, View view) {
            this.f14561b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook05 extends ag {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdNDFacebook05() {
            super();
        }

        void m18876a() {
            this.mAdMediaView.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDFacebook05_ViewBinding<T extends ViewHolderAdNDFacebook05> implements Unbinder {
        protected T f14562b;

        public ViewHolderAdNDFacebook05_ViewBinding(T t, View view) {
            this.f14562b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook06 extends ah {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdNDFacebook06() {
            super();
        }

        void m18877a() {
            this.mAdMediaView.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, this.f, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                ImageCache.m17565a(this.b, this.mAdIcon, str);
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDFacebook06_ViewBinding<T extends ViewHolderAdNDFacebook06> implements Unbinder {
        protected T f14563b;

        public ViewHolderAdNDFacebook06_ViewBinding(T t, View view) {
            this.f14563b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDFacebook extends ab {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDFacebook_ViewBinding<T extends ViewHolderAdNDFacebook> implements Unbinder {
        protected T f14564b;

        public ViewHolderAdNDFacebook_ViewBinding(T t, View view) {
            this.f14564b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall01 extends ac {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderAdNDGPAppInstall01_ViewBinding<T extends ViewHolderAdNDGPAppInstall01> implements Unbinder {
        protected T f14565b;

        public ViewHolderAdNDGPAppInstall01_ViewBinding(T t, View view) {
            this.f14565b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall02 extends ad {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderAdNDGPAppInstall02_ViewBinding<T extends ViewHolderAdNDGPAppInstall02> implements Unbinder {
        protected T f14566b;

        public ViewHolderAdNDGPAppInstall02_ViewBinding(T t, View view) {
            this.f14566b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall03 extends ae {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDGPAppInstall03_ViewBinding<T extends ViewHolderAdNDGPAppInstall03> implements Unbinder {
        protected T f14567b;

        public ViewHolderAdNDGPAppInstall03_ViewBinding(T t, View view) {
            this.f14567b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall04 extends af {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderAdNDGPAppInstall04() {
            super();
        }

        void m18878a() {
            this.mMediaView.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17563a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                uri = "";
                try {
                    uri = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17563a(this.b, this.mAdIcon, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDGPAppInstall04_ViewBinding<T extends ViewHolderAdNDGPAppInstall04> implements Unbinder {
        protected T f14568b;

        public ViewHolderAdNDGPAppInstall04_ViewBinding(T t, View view) {
            this.f14568b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall05 extends ag {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderAdNDGPAppInstall05() {
            super();
        }

        void m18879a() {
            this.mMediaView.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                uri = "";
                try {
                    uri = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdIcon, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDGPAppInstall05_ViewBinding<T extends ViewHolderAdNDGPAppInstall05> implements Unbinder {
        protected T f14569b;

        public ViewHolderAdNDGPAppInstall05_ViewBinding(T t, View view) {
            this.f14569b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall06 extends ah {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderAdNDGPAppInstall06() {
            super();
        }

        void m18880a() {
            this.mMediaView.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17565a(this.b, this.mAdImage, uri);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                uri = "";
                try {
                    uri = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17565a(this.b, this.mAdIcon, uri);
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDGPAppInstall06_ViewBinding<T extends ViewHolderAdNDGPAppInstall06> implements Unbinder {
        protected T f14570b;

        public ViewHolderAdNDGPAppInstall06_ViewBinding(T t, View view) {
            this.f14570b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPAppInstall extends ab {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderAdNDGPAppInstall_ViewBinding<T extends ViewHolderAdNDGPAppInstall> implements Unbinder {
        protected T f14571b;

        public ViewHolderAdNDGPAppInstall_ViewBinding(T t, View view) {
            this.f14571b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent01 extends ac {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDGPContent01_ViewBinding<T extends ViewHolderAdNDGPContent01> implements Unbinder {
        protected T f14572b;

        public ViewHolderAdNDGPContent01_ViewBinding(T t, View view) {
            this.f14572b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent02 extends ad {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDGPContent02_ViewBinding<T extends ViewHolderAdNDGPContent02> implements Unbinder {
        protected T f14573b;

        public ViewHolderAdNDGPContent02_ViewBinding(T t, View view) {
            this.f14573b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent03 extends ae {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDGPContent03_ViewBinding<T extends ViewHolderAdNDGPContent03> implements Unbinder {
        protected T f14574b;

        public ViewHolderAdNDGPContent03_ViewBinding(T t, View view) {
            this.f14574b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent04 extends af {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdNDGPContent04() {
            super();
        }

        void m18881a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                ImageCache.m17563a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                uri = "";
                try {
                    uri = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17563a(this.b, this.mAdIcon, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDGPContent04_ViewBinding<T extends ViewHolderAdNDGPContent04> implements Unbinder {
        protected T f14575b;

        public ViewHolderAdNDGPContent04_ViewBinding(T t, View view) {
            this.f14575b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent05 extends ag {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdNDGPContent05() {
            super();
        }

        void m18882a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                uri = "";
                try {
                    uri = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdIcon, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDGPContent05_ViewBinding<T extends ViewHolderAdNDGPContent05> implements Unbinder {
        protected T f14576b;

        public ViewHolderAdNDGPContent05_ViewBinding(T t, View view) {
            this.f14576b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent06 extends ah {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdNDGPContent06() {
            super();
        }

        void m18883a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                ImageCache.m17565a(this.b, this.mAdImage, uri);
                this.mAdContainer.setImageView(this.mAdImage);
                uri = "";
                try {
                    uri = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17565a(this.b, this.mAdIcon, uri);
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdNDGPContent06_ViewBinding<T extends ViewHolderAdNDGPContent06> implements Unbinder {
        protected T f14577b;

        public ViewHolderAdNDGPContent06_ViewBinding(T t, View view) {
            this.f14577b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdNDGPContent extends ab {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdNDGPContent_ViewBinding<T extends ViewHolderAdNDGPContent> implements Unbinder {
        protected T f14578b;

        public ViewHolderAdNDGPContent_ViewBinding(T t, View view) {
            this.f14578b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderAdOwn01 extends ac {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdOwn01_ViewBinding<T extends ViewHolderAdOwn01> implements Unbinder {
        protected T f14579b;

        public ViewHolderAdOwn01_ViewBinding(T t, View view) {
            this.f14579b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdOwn02 extends ad {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdOwn02_ViewBinding<T extends ViewHolderAdOwn02> implements Unbinder {
        protected T f14580b;

        public ViewHolderAdOwn02_ViewBinding(T t, View view) {
            this.f14580b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdOwn03 extends ae {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderAdOwn03_ViewBinding<T extends ViewHolderAdOwn03> implements Unbinder {
        protected T f14581b;

        public ViewHolderAdOwn03_ViewBinding(T t, View view) {
            this.f14581b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdOwn04 extends af {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdOwn04() {
            super();
        }

        void m18884a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17563a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdIcon.setVisibility(8);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdOwn04_ViewBinding<T extends ViewHolderAdOwn04> implements Unbinder {
        protected T f14582b;

        public ViewHolderAdOwn04_ViewBinding(T t, View view) {
            this.f14582b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdOwn05 extends ag {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdOwn05() {
            super();
        }

        void m18885a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdIcon.setVisibility(8);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdOwn05_ViewBinding<T extends ViewHolderAdOwn05> implements Unbinder {
        protected T f14583b;

        public ViewHolderAdOwn05_ViewBinding(T t, View view) {
            this.f14583b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdOwn06 extends ah {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderAdOwn06() {
            super();
        }

        void m18886a() {
            this.mAdImage.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17565a(this.b, this.mAdImage, this.a.m18402a().m17681d());
                this.mAdIcon.setVisibility(8);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderAdOwn06_ViewBinding<T extends ViewHolderAdOwn06> implements Unbinder {
        protected T f14584b;

        public ViewHolderAdOwn06_ViewBinding(T t, View view) {
            this.f14584b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderAdOwn extends ab {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderAdOwnVertical04 extends af {
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected ImageView mAdImage;

        protected ViewHolderAdOwnVertical04() {
            super();
        }

        void m18887a() {
            if (this.a == null || this.a.m18402a() == null) {
                this.mAdContainer.setVisibility(4);
                return;
            }
            this.a.m18403a(this.mAdContainer, null, this.f, new Object[0]);
            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ImageCache.m17563a(this.b, this.mAdImage, this.a.m18402a().m17681d(), 0, 0);
        }
    }

    public class ViewHolderAdOwnVertical04_ViewBinding<T extends ViewHolderAdOwnVertical04> implements Unbinder {
        protected T f14585b;

        public ViewHolderAdOwnVertical04_ViewBinding(T t, View view) {
            this.f14585b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
        }
    }

    public class ViewHolderAdOwn_ViewBinding<T extends ViewHolderAdOwn> implements Unbinder {
        protected T f14586b;

        public ViewHolderAdOwn_ViewBinding(T t, View view) {
            this.f14586b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderFullScreenAdMobPower01 extends aj {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdMobPower01() {
            super();
        }

        void m18888a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18404b().m19405g())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(0);
                this.mAdIconDivider.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams2);
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdMobPower01_ViewBinding<T extends ViewHolderFullScreenAdMobPower01> implements Unbinder {
        protected T f14593b;

        public ViewHolderFullScreenAdMobPower01_ViewBinding(T t, View view) {
            this.f14593b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdMobPower02 extends ak {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdMobPower02_1 extends al {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdMobPower02_1() {
            super();
        }

        void m18889a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18404b().m19405g())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdMobPower02_1_ViewBinding<T extends ViewHolderFullScreenAdMobPower02_1> implements Unbinder {
        protected T f14600b;

        public ViewHolderFullScreenAdMobPower02_1_ViewBinding(T t, View view) {
            this.f14600b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdMobPower02_ViewBinding<T extends ViewHolderFullScreenAdMobPower02> implements Unbinder {
        protected T f14601b;

        public ViewHolderFullScreenAdMobPower02_ViewBinding(T t, View view) {
            this.f14601b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdMobPower03 extends am {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdMobPower03_ViewBinding<T extends ViewHolderFullScreenAdMobPower03> implements Unbinder {
        protected T f14602b;

        public ViewHolderFullScreenAdMobPower03_ViewBinding(T t, View view) {
            this.f14602b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
        }
    }

    public class ViewHolderFullScreenAdMobPower04 extends an {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallBg01;
        @BindView
        protected View mAdCallBg02;
        @BindView
        protected ViewGroup mAdCallContainer;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdMobPower04() {
            super();
        }

        void m18890a() {
            int i;
            int i2;
            int parseFloat;
            int i3;
            int i4;
            int i5;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            try {
                i = (int) ((((float) C2535e.f14679c) / 1080.0f) * CloseButton.TEXT_SIZE_SP);
                try {
                    i2 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 140.0f)) * 2);
                    parseFloat = (int) (((float) i2) / Float.parseFloat(MyApplicationLike.getApplication().getString(R.string.ad_image_scale)));
                    try {
                        i3 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 78.0f)) * 2);
                        i4 = (((int) ((((float) C2535e.f14679c) / 1080.0f) * 60.0f)) * 2) + parseFloat;
                    } catch (Throwable th) {
                        i4 = 0;
                        i3 = 0;
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                        if (parseFloat < 0) {
                            parseFloat = 0;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                        layoutParams.addRule(13);
                        this.mAdImage.setLayoutParams(layoutParams);
                        this.mAdImage.setTranslationY((float) (-i2));
                        layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                        layoutParams2.addRule(13);
                        this.mAdImageBg.setLayoutParams(layoutParams2);
                        if (hn.STYLE_A.equals(hh.m18645j())) {
                            this.mAdCallBg01.setBackgroundColor(-11708539);
                            this.mAdCallBg02.setBackgroundColor(-9470785);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                        } else {
                            this.mAdCallBg01.setBackgroundColor(-14078919);
                            this.mAdCallBg02.setBackgroundColor(-12894382);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                        }
                        if (this.a == null) {
                        }
                        if (this.c) {
                            this.mAdContainer.setVisibility(4);
                        } else {
                            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        }
                    }
                } catch (Throwable th2) {
                    i4 = 0;
                    i3 = 0;
                    parseFloat = 0;
                    i2 = 0;
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    } else {
                        this.mAdContainer.setVisibility(4);
                    }
                }
                try {
                    this.mAdImageBg.setImageResource(R.drawable.bg_ad_image);
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                } catch (Throwable th3) {
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setVisibility(4);
                    } else {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                }
            } catch (Throwable th4) {
                i = 0;
                i4 = 0;
                i3 = 0;
                parseFloat = 0;
                i2 = 0;
                i5 = i;
                i = i4;
                i4 = i3;
                i3 = parseFloat;
                parseFloat = i2;
                i2 = i5;
                if (parseFloat < 0) {
                    parseFloat = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                layoutParams.addRule(13);
                this.mAdImage.setLayoutParams(layoutParams);
                this.mAdImage.setTranslationY((float) (-i2));
                layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                layoutParams2.addRule(13);
                this.mAdImageBg.setLayoutParams(layoutParams2);
                if (hn.STYLE_A.equals(hh.m18645j())) {
                    this.mAdCallBg01.setBackgroundColor(-14078919);
                    this.mAdCallBg02.setBackgroundColor(-12894382);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                } else {
                    this.mAdCallBg01.setBackgroundColor(-11708539);
                    this.mAdCallBg02.setBackgroundColor(-9470785);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                }
                if (this.a == null) {
                }
                if (this.c) {
                    this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                } else {
                    this.mAdContainer.setVisibility(4);
                }
            }
            if (parseFloat < 0) {
                parseFloat = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i < 0) {
                i = 0;
            }
            layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            this.mAdImage.setTranslationY((float) (-i2));
            layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
            layoutParams2.addRule(13);
            this.mAdImageBg.setLayoutParams(layoutParams2);
            if (hn.STYLE_A.equals(hh.m18645j())) {
                this.mAdCallBg01.setBackgroundColor(-14078919);
                this.mAdCallBg02.setBackgroundColor(-12894382);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
            } else {
                this.mAdCallBg01.setBackgroundColor(-11708539);
                this.mAdCallBg02.setBackgroundColor(-9470785);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
            }
            if (this.a == null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17565a(this.b, this.mAdImage, this.a.m18404b().m19403f());
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18404b().m19405g())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    i = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, i, 0, i);
                    this.mAdContainer.setLayoutParams(layoutParams3);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                ViewGroup.LayoutParams layoutParams4 = new LayoutParams(-1, 0);
                layoutParams4.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams4);
                layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams4.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams4);
                ImageCache.m17565a(this.b, this.mAdIcon, this.a.m18404b().m19405g());
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdMobPower04_ViewBinding<T extends ViewHolderFullScreenAdMobPower04> implements Unbinder {
        protected T f14606b;

        public ViewHolderFullScreenAdMobPower04_ViewBinding(T t, View view) {
            this.f14606b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
            t.mAdCallContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_call_container, "field 'mAdCallContainer'", ViewGroup.class);
            t.mAdCallBg01 =  Utils.findRequiredView(view, R.id.ad_call_bg_01, "field 'mAdCallBg01'");
            t.mAdCallBg02 =  Utils.findRequiredView(view, R.id.ad_call_bg_02, "field 'mAdCallBg02'");
        }
    }

    public class ViewHolderFullScreenAdMobPower05 extends ao {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdMobPower05_ViewBinding<T extends ViewHolderFullScreenAdMobPower05> implements Unbinder {
        protected T f14607b;

        public ViewHolderFullScreenAdMobPower05_ViewBinding(T t, View view) {
            this.f14607b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderFullScreenAdMobPower06 extends ap {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdMobPower06() {
            super();
        }

        void m18891a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18404b().m19405g())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams2);
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdMobPower06_ViewBinding<T extends ViewHolderFullScreenAdMobPower06> implements Unbinder {
        protected T f14614b;

        public ViewHolderFullScreenAdMobPower06_ViewBinding(T t, View view) {
            this.f14614b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdMobPower07 extends aq {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdMobPower07() {
            super();
        }

        void m18892a() {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.d);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18404b().m19405g())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdMobPower07_ViewBinding<T extends ViewHolderFullScreenAdMobPower07> implements Unbinder {
        protected T f14619b;

        public ViewHolderFullScreenAdMobPower07_ViewBinding(T t, View view) {
            this.f14619b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdMobPower08 extends ar {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdMobPower08_ViewBinding<T extends ViewHolderFullScreenAdMobPower08> implements Unbinder {
        protected T f14620b;

        public ViewHolderFullScreenAdMobPower08_ViewBinding(T t, View view) {
            this.f14620b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdMobPower extends ai {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdMobPower() {
            super();
        }

        void m18893a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18404b() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18404b().m19409i());
                this.mAdName.setText(this.a.m18404b().m19397c());
                this.mAdDesc.setText(this.a.m18404b().m19399d());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18404b().m19403f(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18404b().m19405g())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(0);
                this.mAdIconDivider.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams2);
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18404b().m19405g(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdMobPower_ViewBinding<T extends ViewHolderFullScreenAdMobPower> implements Unbinder {
        protected T f14627b;

        public ViewHolderFullScreenAdMobPower_ViewBinding(T t, View view) {
            this.f14627b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook01 extends aj {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDFacebook01() {
            super();
        }

        void m18894a() {
            this.mAdMediaView.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                Resources resources = MyApplicationLike.getApplication().getResources();
                ViewGroup.LayoutParams layoutParams;
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(0);
                    this.mAdIconDivider.setVisibility(0);
                    layoutParams = new LayoutParams(-1, 0);
                    layoutParams.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDFacebook01_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook01> implements Unbinder {
        protected T f14628b;

        public ViewHolderFullScreenAdNDFacebook01_ViewBinding(T t, View view) {
            this.f14628b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook02 extends ak {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDFacebook02_1 extends al {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDFacebook02_1() {
            super();
        }

        void m18895a() {
            this.mAdMediaView.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                Resources resources = MyApplicationLike.getApplication().getResources();
                ViewGroup.LayoutParams layoutParams;
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDFacebook02_1_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook02_1> implements Unbinder {
        protected T f14629b;

        public ViewHolderFullScreenAdNDFacebook02_1_ViewBinding(T t, View view) {
            this.f14629b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook02_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook02> implements Unbinder {
        protected T f14630b;

        public ViewHolderFullScreenAdNDFacebook02_ViewBinding(T t, View view) {
            this.f14630b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook03 extends am {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDFacebook03_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook03> implements Unbinder {
        protected T f14631b;

        public ViewHolderFullScreenAdNDFacebook03_ViewBinding(T t, View view) {
            this.f14631b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
        }
    }

    public class ViewHolderFullScreenAdNDFacebook04 extends an {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallBg01;
        @BindView
        protected View mAdCallBg02;
        @BindView
        protected ViewGroup mAdCallContainer;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDFacebook04() {
            super();
        }

        void m18896a() {
            int i;
            int i2;
            int parseFloat;
            int i3;
            int i4;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            int i5;
            try {
                i = (int) ((((float) C2535e.f14679c) / 1080.0f) * CloseButton.TEXT_SIZE_SP);
                try {
                    i2 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 140.0f)) * 2);
                    parseFloat = (int) (((float) i2) / Float.parseFloat(MyApplicationLike.getApplication().getString(R.string.ad_image_scale)));
                    try {
                        i3 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 78.0f)) * 2);
                        i4 = (((int) ((((float) C2535e.f14679c) / 1080.0f) * 60.0f)) * 2) + parseFloat;
                    } catch (Throwable th) {
                        i4 = 0;
                        i3 = 0;
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                        if (parseFloat < 0) {
                            parseFloat = 0;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                        layoutParams.addRule(13);
                        this.mAdMediaView.setLayoutParams(layoutParams);
                        this.mAdMediaView.setTranslationY((float) (-i2));
                        layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                        layoutParams2.addRule(13);
                        this.mAdImageBg.setLayoutParams(layoutParams2);
                        if (hn.STYLE_A.equals(hh.m18645j())) {
                            this.mAdCallBg01.setBackgroundColor(-14078919);
                            this.mAdCallBg02.setBackgroundColor(-12894382);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                        } else {
                            this.mAdCallBg01.setBackgroundColor(-11708539);
                            this.mAdCallBg02.setBackgroundColor(-9470785);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                        }
                        if (this.a == null) {
                        }
                        if (this.c) {
                            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        } else {
                            this.mAdContainer.setVisibility(4);
                        }
                    }
                } catch (Throwable th2) {
                    i4 = 0;
                    i3 = 0;
                    parseFloat = 0;
                    i2 = 0;
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdMediaView.setLayoutParams(layoutParams);
                    this.mAdMediaView.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setVisibility(4);
                    } else {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                }
                try {
                    this.mAdImageBg.setImageResource(R.drawable.bg_ad_image);
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                } catch (Throwable th3) {
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdMediaView.setLayoutParams(layoutParams);
                    this.mAdMediaView.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setVisibility(4);
                    } else {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                }
            } catch (Throwable th4) {
                i = 0;
                i4 = 0;
                i3 = 0;
                parseFloat = 0;
                i2 = 0;
                i5 = i;
                i = i4;
                i4 = i3;
                i3 = parseFloat;
                parseFloat = i2;
                i2 = i5;
                if (parseFloat < 0) {
                    parseFloat = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                layoutParams.addRule(13);
                this.mAdMediaView.setLayoutParams(layoutParams);
                this.mAdMediaView.setTranslationY((float) (-i2));
                layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                layoutParams2.addRule(13);
                this.mAdImageBg.setLayoutParams(layoutParams2);
                if (hn.STYLE_A.equals(hh.m18645j())) {
                    this.mAdCallBg01.setBackgroundColor(-14078919);
                    this.mAdCallBg02.setBackgroundColor(-12894382);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                } else {
                    this.mAdCallBg01.setBackgroundColor(-11708539);
                    this.mAdCallBg02.setBackgroundColor(-9470785);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                }
                if (this.a == null) {
                }
                if (this.c) {
                    this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                } else {
                    this.mAdContainer.setVisibility(4);
                }
            }
            if (parseFloat < 0) {
                parseFloat = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i < 0) {
                i = 0;
            }
            layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
            layoutParams.addRule(13);
            this.mAdMediaView.setLayoutParams(layoutParams);
            this.mAdMediaView.setTranslationY((float) (-i2));
            layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
            layoutParams2.addRule(13);
            this.mAdImageBg.setLayoutParams(layoutParams2);
            if (hn.STYLE_A.equals(hh.m18645j())) {
                this.mAdCallBg01.setBackgroundColor(-14078919);
                this.mAdCallBg02.setBackgroundColor(-12894382);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
            } else {
                this.mAdCallBg01.setBackgroundColor(-11708539);
                this.mAdCallBg02.setBackgroundColor(-9470785);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
            }
            if (this.a == null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th5) {
                }
                this.mAdMediaView.setNativeAd(e);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    i = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, i, 0, i);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17565a(this.b, this.mAdIcon, str);
                }
                this.mAdContainer.setTag(e);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDFacebook04_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook04> implements Unbinder {
        protected T f14632b;

        public ViewHolderFullScreenAdNDFacebook04_ViewBinding(T t, View view) {
            this.f14632b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
            t.mAdCallContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_call_container, "field 'mAdCallContainer'", ViewGroup.class);
            t.mAdCallBg01 =  Utils.findRequiredView(view, R.id.ad_call_bg_01, "field 'mAdCallBg01'");
            t.mAdCallBg02 =  Utils.findRequiredView(view, R.id.ad_call_bg_02, "field 'mAdCallBg02'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook05 extends ao {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDFacebook05_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook05> implements Unbinder {
        protected T f14633b;

        public ViewHolderFullScreenAdNDFacebook05_ViewBinding(T t, View view) {
            this.f14633b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderFullScreenAdNDFacebook06 extends ap {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDFacebook06() {
            super();
        }

        void m18897a() {
            this.mAdMediaView.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                Resources resources = MyApplicationLike.getApplication().getResources();
                ViewGroup.LayoutParams layoutParams;
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    layoutParams = new LayoutParams(-1, 0);
                    layoutParams.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDFacebook06_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook06> implements Unbinder {
        protected T f14634b;

        public ViewHolderFullScreenAdNDFacebook06_ViewBinding(T t, View view) {
            this.f14634b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook07 extends aq {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDFacebook07() {
            super();
        }

        void m18898a() {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.d);
            layoutParams.addRule(13);
            this.mAdMediaView.setLayoutParams(layoutParams);
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdMediaView);
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                Resources resources = MyApplicationLike.getApplication().getResources();
                ViewGroup.LayoutParams layoutParams2;
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setTag(e);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDFacebook07_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook07> implements Unbinder {
        protected T f14635b;

        public ViewHolderFullScreenAdNDFacebook07_ViewBinding(T t, View view) {
            this.f14635b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook08 extends ar {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDFacebook08_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook08> implements Unbinder {
        protected T f14636b;

        public ViewHolderFullScreenAdNDFacebook08_ViewBinding(T t, View view) {
            this.f14636b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDFacebook extends ai {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdChoices;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected MediaView mAdMediaView;
        @BindView
        protected TextView mAdName;
        @BindView
        protected ImageView mAdSkip;

        protected ViewHolderFullScreenAdNDFacebook() {
            super();
        }

        void m18899a() {
            this.mAdMediaView.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18407e() != null) {
                List arrayList = new ArrayList();
                arrayList.add(this.mAdCall);
                this.a.m18403a(this.mAdContainer, arrayList, null, this.f);
                this.mAdSkip.setVisibility(0);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ad e = this.a.m18407e();
                this.mAdChoices.addView(new C0939b(MyApplicationLike.getApplication(), e, true));
                this.mAdCall.setText(String.valueOf(e.m4091i()));
                this.mAdName.setText(e.m4089g());
                this.mAdDesc.setText(e.m4090h() == null ? "" : e.m4090h());
                String str = "";
                try {
                    str = e.m4087e().m4148a();
                } catch (Throwable th) {
                }
                this.mAdMediaView.setNativeAd(e);
                Resources resources = MyApplicationLike.getApplication().getResources();
                ViewGroup.LayoutParams layoutParams;
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(0);
                    this.mAdIconDivider.setVisibility(0);
                    layoutParams = new LayoutParams(-1, 0);
                    layoutParams.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams);
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setTag(e);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDFacebook_ViewBinding<T extends ViewHolderFullScreenAdNDFacebook> implements Unbinder {
        protected T f14637b;

        public ViewHolderFullScreenAdNDFacebook_ViewBinding(T t, View view) {
            this.f14637b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdChoices = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_choices, "field 'mAdChoices'", ViewGroup.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdMediaView = (MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mAdMediaView'", MediaView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdSkip = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_skip, "field 'mAdSkip'", ImageView.class);
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall01 extends aj {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderFullScreenAdNDGPAppInstall01() {
            super();
        }

        void m18900a() {
            this.mMediaView.setLayoutParams(new LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(0);
                    this.mAdIconDivider.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, this.f);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall01_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall01> implements Unbinder {
        protected T f14638b;

        public ViewHolderFullScreenAdNDGPAppInstall01_ViewBinding(T t, View view) {
            this.f14638b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall02 extends ak {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderFullScreenAdNDGPAppInstall02_1 extends al {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderFullScreenAdNDGPAppInstall02_1() {
            super();
        }

        void m18901a() {
            this.mMediaView.setLayoutParams(new LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, this.f);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall02_1_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall02_1> implements Unbinder {
        protected T f14639b;

        public ViewHolderFullScreenAdNDGPAppInstall02_1_ViewBinding(T t, View view) {
            this.f14639b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall02_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall02> implements Unbinder {
        protected T f14640b;

        public ViewHolderFullScreenAdNDGPAppInstall02_ViewBinding(T t, View view) {
            this.f14640b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall03 extends am {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderFullScreenAdNDGPAppInstall03_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall03> implements Unbinder {
        protected T f14641b;

        public ViewHolderFullScreenAdNDGPAppInstall03_ViewBinding(T t, View view) {
            this.f14641b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall04 extends an {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallBg01;
        @BindView
        protected View mAdCallBg02;
        @BindView
        protected ViewGroup mAdCallContainer;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderFullScreenAdNDGPAppInstall04() {
            super();
        }

        void m18902a() {
            int i;
            int i2;
            int parseFloat;
            int i3;
            int i4;
            int i5;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            try {
                i = (int) ((((float) C2535e.f14679c) / 1080.0f) * CloseButton.TEXT_SIZE_SP);
                try {
                    i2 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 140.0f)) * 2);
                    parseFloat = (int) (((float) i2) / Float.parseFloat(MyApplicationLike.getApplication().getString(R.string.ad_image_scale)));
                    try {
                        i3 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 78.0f)) * 2);
                        i4 = (((int) ((((float) C2535e.f14679c) / 1080.0f) * 60.0f)) * 2) + parseFloat;
                    } catch (Throwable th) {
                        i4 = 0;
                        i3 = 0;
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                        if (parseFloat < 0) {
                            parseFloat = 0;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                        layoutParams.addRule(13);
                        this.mAdImage.setLayoutParams(layoutParams);
                        this.mMediaView.setLayoutParams(layoutParams);
                        this.mAdImage.setTranslationY((float) (-i2));
                        this.mMediaView.setTranslationY((float) (-i2));
                        layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                        layoutParams2.addRule(13);
                        this.mAdImageBg.setLayoutParams(layoutParams2);
                        if (hn.STYLE_A.equals(hh.m18645j())) {
                            this.mAdCallBg01.setBackgroundColor(-14078919);
                            this.mAdCallBg02.setBackgroundColor(-12894382);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                        } else {
                            this.mAdCallBg01.setBackgroundColor(-11708539);
                            this.mAdCallBg02.setBackgroundColor(-9470785);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                        }
                        if (this.a == null) {
                        }
                        if (this.c) {
                            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        } else {
                            this.mAdContainer.setVisibility(4);
                        }
                    }
                } catch (Throwable th2) {
                    i4 = 0;
                    i3 = 0;
                    parseFloat = 0;
                    i2 = 0;
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mMediaView.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    this.mMediaView.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    } else {
                        this.mAdContainer.setVisibility(4);
                    }
                }
                try {
                    this.mAdImageBg.setImageResource(R.drawable.bg_ad_image);
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                } catch (Throwable th3) {
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mMediaView.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    this.mMediaView.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setVisibility(4);
                    } else {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                }
            } catch (Throwable th4) {
                i = 0;
                i4 = 0;
                i3 = 0;
                parseFloat = 0;
                i2 = 0;
                i5 = i;
                i = i4;
                i4 = i3;
                i3 = parseFloat;
                parseFloat = i2;
                i2 = i5;
                if (parseFloat < 0) {
                    parseFloat = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                layoutParams.addRule(13);
                this.mAdImage.setLayoutParams(layoutParams);
                this.mMediaView.setLayoutParams(layoutParams);
                this.mAdImage.setTranslationY((float) (-i2));
                this.mMediaView.setTranslationY((float) (-i2));
                layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                layoutParams2.addRule(13);
                this.mAdImageBg.setLayoutParams(layoutParams2);
                if (hn.STYLE_A.equals(hh.m18645j())) {
                    this.mAdCallBg01.setBackgroundColor(-11708539);
                    this.mAdCallBg02.setBackgroundColor(-9470785);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                } else {
                    this.mAdCallBg01.setBackgroundColor(-14078919);
                    this.mAdCallBg02.setBackgroundColor(-12894382);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                }
                if (this.a == null) {
                }
                if (this.c) {
                    this.mAdContainer.setVisibility(4);
                } else {
                    this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
            }
            if (parseFloat < 0) {
                parseFloat = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i < 0) {
                i = 0;
            }
            layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            this.mMediaView.setLayoutParams(layoutParams);
            this.mAdImage.setTranslationY((float) (-i2));
            this.mMediaView.setTranslationY((float) (-i2));
            layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
            layoutParams2.addRule(13);
            this.mAdImageBg.setLayoutParams(layoutParams2);
            if (hn.STYLE_A.equals(hh.m18645j())) {
                this.mAdCallBg01.setBackgroundColor(-14078919);
                this.mAdCallBg02.setBackgroundColor(-12894382);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
            } else {
                this.mAdCallBg01.setBackgroundColor(-11708539);
                this.mAdCallBg02.setBackgroundColor(-9470785);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
            }
            if (this.a == null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th5) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1860i.getIcon().getUri().toString();
                } catch (Throwable th6) {
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17565a(this.b, this.mAdImage, uri);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    i4 = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, i4, 0, i4);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams3 = new LayoutParams(-1, 0);
                    layoutParams3.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams3);
                    layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams3);
                    ImageCache.m17565a(this.b, this.mAdIcon, str);
                }
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall04_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall04> implements Unbinder {
        protected T f14642b;

        public ViewHolderFullScreenAdNDGPAppInstall04_ViewBinding(T t, View view) {
            this.f14642b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
            t.mAdCallContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_call_container, "field 'mAdCallContainer'", ViewGroup.class);
            t.mAdCallBg01 =  Utils.findRequiredView(view, R.id.ad_call_bg_01, "field 'mAdCallBg01'");
            t.mAdCallBg02 =  Utils.findRequiredView(view, R.id.ad_call_bg_02, "field 'mAdCallBg02'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall05 extends ao {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderFullScreenAdNDGPAppInstall05_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall05> implements Unbinder {
        protected T f14643b;

        public ViewHolderFullScreenAdNDGPAppInstall05_ViewBinding(T t, View view) {
            this.f14643b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall06 extends ap {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderFullScreenAdNDGPAppInstall06() {
            super();
        }

        void m18903a() {
            this.mMediaView.setLayoutParams(new LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, this.f);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall06_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall06> implements Unbinder {
        protected T f14644b;

        public ViewHolderFullScreenAdNDGPAppInstall06_ViewBinding(T t, View view) {
            this.f14644b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall07 extends aq {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderFullScreenAdNDGPAppInstall07() {
            super();
        }

        void m18904a() {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.d);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            this.mMediaView.setLayoutParams(layoutParams);
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams3);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall07_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall07> implements Unbinder {
        protected T f14645b;

        public ViewHolderFullScreenAdNDGPAppInstall07_ViewBinding(T t, View view) {
            this.f14645b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall08 extends ar {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;
    }

    public class ViewHolderFullScreenAdNDGPAppInstall08_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall08> implements Unbinder {
        protected T f14646b;

        public ViewHolderFullScreenAdNDGPAppInstall08_ViewBinding(T t, View view) {
            this.f14646b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall extends ai {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeAppInstallAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected com.google.android.gms.ads.formats.MediaView mMediaView;

        protected ViewHolderFullScreenAdNDGPAppInstall() {
            super();
        }

        void m18905a() {
            this.mMediaView.setLayoutParams(new LayoutParams(this.c, this.d));
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeAppInstallAd)) {
                String uri;
                NativeAppInstallAd c1860i = (NativeAppInstallAd) this.a.m18406d();
                this.mAdName.setText(c1860i.mo2536b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1860i.mo2540f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1860i.mo2538d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1860i.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1860i.getIcon().getUri().toString();
                } catch (Throwable th2) {
                }
                if (c1860i.mo2544j() == null || !c1860i.mo2544j().m9626b()) {
                    this.mMediaView.setVisibility(8);
                    this.mAdImage.setVisibility(0);
                    ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                    this.mAdContainer.setImageView(this.mAdImage);
                } else {
                    this.mMediaView.setVisibility(0);
                    this.mAdImage.setVisibility(8);
                    this.mAdContainer.setMediaView(this.mMediaView);
                }
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(0);
                    this.mAdIconDivider.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setIconView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1860i);
                this.a.m18403a(this.mAdContainer, null, null, this.f);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPAppInstall_ViewBinding<T extends ViewHolderFullScreenAdNDGPAppInstall> implements Unbinder {
        protected T f14647b;

        public ViewHolderFullScreenAdNDGPAppInstall_ViewBinding(T t, View view) {
            this.f14647b = t;
            t.mAdContainer = (NativeAppInstallAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeAppInstallAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mMediaView = (com.google.android.gms.ads.formats.MediaView)  Utils.findRequiredViewAsType(view, R.id.ad_media_view, "field 'mMediaView'", com.google.android.gms.ads.formats.MediaView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent01 extends aj {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDGPContent01() {
            super();
        }

        void m18906a() {
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(0);
                    this.mAdIconDivider.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPContent01_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent01> implements Unbinder {
        protected T f14648b;

        public ViewHolderFullScreenAdNDGPContent01_ViewBinding(T t, View view) {
            this.f14648b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent02 extends ak {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDGPContent02_1 extends al {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDGPContent02_1() {
            super();
        }

        void m18907a() {
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPContent02_1_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent02_1> implements Unbinder {
        protected T f14649b;

        public ViewHolderFullScreenAdNDGPContent02_1_ViewBinding(T t, View view) {
            this.f14649b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent02_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent02> implements Unbinder {
        protected T f14650b;

        public ViewHolderFullScreenAdNDGPContent02_ViewBinding(T t, View view) {
            this.f14650b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent03 extends am {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDGPContent03_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent03> implements Unbinder {
        protected T f14651b;

        public ViewHolderFullScreenAdNDGPContent03_ViewBinding(T t, View view) {
            this.f14651b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
        }
    }

    public class ViewHolderFullScreenAdNDGPContent04 extends an {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallBg01;
        @BindView
        protected View mAdCallBg02;
        @BindView
        protected ViewGroup mAdCallContainer;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDGPContent04() {
            super();
        }

        void m18908a() {
            int i;
            int i2;
            int parseFloat;
            int i3;
            int i4;
            int i5;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            try {
                i = (int) ((((float) C2535e.f14679c) / 1080.0f) * CloseButton.TEXT_SIZE_SP);
                try {
                    i2 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 140.0f)) * 2);
                    parseFloat = (int) (((float) i2) / Float.parseFloat(MyApplicationLike.getApplication().getString(R.string.ad_image_scale)));
                    try {
                        i3 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 78.0f)) * 2);
                        i4 = (((int) ((((float) C2535e.f14679c) / 1080.0f) * 60.0f)) * 2) + parseFloat;
                    } catch (Throwable th) {
                        i4 = 0;
                        i3 = 0;
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                        if (parseFloat < 0) {
                            parseFloat = 0;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                        layoutParams.addRule(13);
                        this.mAdImage.setLayoutParams(layoutParams);
                        this.mAdImage.setTranslationY((float) (-i2));
                        layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                        layoutParams2.addRule(13);
                        this.mAdImageBg.setLayoutParams(layoutParams2);
                        if (hn.STYLE_A.equals(hh.m18645j())) {
                            this.mAdCallBg01.setBackgroundColor(-11708539);
                            this.mAdCallBg02.setBackgroundColor(-9470785);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                        } else {
                            this.mAdCallBg01.setBackgroundColor(-14078919);
                            this.mAdCallBg02.setBackgroundColor(-12894382);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                        }
                        if (this.a == null) {
                        }
                        if (this.c) {
                            this.mAdContainer.setVisibility(4);
                        } else {
                            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        }
                    }
                    try {
                        this.mAdImageBg.setImageResource(R.drawable.bg_ad_image);
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                    } catch (Throwable th2) {
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                        if (parseFloat < 0) {
                            parseFloat = 0;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                        layoutParams.addRule(13);
                        this.mAdImage.setLayoutParams(layoutParams);
                        this.mAdImage.setTranslationY((float) (-i2));
                        layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                        layoutParams2.addRule(13);
                        this.mAdImageBg.setLayoutParams(layoutParams2);
                        if (hn.STYLE_A.equals(hh.m18645j())) {
                            this.mAdCallBg01.setBackgroundColor(-14078919);
                            this.mAdCallBg02.setBackgroundColor(-12894382);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                        } else {
                            this.mAdCallBg01.setBackgroundColor(-11708539);
                            this.mAdCallBg02.setBackgroundColor(-9470785);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                        }
                        if (this.a == null) {
                        }
                        if (this.c) {
                            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        } else {
                            this.mAdContainer.setVisibility(4);
                        }
                    }
                } catch (Throwable th3) {
                    i4 = 0;
                    i3 = 0;
                    parseFloat = 0;
                    i2 = 0;
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setVisibility(4);
                    } else {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                }
            } catch (Throwable th4) {
                i = 0;
                i4 = 0;
                i3 = 0;
                parseFloat = 0;
                i2 = 0;
                i5 = i;
                i = i4;
                i4 = i3;
                i3 = parseFloat;
                parseFloat = i2;
                i2 = i5;
                if (parseFloat < 0) {
                    parseFloat = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                layoutParams.addRule(13);
                this.mAdImage.setLayoutParams(layoutParams);
                this.mAdImage.setTranslationY((float) (-i2));
                layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                layoutParams2.addRule(13);
                this.mAdImageBg.setLayoutParams(layoutParams2);
                if (hn.STYLE_A.equals(hh.m18645j())) {
                    this.mAdCallBg01.setBackgroundColor(-14078919);
                    this.mAdCallBg02.setBackgroundColor(-12894382);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                } else {
                    this.mAdCallBg01.setBackgroundColor(-11708539);
                    this.mAdCallBg02.setBackgroundColor(-9470785);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                }
                if (this.a == null) {
                }
                if (this.c) {
                    this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                } else {
                    this.mAdContainer.setVisibility(4);
                }
            }
            if (parseFloat < 0) {
                parseFloat = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i < 0) {
                i = 0;
            }
            layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            this.mAdImage.setTranslationY((float) (-i2));
            layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
            layoutParams2.addRule(13);
            this.mAdImageBg.setLayoutParams(layoutParams2);
            if (hn.STYLE_A.equals(hh.m18645j())) {
                this.mAdCallBg01.setBackgroundColor(-14078919);
                this.mAdCallBg02.setBackgroundColor(-12894382);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
            } else {
                this.mAdCallBg01.setBackgroundColor(-11708539);
                this.mAdCallBg02.setBackgroundColor(-9470785);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
            }
            if (this.a == null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th5) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1861k.getLogo().getUri().toString();
                } catch (Throwable th6) {
                }
                ImageCache.m17565a(this.b, this.mAdImage, uri);
                this.mAdContainer.setImageView(this.mAdImage);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    i4 = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, i4, 0, i4);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams3 = new LayoutParams(-1, 0);
                    layoutParams3.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams3);
                    layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams3);
                    ImageCache.m17565a(this.b, this.mAdIcon, str);
                }
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1861k);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPContent04_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent04> implements Unbinder {
        protected T f14652b;

        public ViewHolderFullScreenAdNDGPContent04_ViewBinding(T t, View view) {
            this.f14652b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
            t.mAdCallContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_call_container, "field 'mAdCallContainer'", ViewGroup.class);
            t.mAdCallBg01 =  Utils.findRequiredView(view, R.id.ad_call_bg_01, "field 'mAdCallBg01'");
            t.mAdCallBg02 =  Utils.findRequiredView(view, R.id.ad_call_bg_02, "field 'mAdCallBg02'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent05 extends ao {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDGPContent05_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent05> implements Unbinder {
        protected T f14653b;

        public ViewHolderFullScreenAdNDGPContent05_ViewBinding(T t, View view) {
            this.f14653b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
        }
    }

    public class ViewHolderFullScreenAdNDGPContent06 extends ap {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDGPContent06() {
            super();
        }

        void m18909a() {
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPContent06_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent06> implements Unbinder {
        protected T f14654b;

        public ViewHolderFullScreenAdNDGPContent06_ViewBinding(T t, View view) {
            this.f14654b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent07 extends aq {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDGPContent07() {
            super();
        }

        void m18910a() {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.d);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                } else {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams3);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1861k);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPContent07_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent07> implements Unbinder {
        protected T f14655b;

        public ViewHolderFullScreenAdNDGPContent07_ViewBinding(T t, View view) {
            this.f14655b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent08 extends ar {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
    }

    public class ViewHolderFullScreenAdNDGPContent08_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent08> implements Unbinder {
        protected T f14656b;

        public ViewHolderFullScreenAdNDGPContent08_ViewBinding(T t, View view) {
            this.f14656b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdNDGPContent extends ai {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected NativeContentAdView mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected ImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;

        protected ViewHolderFullScreenAdNDGPContent() {
            super();
        }

        void m18911a() {
            this.mAdImage.setLayoutParams(new LayoutParams(this.c, this.d));
            if (this.a != null && (this.a.m18406d() instanceof NativeContentAd)) {
                String uri;
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                NativeContentAd c1861k = (NativeContentAd) this.a.m18406d();
                this.mAdName.setText(c1861k.mo2546b());
                this.mAdContainer.setHeadlineView(this.mAdName);
                this.mAdCall.setText(c1861k.mo2550f());
                this.mAdContainer.setCallToActionView(this.mAdCall);
                this.mAdDesc.setText(c1861k.mo2548d());
                this.mAdContainer.setBodyView(this.mAdDesc);
                String str = "";
                try {
                    uri = ((NativeAd.Image) c1861k.getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = str;
                }
                str = "";
                try {
                    str = c1861k.getLogo().getUri().toString();
                } catch (Throwable th2) {
                }
                ImageCache.m17567a(this.b, this.mAdImage, uri, (int) R.drawable.im_default, (int) R.drawable.im_default);
                this.mAdContainer.setImageView(this.mAdImage);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(str)) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                } else {
                    this.mAdIcon.setVisibility(0);
                    this.mAdIconDivider.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                    layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.mAdCallDivider.setLayoutParams(layoutParams2);
                    layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, 0, 0, 0);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    ImageCache.m17567a(this.b, this.mAdIcon, str, (int) R.drawable.im_default, (int) R.drawable.im_default);
                }
                this.mAdContainer.setLogoView(this.mAdIcon);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdContainer.setTag(c1861k);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdNDGPContent_ViewBinding<T extends ViewHolderFullScreenAdNDGPContent> implements Unbinder {
        protected T f14657b;

        public ViewHolderFullScreenAdNDGPContent_ViewBinding(T t, View view) {
            this.f14657b = t;
            t.mAdContainer = (NativeContentAdView)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", NativeContentAdView.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn01 extends aj {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdOwn01() {
            super();
        }

        void m18912a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18402a().m17682e())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(0);
                this.mAdIconDivider.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams2);
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18402a().m17682e(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdOwn01_ViewBinding<T extends ViewHolderFullScreenAdOwn01> implements Unbinder {
        protected T f14658b;

        public ViewHolderFullScreenAdOwn01_ViewBinding(T t, View view) {
            this.f14658b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn02 extends ak {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdOwn02_1 extends al {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdOwn02_1() {
            super();
        }

        void m18913a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18402a().m17682e())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18402a().m17682e(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdOwn02_1_ViewBinding<T extends ViewHolderFullScreenAdOwn02_1> implements Unbinder {
        protected T f14659b;

        public ViewHolderFullScreenAdOwn02_1_ViewBinding(T t, View view) {
            this.f14659b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn02_ViewBinding<T extends ViewHolderFullScreenAdOwn02> implements Unbinder {
        protected T f14660b;

        public ViewHolderFullScreenAdOwn02_ViewBinding(T t, View view) {
            this.f14660b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn03 extends am {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdOwn03_ViewBinding<T extends ViewHolderFullScreenAdOwn03> implements Unbinder {
        protected T f14661b;

        public ViewHolderFullScreenAdOwn03_ViewBinding(T t, View view) {
            this.f14661b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
        }
    }

    public class ViewHolderFullScreenAdOwn04 extends an {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallBg01;
        @BindView
        protected View mAdCallBg02;
        @BindView
        protected ViewGroup mAdCallContainer;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected ImageView mAdImageBg;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdOwn04() {
            super();
        }

        void m18914a() {
            int i;
            int i2;
            int parseFloat;
            int i3;
            int i4;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            int i5;
            try {
                i = (int) ((((float) C2535e.f14679c) / 1080.0f) * CloseButton.TEXT_SIZE_SP);
                try {
                    i2 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 140.0f)) * 2);
                    parseFloat = (int) (((float) i2) / Float.parseFloat(MyApplicationLike.getApplication().getString(R.string.ad_image_scale)));
                    try {
                        i3 = C2535e.f14679c - (((int) ((((float) C2535e.f14679c) / 1080.0f) * 78.0f)) * 2);
                        i4 = (((int) ((((float) C2535e.f14679c) / 1080.0f) * 60.0f)) * 2) + parseFloat;
                    } catch (Throwable th) {
                        i4 = 0;
                        i3 = 0;
                        i5 = i;
                        i = i4;
                        i4 = i3;
                        i3 = parseFloat;
                        parseFloat = i2;
                        i2 = i5;
                        if (parseFloat < 0) {
                            parseFloat = 0;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                        layoutParams.addRule(13);
                        this.mAdImage.setLayoutParams(layoutParams);
                        this.mAdImage.setTranslationY((float) (-i2));
                        layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                        layoutParams2.addRule(13);
                        this.mAdImageBg.setLayoutParams(layoutParams2);
                        if (hn.STYLE_A.equals(hh.m18645j())) {
                            this.mAdCallBg01.setBackgroundColor(-11708539);
                            this.mAdCallBg02.setBackgroundColor(-9470785);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                        } else {
                            this.mAdCallBg01.setBackgroundColor(-14078919);
                            this.mAdCallBg02.setBackgroundColor(-12894382);
                            this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                        }
                        if (this.a == null) {
                        }
                        if (this.c) {
                            this.mAdContainer.setVisibility(4);
                        } else {
                            this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        }
                    }
                } catch (Throwable th2) {
                    i4 = 0;
                    i3 = 0;
                    parseFloat = 0;
                    i2 = 0;
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    } else {
                        this.mAdContainer.setVisibility(4);
                    }
                }
                try {
                    this.mAdImageBg.setImageResource(R.drawable.bg_ad_image);
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                } catch (Throwable th3) {
                    i5 = i;
                    i = i4;
                    i4 = i3;
                    i3 = parseFloat;
                    parseFloat = i2;
                    i2 = i5;
                    if (parseFloat < 0) {
                        parseFloat = 0;
                    }
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                    layoutParams.addRule(13);
                    this.mAdImage.setLayoutParams(layoutParams);
                    this.mAdImage.setTranslationY((float) (-i2));
                    layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                    layoutParams2.addRule(13);
                    this.mAdImageBg.setLayoutParams(layoutParams2);
                    if (hn.STYLE_A.equals(hh.m18645j())) {
                        this.mAdCallBg01.setBackgroundColor(-11708539);
                        this.mAdCallBg02.setBackgroundColor(-9470785);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                    } else {
                        this.mAdCallBg01.setBackgroundColor(-14078919);
                        this.mAdCallBg02.setBackgroundColor(-12894382);
                        this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                    }
                    if (this.a == null) {
                    }
                    if (this.c) {
                        this.mAdContainer.setVisibility(4);
                    } else {
                        this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                }
            } catch (Throwable th4) {
                i = 0;
                i4 = 0;
                i3 = 0;
                parseFloat = 0;
                i2 = 0;
                i5 = i;
                i = i4;
                i4 = i3;
                i3 = parseFloat;
                parseFloat = i2;
                i2 = i5;
                if (parseFloat < 0) {
                    parseFloat = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
                layoutParams.addRule(13);
                this.mAdImage.setLayoutParams(layoutParams);
                this.mAdImage.setTranslationY((float) (-i2));
                layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
                layoutParams2.addRule(13);
                this.mAdImageBg.setLayoutParams(layoutParams2);
                if (hn.STYLE_A.equals(hh.m18645j())) {
                    this.mAdCallBg01.setBackgroundColor(-14078919);
                    this.mAdCallBg02.setBackgroundColor(-12894382);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
                } else {
                    this.mAdCallBg01.setBackgroundColor(-11708539);
                    this.mAdCallBg02.setBackgroundColor(-9470785);
                    this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
                }
                if (this.a == null) {
                }
                if (this.c) {
                    this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                } else {
                    this.mAdContainer.setVisibility(4);
                }
            }
            if (parseFloat < 0) {
                parseFloat = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            if (i < 0) {
                i = 0;
            }
            layoutParams = new RelativeLayout.LayoutParams(parseFloat, i3);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            this.mAdImage.setTranslationY((float) (-i2));
            layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
            layoutParams2.addRule(13);
            this.mAdImageBg.setLayoutParams(layoutParams2);
            if (hn.STYLE_A.equals(hh.m18645j())) {
                this.mAdCallBg01.setBackgroundColor(-14078919);
                this.mAdCallBg02.setBackgroundColor(-12894382);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta2);
            } else {
                this.mAdCallBg01.setBackgroundColor(-11708539);
                this.mAdCallBg02.setBackgroundColor(-9470785);
                this.mAdCall.setBackgroundResource(R.drawable.bg_ad_cta3);
            }
            if (this.a == null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17565a(this.b, this.mAdImage, this.a.m18402a().m17681d());
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18402a().m17682e())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    i = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, i, 0, i);
                    this.mAdContainer.setLayoutParams(layoutParams3);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                ViewGroup.LayoutParams layoutParams4 = new LayoutParams(-1, 0);
                layoutParams4.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams4);
                layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams4.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams4);
                ImageCache.m17565a(this.b, this.mAdIcon, this.a.m18402a().m17682e());
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdOwn04_ViewBinding<T extends ViewHolderFullScreenAdOwn04> implements Unbinder {
        protected T f14662b;

        public ViewHolderFullScreenAdOwn04_ViewBinding(T t, View view) {
            this.f14662b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
            t.mAdImageBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image_bg, "field 'mAdImageBg'", ImageView.class);
            t.mAdCallContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_call_container, "field 'mAdCallContainer'", ViewGroup.class);
            t.mAdCallBg01 =  Utils.findRequiredView(view, R.id.ad_call_bg_01, "field 'mAdCallBg01'");
            t.mAdCallBg02 =  Utils.findRequiredView(view, R.id.ad_call_bg_02, "field 'mAdCallBg02'");
        }
    }

    public class ViewHolderFullScreenAdOwn05 extends ao {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdOwn05_ViewBinding<T extends ViewHolderFullScreenAdOwn05> implements Unbinder {
        protected T f14663b;

        public ViewHolderFullScreenAdOwn05_ViewBinding(T t, View view) {
            this.f14663b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
        }
    }

    public class ViewHolderFullScreenAdOwn06 extends ap {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdOwn06() {
            super();
        }

        void m18915a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18402a().m17682e())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams2);
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18402a().m17682e(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdOwn06_ViewBinding<T extends ViewHolderFullScreenAdOwn06> implements Unbinder {
        protected T f14664b;

        public ViewHolderFullScreenAdOwn06_ViewBinding(T t, View view) {
            this.f14664b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn07 extends aq {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdOwn07() {
            super();
        }

        void m18916a() {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.d);
            layoutParams.addRule(13);
            this.mAdImage.setLayoutParams(layoutParams);
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, new Object[0]);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18402a().m17682e())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams2);
                    return;
                }
                this.mAdIcon.setVisibility(8);
                this.mAdIconDivider.setVisibility(8);
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18402a().m17682e(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.c) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdOwn07_ViewBinding<T extends ViewHolderFullScreenAdOwn07> implements Unbinder {
        protected T f14665b;

        public ViewHolderFullScreenAdOwn07_ViewBinding(T t, View view) {
            this.f14665b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn08 extends ar {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;
    }

    public class ViewHolderFullScreenAdOwn08_ViewBinding<T extends ViewHolderFullScreenAdOwn08> implements Unbinder {
        protected T f14666b;

        public ViewHolderFullScreenAdOwn08_ViewBinding(T t, View view) {
            this.f14666b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public class ViewHolderFullScreenAdOwn extends ai {
        @BindView
        protected TextView mAdCall;
        @BindView
        protected View mAdCallDivider;
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected TextView mAdDesc;
        @BindView
        protected BacaCircleImageView mAdIcon;
        @BindView
        protected View mAdIconDivider;
        @BindView
        protected ImageView mAdImage;
        @BindView
        protected TextView mAdName;
        @BindView
        protected TextView mAdTag;

        protected ViewHolderFullScreenAdOwn() {
            super();
        }

        void m18917a() {
            this.mAdImage.setLayoutParams(new LayoutParams(-1, this.d));
            if (this.a != null && this.a.m18402a() != null) {
                this.a.m18403a(this.mAdContainer, null, null, this.f);
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mAdTag.setVisibility(0);
                this.mAdCall.setText(this.a.m18402a().m17680c());
                this.mAdName.setText(this.a.m18402a().m17678a());
                this.mAdDesc.setText(this.a.m18402a().m17679b());
                ImageCache.m17567a(this.b, this.mAdImage, this.a.m18402a().m17681d(), (int) R.drawable.im_default, (int) R.drawable.im_default);
                Resources resources = MyApplicationLike.getApplication().getResources();
                if (TextUtils.isEmpty(this.a.m18402a().m17682e())) {
                    this.mAdIcon.setVisibility(8);
                    this.mAdIconDivider.setVisibility(8);
                    this.mAdCallDivider.setLayoutParams(new LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.launcher_ad_call_margin)));
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.launcher_ad_margin);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
                    this.mAdContainer.setLayoutParams(layoutParams);
                    return;
                }
                this.mAdIcon.setVisibility(0);
                this.mAdIconDivider.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0);
                layoutParams2.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.mAdCallDivider.setLayoutParams(layoutParams2);
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.mAdContainer.setLayoutParams(layoutParams2);
                ImageCache.m17567a(this.b, this.mAdIcon, this.a.m18402a().m17682e(), (int) R.drawable.im_default, (int) R.drawable.im_default);
            } else if (this.e) {
                this.mAdContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            } else {
                this.mAdContainer.setVisibility(4);
            }
        }
    }

    public class ViewHolderFullScreenAdOwn_ViewBinding<T extends ViewHolderFullScreenAdOwn> implements Unbinder {
        protected T f14667b;

        public ViewHolderFullScreenAdOwn_ViewBinding(T t, View view) {
            this.f14667b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdName = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_name, "field 'mAdName'", TextView.class);
            t.mAdTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_tag, "field 'mAdTag'", TextView.class);
            t.mAdDesc = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_desc, "field 'mAdDesc'", TextView.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
            t.mAdCall = (TextView)  Utils.findRequiredViewAsType(view, R.id.ad_call, "field 'mAdCall'", TextView.class);
            t.mAdIcon = (BacaCircleImageView)  Utils.findRequiredViewAsType(view, R.id.ad_icon, "field 'mAdIcon'", BacaCircleImageView.class);
            t.mAdCallDivider =  Utils.findRequiredView(view, R.id.ad_call_divider, "field 'mAdCallDivider'");
            t.mAdIconDivider =  Utils.findRequiredView(view, R.id.ad_icon_divider, "field 'mAdIconDivider'");
        }
    }

    public static int m18918a(float f) {
        return (int) ((C2535e.f14678b * f) + 0.5f);
    }

    public static boolean m18936a(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (activity instanceof BaseActivity) {
            if (((BaseActivity) activity).m17252c()) {
                return false;
            }
            return true;
        } else if (VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean m18937a(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return m18936a(fragment.getActivity());
    }

    public static C2598x m18950b(Activity activity) {
        if (m18936a(activity)) {
            return new C2598x(activity);
        }
        return null;
    }

    public static View m18919a(Context context, int i, int i2) {
        if ((context instanceof Activity) && !m18936a((Activity) context)) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_ad_for_normal, null);
        m18930a(inflate, null, context, i, i2, false).m18871a();
        return inflate;
    }

    private static ViewHolderAdBlank m18930a(View view, cv cvVar, Context context, int i, int i2, boolean z) {
        ViewHolderAdBlank viewHolderAdBlank = (ViewHolderAdBlank) view.getTag();
        if (viewHolderAdBlank == null) {
            viewHolderAdBlank = new ViewHolderAdBlank();
            ButterKnife.m2793a(viewHolderAdBlank, view);
            view.setTag(viewHolderAdBlank);
        }
        viewHolderAdBlank.f14530a = i;
        viewHolderAdBlank.f14531b = i2;
        viewHolderAdBlank.f14532c = z;
        return viewHolderAdBlank;
    }

    public static View m18922a(Fragment fragment, cv cvVar, int i, int i2, boolean z, im imVar) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View a;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            a = m18927a(cvVar, from, fragment, i, i2, z, imVar);
        } else if (cvVar.m18402a() != null) {
            a = m18942b(cvVar, from, fragment, i, i2, z, imVar);
        } else if (cvVar.m18405c() != null) {
            a = cvVar.m18405c();
            cvVar.m18403a(a, null, null, imVar);
        } else if (cvVar.m18406d() != null) {
            a = m18965d(cvVar, from, fragment, i, i2, z, imVar);
        } else if (cvVar.m18407e() != null) {
            a = m18954c(cvVar, from, fragment, i, i2, z, imVar);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            a = new View(fragment.getActivity());
            a.setTag(h);
        } else {
            a = null;
        }
        return a;
    }

    private static View m18927a(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z, im imVar) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen, null);
        m18935a(inflate, cvVar, fragment, i, i2, z, imVar).m18893a();
        return inflate;
    }

    private static View m18942b(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z, im imVar) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen, null);
        m18961c(inflate, cvVar, fragment, i, i2, z, imVar).m18917a();
        return inflate;
    }

    private static View m18954c(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z, im imVar) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_full_screen, null);
        m18949b(inflate, cvVar, fragment, i, i2, z, imVar).m18899a();
        return inflate;
    }

    private static View m18965d(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z, im imVar) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_full_screen, null);
            m18972d(inflate, cvVar, fragment, i, i2, z, imVar).m18905a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_full_screen, null);
        m18979e(inflate, cvVar, fragment, i, i2, z, imVar).m18911a();
        return inflate;
    }

    private static ViewHolderFullScreenAdMobPower m18935a(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z, im imVar) {
        ViewHolderFullScreenAdMobPower viewHolderFullScreenAdMobPower = (ViewHolderFullScreenAdMobPower) view.getTag();
        if (viewHolderFullScreenAdMobPower == null) {
            viewHolderFullScreenAdMobPower = new ViewHolderFullScreenAdMobPower();
            ButterKnife.m2793a(viewHolderFullScreenAdMobPower, view);
            view.setTag(viewHolderFullScreenAdMobPower);
        }
        viewHolderFullScreenAdMobPower.a = cvVar;
        viewHolderFullScreenAdMobPower.b = fragment;
        viewHolderFullScreenAdMobPower.c = i;
        viewHolderFullScreenAdMobPower.d = i2;
        viewHolderFullScreenAdMobPower.e = z;
        viewHolderFullScreenAdMobPower.f = imVar;
        return viewHolderFullScreenAdMobPower;
    }

    private static ViewHolderFullScreenAdNDFacebook m18949b(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z, im imVar) {
        ViewHolderFullScreenAdNDFacebook viewHolderFullScreenAdNDFacebook = (ViewHolderFullScreenAdNDFacebook) view.getTag();
        if (viewHolderFullScreenAdNDFacebook == null) {
            viewHolderFullScreenAdNDFacebook = new ViewHolderFullScreenAdNDFacebook();
            ButterKnife.m2793a(viewHolderFullScreenAdNDFacebook, view);
            view.setTag(viewHolderFullScreenAdNDFacebook);
        }
        viewHolderFullScreenAdNDFacebook.a = cvVar;
        viewHolderFullScreenAdNDFacebook.b = fragment;
        viewHolderFullScreenAdNDFacebook.c = i;
        viewHolderFullScreenAdNDFacebook.d = i2;
        viewHolderFullScreenAdNDFacebook.e = z;
        viewHolderFullScreenAdNDFacebook.f = imVar;
        return viewHolderFullScreenAdNDFacebook;
    }

    private static ViewHolderFullScreenAdOwn m18961c(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z, im imVar) {
        ViewHolderFullScreenAdOwn viewHolderFullScreenAdOwn = (ViewHolderFullScreenAdOwn) view.getTag();
        if (viewHolderFullScreenAdOwn == null) {
            viewHolderFullScreenAdOwn = new ViewHolderFullScreenAdOwn();
            ButterKnife.m2793a(viewHolderFullScreenAdOwn, view);
            view.setTag(viewHolderFullScreenAdOwn);
        }
        viewHolderFullScreenAdOwn.a = cvVar;
        viewHolderFullScreenAdOwn.b = fragment;
        viewHolderFullScreenAdOwn.c = i;
        viewHolderFullScreenAdOwn.d = i2;
        viewHolderFullScreenAdOwn.e = z;
        viewHolderFullScreenAdOwn.f = imVar;
        return viewHolderFullScreenAdOwn;
    }

    private static ViewHolderFullScreenAdNDGPAppInstall m18972d(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z, im imVar) {
        ViewHolderFullScreenAdNDGPAppInstall viewHolderFullScreenAdNDGPAppInstall = (ViewHolderFullScreenAdNDGPAppInstall) view.getTag();
        if (viewHolderFullScreenAdNDGPAppInstall == null) {
            viewHolderFullScreenAdNDGPAppInstall = new ViewHolderFullScreenAdNDGPAppInstall();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPAppInstall, view);
            view.setTag(viewHolderFullScreenAdNDGPAppInstall);
        }
        viewHolderFullScreenAdNDGPAppInstall.a = cvVar;
        viewHolderFullScreenAdNDGPAppInstall.b = fragment;
        viewHolderFullScreenAdNDGPAppInstall.c = i;
        viewHolderFullScreenAdNDGPAppInstall.d = i2;
        viewHolderFullScreenAdNDGPAppInstall.e = z;
        viewHolderFullScreenAdNDGPAppInstall.f = imVar;
        return viewHolderFullScreenAdNDGPAppInstall;
    }

    private static ViewHolderFullScreenAdNDGPContent m18979e(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z, im imVar) {
        ViewHolderFullScreenAdNDGPContent viewHolderFullScreenAdNDGPContent = (ViewHolderFullScreenAdNDGPContent) view.getTag();
        if (viewHolderFullScreenAdNDGPContent == null) {
            viewHolderFullScreenAdNDGPContent = new ViewHolderFullScreenAdNDGPContent();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPContent, view);
            view.setTag(viewHolderFullScreenAdNDGPContent);
        }
        viewHolderFullScreenAdNDGPContent.a = cvVar;
        viewHolderFullScreenAdNDGPContent.b = fragment;
        viewHolderFullScreenAdNDGPContent.c = i;
        viewHolderFullScreenAdNDGPContent.d = i2;
        viewHolderFullScreenAdNDGPContent.e = z;
        viewHolderFullScreenAdNDGPContent.f = imVar;
        return viewHolderFullScreenAdNDGPContent;
    }

    public static View m18920a(Context context, cv cvVar, int i, int i2, boolean z, cx cxVar) {
        if (((context instanceof Activity) && !m18936a((Activity) context)) || cvVar == null) {
            return null;
        }
        View a;
        LayoutInflater from = LayoutInflater.from(context);
        if (cvVar.m18404b() != null) {
            a = m18925a(cvVar, from, context, i, i2, z, cxVar);
        } else if (cvVar.m18402a() != null) {
            a = m18940b(cvVar, from, context, i, i2, z, cxVar);
        } else if (cvVar.m18405c() != null) {
            a = cvVar.m18405c();
            cvVar.m18403a(a, null, cxVar, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            a = m18952c(cvVar, from, context, i, i2, z, cxVar);
        } else if (cvVar.m18407e() != null) {
            a = m18963d(cvVar, from, context, i, i2, z, cxVar);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            a = new View(context);
            a.setTag(h);
        } else {
            a = null;
        }
        return a;
    }

    private static View m18925a(cv cvVar, LayoutInflater layoutInflater, Context context, int i, int i2, boolean z, cx cxVar) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_04, null);
        m18931a(inflate, cvVar, context, i, i2, z, cxVar).m18872a();
        return inflate;
    }

    private static View m18940b(cv cvVar, LayoutInflater layoutInflater, Context context, int i, int i2, boolean z, cx cxVar) {
        OwnCampaignInfo a = cvVar.m18402a();
        if (a == null) {
            return null;
        }
        if (a.m17688k()) {
            View inflate = layoutInflater.inflate(R.layout.item_ad_for_own_vertical_04, null);
            m18970d(inflate, cvVar, context, i, i2, z, cxVar).m18887a();
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_04, null);
        m18957c(inflate, cvVar, context, i, i2, z, cxVar).m18884a();
        return inflate;
    }

    private static View m18952c(cv cvVar, LayoutInflater layoutInflater, Context context, int i, int i2, boolean z, cx cxVar) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_04, null);
            m18975e(inflate, cvVar, context, i, i2, z, cxVar).m18878a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_04, null);
        m18982f(inflate, cvVar, context, i, i2, z, cxVar).m18881a();
        return inflate;
    }

    private static View m18963d(cv cvVar, LayoutInflater layoutInflater, Context context, int i, int i2, boolean z, cx cxVar) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_04, null);
        m18945b(inflate, cvVar, context, i, i2, z, cxVar).m18875a();
        return inflate;
    }

    private static ViewHolderAdMobPower04 m18931a(View view, cv cvVar, Context context, int i, int i2, boolean z, cx cxVar) {
        ViewHolderAdMobPower04 viewHolderAdMobPower04 = (ViewHolderAdMobPower04) view.getTag();
        if (viewHolderAdMobPower04 == null) {
            viewHolderAdMobPower04 = new ViewHolderAdMobPower04();
            ButterKnife.m2793a(viewHolderAdMobPower04, view);
            view.setTag(viewHolderAdMobPower04);
        }
        viewHolderAdMobPower04.a = cvVar;
        viewHolderAdMobPower04.b = context;
        viewHolderAdMobPower04.c = i;
        viewHolderAdMobPower04.d = i2;
        viewHolderAdMobPower04.e = z;
        viewHolderAdMobPower04.f = cxVar;
        return viewHolderAdMobPower04;
    }

    private static ViewHolderAdNDFacebook04 m18945b(View view, cv cvVar, Context context, int i, int i2, boolean z, cx cxVar) {
        ViewHolderAdNDFacebook04 viewHolderAdNDFacebook04 = (ViewHolderAdNDFacebook04) view.getTag();
        if (viewHolderAdNDFacebook04 == null) {
            viewHolderAdNDFacebook04 = new ViewHolderAdNDFacebook04();
            ButterKnife.m2793a(viewHolderAdNDFacebook04, view);
            view.setTag(viewHolderAdNDFacebook04);
        }
        viewHolderAdNDFacebook04.a = cvVar;
        viewHolderAdNDFacebook04.b = context;
        viewHolderAdNDFacebook04.c = i;
        viewHolderAdNDFacebook04.d = i2;
        viewHolderAdNDFacebook04.e = z;
        viewHolderAdNDFacebook04.f = cxVar;
        return viewHolderAdNDFacebook04;
    }

    private static ViewHolderAdOwn04 m18957c(View view, cv cvVar, Context context, int i, int i2, boolean z, cx cxVar) {
        ViewHolderAdOwn04 viewHolderAdOwn04 = (ViewHolderAdOwn04) view.getTag();
        if (viewHolderAdOwn04 == null) {
            viewHolderAdOwn04 = new ViewHolderAdOwn04();
            ButterKnife.m2793a(viewHolderAdOwn04, view);
            view.setTag(viewHolderAdOwn04);
        }
        viewHolderAdOwn04.a = cvVar;
        viewHolderAdOwn04.b = context;
        viewHolderAdOwn04.c = i;
        viewHolderAdOwn04.d = i2;
        viewHolderAdOwn04.e = z;
        viewHolderAdOwn04.f = cxVar;
        return viewHolderAdOwn04;
    }

    private static ViewHolderAdOwnVertical04 m18970d(View view, cv cvVar, Context context, int i, int i2, boolean z, cx cxVar) {
        ViewHolderAdOwnVertical04 viewHolderAdOwnVertical04 = (ViewHolderAdOwnVertical04) view.getTag();
        if (viewHolderAdOwnVertical04 == null) {
            viewHolderAdOwnVertical04 = new ViewHolderAdOwnVertical04();
            ButterKnife.m2793a(viewHolderAdOwnVertical04, view);
            view.setTag(viewHolderAdOwnVertical04);
        }
        viewHolderAdOwnVertical04.a = cvVar;
        viewHolderAdOwnVertical04.b = context;
        viewHolderAdOwnVertical04.c = i;
        viewHolderAdOwnVertical04.d = i2;
        viewHolderAdOwnVertical04.e = z;
        viewHolderAdOwnVertical04.f = cxVar;
        return viewHolderAdOwnVertical04;
    }

    private static ViewHolderAdNDGPAppInstall04 m18975e(View view, cv cvVar, Context context, int i, int i2, boolean z, cx cxVar) {
        ViewHolderAdNDGPAppInstall04 viewHolderAdNDGPAppInstall04 = (ViewHolderAdNDGPAppInstall04) view.getTag();
        if (viewHolderAdNDGPAppInstall04 == null) {
            viewHolderAdNDGPAppInstall04 = new ViewHolderAdNDGPAppInstall04();
            ButterKnife.m2793a(viewHolderAdNDGPAppInstall04, view);
            view.setTag(viewHolderAdNDGPAppInstall04);
        }
        viewHolderAdNDGPAppInstall04.a = cvVar;
        viewHolderAdNDGPAppInstall04.b = context;
        viewHolderAdNDGPAppInstall04.c = i;
        viewHolderAdNDGPAppInstall04.d = i2;
        viewHolderAdNDGPAppInstall04.e = z;
        viewHolderAdNDGPAppInstall04.f = cxVar;
        return viewHolderAdNDGPAppInstall04;
    }

    private static ViewHolderAdNDGPContent04 m18982f(View view, cv cvVar, Context context, int i, int i2, boolean z, cx cxVar) {
        ViewHolderAdNDGPContent04 viewHolderAdNDGPContent04 = (ViewHolderAdNDGPContent04) view.getTag();
        if (viewHolderAdNDGPContent04 == null) {
            viewHolderAdNDGPContent04 = new ViewHolderAdNDGPContent04();
            ButterKnife.m2793a(viewHolderAdNDGPContent04, view);
            view.setTag(viewHolderAdNDGPContent04);
        }
        viewHolderAdNDGPContent04.a = cvVar;
        viewHolderAdNDGPContent04.b = context;
        viewHolderAdNDGPContent04.c = i;
        viewHolderAdNDGPContent04.d = i2;
        viewHolderAdNDGPContent04.e = z;
        viewHolderAdNDGPContent04.f = cxVar;
        return viewHolderAdNDGPContent04;
    }

    public static View m18921a(Fragment fragment, cv cvVar, int i, int i2, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View a;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            a = m18926a(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18402a() != null) {
            a = m18941b(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18405c() != null) {
            a = cvVar.m18405c();
            cvVar.m18403a(a, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            a = m18953c(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18407e() != null) {
            a = m18964d(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            a = new View(fragment.getActivity());
            a.setTag(h);
        } else {
            a = null;
        }
        return a;
    }

    private static View m18926a(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_05, null);
        m18932a(inflate, cvVar, fragment, i, i2, z).m18873a();
        return inflate;
    }

    private static View m18941b(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_05, null);
        m18958c(inflate, cvVar, fragment, i, i2, z).m18885a();
        return inflate;
    }

    private static View m18953c(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_05, null);
            m18968d(inflate, cvVar, fragment, i, i2, z).m18879a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_05, null);
        m18976e(inflate, cvVar, fragment, i, i2, z).m18882a();
        return inflate;
    }

    private static View m18964d(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_05, null);
        m18946b(inflate, cvVar, fragment, i, i2, z).m18876a();
        return inflate;
    }

    private static ViewHolderAdMobPower05 m18932a(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdMobPower05 viewHolderAdMobPower05 = (ViewHolderAdMobPower05) view.getTag();
        if (viewHolderAdMobPower05 == null) {
            viewHolderAdMobPower05 = new ViewHolderAdMobPower05();
            ButterKnife.m2793a(viewHolderAdMobPower05, view);
            view.setTag(viewHolderAdMobPower05);
        }
        viewHolderAdMobPower05.a = cvVar;
        viewHolderAdMobPower05.b = fragment;
        viewHolderAdMobPower05.c = i;
        viewHolderAdMobPower05.d = i2;
        viewHolderAdMobPower05.e = z;
        return viewHolderAdMobPower05;
    }

    private static ViewHolderAdNDFacebook05 m18946b(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdNDFacebook05 viewHolderAdNDFacebook05 = (ViewHolderAdNDFacebook05) view.getTag();
        if (viewHolderAdNDFacebook05 == null) {
            viewHolderAdNDFacebook05 = new ViewHolderAdNDFacebook05();
            ButterKnife.m2793a(viewHolderAdNDFacebook05, view);
            view.setTag(viewHolderAdNDFacebook05);
        }
        viewHolderAdNDFacebook05.a = cvVar;
        viewHolderAdNDFacebook05.b = fragment;
        viewHolderAdNDFacebook05.c = i;
        viewHolderAdNDFacebook05.d = i2;
        viewHolderAdNDFacebook05.e = z;
        return viewHolderAdNDFacebook05;
    }

    private static ViewHolderAdOwn05 m18958c(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdOwn05 viewHolderAdOwn05 = (ViewHolderAdOwn05) view.getTag();
        if (viewHolderAdOwn05 == null) {
            viewHolderAdOwn05 = new ViewHolderAdOwn05();
            ButterKnife.m2793a(viewHolderAdOwn05, view);
            view.setTag(viewHolderAdOwn05);
        }
        viewHolderAdOwn05.a = cvVar;
        viewHolderAdOwn05.b = fragment;
        viewHolderAdOwn05.c = i;
        viewHolderAdOwn05.d = i2;
        viewHolderAdOwn05.e = z;
        return viewHolderAdOwn05;
    }

    private static ViewHolderAdNDGPAppInstall05 m18968d(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdNDGPAppInstall05 viewHolderAdNDGPAppInstall05 = (ViewHolderAdNDGPAppInstall05) view.getTag();
        if (viewHolderAdNDGPAppInstall05 == null) {
            viewHolderAdNDGPAppInstall05 = new ViewHolderAdNDGPAppInstall05();
            ButterKnife.m2793a(viewHolderAdNDGPAppInstall05, view);
            view.setTag(viewHolderAdNDGPAppInstall05);
        }
        viewHolderAdNDGPAppInstall05.a = cvVar;
        viewHolderAdNDGPAppInstall05.b = fragment;
        viewHolderAdNDGPAppInstall05.c = i;
        viewHolderAdNDGPAppInstall05.d = i2;
        viewHolderAdNDGPAppInstall05.e = z;
        return viewHolderAdNDGPAppInstall05;
    }

    private static ViewHolderAdNDGPContent05 m18976e(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdNDGPContent05 viewHolderAdNDGPContent05 = (ViewHolderAdNDGPContent05) view.getTag();
        if (viewHolderAdNDGPContent05 == null) {
            viewHolderAdNDGPContent05 = new ViewHolderAdNDGPContent05();
            ButterKnife.m2793a(viewHolderAdNDGPContent05, view);
            view.setTag(viewHolderAdNDGPContent05);
        }
        viewHolderAdNDGPContent05.a = cvVar;
        viewHolderAdNDGPContent05.b = fragment;
        viewHolderAdNDGPContent05.c = i;
        viewHolderAdNDGPContent05.d = i2;
        viewHolderAdNDGPContent05.e = z;
        return viewHolderAdNDGPContent05;
    }

    public static View m18923a(Fragment fragment, cv cvVar, cx cxVar, int i, int i2, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View a;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            a = m18929a(cvVar, cxVar, from, fragment, i, i2, z);
        } else if (cvVar.m18402a() != null) {
            a = m18944b(cvVar, cxVar, from, fragment, i, i2, z);
        } else if (cvVar.m18405c() != null) {
            a = cvVar.m18405c();
            cvVar.m18403a(a, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            a = m18956c(cvVar, cxVar, from, fragment, i, i2, z);
        } else if (cvVar.m18407e() != null) {
            a = m18967d(cvVar, cxVar, from, fragment, i, i2, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            a = new View(fragment.getActivity());
            a.setTag(h);
        } else {
            a = null;
        }
        return a;
    }

    private static View m18929a(cv cvVar, cx cxVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_06, null);
        m18933a(inflate, cvVar, cxVar, fragment, i, i2, z).m18874a();
        return inflate;
    }

    private static View m18944b(cv cvVar, cx cxVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_06, null);
        m18959c(inflate, cvVar, cxVar, fragment, i, i2, z).m18886a();
        return inflate;
    }

    private static View m18956c(cv cvVar, cx cxVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_06, null);
            m18969d(inflate, cvVar, cxVar, fragment, i, i2, z).m18880a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_06, null);
        m18977e(inflate, cvVar, cxVar, fragment, i, i2, z).m18883a();
        return inflate;
    }

    private static View m18967d(cv cvVar, cx cxVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_06, null);
        m18947b(inflate, cvVar, cxVar, fragment, i, i2, z).m18877a();
        return inflate;
    }

    private static ViewHolderAdMobPower06 m18933a(View view, cv cvVar, cx cxVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdMobPower06 viewHolderAdMobPower06 = (ViewHolderAdMobPower06) view.getTag();
        if (viewHolderAdMobPower06 == null) {
            viewHolderAdMobPower06 = new ViewHolderAdMobPower06();
            ButterKnife.m2793a(viewHolderAdMobPower06, view);
            view.setTag(viewHolderAdMobPower06);
        }
        viewHolderAdMobPower06.a = cvVar;
        viewHolderAdMobPower06.b = fragment;
        viewHolderAdMobPower06.c = i;
        viewHolderAdMobPower06.d = i2;
        viewHolderAdMobPower06.e = z;
        viewHolderAdMobPower06.f = cxVar;
        return viewHolderAdMobPower06;
    }

    private static ViewHolderAdNDFacebook06 m18947b(View view, cv cvVar, cx cxVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdNDFacebook06 viewHolderAdNDFacebook06 = (ViewHolderAdNDFacebook06) view.getTag();
        if (viewHolderAdNDFacebook06 == null) {
            viewHolderAdNDFacebook06 = new ViewHolderAdNDFacebook06();
            ButterKnife.m2793a(viewHolderAdNDFacebook06, view);
            view.setTag(viewHolderAdNDFacebook06);
        }
        viewHolderAdNDFacebook06.a = cvVar;
        viewHolderAdNDFacebook06.b = fragment;
        viewHolderAdNDFacebook06.c = i;
        viewHolderAdNDFacebook06.d = i2;
        viewHolderAdNDFacebook06.e = z;
        viewHolderAdNDFacebook06.f = cxVar;
        return viewHolderAdNDFacebook06;
    }

    private static ViewHolderAdOwn06 m18959c(View view, cv cvVar, cx cxVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdOwn06 viewHolderAdOwn06 = (ViewHolderAdOwn06) view.getTag();
        if (viewHolderAdOwn06 == null) {
            viewHolderAdOwn06 = new ViewHolderAdOwn06();
            ButterKnife.m2793a(viewHolderAdOwn06, view);
            view.setTag(viewHolderAdOwn06);
        }
        viewHolderAdOwn06.a = cvVar;
        viewHolderAdOwn06.b = fragment;
        viewHolderAdOwn06.c = i;
        viewHolderAdOwn06.d = i2;
        viewHolderAdOwn06.e = z;
        viewHolderAdOwn06.f = cxVar;
        return viewHolderAdOwn06;
    }

    private static ViewHolderAdNDGPAppInstall06 m18969d(View view, cv cvVar, cx cxVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdNDGPAppInstall06 viewHolderAdNDGPAppInstall06 = (ViewHolderAdNDGPAppInstall06) view.getTag();
        if (viewHolderAdNDGPAppInstall06 == null) {
            viewHolderAdNDGPAppInstall06 = new ViewHolderAdNDGPAppInstall06();
            ButterKnife.m2793a(viewHolderAdNDGPAppInstall06, view);
            view.setTag(viewHolderAdNDGPAppInstall06);
        }
        viewHolderAdNDGPAppInstall06.a = cvVar;
        viewHolderAdNDGPAppInstall06.b = fragment;
        viewHolderAdNDGPAppInstall06.c = i;
        viewHolderAdNDGPAppInstall06.d = i2;
        viewHolderAdNDGPAppInstall06.e = z;
        viewHolderAdNDGPAppInstall06.f = cxVar;
        return viewHolderAdNDGPAppInstall06;
    }

    private static ViewHolderAdNDGPContent06 m18977e(View view, cv cvVar, cx cxVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderAdNDGPContent06 viewHolderAdNDGPContent06 = (ViewHolderAdNDGPContent06) view.getTag();
        if (viewHolderAdNDGPContent06 == null) {
            viewHolderAdNDGPContent06 = new ViewHolderAdNDGPContent06();
            ButterKnife.m2793a(viewHolderAdNDGPContent06, view);
            view.setTag(viewHolderAdNDGPContent06);
        }
        viewHolderAdNDGPContent06.a = cvVar;
        viewHolderAdNDGPContent06.b = fragment;
        viewHolderAdNDGPContent06.c = i;
        viewHolderAdNDGPContent06.d = i2;
        viewHolderAdNDGPContent06.e = z;
        viewHolderAdNDGPContent06.f = cxVar;
        return viewHolderAdNDGPContent06;
    }

    public static View m18938b(Fragment fragment, cv cvVar, int i, int i2, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View e;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            e = m18973e(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18402a() != null) {
            e = m18980f(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18405c() != null) {
            e = cvVar.m18405c();
            cvVar.m18403a(e, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            e = m18989h(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18407e() != null) {
            e = m18985g(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            e = new View(fragment.getActivity());
            e.setTag(h);
        } else {
            e = null;
        }
        return e;
    }

    private static View m18973e(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_01, null);
        m18983f(inflate, cvVar, fragment, i, i2, z).m18888a();
        return inflate;
    }

    private static View m18980f(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_01, null);
        m18991h(inflate, cvVar, fragment, i, i2, z).m18912a();
        return inflate;
    }

    private static View m18985g(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_full_screen_01, null);
        m18987g(inflate, cvVar, fragment, i, i2, z).m18894a();
        return inflate;
    }

    private static View m18989h(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_full_screen_01, null);
            m18994i(inflate, cvVar, fragment, i, i2, z).m18900a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_full_screen_01, null);
        m18997j(inflate, cvVar, fragment, i, i2, z).m18906a();
        return inflate;
    }

    private static ViewHolderFullScreenAdMobPower01 m18983f(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdMobPower01 viewHolderFullScreenAdMobPower01 = (ViewHolderFullScreenAdMobPower01) view.getTag();
        if (viewHolderFullScreenAdMobPower01 == null) {
            viewHolderFullScreenAdMobPower01 = new ViewHolderFullScreenAdMobPower01();
            ButterKnife.m2793a(viewHolderFullScreenAdMobPower01, view);
            view.setTag(viewHolderFullScreenAdMobPower01);
        }
        viewHolderFullScreenAdMobPower01.a = cvVar;
        viewHolderFullScreenAdMobPower01.b = fragment;
        viewHolderFullScreenAdMobPower01.c = i;
        viewHolderFullScreenAdMobPower01.d = i2;
        viewHolderFullScreenAdMobPower01.e = z;
        return viewHolderFullScreenAdMobPower01;
    }

    private static ViewHolderFullScreenAdNDFacebook01 m18987g(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDFacebook01 viewHolderFullScreenAdNDFacebook01 = (ViewHolderFullScreenAdNDFacebook01) view.getTag();
        if (viewHolderFullScreenAdNDFacebook01 == null) {
            viewHolderFullScreenAdNDFacebook01 = new ViewHolderFullScreenAdNDFacebook01();
            ButterKnife.m2793a(viewHolderFullScreenAdNDFacebook01, view);
            view.setTag(viewHolderFullScreenAdNDFacebook01);
        }
        viewHolderFullScreenAdNDFacebook01.a = cvVar;
        viewHolderFullScreenAdNDFacebook01.b = fragment;
        viewHolderFullScreenAdNDFacebook01.c = i;
        viewHolderFullScreenAdNDFacebook01.d = i2;
        viewHolderFullScreenAdNDFacebook01.e = z;
        return viewHolderFullScreenAdNDFacebook01;
    }

    private static ViewHolderFullScreenAdOwn01 m18991h(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdOwn01 viewHolderFullScreenAdOwn01 = (ViewHolderFullScreenAdOwn01) view.getTag();
        if (viewHolderFullScreenAdOwn01 == null) {
            viewHolderFullScreenAdOwn01 = new ViewHolderFullScreenAdOwn01();
            ButterKnife.m2793a(viewHolderFullScreenAdOwn01, view);
            view.setTag(viewHolderFullScreenAdOwn01);
        }
        viewHolderFullScreenAdOwn01.a = cvVar;
        viewHolderFullScreenAdOwn01.b = fragment;
        viewHolderFullScreenAdOwn01.c = i;
        viewHolderFullScreenAdOwn01.d = i2;
        viewHolderFullScreenAdOwn01.e = z;
        return viewHolderFullScreenAdOwn01;
    }

    private static ViewHolderFullScreenAdNDGPAppInstall01 m18994i(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDGPAppInstall01 viewHolderFullScreenAdNDGPAppInstall01 = (ViewHolderFullScreenAdNDGPAppInstall01) view.getTag();
        if (viewHolderFullScreenAdNDGPAppInstall01 == null) {
            viewHolderFullScreenAdNDGPAppInstall01 = new ViewHolderFullScreenAdNDGPAppInstall01();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPAppInstall01, view);
            view.setTag(viewHolderFullScreenAdNDGPAppInstall01);
        }
        viewHolderFullScreenAdNDGPAppInstall01.a = cvVar;
        viewHolderFullScreenAdNDGPAppInstall01.b = fragment;
        viewHolderFullScreenAdNDGPAppInstall01.c = i;
        viewHolderFullScreenAdNDGPAppInstall01.d = i2;
        viewHolderFullScreenAdNDGPAppInstall01.e = z;
        return viewHolderFullScreenAdNDGPAppInstall01;
    }

    private static ViewHolderFullScreenAdNDGPContent01 m18997j(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDGPContent01 viewHolderFullScreenAdNDGPContent01 = (ViewHolderFullScreenAdNDGPContent01) view.getTag();
        if (viewHolderFullScreenAdNDGPContent01 == null) {
            viewHolderFullScreenAdNDGPContent01 = new ViewHolderFullScreenAdNDGPContent01();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPContent01, view);
            view.setTag(viewHolderFullScreenAdNDGPContent01);
        }
        viewHolderFullScreenAdNDGPContent01.a = cvVar;
        viewHolderFullScreenAdNDGPContent01.b = fragment;
        viewHolderFullScreenAdNDGPContent01.c = i;
        viewHolderFullScreenAdNDGPContent01.d = i2;
        viewHolderFullScreenAdNDGPContent01.e = z;
        return viewHolderFullScreenAdNDGPContent01;
    }

    public static View m18951c(Fragment fragment, cv cvVar, int i, int i2, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View i3;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            i3 = m18993i(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18402a() != null) {
            i3 = m18996j(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18405c() != null) {
            i3 = cvVar.m18405c();
            cvVar.m18403a(i3, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            i3 = m19001l(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18407e() != null) {
            i3 = m18999k(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            i3 = new View(fragment.getActivity());
            i3.setTag(h);
        } else {
            i3 = null;
        }
        return i3;
    }

    private static View m18993i(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_02, null);
        m19000k(inflate, cvVar, fragment, i, i2, z).m18889a();
        return inflate;
    }

    private static View m18996j(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_02, null);
        m19004m(inflate, cvVar, fragment, i, i2, z).m18913a();
        return inflate;
    }

    private static View m18999k(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_full_screen_02, null);
        m19002l(inflate, cvVar, fragment, i, i2, z).m18895a();
        return inflate;
    }

    private static View m19001l(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_full_screen_02, null);
            m19006n(inflate, cvVar, fragment, i, i2, z).m18901a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_full_screen_02, null);
        m19008o(inflate, cvVar, fragment, i, i2, z).m18907a();
        return inflate;
    }

    private static ViewHolderFullScreenAdMobPower02_1 m19000k(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdMobPower02_1 viewHolderFullScreenAdMobPower02_1 = (ViewHolderFullScreenAdMobPower02_1) view.getTag();
        if (viewHolderFullScreenAdMobPower02_1 == null) {
            viewHolderFullScreenAdMobPower02_1 = new ViewHolderFullScreenAdMobPower02_1();
            ButterKnife.m2793a(viewHolderFullScreenAdMobPower02_1, view);
            view.setTag(viewHolderFullScreenAdMobPower02_1);
        }
        viewHolderFullScreenAdMobPower02_1.a = cvVar;
        viewHolderFullScreenAdMobPower02_1.b = fragment;
        viewHolderFullScreenAdMobPower02_1.c = i;
        viewHolderFullScreenAdMobPower02_1.d = i2;
        viewHolderFullScreenAdMobPower02_1.e = z;
        return viewHolderFullScreenAdMobPower02_1;
    }

    private static ViewHolderFullScreenAdNDFacebook02_1 m19002l(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDFacebook02_1 viewHolderFullScreenAdNDFacebook02_1 = (ViewHolderFullScreenAdNDFacebook02_1) view.getTag();
        if (viewHolderFullScreenAdNDFacebook02_1 == null) {
            viewHolderFullScreenAdNDFacebook02_1 = new ViewHolderFullScreenAdNDFacebook02_1();
            ButterKnife.m2793a(viewHolderFullScreenAdNDFacebook02_1, view);
            view.setTag(viewHolderFullScreenAdNDFacebook02_1);
        }
        viewHolderFullScreenAdNDFacebook02_1.a = cvVar;
        viewHolderFullScreenAdNDFacebook02_1.b = fragment;
        viewHolderFullScreenAdNDFacebook02_1.c = i;
        viewHolderFullScreenAdNDFacebook02_1.d = i2;
        viewHolderFullScreenAdNDFacebook02_1.e = z;
        return viewHolderFullScreenAdNDFacebook02_1;
    }

    private static ViewHolderFullScreenAdOwn02_1 m19004m(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdOwn02_1 viewHolderFullScreenAdOwn02_1 = (ViewHolderFullScreenAdOwn02_1) view.getTag();
        if (viewHolderFullScreenAdOwn02_1 == null) {
            viewHolderFullScreenAdOwn02_1 = new ViewHolderFullScreenAdOwn02_1();
            ButterKnife.m2793a(viewHolderFullScreenAdOwn02_1, view);
            view.setTag(viewHolderFullScreenAdOwn02_1);
        }
        viewHolderFullScreenAdOwn02_1.a = cvVar;
        viewHolderFullScreenAdOwn02_1.b = fragment;
        viewHolderFullScreenAdOwn02_1.c = i;
        viewHolderFullScreenAdOwn02_1.d = i2;
        viewHolderFullScreenAdOwn02_1.e = z;
        return viewHolderFullScreenAdOwn02_1;
    }

    private static ViewHolderFullScreenAdNDGPAppInstall02_1 m19006n(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDGPAppInstall02_1 viewHolderFullScreenAdNDGPAppInstall02_1 = (ViewHolderFullScreenAdNDGPAppInstall02_1) view.getTag();
        if (viewHolderFullScreenAdNDGPAppInstall02_1 == null) {
            viewHolderFullScreenAdNDGPAppInstall02_1 = new ViewHolderFullScreenAdNDGPAppInstall02_1();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPAppInstall02_1, view);
            view.setTag(viewHolderFullScreenAdNDGPAppInstall02_1);
        }
        viewHolderFullScreenAdNDGPAppInstall02_1.a = cvVar;
        viewHolderFullScreenAdNDGPAppInstall02_1.b = fragment;
        viewHolderFullScreenAdNDGPAppInstall02_1.c = i;
        viewHolderFullScreenAdNDGPAppInstall02_1.d = i2;
        viewHolderFullScreenAdNDGPAppInstall02_1.e = z;
        return viewHolderFullScreenAdNDGPAppInstall02_1;
    }

    private static ViewHolderFullScreenAdNDGPContent02_1 m19008o(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDGPContent02_1 viewHolderFullScreenAdNDGPContent02_1 = (ViewHolderFullScreenAdNDGPContent02_1) view.getTag();
        if (viewHolderFullScreenAdNDGPContent02_1 == null) {
            viewHolderFullScreenAdNDGPContent02_1 = new ViewHolderFullScreenAdNDGPContent02_1();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPContent02_1, view);
            view.setTag(viewHolderFullScreenAdNDGPContent02_1);
        }
        viewHolderFullScreenAdNDGPContent02_1.a = cvVar;
        viewHolderFullScreenAdNDGPContent02_1.b = fragment;
        viewHolderFullScreenAdNDGPContent02_1.c = i;
        viewHolderFullScreenAdNDGPContent02_1.d = i2;
        viewHolderFullScreenAdNDGPContent02_1.e = z;
        return viewHolderFullScreenAdNDGPContent02_1;
    }

    public static View m18924a(Fragment fragment, cv cvVar, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View a;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            a = m18928a(cvVar, from, fragment, z);
        } else if (cvVar.m18402a() != null) {
            a = m18943b(cvVar, from, fragment, z);
        } else if (cvVar.m18405c() != null) {
            a = cvVar.m18405c();
            cvVar.m18403a(a, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            a = m18966d(cvVar, from, fragment, z);
        } else if (cvVar.m18407e() != null) {
            a = m18955c(cvVar, from, fragment, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            a = new View(fragment.getActivity());
            a.setTag(h);
        } else {
            a = null;
        }
        return a;
    }

    private static View m18928a(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_04, null);
        m18934a(inflate, cvVar, fragment, z).m18890a();
        return inflate;
    }

    private static View m18943b(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_04, null);
        m18960c(inflate, cvVar, fragment, z).m18914a();
        return inflate;
    }

    private static View m18955c(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_full_screen_04, null);
        m18948b(inflate, cvVar, fragment, z).m18896a();
        return inflate;
    }

    private static View m18966d(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_full_screen_04, null);
            m18971d(inflate, cvVar, fragment, z).m18902a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_full_screen_04, null);
        m18978e(inflate, cvVar, fragment, z).m18908a();
        return inflate;
    }

    private static ViewHolderFullScreenAdMobPower04 m18934a(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdMobPower04 viewHolderFullScreenAdMobPower04 = (ViewHolderFullScreenAdMobPower04) view.getTag();
        if (viewHolderFullScreenAdMobPower04 == null) {
            viewHolderFullScreenAdMobPower04 = new ViewHolderFullScreenAdMobPower04();
            ButterKnife.m2793a(viewHolderFullScreenAdMobPower04, view);
            view.setTag(viewHolderFullScreenAdMobPower04);
        }
        viewHolderFullScreenAdMobPower04.a = cvVar;
        viewHolderFullScreenAdMobPower04.b = fragment;
        viewHolderFullScreenAdMobPower04.c = z;
        return viewHolderFullScreenAdMobPower04;
    }

    private static ViewHolderFullScreenAdNDFacebook04 m18948b(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdNDFacebook04 viewHolderFullScreenAdNDFacebook04 = (ViewHolderFullScreenAdNDFacebook04) view.getTag();
        if (viewHolderFullScreenAdNDFacebook04 == null) {
            viewHolderFullScreenAdNDFacebook04 = new ViewHolderFullScreenAdNDFacebook04();
            ButterKnife.m2793a(viewHolderFullScreenAdNDFacebook04, view);
            view.setTag(viewHolderFullScreenAdNDFacebook04);
        }
        viewHolderFullScreenAdNDFacebook04.a = cvVar;
        viewHolderFullScreenAdNDFacebook04.b = fragment;
        viewHolderFullScreenAdNDFacebook04.c = z;
        return viewHolderFullScreenAdNDFacebook04;
    }

    private static ViewHolderFullScreenAdOwn04 m18960c(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdOwn04 viewHolderFullScreenAdOwn04 = (ViewHolderFullScreenAdOwn04) view.getTag();
        if (viewHolderFullScreenAdOwn04 == null) {
            viewHolderFullScreenAdOwn04 = new ViewHolderFullScreenAdOwn04();
            ButterKnife.m2793a(viewHolderFullScreenAdOwn04, view);
            view.setTag(viewHolderFullScreenAdOwn04);
        }
        viewHolderFullScreenAdOwn04.a = cvVar;
        viewHolderFullScreenAdOwn04.b = fragment;
        viewHolderFullScreenAdOwn04.c = z;
        return viewHolderFullScreenAdOwn04;
    }

    private static ViewHolderFullScreenAdNDGPAppInstall04 m18971d(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdNDGPAppInstall04 viewHolderFullScreenAdNDGPAppInstall04 = (ViewHolderFullScreenAdNDGPAppInstall04) view.getTag();
        if (viewHolderFullScreenAdNDGPAppInstall04 == null) {
            viewHolderFullScreenAdNDGPAppInstall04 = new ViewHolderFullScreenAdNDGPAppInstall04();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPAppInstall04, view);
            view.setTag(viewHolderFullScreenAdNDGPAppInstall04);
        }
        viewHolderFullScreenAdNDGPAppInstall04.a = cvVar;
        viewHolderFullScreenAdNDGPAppInstall04.b = fragment;
        viewHolderFullScreenAdNDGPAppInstall04.c = z;
        return viewHolderFullScreenAdNDGPAppInstall04;
    }

    private static ViewHolderFullScreenAdNDGPContent04 m18978e(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdNDGPContent04 viewHolderFullScreenAdNDGPContent04 = (ViewHolderFullScreenAdNDGPContent04) view.getTag();
        if (viewHolderFullScreenAdNDGPContent04 == null) {
            viewHolderFullScreenAdNDGPContent04 = new ViewHolderFullScreenAdNDGPContent04();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPContent04, view);
            view.setTag(viewHolderFullScreenAdNDGPContent04);
        }
        viewHolderFullScreenAdNDGPContent04.a = cvVar;
        viewHolderFullScreenAdNDGPContent04.b = fragment;
        viewHolderFullScreenAdNDGPContent04.c = z;
        return viewHolderFullScreenAdNDGPContent04;
    }

    public static View m18962d(Fragment fragment, cv cvVar, int i, int i2, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View m;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            m = m19003m(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18402a() != null) {
            m = m19005n(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18405c() != null) {
            m = cvVar.m18405c();
            cvVar.m18403a(m, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            m = m19009p(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18407e() != null) {
            m = m19007o(cvVar, from, fragment, i, i2, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            m = new View(fragment.getActivity());
            m.setTag(h);
        } else {
            m = null;
        }
        return m;
    }

    private static View m19003m(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_06, null);
        m19010p(inflate, cvVar, fragment, i, i2, z).m18891a();
        return inflate;
    }

    private static View m19005n(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_06, null);
        m19012r(inflate, cvVar, fragment, i, i2, z).m18915a();
        return inflate;
    }

    private static View m19007o(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_full_screen_06, null);
        m19011q(inflate, cvVar, fragment, i, i2, z).m18897a();
        return inflate;
    }

    private static View m19009p(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, int i, int i2, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_full_screen_06, null);
            m19013s(inflate, cvVar, fragment, i, i2, z).m18903a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_full_screen_06, null);
        m19014t(inflate, cvVar, fragment, i, i2, z).m18909a();
        return inflate;
    }

    private static ViewHolderFullScreenAdMobPower06 m19010p(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdMobPower06 viewHolderFullScreenAdMobPower06 = (ViewHolderFullScreenAdMobPower06) view.getTag();
        if (viewHolderFullScreenAdMobPower06 == null) {
            viewHolderFullScreenAdMobPower06 = new ViewHolderFullScreenAdMobPower06();
            ButterKnife.m2793a(viewHolderFullScreenAdMobPower06, view);
            view.setTag(viewHolderFullScreenAdMobPower06);
        }
        viewHolderFullScreenAdMobPower06.a = cvVar;
        viewHolderFullScreenAdMobPower06.b = fragment;
        viewHolderFullScreenAdMobPower06.c = i;
        viewHolderFullScreenAdMobPower06.d = i2;
        viewHolderFullScreenAdMobPower06.e = z;
        return viewHolderFullScreenAdMobPower06;
    }

    private static ViewHolderFullScreenAdNDFacebook06 m19011q(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDFacebook06 viewHolderFullScreenAdNDFacebook06 = (ViewHolderFullScreenAdNDFacebook06) view.getTag();
        if (viewHolderFullScreenAdNDFacebook06 == null) {
            viewHolderFullScreenAdNDFacebook06 = new ViewHolderFullScreenAdNDFacebook06();
            ButterKnife.m2793a(viewHolderFullScreenAdNDFacebook06, view);
            view.setTag(viewHolderFullScreenAdNDFacebook06);
        }
        viewHolderFullScreenAdNDFacebook06.a = cvVar;
        viewHolderFullScreenAdNDFacebook06.b = fragment;
        viewHolderFullScreenAdNDFacebook06.c = i;
        viewHolderFullScreenAdNDFacebook06.d = i2;
        viewHolderFullScreenAdNDFacebook06.e = z;
        return viewHolderFullScreenAdNDFacebook06;
    }

    private static ViewHolderFullScreenAdOwn06 m19012r(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdOwn06 viewHolderFullScreenAdOwn06 = (ViewHolderFullScreenAdOwn06) view.getTag();
        if (viewHolderFullScreenAdOwn06 == null) {
            viewHolderFullScreenAdOwn06 = new ViewHolderFullScreenAdOwn06();
            ButterKnife.m2793a(viewHolderFullScreenAdOwn06, view);
            view.setTag(viewHolderFullScreenAdOwn06);
        }
        viewHolderFullScreenAdOwn06.a = cvVar;
        viewHolderFullScreenAdOwn06.b = fragment;
        viewHolderFullScreenAdOwn06.c = i;
        viewHolderFullScreenAdOwn06.d = i2;
        viewHolderFullScreenAdOwn06.e = z;
        return viewHolderFullScreenAdOwn06;
    }

    private static ViewHolderFullScreenAdNDGPAppInstall06 m19013s(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDGPAppInstall06 viewHolderFullScreenAdNDGPAppInstall06 = (ViewHolderFullScreenAdNDGPAppInstall06) view.getTag();
        if (viewHolderFullScreenAdNDGPAppInstall06 == null) {
            viewHolderFullScreenAdNDGPAppInstall06 = new ViewHolderFullScreenAdNDGPAppInstall06();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPAppInstall06, view);
            view.setTag(viewHolderFullScreenAdNDGPAppInstall06);
        }
        viewHolderFullScreenAdNDGPAppInstall06.a = cvVar;
        viewHolderFullScreenAdNDGPAppInstall06.b = fragment;
        viewHolderFullScreenAdNDGPAppInstall06.c = i;
        viewHolderFullScreenAdNDGPAppInstall06.d = i2;
        viewHolderFullScreenAdNDGPAppInstall06.e = z;
        return viewHolderFullScreenAdNDGPAppInstall06;
    }

    private static ViewHolderFullScreenAdNDGPContent06 m19014t(View view, cv cvVar, Fragment fragment, int i, int i2, boolean z) {
        ViewHolderFullScreenAdNDGPContent06 viewHolderFullScreenAdNDGPContent06 = (ViewHolderFullScreenAdNDGPContent06) view.getTag();
        if (viewHolderFullScreenAdNDGPContent06 == null) {
            viewHolderFullScreenAdNDGPContent06 = new ViewHolderFullScreenAdNDGPContent06();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPContent06, view);
            view.setTag(viewHolderFullScreenAdNDGPContent06);
        }
        viewHolderFullScreenAdNDGPContent06.a = cvVar;
        viewHolderFullScreenAdNDGPContent06.b = fragment;
        viewHolderFullScreenAdNDGPContent06.c = i;
        viewHolderFullScreenAdNDGPContent06.d = i2;
        viewHolderFullScreenAdNDGPContent06.e = z;
        return viewHolderFullScreenAdNDGPContent06;
    }

    public static View m18939b(Fragment fragment, cv cvVar, boolean z) {
        if (!m18937a(fragment) || cvVar == null) {
            return null;
        }
        View e;
        LayoutInflater from = LayoutInflater.from(fragment.getActivity());
        if (cvVar.m18404b() != null) {
            e = m18974e(cvVar, from, fragment, z);
        } else if (cvVar.m18402a() != null) {
            e = m18981f(cvVar, from, fragment, z);
        } else if (cvVar.m18405c() != null) {
            e = cvVar.m18405c();
            cvVar.m18403a(e, null, null, new Object[0]);
        } else if (cvVar.m18406d() != null) {
            e = m18990h(cvVar, from, fragment, z);
        } else if (cvVar.m18407e() != null) {
            e = m18986g(cvVar, from, fragment, z);
        } else if (cvVar.m18410h() != null) {
            NativeAd h = cvVar.m18410h();
            e = new View(fragment.getActivity());
            e.setTag(h);
        } else {
            e = null;
        }
        return e;
    }

    private static View m18974e(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_07, null);
        m18984f(inflate, cvVar, fragment, z).m18892a();
        return inflate;
    }

    private static View m18981f(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_normal_full_screen_07, null);
        m18992h(inflate, cvVar, fragment, z).m18916a();
        return inflate;
    }

    private static View m18986g(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        if (cvVar.m18407e() == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.item_ad_for_facebook_full_screen_07, null);
        m18988g(inflate, cvVar, fragment, z).m18898a();
        return inflate;
    }

    private static View m18990h(cv cvVar, LayoutInflater layoutInflater, Fragment fragment, boolean z) {
        View inflate;
        NativeAd d = cvVar.m18406d();
        if (d instanceof NativeAppInstallAd) {
            inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_install_full_screen_07, null);
            m18995i(inflate, cvVar, fragment, z).m18904a();
        } else {
            inflate = null;
        }
        if (!(d instanceof NativeContentAd)) {
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.item_ad_for_gp_content_full_screen_07, null);
        m18998j(inflate, cvVar, fragment, z).m18910a();
        return inflate;
    }

    private static ViewHolderFullScreenAdMobPower07 m18984f(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdMobPower07 viewHolderFullScreenAdMobPower07 = (ViewHolderFullScreenAdMobPower07) view.getTag();
        if (viewHolderFullScreenAdMobPower07 == null) {
            viewHolderFullScreenAdMobPower07 = new ViewHolderFullScreenAdMobPower07();
            ButterKnife.m2793a(viewHolderFullScreenAdMobPower07, view);
            view.setTag(viewHolderFullScreenAdMobPower07);
        }
        viewHolderFullScreenAdMobPower07.a = cvVar;
        viewHolderFullScreenAdMobPower07.b = fragment;
        viewHolderFullScreenAdMobPower07.c = z;
        return viewHolderFullScreenAdMobPower07;
    }

    private static ViewHolderFullScreenAdNDFacebook07 m18988g(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdNDFacebook07 viewHolderFullScreenAdNDFacebook07 = (ViewHolderFullScreenAdNDFacebook07) view.getTag();
        if (viewHolderFullScreenAdNDFacebook07 == null) {
            viewHolderFullScreenAdNDFacebook07 = new ViewHolderFullScreenAdNDFacebook07();
            ButterKnife.m2793a(viewHolderFullScreenAdNDFacebook07, view);
            view.setTag(viewHolderFullScreenAdNDFacebook07);
        }
        viewHolderFullScreenAdNDFacebook07.a = cvVar;
        viewHolderFullScreenAdNDFacebook07.b = fragment;
        viewHolderFullScreenAdNDFacebook07.c = z;
        return viewHolderFullScreenAdNDFacebook07;
    }

    private static ViewHolderFullScreenAdOwn07 m18992h(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdOwn07 viewHolderFullScreenAdOwn07 = (ViewHolderFullScreenAdOwn07) view.getTag();
        if (viewHolderFullScreenAdOwn07 == null) {
            viewHolderFullScreenAdOwn07 = new ViewHolderFullScreenAdOwn07();
            ButterKnife.m2793a(viewHolderFullScreenAdOwn07, view);
            view.setTag(viewHolderFullScreenAdOwn07);
        }
        viewHolderFullScreenAdOwn07.a = cvVar;
        viewHolderFullScreenAdOwn07.b = fragment;
        viewHolderFullScreenAdOwn07.c = z;
        return viewHolderFullScreenAdOwn07;
    }

    private static ViewHolderFullScreenAdNDGPAppInstall07 m18995i(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdNDGPAppInstall07 viewHolderFullScreenAdNDGPAppInstall07 = (ViewHolderFullScreenAdNDGPAppInstall07) view.getTag();
        if (viewHolderFullScreenAdNDGPAppInstall07 == null) {
            viewHolderFullScreenAdNDGPAppInstall07 = new ViewHolderFullScreenAdNDGPAppInstall07();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPAppInstall07, view);
            view.setTag(viewHolderFullScreenAdNDGPAppInstall07);
        }
        viewHolderFullScreenAdNDGPAppInstall07.a = cvVar;
        viewHolderFullScreenAdNDGPAppInstall07.b = fragment;
        viewHolderFullScreenAdNDGPAppInstall07.c = z;
        return viewHolderFullScreenAdNDGPAppInstall07;
    }

    private static ViewHolderFullScreenAdNDGPContent07 m18998j(View view, cv cvVar, Fragment fragment, boolean z) {
        ViewHolderFullScreenAdNDGPContent07 viewHolderFullScreenAdNDGPContent07 = (ViewHolderFullScreenAdNDGPContent07) view.getTag();
        if (viewHolderFullScreenAdNDGPContent07 == null) {
            viewHolderFullScreenAdNDGPContent07 = new ViewHolderFullScreenAdNDGPContent07();
            ButterKnife.m2793a(viewHolderFullScreenAdNDGPContent07, view);
            view.setTag(viewHolderFullScreenAdNDGPContent07);
        }
        viewHolderFullScreenAdNDGPContent07.a = cvVar;
        viewHolderFullScreenAdNDGPContent07.b = fragment;
        viewHolderFullScreenAdNDGPContent07.c = z;
        return viewHolderFullScreenAdNDGPContent07;
    }
}
