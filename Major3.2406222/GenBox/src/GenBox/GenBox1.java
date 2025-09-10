package GenBox;

public class GenBox1<T> {
	    private T t;
	    
	    public void add(T t) {
	    	this.t = t;
	    }
	    
	    public T get() {
	    	return t;
	    }
		public static void main(String[] args) {
			GenBox1<Integer> IntegerBox = new GenBox1<Integer>();
			GenBox1<String> stringBox = new GenBox1<String>();
			
			IntegerBox.add(new Integer(10));
			stringBox.add(new String("Hello World"));
			
			System.out.printf("integer Value :%d\n\n", IntegerBox.get());
			System.out.printf("String Value :%s\n", stringBox.get());
		}

	}
