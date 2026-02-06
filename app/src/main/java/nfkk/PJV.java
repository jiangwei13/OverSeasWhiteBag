package nfkk;

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
import tmlr.hti.caqq.R;

// 隐私协议
public class PJV extends Dialog {

    private OnProtocolDialogListener onProtocolDialogListener;

    private Context context;

    public PJV(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public PJV(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected PJV(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组求和
        int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
        int sumTotalPlokij8934 = 0;
        int countNhybgt6723 = 0;
        for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
            sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
            countNhybgt6723++;
        }
        int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
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
                // 跳转到用户协议页面
                Intent intent = new Intent(context, PJN.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 最大值查找
                int[] asdfghjk5621arr = new int[] { 12, 5, 8, 19, 3 };
                int maxValPlokmn8734 = asdfghjk5621arr[0];
                int maxIdxQazwsx9812 = 0;
                for (int iterYhnujm3456 = 1; iterYhnujm3456 < asdfghjk5621arr.length; iterYhnujm3456++) {
                    if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                        maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456];
                        maxIdxQazwsx9812 = iterYhnujm3456;
                    }
                }
                int unusedMaxRfvtgb2198 = maxValPlokmn8734;
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
                int passwordfdare32432qresafdsagda32 = 123456;
                // 数组求和
                int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
                int sumTotalPlokij8934 = 0;
                int countNhybgt6723 = 0;
                for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
                    sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
                    countNhybgt6723++;
                }
                int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, PJN.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
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
                    onProtocolDialogListener.agree();
                }
            }
        });
        dialogView.findViewById(R.id.not_agreen).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
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
                    onProtocolDialogListener.refuse();
                }
            }
        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
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
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
