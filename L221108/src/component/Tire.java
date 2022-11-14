package component;

public class Tire {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size >= 0) {
			this.size = size;
		}
	}
 
}
