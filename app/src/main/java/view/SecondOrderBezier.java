package view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 二阶贝塞尔曲线
 */

public class SecondOrderBezier extends View {

    private Paint mPaintBeaier;
    private Paint mPaintAuxiliary;
    private Paint mPaintAuxiliaryText;

    private float mAuxiliaryY;
    private float mAuxiliaryX;

    private float mStartPointX;
    private float mStartPointY;

    private int mEndPointX;
    private int mEndPointY;

    private Path mPath = new Path();



    public SecondOrderBezier(Context context) {
        super(context);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mStartPointX = w / 4;
        mStartPointY = h / 2 - 200;

        mEndPointX = w / 4 * 3;
        mEndPointY = h / 2 - 200;
    }

    public SecondOrderBezier(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaintBeaier = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintBeaier.setStyle(Paint.Style.STROKE);
        mPaintBeaier.setStrokeWidth(8);

        mPaintAuxiliary = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintAuxiliary.setStyle(Paint.Style.STROKE);
        mPaintAuxiliary.setStrokeWidth(2);

        mPaintAuxiliaryText = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintAuxiliaryText.setStyle(Paint.Style.STROKE);
        mPaintAuxiliaryText.setTextSize(20);

    }

    public SecondOrderBezier(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            mAuxiliaryX = event.getX();
            mAuxiliaryY = event.getY();
            invalidate();
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPath.reset();
        mPath.moveTo(mStartPointX, mStartPointY);
        //辅助点
        canvas.drawPoint(mAuxiliaryX,mAuxiliaryY,mPaintAuxiliary);
        canvas.drawText("控制点",mAuxiliaryX,mAuxiliaryY,mPaintAuxiliaryText);
        canvas.drawText("起始点",mStartPointX,mStartPointY,mPaintAuxiliaryText);
        canvas.drawText("终止点",mEndPointX,mEndPointY,mPaintAuxiliaryText);

        //辅助线
        canvas.drawLine(mStartPointX,mStartPointY,mAuxiliaryX,mAuxiliaryY,mPaintAuxiliary);
        canvas.drawLine(mEndPointX,mEndPointY,mAuxiliaryX,mAuxiliaryY,mPaintAuxiliary);

        //二阶贝塞尔曲线
        mPath.quadTo(mAuxiliaryX,mAuxiliaryY,mEndPointX,mEndPointY);
        canvas.drawPath(mPath,mPaintBeaier);
    }
}
