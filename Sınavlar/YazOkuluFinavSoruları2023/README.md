 2.Soru
 - Kuyruk, Yığıt ve ağaç yapıları nerelerde kullanılır? Açıklayınız.

| Özellikler         | Stack              | Kuyruk             | Ağaç               |
|--------------------|--------------------|--------------------|--------------------|
| Temel İşleyiş      | LIFO (Son giren,  ilk çıkar)    | FIFO (İlk giren, ilk çıkar)   | Hiyerarşik yapı   |                                                         
| Depolama Yapısı   | Lineer         | Lineer        | Hiyerarşik |
| Veri ekleme       | Üstüne ekler | Sona ekler  | Kökten başlayarak ekler  |
| Veri çıkarma       | Üstünden çıkar | Önden çıkar  | Belirli düğümü çıkarır  |
| Kullanım Alanları | Geri alma işlemi(internet tarayıcılarında), işlem çağrısı, sistem çağrıları, bellek yönetimi|İşlemci planlaması, dosya sistemi, ağ yönetimi, mesajlaşma|Veritabanı yönetim sistemleri, Otomatik düzeltme ve tahminleme, internet tarayıcıları geçmişi, dosya sistemleri, sıralama algoritmaları, Derin Öğrenme     |

  
3.Soru
 - Aşağıdaki ifadeleri arama ağacına yerleştirerek preorder, postorder, ve inorder gezinme yöntemlerine göre değerlerini veriniz.
   - 5, 2, 8, 4, 6, 7, 12, 13, 1 (NOT : 5 kök olacak ve diğer değerler sırasıyla ağaca eklenecektir)
   
```code
     5
   /   \
  2     8
 /  \   / \
1    4  6   12
         \    \
          7    13
```

1. Preorder : 5, 2, 1, 4, 8, 6, 7, 12, 13
2. Postorder : 1, 4, 2, 7, 6, 13, 12, 8, 5 
3. İnorder : 1, 2, 4, 5, 6, 7, 8, 12, 13


4.Soru
 - Bir ikili arama ağacında en kötü durum nedir? Ne tür bir dizi geldiği zaman oluşur örnekle açıklayınız.
   - `çözüm:` Bir ikili arama ağacının en kötü durumu ağacın dengesiz bir şekilde büyüdüğü durumlardır, teorik olarak böyle durumlarda ağaçta gezinme algoritmasının karmaşıklığı O(logn)'den O(n)'e doğru çıkar. Sıralı artan ve ya azalan elemanlı bir dizi dengesiz bir ağaç için mükemmel birer örneklerdir.
   
