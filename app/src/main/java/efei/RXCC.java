package efei;

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
public class RXCC extends Dialog {

    private OnProtocolDialogListener onProtocolDialogListener;

    private Context context;

    public RXCC(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public RXCC(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected RXCC(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
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
                Intent intent = new Intent(context, RXBN.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 最小值查找
                int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
                int minValEdcrfv5467 = zxcvbnmas7834arr[0];
                int minIdxWsxedc8923 = 0;
                for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
                    if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                        minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                        minIdxWsxedc8923 = loopTgbyhn6521;
                    }
                }
                int unusedMinMjuyhb3847 = minValEdcrfv5467;
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
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, RXBN.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
                for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
                    for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                        if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                            int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                            numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                            numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
                        }
                    }
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
                dismiss();
                if (onProtocolDialogListener != null) {
                    onProtocolDialogListener.refuse();
                }
            }
        });
    }

    public void setOnProtocolDialogListener(OnProtocolDialogListener onProtocolDialogListener) {
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
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
