package Stackler;

public class Main {

	public static void main(String[] args) {
		StackYıgın yıgın = new StackYıgın(5);
		
		yıgın.push(3);
		yıgın.push(2);
		yıgın.push(1);
		
		yıgın.pop();
		yıgın.pop();
		
		yıgın.push(5);
		yıgın.pop();
		yıgın.pop();
		yıgın.pop();
       
		//System.out.println(yıgın.dizi[1]);
	}

}
