package fill.coo.generics;

public class Rutabaga implements Vegetable {
    private String name;
    private static final String DEFAULT = "Rutabaga";

    public Rutabaga (int i) {
	this.name = DEFAULT+"-"+i;
    }

    public String toString() { 
	return this.name;
    }

}
