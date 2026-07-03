package com.example.overseaswhitebag.privacy;



import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.clean.toos.R;


//隐私协议
public class ProtocolDialog extends Dialog {
    private OnProtocolDialogListener onProtocolDialogListener;
    private Context context;

    public ProtocolDialog(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public ProtocolDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected ProtocolDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
        setCanceledOnTouchOutside(false);
        View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_protocol_layout, null);
        setContentView(dialogView);
        // 获取屏幕宽度
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;

        // 设置Dialog的宽度和高度（例如屏幕宽度的80%，高度的60%）
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) (screenWidth * 0.75); // 80%屏幕宽度
            layoutParams.height = (int) (screenHeight * 0.55); // 60%屏幕高度

            // 应用设置
            window.setAttributes(layoutParams);
        }
        TextView contentTv = dialogView.findViewById(R.id.contentTv);
        SpannableString spannableString = new SpannableString(contentTv.getText());

        // 设置《用户协议》的点击事件
        ClickableSpan userAgreementSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                // 跳转到用户协议页面
                Intent intent = new Intent(context, XieYiActivity.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getContext().getColor(android.R.color.holo_blue_dark)); // 设置蓝色
                ds.setUnderlineText(false); // 去掉下划线
            }
        };

        // 设置《隐私政策》的点击事件
        ClickableSpan privacyPolicySpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, XieYiActivity.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getContext().getColor(android.R.color.holo_blue_dark)); // 设置蓝色
                ds.setUnderlineText(false); // 去掉下划线
            }
        };

        // 找到《用户协议》和《隐私政策》在文本中的位置
        int userAgreementStart = contentTv.getText().toString().indexOf("《用户协议》");
        int userAgreementEnd = userAgreementStart + "《用户协议》".length();
        int privacyPolicyStart = contentTv.getText().toString().indexOf("《隐私政策》");
        int privacyPolicyEnd = privacyPolicyStart + "《隐私政策》".length();

        // 应用ClickableSpan
        spannableString.setSpan(userAgreementSpan, userAgreementStart, userAgreementEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(privacyPolicySpan, privacyPolicyStart, privacyPolicyEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        // 设置TextView的文本
        contentTv.setText(spannableString);
        contentTv.setMovementMethod(LinkMovementMethod.getInstance()); // 使点击事件生效
        dialogView.findViewById(R.id.agreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.agree();
                }
            }
        });
        dialogView.findViewById(R.id.not_agreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.refuse();
                }
            }
        });

//        dialogView.findViewById(R.id.protocol_url_1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, XieYiActivity.class);
//                intent.putExtra("TITLE", "隐私政策");
//                intent.putExtra("CONTENT", "http://html.xiangrui123.xyz/lghcb/agreement/privacy.html");
//                context.startActivity(intent);
//            }
//        });
//
//        dialogView.findViewById(R.id.protocol_url_2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, XieYiActivity.class);
//                intent.putExtra("TITLE", "用户协议");
//                intent.putExtra("CONTENT", "http://html.xiangrui123.xyz/lghcb/agreement/user.html");
//                context.startActivity(intent);
//            }
//        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
        this.onProtocolDialogListener = onProtocolDialogListener;
    }


    public interface OnProtocolDialogListener {
        void agree();

        void refuse();
    }


}
