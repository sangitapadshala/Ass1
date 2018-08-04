import java.io.Serializable;

public class Student implements Serializable{
	private int maths, science, eng;
	private transient int total;

	public Student() {
	}

	public Student(int maths, int science, int eng) {
		super();
		this.maths = maths;
		this.science = science;
		this.eng = eng;
		total = maths + science + eng;
	}

	public void result() {
		System.out.println("Maths: " + maths);
		System.out.println("Science: " + science);
		System.out.println("English: " + eng);
		System.out.println("Total: " + total);
	}
}
