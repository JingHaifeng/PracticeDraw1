package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    {
        mPaint.setColor(Color.BLACK);
    }

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        RectF rectF = new RectF(getWidth() / 3, getHeight() / 3, getWidth() * 2 / 3, getHeight() * 2 / 3);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectF, 30, 120, false, mPaint);
        canvas.drawArc(rectF,250,110,true,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF,180,60,false,mPaint);

    }
}
