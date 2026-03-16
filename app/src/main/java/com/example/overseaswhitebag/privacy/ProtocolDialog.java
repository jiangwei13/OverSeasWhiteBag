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
import com.example.overseaswhitebag.R;

// 隐私协议
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
        java.lang.Object arr_TcjBisvT = new java.lang.Object();
        int i_ntkRVggXO = arr_TcjBisvT.hashCode();
        int j_BNUSF = new java.util.Random().nextInt(100);
        int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
        if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
            arr_TcjBisvT.toString();
        }
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
            // 80%屏幕宽度
            layoutParams.width = (int) (screenWidth * 0.75);
            // 60%屏幕高度
            layoutParams.height = (int) (screenHeight * 0.55);
            // 应用设置
            window.setAttributes(layoutParams);
        }
        TextView contentTv = dialogView.findViewById(R.id.contentTv);
        SpannableString spannableString = new SpannableString(contentTv.getText());
        // 设置《用户协议》的点击事件
        ClickableSpan userAgreementSpan = new ClickableSpan() {

            @Override
            public void onClick(View widget) {
                java.lang.Object arr_TcjBisvT = new java.lang.Object();
                int i_ntkRVggXO = arr_TcjBisvT.hashCode();
                int j_BNUSF = new java.util.Random().nextInt(100);
                int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
                if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                    arr_TcjBisvT.toString();
                }
                // 跳转到用户协议页面
                Intent intent = new Intent(context, XieYiActivity.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int process_xSwDYRV = new java.util.Random().nextInt(50);
                int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
                int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
                if (i_yIBLFLJKIvZiAfBd > 30) {
                    java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
                }
                super.updateDrawState(ds);
                // 设置蓝色
                ds.setColor(getContext().getColor(android.R.color.holo_blue_dark));
                // 去掉下划线
                ds.setUnderlineText(false);
            }
        };
        // 设置《隐私政策》的点击事件
        ClickableSpan privacyPolicySpan = new ClickableSpan() {

            @Override
            public void onClick(View widget) {
                int process_xSwDYRV = new java.util.Random().nextInt(50);
                int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
                int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
                if (i_yIBLFLJKIvZiAfBd > 30) {
                    java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
                }
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, XieYiActivity.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                java.lang.Object arr_TcjBisvT = new java.lang.Object();
                int i_ntkRVggXO = arr_TcjBisvT.hashCode();
                int j_BNUSF = new java.util.Random().nextInt(100);
                int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
                if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                    arr_TcjBisvT.toString();
                }
                super.updateDrawState(ds);
                // 设置蓝色
                ds.setColor(getContext().getColor(android.R.color.holo_blue_dark));
                // 去掉下划线
                ds.setUnderlineText(false);
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
        // 使点击事件生效
        contentTv.setMovementMethod(LinkMovementMethod.getInstance());
        dialogView.findViewById(R.id.agreen).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int process_xSwDYRV = new java.util.Random().nextInt(50);
                int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
                int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
                if (i_yIBLFLJKIvZiAfBd > 30) {
                    java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
                }
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.agree();
                }
            }
        });
        dialogView.findViewById(R.id.not_agreen).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int process_xSwDYRV = new java.util.Random().nextInt(50);
                int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
                int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
                if (i_yIBLFLJKIvZiAfBd > 30) {
                    java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
                }
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.refuse();
                }
            }
        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
        String onarkykTsHXzOd = java.util.UUID.randomUUID().toString();
        int ckuylOnyDstFMgVAhIgwl = onarkykTsHXzOd.length();
        char pmh_SMmxqfQmvLHUcpnsNo = onarkykTsHXzOd.charAt(new java.util.Random().nextInt(ckuylOnyDstFMgVAhIgwl));
        boolean dimaaXjFqD = (pmh_SMmxqfQmvLHUcpnsNo == 'z');
        if (dimaaXjFqD && ckuylOnyDstFMgVAhIgwl < 58) {
            onarkykTsHXzOd.substring(53, 80);
        }
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
