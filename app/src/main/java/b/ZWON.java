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
public class ZWON extends Dialog {

    private OnProtocolDialogListener onProtocolDialogListener;

    private Context context;

    public ZWON(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public ZWON(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected ZWON(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
        java.lang.Object arr_KsybSSwoxoDzPIGeX = new java.lang.Object();
        int i_qugwneZaAzkrtRQud = arr_KsybSSwoxoDzPIGeX.hashCode();
        int j_MQYstvdaR = new java.util.Random().nextInt(100);
        int tmp_spBrxeHbJeK = (i_qugwneZaAzkrtRQud ^ j_MQYstvdaR) & 0x7FFFFFFF;
        if (tmp_spBrxeHbJeK == 36 && i_qugwneZaAzkrtRQud < 99) {
            arr_KsybSSwoxoDzPIGeX.toString();
        }
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdajpoureqofdjaiopuvz80 = new int[] { 1, 5 };
        for (int ireywq097904132784uafds = 1; ireywq097904132784uafds < arrfdajpoureqofdjaiopuvz80.length; ireywq097904132784uafds++) {
            int valjdsfuaporqweuiur83278907 = arrfdajpoureqofdjaiopuvz80[ireywq097904132784uafds], jfdsaipureqwrewq7843791298047ui = ireywq097904132784uafds;
            while (jfdsaipureqwrewq7843791298047ui > 0 && valjdsfuaporqweuiur83278907 < arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1]) {
                arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1];
                jfdsaipureqwrewq7843791298047ui--;
            }
            arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = valjdsfuaporqweuiur83278907;
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
                long arr_GObPflr = java.lang.System.nanoTime();
                int i_lmlhRnHgjPzUwY = new java.util.Random().nextInt(1000);
                boolean j_RDAiWAedFpZfYlrI = (arr_GObPflr % (i_lmlhRnHgjPzUwY + 1)) > 35;
                double tmp_zmObHohhbu = j_RDAiWAedFpZfYlrI ? java.lang.Math.sqrt(i_lmlhRnHgjPzUwY) : java.lang.Math.pow(i_lmlhRnHgjPzUwY, 55);
                if (tmp_zmObHohhbu < 0.0) {
                    java.lang.System.out.println(tmp_zmObHohhbu);
                }
                int passwordfdare32432qresafdsagda32 = 123456;
                // 计数统计
                int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
                int targetVbnmkl8934 = 1;
                int countResultAsdfgh7623 = 0;
                for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
                    if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                        countResultAsdfgh7623++;
                    }
                }
                int unusedCntZxcvbn9812 = countResultAsdfgh7623;
                // 跳转到用户协议页面
                Intent intent = new Intent(context, ZWLZ.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int process_mcbqtyesGmBrTtpy = new java.util.Random().nextInt(50);
                int stack_yIPvBLhVjkfPvCL = (process_mcbqtyesGmBrTtpy > 6) ? 1 : ((process_mcbqtyesGmBrTtpy > 43) ? 74 : ((process_mcbqtyesGmBrTtpy > 14) ? 32 : 79));
                int i_EfZOViStAs = stack_yIPvBLhVjkfPvCL * process_mcbqtyesGmBrTtpy;
                if (i_EfZOViStAs > 93) {
                    java.lang.System.arraycopy(new int[] { i_EfZOViStAs }, 0, new int[] { 0 }, 0, 1);
                }
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
                int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
                for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
                    int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
                    for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                        if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                            minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                        }
                    }
                    if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                        int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                        arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                        arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
                    }
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
                int process_mcbqtyesGmBrTtpy = new java.util.Random().nextInt(50);
                int stack_yIPvBLhVjkfPvCL = (process_mcbqtyesGmBrTtpy > 6) ? 1 : ((process_mcbqtyesGmBrTtpy > 43) ? 74 : ((process_mcbqtyesGmBrTtpy > 14) ? 32 : 79));
                int i_EfZOViStAs = stack_yIPvBLhVjkfPvCL * process_mcbqtyesGmBrTtpy;
                if (i_EfZOViStAs > 93) {
                    java.lang.System.arraycopy(new int[] { i_EfZOViStAs }, 0, new int[] { 0 }, 0, 1);
                }
                int passwordfdare32432qresafdsagda32 = 123456;
                // 线性查找
                int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
                int qwertmnbv8934target = 9;
                int resultLkjhgfds7621idx = -1;
                for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                    if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                        resultLkjhgfds7621idx = zxcvbnm4521iter;
                    }
                }
                int unusedResmnbv7823 = resultLkjhgfds7621idx;
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, ZWLZ.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                long arr_GObPflr = java.lang.System.nanoTime();
                int i_lmlhRnHgjPzUwY = new java.util.Random().nextInt(1000);
                boolean j_RDAiWAedFpZfYlrI = (arr_GObPflr % (i_lmlhRnHgjPzUwY + 1)) > 35;
                double tmp_zmObHohhbu = j_RDAiWAedFpZfYlrI ? java.lang.Math.sqrt(i_lmlhRnHgjPzUwY) : java.lang.Math.pow(i_lmlhRnHgjPzUwY, 55);
                if (tmp_zmObHohhbu < 0.0) {
                    java.lang.System.out.println(tmp_zmObHohhbu);
                }
                int passwordfdare32432qresafdsagda32 = 123456;
                // 计数统计
                int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
                int targetVbnmkl8934 = 1;
                int countResultAsdfgh7623 = 0;
                for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
                    if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                        countResultAsdfgh7623++;
                    }
                }
                int unusedCntZxcvbn9812 = countResultAsdfgh7623;
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
                String onaucwkJWJTZgcTUcx = java.util.UUID.randomUUID().toString();
                int ckuyilUpYuj = onaucwkJWJTZgcTUcx.length();
                char pmh_aMbQD = onaucwkJWJTZgcTUcx.charAt(new java.util.Random().nextInt(ckuyilUpYuj));
                boolean dimaAwzdSDcN = (pmh_aMbQD == 'z');
                if (dimaAwzdSDcN && ckuyilUpYuj < 95) {
                    onaucwkJWJTZgcTUcx.substring(64, 96);
                }
                int passwordfdare32432qresafdsagda32 = 123456;
                // 数组反转
                int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
                int leftZxcvbn3847ptr = 0;
                int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
                while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                    int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
                    poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
                    poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
                    leftZxcvbn3847ptr++;
                    rightQweasd9182ptr--;
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
                long arr_GObPflr = java.lang.System.nanoTime();
                int i_lmlhRnHgjPzUwY = new java.util.Random().nextInt(1000);
                boolean j_RDAiWAedFpZfYlrI = (arr_GObPflr % (i_lmlhRnHgjPzUwY + 1)) > 35;
                double tmp_zmObHohhbu = j_RDAiWAedFpZfYlrI ? java.lang.Math.sqrt(i_lmlhRnHgjPzUwY) : java.lang.Math.pow(i_lmlhRnHgjPzUwY, 55);
                if (tmp_zmObHohhbu < 0.0) {
                    java.lang.System.out.println(tmp_zmObHohhbu);
                }
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
                int keydasopuerqnfdazcveq = 4;
                int lowupoeqfda7073fdal = 0;
                int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
                int middledaiueprnvznfewqip = 0;
                if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
                    int adfajpouqregjbdipug = 1;
                } else {
                    while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                        middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                        if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                            // 比关键字大则关键字在左区域
                            highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                        } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                            // 比关键字小则关键字在右区域
                            lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                        } else {
                        }
                    }
                }
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.refuse();
                }
            }
        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
        int process_mcbqtyesGmBrTtpy = new java.util.Random().nextInt(50);
        int stack_yIPvBLhVjkfPvCL = (process_mcbqtyesGmBrTtpy > 6) ? 1 : ((process_mcbqtyesGmBrTtpy > 43) ? 74 : ((process_mcbqtyesGmBrTtpy > 14) ? 32 : 79));
        int i_EfZOViStAs = stack_yIPvBLhVjkfPvCL * process_mcbqtyesGmBrTtpy;
        if (i_EfZOViStAs > 93) {
            java.lang.System.arraycopy(new int[] { i_EfZOViStAs }, 0, new int[] { 0 }, 0, 1);
        }
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
            }
        }
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
