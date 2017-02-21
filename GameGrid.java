package com.example.root.gameoflife;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepika on 2/20/17.
 */

public class GameGrid extends View{


    Paint paint = new Paint();
    int squareWidth = 60;
    //List<Point> points = new ArrayList<Point>();
    //ArrayList<Point> points;
    public GameGrid(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
    }

    public GameGrid(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean bounds;

        int height = canvas.getHeight();
        int width = canvas.getWidth();

        int numrow = height/squareWidth;
        int numcol = width/squareWidth;


        for(int i = 0; i < width; i+=squareWidth)
        {
            canvas.drawLine(i, 0, i, height, paint);
        }

        for(int i = 0; i < height; i+=squareWidth)
        {
            canvas.drawLine(0, i, width, i, paint);
        }

       /* paint.setColor(Color.RED);
        if (points != null) {
            for (Point point : points) {
                canvas.drawCircle(point.x + squareWidth / 2, point.y + squareWidth / 2, squareWidth / 2, paint);
            }
        }*/


    }

   /* @Override
    public boolean onTouch(View v, MotionEvent event) {
        Point p = new Point();
        p.x= (int) event.getX();
        p.y= (int) event.getY();
        System.out.print("touched***********");
        p.x = p.x-(p.x%squareWidth);
        p.y = p.y-(p.y%squareWidth);

        points.add(new Point(p));
        invalidate();
        return true;
    }*/
}
