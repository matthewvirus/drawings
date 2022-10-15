package by.matthewvirus.drawings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

import androidx.core.content.ContextCompat;

public class DrawingView extends View {

    private final Paint paint = new Paint();

    private final Paint boxPaint;
    private final Paint boxCapPaint;
    private final Paint beautifulPaint;
    private final Paint beautifulPaint2;

    private final RectF rectfLeft;
    private final RectF rectfRight;

    private final int snowBlueColor;
    private final int lightYellowColor;
    private final int lightOrangeColor;
    private final int lightRedColor;
    private final int lightPinkColor;

    public DrawingView(Context context) {
        super(context);

        snowBlueColor = ContextCompat.getColor(context, R.color.snow_blue);
        lightYellowColor = ContextCompat.getColor(context, R.color.light_yellow);
        lightOrangeColor = ContextCompat.getColor(context, R.color.light_orange);
        lightRedColor = ContextCompat.getColor(context, R.color.light_red);
        lightPinkColor = ContextCompat.getColor(context, R.color.light_pink);

        rectfLeft = new RectF(300,1200,550,1250);
        rectfRight = new RectF(550,1200,800,1250);

        boxPaint = new Paint();
        boxPaint.setAntiAlias(true);
        boxPaint.setColor(lightYellowColor);
        boxPaint.setStyle(Paint.Style.FILL);

        boxCapPaint = new Paint();
        boxCapPaint.setAntiAlias(true);
        boxCapPaint.setColor(lightOrangeColor);
        boxCapPaint.setStyle(Paint.Style.FILL);

        beautifulPaint = new Paint();
        beautifulPaint.setAntiAlias(true);
        beautifulPaint.setColor(lightRedColor);
        beautifulPaint.setStyle(Paint.Style.FILL);

        beautifulPaint2 = new Paint();
        beautifulPaint2.setAntiAlias(true);
        beautifulPaint2.setColor(lightRedColor);
        beautifulPaint2.setStyle(Paint.Style.STROKE);
        beautifulPaint2.setStrokeWidth(23f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(lightPinkColor);
        paint.setTextSize(100);
        paint.setAntiAlias(true);
        canvas.drawColor(snowBlueColor);

        canvas.drawRect(300, 1300, 800, 1800, boxPaint);
        canvas.drawRect(280, 1250, 820, 1350, boxCapPaint);
        canvas.drawRect(520, 1250, 580, 1800, beautifulPaint);

        canvas.drawArc(rectfLeft,0,360,false, beautifulPaint2);
        canvas.drawArc(rectfRight,0,360,false, beautifulPaint2);

        canvas.drawText("C Новым Годом!", 200, 800, paint);
    }
}