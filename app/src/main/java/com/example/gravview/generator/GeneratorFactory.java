package com.example.gravview.generator;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.example.gravview.generator.animation.AlphaAnimator;
import com.example.gravview.generator.animation.GravAnimatorGenerator;
import com.example.gravview.generator.grav.BallGenerator;
import com.example.gravview.generator.grav.GravGenerator;
import com.example.gravview.generator.paint.PaintGenerator;
import com.example.gravview.generator.paint.RandomColorGenerator;
import com.example.gravview.generator.point.PointGenerator;
import com.example.gravview.generator.point.RegularPointGenerator;

public class GeneratorFactory {
    private Context context;

    public GeneratorFactory(Context context) {
        this.context = context;
    }

    public PaintGenerator createPaint(String className, AttributeSet attrs) {
        if (className == null || className.isEmpty()) {
            return new RandomColorGenerator();
        }
        PaintGenerator paintGenerator = new RandomColorGenerator();
        paintGenerator.configure(attrs, context);
        return paintGenerator;
    }

    public PointGenerator createPoint(String className, AttributeSet attributeSet) {
        if (className == null || className.isEmpty()) {
            return new RegularPointGenerator();
        }
        PointGenerator generator = new RegularPointGenerator();
        generator.configure(attributeSet, context);
        return generator;
    }

    public GravGenerator createGrav(String className, AttributeSet attrs) {
        if (className == null || className.isEmpty()) {
            return new BallGenerator();
        }
        GravGenerator generator = new BallGenerator();
        generator.configure(attrs, context);
        return generator;
    }

    @Nullable
    public GravAnimatorGenerator createAnimator(String className, AttributeSet attributeSet) {
        if (className == null || className.isEmpty()) {
            return null;
        }
        GravAnimatorGenerator generator = new AlphaAnimator();
        generator.configure(attributeSet, context);
        return generator;
    }
}
