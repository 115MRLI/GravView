package com.example.gravview.figures;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

/**
 * 线性粒子基类
 */
public class GravRectangle extends Grav {
    private final float width;
    private final float height;

    public GravRectangle(PointF startPoint, Paint paint, float width, float height) {
        super(startPoint, paint);
        this.width = width;
        this.height = height;
    }

    @Override
    protected void draw(Canvas canvas, PointF drawPoint) {
        float stopX = drawPoint.x + width;
        float stopY = drawPoint.y + height;
        canvas.drawRect(drawPoint.x, drawPoint.y, stopX, stopY, paint);
    }
}
