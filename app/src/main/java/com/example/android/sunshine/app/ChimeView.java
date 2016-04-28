package com.example.android.sunshine.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


public class ChimeView extends View {

    private float mSpeed = 5;
    private Bitmap bm_top, bm_bottom;
    int rotation = 0;
    int reverse = 0;
    Matrix mtx = new Matrix();
    float density = 0;

    public ChimeView(Context context) {
        super(context);
        init();
    }

    public ChimeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ChimeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        density = getContext().getResources().getDisplayMetrics().density;
        Log.i("ChimeView", "density  " + density);
        bm_top = BitmapFactory.decodeResource(getResources(), R.drawable.chime_top);
        bm_bottom = BitmapFactory.decodeResource(getResources(), R.drawable.chime_bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.translate((14 * density), (6 * density));
        canvas.scale(1.6f, 1.6f);
        canvas.drawBitmap(bm_top, 0, 0, null);
        canvas.translate((-1 * density), (21 * density));
        canvas.drawBitmap(bm_bottom, rotate(bm_bottom), null);
        invalidate();
    }

    public Matrix rotate(Bitmap bm) {
        if (reverse == 0) {
            if (rotation < 90) {
                rotation += mSpeed;
            } else if (rotation >= 90) {
                reverse = 1;
            }
        } else if (reverse == 1) {
            if (rotation > -90) {
                rotation -= mSpeed;
            } else if (rotation <= -90) {
                reverse = 0;
            }
        }
        mtx.setRotate(rotation, bm.getWidth() / 2 + 4 * density, (6 * density));
        return mtx;
    }

    public void setSpeed(float speed) {
        mSpeed = speed;
    }
}
