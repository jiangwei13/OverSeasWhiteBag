package myrc;

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

// 隐私协议
public class ZZJI extends Dialog {

    private OnProtocolDialogListener onProtocolDialogListener;

    private Context context;

    public ZZJI(@NonNull Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public ZZJI(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        initView();
    }

    protected ZZJI(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
        initView();
    }

    private void initView() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] numbersSpectrum = new int[] { 2, 3 };
        for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
            for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                    int swapTemp = numbersSpectrum[innerLoop];
                    numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                    numbersSpectrum[innerLoop + 1] = swapTemp;
                }
            }
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
                int[] sequenceList = new int[] { 1, 5 };
                for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                    int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                    while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                        sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                        shiftIndex--;
                    }
                    sequenceList[shiftIndex] = valueStore;
                }
                // 跳转到用户协议页面
                Intent intent = new Intent(context, ZZIL.class);
                intent.putExtra("TITLE", "用户协议");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/user");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] arrayPuzzle = new int[] { 6, 8 };
                int targetKey = 4;
                int leftEdge = 0;
                int rightEdge = arrayPuzzle.length - 1;
                int centerPoint = 0;
                if (targetKey < arrayPuzzle[leftEdge] || targetKey > arrayPuzzle[rightEdge] || leftEdge > rightEdge) {
                    int markerFlag = 1;
                } else {
                    while (leftEdge <= rightEdge) {
                        centerPoint = (leftEdge + rightEdge) / 2;
                        if (arrayPuzzle[centerPoint] > targetKey) {
                            rightEdge = centerPoint - 1;
                        } else if (arrayPuzzle[centerPoint] < targetKey) {
                            leftEdge = centerPoint + 1;
                        } else {
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
        // 设置《隐私政策》的点击事件
        ClickableSpan privacyPolicySpan = new ClickableSpan() {

            @Override
            public void onClick(View widget) {
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] numbersSpectrum = new int[] { 2, 3 };
                for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
                    for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                        if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                            int swapTemp = numbersSpectrum[innerLoop];
                            numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                            numbersSpectrum[innerLoop + 1] = swapTemp;
                        }
                    }
                }
                // 跳转到隐私政策页面
                Intent intent = new Intent(context, ZZIL.class);
                intent.putExtra("TITLE", "隐私政策");
                intent.putExtra("CONTENT", "http://api.dlzfjk.top/agreement/wjpp/privacy");
                context.startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] numbersSpectrum = new int[] { 2, 3 };
                for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
                    for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                        if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                            int swapTemp = numbersSpectrum[innerLoop];
                            numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                            numbersSpectrum[innerLoop + 1] = swapTemp;
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
                int[] sequenceList = new int[] { 1, 5 };
                for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                    int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                    while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                        sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                        shiftIndex--;
                    }
                    sequenceList[shiftIndex] = valueStore;
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
                int[] dataArray = new int[] { 9, 4 };
                int arraySize = dataArray.length;
                for (int indexOuter = 0; indexOuter < arraySize - 1; indexOuter++) {
                    int minIndexHolder = indexOuter;
                    for (int indexInner = indexOuter + 1; indexInner < arraySize; indexInner++) {
                        if (dataArray[minIndexHolder] > dataArray[indexInner]) {
                            minIndexHolder = indexInner;
                        }
                    }
                    if (minIndexHolder != indexOuter) {
                        int exchangeBuffer = dataArray[indexOuter];
                        dataArray[indexOuter] = dataArray[minIndexHolder];
                        dataArray[minIndexHolder] = exchangeBuffer;
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
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrayPuzzle = new int[] { 6, 8 };
        int targetKey = 4;
        int leftEdge = 0;
        int rightEdge = arrayPuzzle.length - 1;
        int centerPoint = 0;
        if (targetKey < arrayPuzzle[leftEdge] || targetKey > arrayPuzzle[rightEdge] || leftEdge > rightEdge) {
            int markerFlag = 1;
        } else {
            while (leftEdge <= rightEdge) {
                centerPoint = (leftEdge + rightEdge) / 2;
                if (arrayPuzzle[centerPoint] > targetKey) {
                    rightEdge = centerPoint - 1;
                } else if (arrayPuzzle[centerPoint] < targetKey) {
                    leftEdge = centerPoint + 1;
                } else {
                }
            }
        }
        this.onProtocolDialogListener = onProtocolDialogListener;
    }

    public interface OnProtocolDialogListener {

        void agree();

        void refuse();
    }
}
