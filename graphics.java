package com.example.root.gameoflife;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import java.util.ArrayList;

/**
 * Created by deepika on 2/20/17.
 */

public class graphics extends Activity {

    GameGrid gameGrid;
    int squareWidth = 60;
    ArrayList<Point> points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameGrid = new GameGrid(this);
        setContentView(R.layout.activity_main);
        gameGrid.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Point p = new Point();
                p.x= (int) event.getX();
                p.y= (int) event.getY();
                System.out.print("touched***********");
                p.x = p.x-(p.x%squareWidth);
                p.y = p.y-(p.y%squareWidth);

                points.add(new Point(p));
                return true;
            }
        });
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
