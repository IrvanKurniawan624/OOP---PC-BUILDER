Judul Proyek: PC Builder Tycoon - Core Engine v1.0
Tim : Irvan Aditya Kurniwan & Muhammad Syauqy Arrayyan

Deskripsi Singkat Arsitektur : <br>
Dalam aplikasi ini kami membuat class abstract Component sebagai blueprint awal untuk semua komponen agar setiap jenis komponen menyediakan perilaku dan akses data yang konsisten. Di kelas Pc, setiap komponen dikumpulkan dalam ArrayList sehingga Pc dapat menyimpan dan mengelola komponen secara dinamis tanpa mengetahui detail implementasinya. Tiga komponen inti (Motherboard, Cpu, Ram) diinisialisasi langsung di konstruktor Pc sebagai bentuk composition, memastikan objek Pc selalu terbangun dengan dasar componen tersebut.

## Personal Reflection
1. Momen "Aha!" Terbesar pada praktikum hari ini<br>
Irvan : Menurut saya momen paling membuat saya memahami konsep dengan lebih baik pada Misi ke-1 saat menentukan komposisi dan aggregasi untuk setiap komponen pada pc dan juga merefactoring folder pada misi ke-2.
Syauqy : Menurut saya, momen yang paling membuat saya "Aha!" adalah saat menemukan bagaimana gambaran program yang akan kami buat nantinya. Menggunakan penerapan abstract class pada program kami, membuat saya lebih memahami fungsi jenis class tersebut lebih dalam lagi. Penerapan relasi antar kelas juga yang diterapkan pada program dan pada sebelumnya sempat saya jelaskan pada kelas teori pagi tadi. Kemudian saat lanjut ke misi ke-2 kami sempat mengalami kesulitan dalam melakukan penyusunan kode programnya. Disitu saya belajar mengenai manfaat dari refactoring dan dampaknya kepada code readability, dll.

2. Kelemahan Terbesar Saya/Tim <br>
Irvan : Salah satu kelemahan pada desain awal saya terdapat pada penggunaann abstract class di component yang lupa saya berikan abstract method.
Syauqy : Kelemahan saya dalam pengerjaan tugas ini, yaitu kurangnya saya memahami konsep dari abstract dan interface itu sendiri, kemudian saat penulisan UML masih belum sesuai dengan kode aktualnya.

4. Skill baru yang paling berharga pada praktikum hari ini<br>
Irvan : menurut saya skill paling berharga adalah saat kita mengaudit kode orang lain dan berusaha mencari kesalahan serta memberikan saran pada kode tersebut.
Syauqy : Skill baru yang berharga dan saya pelajari hari ini adalah saat kita melakukan audit pada kode orang lain. Disaat melakukan audit, kami sebagai auditor juga perlu memahami kode mereka secara keseluruhan dan apa saja kekurangan yang terlihat pada program tersebut. Berperan sebagai auditor ternyata tidak semudah yang orang-orang bayangkan, karena tanggung jawabnya agar dapat menciptakan kritik yang membangun.
