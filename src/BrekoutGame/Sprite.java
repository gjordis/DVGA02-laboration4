package BrekoutGame;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class Sprite{
	private int x, y, width, height;
	/* Skapar ett Rectangle objekt för att få
	 * tillgång till metoder som denna klass 
	 * har.  */
	protected Rectangle bounds;
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public int getWidth() { return this.width; }
	public int getHeight() { return this.height; }
	public void setX(int x) { this.x = x; };
	public void setY(int y) { this.y = y; };
	public void setWidth(int width) { this.width = width; };
	public void setHeight(int height) { this.height = height; };
	public Sprite(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.bounds = new Rectangle(x, y, width, height);
	}
	public abstract void update(Keyboard keyboard);
	public abstract void draw(Graphics2D graphics);
	public abstract void updateBounds();
    public abstract Rectangle getBounds();
}	
