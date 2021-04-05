package com.e.hardviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class CreatePiecesView extends View {
    private Paint paint;
    private int amountTimes = 0;
    private int paintColor;

    public void setPaintColor(int paintColor) {
        this.paintColor = paintColor;
    }

    public void setAmountTimes(int newAmountTimes) {
        this.amountTimes = newAmountTimes;
        if (newAmountTimes == 1) this.amountTimes = 0;
        invalidate();
    }

    public CreatePiecesView(Context context) {
        super(context);
        paint = new Paint();
    }

    public CreatePiecesView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public CreatePiecesView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
    }



    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawARGB(0, 102, 204, 255);
        paint.setColor(paintColor);
        paint.setStrokeWidth(10);

        final int xc = 275, yc = 275, radius = 200;


        int[] positionX = new int[amountTimes];
        int[] positionY = new int[amountTimes];
        for (int i = 0; i < amountTimes; i++) {
            double pieces = Math.toRadians(i * 360 / amountTimes) + Math.PI / 2;
            positionX[i] = (int) (xc + radius * Math.cos(pieces));
            positionY[i] = (int) (yc - radius * Math.sin(pieces));
        }
        for (int i = 0; i < amountTimes; i++) {
            canvas.save();
            canvas.rotate( 225 - i *(360 / amountTimes), positionX[i], positionY[i]);
            canvas.drawLine(positionX[i], positionY[i], positionX[i] + 40, positionY[i] + 40, paint);
            canvas.restore();
        }
    }
}

