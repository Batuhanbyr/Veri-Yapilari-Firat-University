>Teorik Sorular & Çözümleri | Diğer sorular ve cevapları Main
>2dedir
## 4.Soru
*  Aşağıda verilen iki seriyide ikili arama ağacına yerleştiriniz. (İkl değeri kök olarak alınız ve sırasıyla yerleştiriniz.) 
   1. 10, 5, 3, 12, 9, 18, 16, 13 
   2. fatma, ali, veli, bilal, osmman, hıdır
 
```code
   10
  /   \
  5   12
 / \    \
3   9   18
        /   
       16   
      /
     13
```

```code
    Fatma
   /    \
Ali     Veli
  \    /    
Bilal Osman 
      /
    Hıdır        
```

## 5.Soru
*  bir önceki sorudaki kök değeri ne seçilmelidir ki, ağaç mümkün olduğu kadar dengeli olsun. Bu seçtiğiniz değere göre ikili arama ağacını tekrar çiziniz.
   1. 10, 5, 3, 12, 9, 18, 16, 13 
   2. fatma, ali, veli, bilal, osmman, hıdır

sayısal değerlerde değerler sıralanır ve ortadaki değer kök olarak seçilir.
3, 5, 9, 10, 12, 13, 16, 18
```code
      10
    /    \
   5      13
  / \    /  \
 3   9  12   16
              \
              18

```

alfabetik dğeerlerde en küçük harf seçilir.
```code
    Ali
   /  \
Bilal  Fatma
     \    \
    Hıdır  Osman
          /
        Veli
  
```
## 6.Soru
*   4 ve 5. soruda oluşturduğunuz ikili arama ağacı üzerinde preorder, postorder, inorder, levelorder gezinme yöntemleri ile geziniz.
   * 10, 5, 3, 12, 9, 18, 16, 13 `(4.soru)`
      1. Preorder : 10, 5, 3, 9, 12, 18, 16
      2. Postorder : 3, 9, 5, 13, 16, 18, 12, 10
      3. Levelorder : (0: 10),(1: 5, 12),(2: 3, 9, 18),(3: 16),(4: 13)
      4. inorder : 3, 5, 9, 10, 12, 13, 16, 18
   * 10, 5, 3, 12, 9, 18, 16, 13 `(5.soru)`
      1. Preorder : 10, 5, 3, 9, 13, 12, 18, 16, 13, 10
      2. Postorder : 3, 9, 15, 12, 18, 16, 13, 10
      3. Levelorder : (0: 10),(1: 5, 13),(2: 3, 9, 12, 16),(3: 18)
      4. inorder : 3, 5, 9, 10, 12, 13, 16, 18
   * fatma, ali, veli, bilal, osmman, hıdır `(4.soru)`
      1. Preorder : Fatma, Ali, Bilal, Veli, Osman, Hıdır
      2. Postorder : Bilal, Ali, Hıdır, Osman, Veli, Fatma
      3. Levelorder : (0: Fatma),(1: Ali, Veli),(2: Bilal, Osman),(3: Hıdır)
      4. inorder : Ali, Bilal, Fatma, Hıdır, Osman, Veli 
  * fatma, ali, veli, bilal, osmman, hıdır `(5.soru)` 
      1. Preorder : Ali, Bilal, Hıdır, Fatma, Osman, Veli
      2. Postorder : Hıdır, Bilal, Veli, Osman, Fatma, Ali
      3. Levelorder : (0: 10),(1: 5, 12),(2: 3, 9, 18),(3: 16),(4: 13)
      4. inorder : Bilal, Hıdır, Ali, Fatma, Veli, Osman
## 7.Soru
* Bir ikili arama ağacında en kötü duruma örnek veriniz. Verdiğiniz örnekdeki ortadaki sayıyı kök alarak yeniden ağaç oluşturunuz.

en kötü durum 
  ```code
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
              \
               7
```
en iyi durum
  ```code
        4
      /   \
     2     6
    / \   / \
   1   3 5   7

```
## 8.Soru
* Stack, Kuyruk ve Ağaç yapılarının arasındaki benzerlikler ve farklılıkları, kullanıldıkları alanları açıklayınız.



