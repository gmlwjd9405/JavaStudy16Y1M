
public class ProblemEX_4_5 extends Problem {

	String title;
	String author;
	int ISBN;

	public ProblemEX_4_5(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public ProblemEX_4_5() {
		
	}

	@Override
	public void run() {
		ProblemEX_4_5 javaBook = new ProblemEX_4_5("�ڹ�", "Ȳ����", 3333);

		System.out.println(javaBook.title + javaBook.author + javaBook.ISBN);
	}

}
