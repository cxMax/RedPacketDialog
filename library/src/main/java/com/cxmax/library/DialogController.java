package com.cxmax.library;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * @Author CaiXi on  2016/12/8 00:45.
 * @Github: https://github.com/cxMax
 * @Description
 */

public class DialogController implements DialogHelper.Result , View.OnClickListener {

    private Context mContext;

    private View mPopView;
    private PopupWindow mPopupWindow;

    private LinearLayout mContainer;
    private TextView mTitle;
    private TextView mRemainTime;
    private TextView mDetailsText;
    private TextView mCode;
    private Button mBtn;
    private TextView mTips;
    private ImageView mCloseImg;

    private LinearLayout mContainerFlip;
    private TextView mTitleFlip;
    private TextView mRemainTimeFlip;
    private TextView mDetailsTextFlip;
    private TextView mCodeFlip;
    private Button mBtnFlip;
    private TextView mTipsFlip;


    public DialogController(Context context) {
        this.mContext = context;
        if (mPopupWindow == null){
            initPopupWindow();
        }
    }

    private void initPopupWindow() {
        mPopView = ((Activity) mContext).getLayoutInflater().inflate(R.layout.red_packet_pop_view, null);
        mPopupWindow = new PopupWindow(mPopView,
                (int) (312 * mContext.getResources().getDisplayMetrics().density),
                (int) (390 * mContext.getResources().getDisplayMetrics().density), false);
        mPopupWindow.setFocusable(true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
        mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                final WindowManager.LayoutParams lp = ((Activity) mContext).getWindow().getAttributes();
                if (lp.alpha != 1.0f) {
                    lp.alpha = 1.0f;
                    ((Activity) mContext).getWindow().setAttributes(lp);
                }
                mContainerFlip.setVisibility(View.GONE);
            }
        });
        initPopView(mPopView);
    }

    private void initPopView(View rootView) {
        mContainer = (LinearLayout) rootView.findViewById(R.id.details_popview_layout);
        mRemainTime = (TextView) rootView.findViewById(R.id.remain_time);
        mTitle = (TextView) rootView.findViewById(R.id.gift_title);
        mDetailsText = (TextView) rootView.findViewById(R.id.gift_details_text);
        mCode = (TextView) rootView.findViewById(R.id.gift_code);
        mBtn = (Button) rootView.findViewById(R.id.gift_btn);
        mBtn.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        mTips = (TextView) rootView.findViewById(R.id.gift_tips_text);
        mBtn.setOnClickListener(this);
        mCloseImg = (ImageView) rootView.findViewById(R.id.details_popview_close_img);
        mCloseImg.setOnClickListener(this);

        mContainerFlip = (LinearLayout) rootView.findViewById(R.id.details_popview_layout_flip);
        mRemainTimeFlip = (TextView) rootView.findViewById(R.id.remain_time_flip);
        mTitleFlip = (TextView) rootView.findViewById(R.id.gift_title_flip);
        mDetailsTextFlip = (TextView) rootView.findViewById(R.id.gift_details_text_flip);
        mCodeFlip = (TextView) rootView.findViewById(R.id.gift_code_flip);
        mBtnFlip = (Button) rootView.findViewById(R.id.gift_btn_flip);
        mBtnFlip.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        mTipsFlip = (TextView) rootView.findViewById(R.id.gift_tips_text_flip);
        mBtnFlip.setOnClickListener(this);

        mContainerFlip.setVisibility(View.GONE);
    }

    @Override
    public void showDilaog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void onClick(View v) {
        if (v == mBtn || v == mBtnFlip){

        } else if (v == mCloseImg){

        }
    }
}
