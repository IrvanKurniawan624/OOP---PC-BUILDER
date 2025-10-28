Judul Proyek: PC Builder Tycoon - Core Engine v1.0
Tim : Irvan Aditya Kurniwan & Muhammad Syauqy Arrayyan

Deskripsi Singkat Arsitektur : 
Dalam aplikasi ini kami membuat class abstract Component sebagai blueprint awal untuk semua komponen agar setiap jenis komponen menyediakan perilaku dan akses data yang konsisten. Di kelas Pc, setiap komponen dikumpulkan dalam ArrayList sehingga Pc menggunakan dapat menyimpan dan mengelola komponen secara dinamis tanpa mengetahui detail implementasinya. Tiga komponen inti (Motherboard, Cpu, Ram) diinisialisasi langsung di konstruktor Pc sebagai bentuk composition, memastikan objek Pc selalu terbangun dengan dasar componen tersebut.

## Personal Reflection
1. Momen "Aha!" Terbesar
Irvan : Menurut saya momen paling membuat saya memahami konsep dengan lebih baik pada Misi ke-1 saat menentukan komposisi dan aggregasi untuk setiap komponen pada pc dan juga merefactoring folder pada misi ke-2.

2. Kelemahan Terbesar Saya/Tim
Irvan : Salah satu kelemahan pada desain awal saya terdapat pada penggunaann abstract class di component yang lupa saya berikan abstract method. 

3. Skill baru yang paling berharga
Irvan : menurut saya skill paling berharga adalah saat kita mengaudit kode orang lain dan berusaha mencari kesalahan serta memberikan saran pada kode tersebut.