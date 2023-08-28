package Stackler;

public class StackYıgın {
Integer[] dizi;
int size; 
int index;
public StackYıgın(int size) {
	this.size = size;
	dizi = new Integer[size]; //pop çağrıldığında elemanı silmek için ve null yapmak için Integer kullanıyoruz
	index = -1; //eleman ekledikçe bir artıcak bu sayede birinci eleman index 0 olucak
}

void push(int data) {
	if(isFull()) {
		System.out.println("push : stack dolu");
	}else {
	index++;
	dizi[index] = data;
	System.out.println("push : " + dizi[index]);
	}
}

void pop() {
	if(isEmpty()) {
		System.out.println("pop : stack bos");
		
	}else {
		System.out.println("pop : " + dizi[index]);
		dizi[index] = null;
		index--;
	}
}

boolean isFull() {
	return(index == size-1);
}

boolean isEmpty() {
	return (index == -1);
}

}
