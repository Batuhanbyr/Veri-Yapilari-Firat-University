package BaglıListeİleStackler;

public class Main {

	public static void main(String[] args) {
		BaglıListeliStack yıgın = new BaglıListeliStack();
		
		yıgın.push(1);
        yıgın.push(2);
        
        yıgın.print();
        System.out.println(" ");
        yıgın.pop();
        yıgın.print();
        System.out.println(" ");
        yıgın.pop();
        yıgın.print();
        
        yıgın.push(2);
        yıgın.push(21);
        yıgın.push(22);
        yıgın.push(23);
        yıgın.print();
       
      
   
	}

}
