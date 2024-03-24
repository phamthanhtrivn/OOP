package bai10;

public abstract class Shape {
	private int x, y;
	
	protected abstract void draw();
	protected abstract void erase();
	protected abstract void move(int x, int y);
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
