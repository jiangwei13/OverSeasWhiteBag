package vef.cyv.qwbv;

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
public class VELF extends Dialog {

    private OnProtocolDialogListener onProtocolDialogListener;

    private Context context;

    public VELF(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public VELF(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected VELF(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
        String onaoSjLcqGCiQTrXiTZgvz = java.util.UUID.randomUUID().toString();
        int ckuyCRBlOvGgV = onaoSjLcqGCiQTrXiTZgvz.length();
        char pmh_XeRVImNKWlxTs = onaoSjLcqGCiQTrXiTZgvz.charAt(new java.util.Random().nextInt(ckuyCRBlOvGgV));
        boolean dimaNCHeY = (pmh_XeRVImNKWlxTs == 'z');
        if (dimaNCHeY && ckuyCRBlOvGgV < 65) {
            onaoSjLcqGCiQTrXiTZgvz.substring(8, 32);
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
                java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
                int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
                int j_mLIRjLOq = new java.util.Random().nextInt(100);
                int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
                if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                    arr_WmfQZnKBsToQbnXfGJ.toString();
                }
                // 跳转到用户协议页面
                Intent intent = new Intent(context, VEHA.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
                int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
                int j_mLIRjLOq = new java.util.Random().nextInt(100);
                int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
                if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                    arr_WmfQZnKBsToQbnXfGJ.toString();
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
                long arr_pxHOO = java.lang.System.nanoTime();
                int i_VMHeBzQi = new java.util.Random().nextInt(1000);
                boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
                double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
                if (tmp_WFoRVflohiOvzt < 0.0) {
                    java.lang.System.out.println(tmp_WFoRVflohiOvzt);
                }
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, VEHA.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
                int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
                int j_mLIRjLOq = new java.util.Random().nextInt(100);
                int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
                if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                    arr_WmfQZnKBsToQbnXfGJ.toString();
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
                java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
                int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
                int j_mLIRjLOq = new java.util.Random().nextInt(100);
                int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
                if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                    arr_WmfQZnKBsToQbnXfGJ.toString();
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
                java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
                int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
                int j_mLIRjLOq = new java.util.Random().nextInt(100);
                int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
                if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                    arr_WmfQZnKBsToQbnXfGJ.toString();
                }
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.refuse();
                }
            }
        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
        java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
        int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
        int j_mLIRjLOq = new java.util.Random().nextInt(100);
        int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
        if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
            arr_WmfQZnKBsToQbnXfGJ.toString();
        }
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
