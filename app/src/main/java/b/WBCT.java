package b;

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
import xktv.nacw.iwsqc.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

// 隐私协议
public class WBCT extends Dialog {

    private OnProtocolDialogListener onProtocolDialogListener;

    private Context context;

    public WBCT(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public WBCT(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected WBCT(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
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
                long arr_PBMjpTJ = java.lang.System.nanoTime();
                int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
                boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
                double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
                if (tmp_PJpPpmAAtdLHx < 0.0) {
                    java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
                }
                // 跳转到用户协议页面
                Intent intent = new Intent(context, WBAT.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
                int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
                int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
                int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
                if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
                    arr_IgXHuLzTXEQaji.toString();
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
                String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
                int ckuyFsbqW = onaXIYmLrcB.length();
                char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
                boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
                if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                    onaXIYmLrcB.substring(18, 43);
                }
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, WBAT.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
                int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
                int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
                if (i_HKAamyWvAuV > 47) {
                    java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
                int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
                int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
                int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
                if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
                    arr_IgXHuLzTXEQaji.toString();
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
                long arr_PBMjpTJ = java.lang.System.nanoTime();
                int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
                boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
                double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
                if (tmp_PJpPpmAAtdLHx < 0.0) {
                    java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
                }
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.refuse();
                }
            }
        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
        String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
        int ckuyFsbqW = onaXIYmLrcB.length();
        char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
        boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
        if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
            onaXIYmLrcB.substring(18, 43);
        }
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
