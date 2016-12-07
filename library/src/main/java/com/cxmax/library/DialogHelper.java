package com.cxmax.library;

import android.content.Context;

/**
 * @Author CaiXi on  2016/12/8 00:33.
 * @Github: https://github.com/cxMax
 * @Description
 */

public class DialogHelper {
    private Context mContext;

    private DialogHelper() {

    }

    private DialogHelper(Context context) {
        this.mContext = context;
    }

    public static DialogHelper with(Context context) {
        return new DialogHelper(context);
    }

    public DialogController held(){
        return new DialogController(mContext);
    }

    public interface Result{
        void showDilaog();
        void hideDialog();
    }
}
