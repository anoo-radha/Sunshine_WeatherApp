package com.example.android.sunshine.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

public class WindView extends View {

    private Bitmap bm;
    Matrix mtx = new Matrix();
    private float mDirection = 65, density = 0;

    public WindView(Context context) {
        super(context);
        init();
    }

    public WindView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public WindView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        bm = BitmapFactory.decodeResource(getResources(), R.drawable.arrow);
        density = getContext().getResources().getDisplayMetrics().density;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.scale(1.50f, 1.50f);
        canvas.translate(18 * density, 18 * density);
        canvas.drawBitmap(bm, rotate(bm), null);
    }

    public Matrix rotate(Bitmap bm) {
        mtx.setRotate(mDirection, bm.getWidth() / 2, bm.getHeight() / 2);
        return mtx;
    }

    public void update(float dir) {
        mDirection = dir;
        // Call invalidate to force drawing on page.
        invalidate();
    }
}
