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
	//定义并创建画笔
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
	//为该组件的触碰事件重写事件处理方法
	@Override
	public boolean onTouchEvent(MotionEvent event){
		currentX = event.getX();
		currentY = event.getY();
		//通知当前组件重绘自己
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
