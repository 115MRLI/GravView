
package com.example.gravview.generator.grav;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;

import com.example.gravview.R;
import com.example.gravview.figures.Grav;
import com.example.gravview.figures.GravRectangle;

public class RectangleGenerator implements GravGenerator {
  private float width = 40;
  private float height = 40;

  @Override
  public Grav generate(PointF startPoint, Paint paint) {
    return new GravRectangle(startPoint, paint, width, height);
  }

  @Override
  public void configure(AttributeSet attributeSet, Context context) {
    TypedArray attributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RectangleGenerator, 0, 0);
    width = attributes.getDimension(R.styleable.RectangleGenerator_rectangle_width, width);
    height = attributes.getDimension(R.styleable.RectangleGenerator_rectangle_height, height);
    attributes.recycle();
  }
}
