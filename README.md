Nama  : Reza Afzaal Faizullah Taqy <br>
NRP   : 5025241051 <br>

Soal 1 <br>
<img width="1568" height="678" alt="image" src="https://github.com/user-attachments/assets/32cbfbc6-8f8d-469b-9f03-27704fc8b34e" />


Soal 2 <br>
<img width="1374" height="528" alt="image" src="https://github.com/user-attachments/assets/24980eed-487a-43f1-880b-01a96c0e3724" />


A. `Fungsi Program` <br>
1. Program Makhluk Hidup: Program ini berfungsi untuk memodelkan hierarki biologis dasar. Tujuannya adalah memastikan bahwa setiap kelas turunan (Manusia, Hewan, Tumbuhan) memiliki kontrak wajib untuk mendefinisikan cara mereka bernafas dan bergerak, karena setiap makhluk hidup pasti melakukan dua hal tersebut namun dengan cara yang berbeda.

2. Program Foxes and Rabbits: Program ini adalah simulasi ekosistem sederhana (Predator-Prey). Fungsinya untuk mensimulasikan siklus hidup hewan di mana mereka bertambah tua dan melakukan aksi spesifik setiap putaran waktu. Penggunaan Abstract Class berfungsi untuk menghilangkan duplikasi kode terkait manajemen umur dan status kematian yang sebelumnya ditulis ulang di masing-masing kelas.

B. `Cara Kerja Program` <br>
1. Mekanisme Abstraksi: <br>

-> Pada MakhlukHidup, metode bernafas() dideklarasikan tanpa isi (body). Ini memaksa Manusia, Hewan, dan Tumbuhan untuk menulis ulang (override) metode tersebut. Jika tidak ditulis, program akan error saat dikompilasi.

-> Saat dijalankan di main, objek dipanggil melalui referensi induknya. Java secara otomatis menjalankan metode milik anak yang sesuai (Polimorfisme). <br>
<img width="600" height="615" alt="image" src="https://github.com/user-attachments/assets/a18304d1-8875-4a87-be5d-bd368c01c469" />


2. Mekanisme Generalisasi (Pada Foxes and Rabbits): <br>

-> Program tidak lagi menyimpan variabel age di dalam Rabbit dan Fox secara terpisah. Variabel ini ditarik ke atas (pull up) ke kelas Animal.

-> Saat bertindak() dipanggil dalam loop, setiap hewan menjalankan logikanya masing-masing.

-> Method incrementAge() mengecek getMaxAge(). Karena getMaxAge() adalah metode abstrak yang di-override, Rubah akan mati di umur 10, sedangkan Kelinci mati di umur 5, meskipun logika pengecekannya ada di kelas induk Animal. <br>
<img width="599" height="480" alt="image" src="https://github.com/user-attachments/assets/6062c953-c27a-4ef4-be72-62f90a266954" />


C. `Penjelasan Masing-Masing Class` <br>

1. Analisis Program Makhluk Hidup <br>

-> MakhlukHidup <br>
Kelas dasar yang tidak bisa dibuat objeknya. Berisi atribut nama dan mendefinisikan "kontrak" bahwa semua makhluk hidup harus bisa bernafas dan bergerak.

-> Manusia <br>
Turunan MakhlukHidup. Mengimplementasikan bernafas (Paru-paru) dan bergerak (Kaki).

-> Hewan <br>
Turunan MakhlukHidup. Representasi umum hewan dengan cara gerak yang variatif.

-> Tumbuhan <br>
Turunan MakhlukHidup. Membuktikan fleksibilitas abstraksi: Tumbuhan "bergerak" secara pasif (tumbuh), yang sangat berbeda dengan manusia/hewan, namun tetap masuk dalam definisi bergerak di mata sistem.

2. Analisis Program Foxes and Rabbits <br>

-> Animal <br>
Hasil refactoring. Menyimpan state umum (age, isAlive) dan behavior umum (incrementAge). Memaksa anak kelas untuk mendefinisikan bertindak() dan getMaxAge().

-> Rabbit <br>
Merepresentasikan mangsa. Mengatur batas umur pendek (5). Implementasi bertindak() fokus pada makan rumput dan berkembang biak. 

-> Fox <br>
Merepresentasikan predator. Mengatur batas umur lebih panjang (10). Implementasi bertindak() fokus pada berburu.

-> Simulasi <br>
Mengontrol jalannya waktu (looping putaran) dan menampung seluruh hewan dalam satu koleksi polimorfik (Animal[]).
