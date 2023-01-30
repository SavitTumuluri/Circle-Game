
public class Character {
	private float x, y;
	private float size;
	private Color color;
	
	/*
	 * A 4 parameter constructor to initialize the position (x, y), the size (diameter), and the color of the circle.
	 */
	public Character(float x, float y, float size, Color color)
	{

		this.size = size;
		this.color = color;
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
	public float getSize() {
		return size;
	}
	public void setSize(float Size) {
		this.size = Size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void moveCharacter(int mouseX, int mouseY){
		this.x = mouseX;
		this.y = mouseY;
	}
	public boolean collidingWith(Circle other)
	{
		//calculate distance
		float distance = (float) Math.sqrt( Math.pow(  (this.x - other.getX()), 2) + Math.pow(  (this.y - other.getY()), 2)  );
		//check if the distance is less than that of the sum of radii
		float radiiSum = (this.size / 2) + (other.getSize() / 2);
		//return if collides
		if (distance < radiiSum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void grow()
	{
		this.size = this.size + 1;
	}
	
}
