package tut04.act2;

import java.util.Arrays;

public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(0.0f, 0.0f);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint() {
		this.xSpeed = 0.0f;
		this.ySpeed = 0.0f;
	}
	public float getXSpeed() {
		return xSpeed;
	}
	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getYSpeed() {
		return ySpeed;
	}
	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed() {
		return new float[] {xSpeed, ySpeed};
	}
	@Override
	public String toString() {
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ", speed=" + Arrays.toString(getSpeed())
				+ "]";
	}
	public MovablePoint move() {
		x += xSpeed;
		y += ySpeed;
		return this;
	}
}
