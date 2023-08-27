package Algoritmalar;

public class Main {

	public static void main(String[] args) {
		
		//Doğrusal Arama Algoritması
		/*int[] dizi = {1, 5, 12};
		 * System.out.println("Doğrusal Arama : ");
		System.out.println(doğrusalArama(dizi,4));
		System.out.println(doğrusalArama(dizi,5));*/
		
		//İkili Arama Algoritması
		/*int[] dizi = {1, 5, 12, 34, 56, 14};
		System.out.println("İkili Arama : ");
		System.out.println(ikiliArama(dizi,4));
		System.out.println(ikiliArama(dizi,1));*/
		
        //Quick Sort
		/*int[] myArray = {64, 34, 25, 12, 22, 11, 90};
	    int n = myArray.length - 1;
	    quickSort(myArray, 0, n);

	    System.out.println("Sıralanmış Dizi:");
	    for (int num : myArray) {
	        System.out.print(num + " ");
	    }*/
		
		//merge
		 int[] myArray = {64, 34, 25, 12, 22, 11, 90};
	        int n = myArray.length - 1;
	        mergeSort(myArray, 0, n);

	        System.out.println("Sıralanmış Dizi:");
	        for (int num : myArray) {
	            System.out.print(num + " ");
	        }
	        
	        //heap
	        int[] myArray1 = {64, 34, 25, 12, 22, 11, 90};
	        heapSort(myArray1);

	        System.out.println("Sıralanmış Dizi:");
	        for (int num : myArray1) {
	            System.out.print(num + " ");
	        }
		
	}
	

	
	
	
	
	
	//Doğrusal Arama Algoritması
	
	    public static int doğrusalArama(int[] dizi, int hedef) {
	        for (int i = 0; i < dizi.length; i++) {
	            if (dizi[i] == hedef) {
	                return i; // Hedef elemanın indeksini döndür
	            }
	        }
	        return -1; // Hedef elemanı dizide bulunamadı
	    }

	  //İkili Arama Algoritması
	    
	    public static int ikiliArama(int[] dizi, int hedef) {
	        int sol = 0;
	        int sag = dizi.length - 1;

	        while (sol <= sag) {
	            int orta = sol + (sag - sol) / 2;

	            if (dizi[orta] == hedef) {
	                return orta; // Hedef elemanın indeksini döndür
	            } else if (dizi[orta] < hedef) {
	                sol = orta + 1; // Hedef eleman sağdaki yarıda
	            } else {
	                sag = orta - 1; // Hedef eleman soldaki yarıda
	            }
	        }

	        return -1; // Hedef elemanı dizide bulunamadı
	    }
	    
	    //Buble Sort
	    public static void bubbleSort(int[] dizi) {
	        int n = dizi.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (dizi[j] > dizi[j + 1]) {
	                    // Elemanları yer değiştir
	                    int temp = dizi[j];
	                    dizi[j] = dizi[j + 1];
	                    dizi[j + 1] = temp;
	                }
	            }
	        }
	    }

	     
	            public static void selectionSort(int[] dizi) {
	                int n = dizi.length;
	                for (int i = 0; i < n - 1; i++) {
	                    int minIndex = i;
	                    for (int j = i + 1; j < n; j++) {
	                        if (dizi[j] < dizi[minIndex]) {
	                            minIndex = j;
	                        }
	                    }
	                    // En küçük elemanı swap işlemi ile taşı
	                    int temp = dizi[minIndex];
	                    dizi[minIndex] = dizi[i];
	                    dizi[i] = temp;
	                }
	            }
	            
	            
	            
	                public static void insertionSort(int[] dizi) {
	                    int n = dizi.length;
	                    for (int i = 1; i < n; i++) {
	                        int key = dizi[i];
	                        int j = i - 1;

	                        while (j >= 0 && dizi[j] > key) {
	                            dizi[j + 1] = dizi[j];
	                            j--;
	                        }
	                        dizi[j + 1] = key;
	                    }
	                }

	 
	                
	                public static void quickSort(int[] dizi, int küçük, int büyük) {
	                    if (küçük < büyük) {
	                        int pivotIndex = bölünme(dizi, küçük, büyük);
	                        quickSort(dizi, küçük, pivotIndex - 1);
	                        quickSort(dizi, pivotIndex + 1, büyük);
	                    }
	                }

	                public static int bölünme(int[] dizi, int küçük, int büyük) {
	                    int pivot = dizi[büyük];
	                    int i = küçük - 1;

	                    for (int j = küçük; j < büyük; j++) {
	                        if (dizi[j] < pivot) {
	                            i++;
	                            int temp = dizi[i];
	                            dizi[i] = dizi[j];
	                            dizi[j] = temp;
	                        }
	                    }

	                    int temp = dizi[i + 1];
	                    dizi[i + 1] = dizi[büyük];
	                    dizi[büyük] = temp;

	                    return i + 1;
	                }
	                
	                
	                public static void heapSort(int[] dizi) {
	                    int n = dizi.length;

	                    // Max heap oluştur
	                    for (int i = n / 2 - 1; i >= 0; i--) {
	                        heapify(dizi, n, i);
	                    }

	                    // Heap'tan elemanları çıkararak sırala
	                    for (int i = n - 1; i > 0; i--) {
	                        int temp = dizi[0];
	                        dizi[0] = dizi[i];
	                        dizi[i] = temp;

	                        heapify(dizi, i, 0);
	                    }
	                }

	                public static void heapify(int[] dizi, int n, int i) {
	                    int largest = i;
	                    int left = 2 * i + 1;
	                    int right = 2 * i + 2;

	                    if (left < n && dizi[left] > dizi[largest]) {
	                        largest = left;
	                    }

	                    if (right < n && dizi[right] > dizi[largest]) {
	                        largest = right;
	                    }

	                    if (largest != i) {
	                        int swap = dizi[i];
	                        dizi[i] = dizi[largest];
	                        dizi[largest] = swap;

	                        heapify(dizi, n, largest);
	                    }
	                }

	                public static void mergeSort(int[] arr, int left, int right) {
	                    if (left < right) {
	                        int mid = (left + right) / 2;

	                        mergeSort(arr, left, mid);
	                        mergeSort(arr, mid + 1, right);

	                        merge(arr, left, mid, right);
	                    }
	                }

	                public static void merge(int[] arr, int left, int mid, int right) {
	                    int n1 = mid - left + 1;
	                    int n2 = right - mid;

	                    int[] leftArr = new int[n1];
	                    int[] rightArr = new int[n2];

	                    for (int i = 0; i < n1; i++) {
	                        leftArr[i] = arr[left + i];
	                    }
	                    for (int j = 0; j < n2; j++) {
	                        rightArr[j] = arr[mid + 1 + j];
	                    }

	                    int i = 0, j = 0, k = left;
	                    while (i < n1 && j < n2) {
	                        if (leftArr[i] <= rightArr[j]) {
	                            arr[k] = leftArr[i];
	                            i++;
	                        } else {
	                            arr[k] = rightArr[j];
	                            j++;
	                        }
	                        k++;
	                    }

	                    while (i < n1) {
	                        arr[k] = leftArr[i];
	                        i++;
	                        k++;
	                    }

	                    while (j < n2) {
	                        arr[k] = rightArr[j];
	                        j++;
	                        k++;
	                    }
	                }



	


}
