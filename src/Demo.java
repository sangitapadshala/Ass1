
public class Demo {
private Object data;

public Demo(Object data) {
	this.data = data;
}

public Object getData() {
	return data;
}

public void setData(Object data) {
	this.data = data;
}
public static void main(String[] args) {
	Demo d1 = new Demo("Hello");
	System.out.println(d1.getData());
	
	Demo d2 = new Demo(5000);
	System.out.println(d2.getData());
}
}
