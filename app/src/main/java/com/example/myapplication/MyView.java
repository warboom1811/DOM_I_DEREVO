package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
       // super.onDraw(canvas);

        Paint p = new Paint();
        p.setColor(Color.parseColor("#008080"));
        canvas.drawPaint(p);
        p.setColor(Color.GREEN);
        p.setAntiAlias(true);
        p.setStrokeWidth(11);
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(0,1800,canvas.getWidth(),canvas.getHeight(),p);
        p.setColor(Color.YELLOW);
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0,0,260,p);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(18);
        Path path = new Path();
        path.moveTo(0,0);
        path.lineTo(330,0);
        path.moveTo(0,0);
        path.lineTo(350,60);
        path.moveTo(0,0);
        path.lineTo(360,150);
        path.moveTo(0,0);
        path.lineTo(350,220);
        path.moveTo(0,0);
        path.lineTo(300,300);
        path.moveTo(0,0);
        path.lineTo(200,340);
        path.moveTo(0,0);
        path.lineTo(100,350);
        path.moveTo(0,0);
        path.lineTo(10,330);
        canvas.drawPath(path,p);
        p.setStrokeWidth(5);
        p.setColor(Color.parseColor("#8b4513"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(300,1600,700,2000,p);
        p.setColor(Color.parseColor("#00ffff"));
        canvas.drawRect(300,1700,400,1850,p);
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(5);
        canvas.drawRect(303,1700,400,1850,p);
        canvas.drawRect(300,1600,700,2000,p);
        Path pth = new Path();
        pth.moveTo(300,1600);
        pth.lineTo(500,1200);
        pth.lineTo(700,1600);
        canvas.drawPath(pth,p);
        Path pthh = new Path();
        p.setColor(Color.parseColor("#8b4513"));
        p.setStyle(Paint.Style.FILL);
        p.setStrokeWidth(18);
        pthh.moveTo(300,1600);
        pthh.lineTo(500,1200);
        pthh.lineTo(700,1600);
        canvas.drawPath(pthh,p);
        p.setColor(Color.parseColor("#00ffff"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(500,1450,60,p);
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.BLACK);
        p.setStrokeWidth(5);
        canvas.drawCircle(500,1450,60,p);
        p.setColor(Color.parseColor("#A0522D"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(500,1700,650,2000,p);
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);
        canvas.drawRect(500,1700,650,2000,p);
        canvas.drawLine(390,1700,400,1710,p);
        canvas.drawLine(380,1700,400,1720,p);
        canvas.drawLine(370,1700,400,1730,p);
        canvas.drawLine(360,1700,400,1740,p);
        canvas.drawLine(350,1700,400,1750,p);
        canvas.drawLine(340,1700,400,1760,p);
        canvas.drawLine(330,1700,400,1770,p);
        canvas.drawLine(320,1700,400,1780,p);
        canvas.drawLine(310,1700,400,1790,p);
        canvas.drawLine(300,1700,400,1800,p);
        canvas.drawLine(300,1710,400,1810,p);
        canvas.drawLine(300,1720,400,1820,p);
        canvas.drawLine(300,1730,400,1830,p);
        canvas.drawLine(300,1740,400,1840,p);
        canvas.drawLine(300,1750,400,1850,p);
        canvas.drawLine(300,1760,390,1850,p);
        canvas.drawLine(300,1770,380,1850,p);
        canvas.drawLine(300,1780,370,1850,p);
        canvas.drawLine(300,1790,360,1850,p);
        canvas.drawLine(300,1800,350,1850,p);
        canvas.drawLine(300,1810,340,1850,p);
        canvas.drawLine(300,1820,330,1850,p);
        canvas.drawLine(300,1830,320,1850,p);
        canvas.drawLine(300,1840,310,1850,p);
        canvas.drawLine(300,1850,300,1850,p);
        p.setColor(Color.parseColor("#CD853F"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(1000,1900,1070,2000,p);
        p.setColor(Color.parseColor("#008000"));
        canvas.drawOval(915,1100,1155,1930,p);
    }
}
