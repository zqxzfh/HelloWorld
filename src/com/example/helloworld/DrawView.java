package com.example.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View {
	public float currentX = 40;
	public float currentY = 50;
	//create a pen
	Paint p = new Paint();
	public DrawView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public DrawView(Context context,AttributeSet set) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);
		p.setColor(Color.RED);
		canvas.drawCircle(currentX, currentY, 15, p);
	}
	//override event handle method--touch method for this module 
	@Override
	public boolean onTouchEvent(MotionEvent event){
		currentX = event.getX();
		currentY = event.getY();
		// redraw itself
		invalidate();
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
