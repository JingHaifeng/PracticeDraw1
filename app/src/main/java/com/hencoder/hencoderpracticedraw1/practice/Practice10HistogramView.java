package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    {
        mPaint.setColor(Color.WHITE);
    }

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Path path = new Path();
        path.moveTo(100, 100);
        path.lineTo(100, getHeight() - 150);
        path.lineTo(getWidth() - 100, getHeight() - 150);

        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        canvas.drawPath(path, mPaint);

        int w = 100;
        int diff = 20;

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        int left = 100;
        int bottom = getHeight() - 150 - 2;
        Rect rect = new Rect(left + diff, bottom - 2, left + diff + w, bottom);
        canvas.drawRect(rect, mPaint);

        rect.set(left + diff * 2 + w, bottom - 20, left + (diff + w) * 2, bottom);
        canvas.drawRect(rect, mPaint);

        rect.set(left + diff * 3 + w * 2, bottom - 20, left + (diff + w) * 3, bottom);
        canvas.drawRect(rect, mPaint);

        rect.set(left + diff * 4 + w * 3, bottom - 100, left + (diff + w) * 4, bottom);
        canvas.drawRect(rect, mPaint);

        rect.set(left + diff * 5 + w * 4, bottom - 180, left + (diff + w) * 5, bottom);
        canvas.drawRect(rect, mPaint);

        rect.set(left + diff * 6 + w * 5, bottom - 240, left + (diff + w) * 6, bottom);
        canvas.drawRect(rect, mPaint);

        rect.set(left + diff * 7 + w * 6, bottom - 80, left + (diff + w) * 7, bottom);
        canvas.drawRect(rect, mPaint);

        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setTextSize(20);
        mPaint.setColor(Color.WHITE);
        canvas.drawText("Froyo", left + diff + w / 2, bottom + 20, mPaint);
        canvas.drawText("GB", left + diff * 2 + w + w / 2, bottom + 20, mPaint);
        canvas.drawText("ICS", left + diff * 3 + w * 2 + w / 2, bottom + 20, mPaint);
        canvas.drawText("JB", left + diff * 4 + w * 3 + w / 2, bottom + 20, mPaint);
        canvas.drawText("KitKat", left + diff * 5 + w * 4 + w / 2, bottom + 20, mPaint);
        canvas.drawText("L", left + diff * 6 + w * 5 + w / 2, bottom + 20, mPaint);
        canvas.drawText("M", left + diff * 7 + w * 6 + w / 2, bottom + 20, mPaint);

        mPaint.setTextSize(40);
        canvas.drawText("直方图",getWidth() /2 , getHeight() - 40,mPaint);
    }
}
