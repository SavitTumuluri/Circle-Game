
public class Circle {

	private int width, height;
	private float x, y, vx, vy, size;
	private Color color;
	
	public Circle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public Circle(int width, int height, float x, float y, float vx, float vy, float size, Color color)
	{
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.size = size;
		this.color = color;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getVx() {
		return vx;
	}
	public void setVx(float vx) {
		this.vx = vx;
	}
	public float getVy() {
		return vy;
	}
	public void setVy(float vy) {
		this.vy = vy;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	public void respawn(float playerSize)
	{
		float min = playerSize - playerSize/2;
		float max = playerSize + playerSize/2;
		this.size = (float)(Math.random() * ((max - min) + 1)) + min;
		respawn();
	}
	
	public void respawn()
	{
		this.vx = (float) (Math.random() * 3 + 1);
		this.vy = (float) (Math.random() * 3 + 1);
		int x = (int) (Math.random() * 2 + 1);
		int y = (int) (Math.random() * 2 + 1);
		int colorR = (int) (Math.random() * 225 +1);
		int colorG = (int) (Math.random() * 225 +1);
		int colorB = (int) (Math.random() * 225 +1);

		if (x == 1)
		{
			if (y == 1)
			{
				this.x = 0;
				this.y = (float) (Math.random() * 600 + 1);
			}
			if (y == 2)
			{
				this.x = 600;
				this.y = (float) (Math.random() * 600 + 1);
				this.vx = -1 * this.vx;
			}
		}
		if (x == 2)
		{
			if (y == 1)
			{
				this.y = 0;
				this.x = (float) (Math.random() * 600 + 1);
			}
			if (y == 2)
			{
				this.y = 600;
				this.x = (float) (Math.random() * 600 + 1);
				this.vy = -1 * this.vy;
			}
		}
		this.color = new Color (colorR, colorG, colorB);

	}
	
	public void checkBoundary()
	{
		if (this.x < 0 || this.x > 600)
		{
			respawn();
		}
		if (this.y < 0 || this.y > 600)
		{
			respawn();
		}
	}
	public void move()
	{
		this.x = this.x + this.vx;
		this.y = this.y +this.vy;
	}
	public void update()
	{
		checkBoundary();
		move();
	}
}
