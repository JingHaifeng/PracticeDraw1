package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private Path mPath = new Path();

    {
        mPaint.setColor(Color.BLACK);
    }

//    {
//        // 使用 path 对图形进行描述（这段描述代码不必看懂）
//        mPath.addArc(200, 200, 400, 400, -225, 225);
//        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
//        mPath.lineTo(400, 542);
//    }

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        Path path = new Path();
        path.moveTo(centerX, centerY);
        RectF oval = new RectF(centerX - 200, centerY - 100, centerX, centerY + 100);
        path.addArc(oval, -225, 225);
        RectF oval2 = new RectF(centerX, centerY - 100, centerX + 200, centerY + 100);
        path.arcTo(oval2, -180, 225, false);

        path.lineTo(centerX ,centerY + 240);

        canvas.drawPath(path, mPaint);
    }
}
