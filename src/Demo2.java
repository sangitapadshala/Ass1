
public class Demo2<S> {
private S data;

public Demo2(S data) {
	this.data = data;
}

public S getData() {
	return data;
}

public void setData(S data) {
	this.data = data; 
}
public static void main(String[] args) {
	Demo2<String> d1 = new Demo2<String>("Hello");
	System.out.println(d1.getData());
	
	Demo2 d2 = new Demo2(5000);
	d2.setData("bye");
	System.out.println(d2.getData());
}
}
