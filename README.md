Judul Proyek: PC Builder Tycoon - Core Engine v1.0
Tim : Irvan Aditya Kurniwan

Deskripsi Singkat Arsitektur : 
Dalam aplikasi ini kami membuat class abstract Component sebagai blueprint awal untuk semua komponen agar setiap jenis komponen menyediakan perilaku dan akses data yang konsisten. Di kelas Pc, setiap komponen dikumpulkan dalam ArrayList sehingga Pc menggunakan dapat menyimpan dan mengelola komponen secara dinamis tanpa mengetahui detail implementasinya. Tiga komponen inti (Motherboard, Cpu, Ram) diinisialisasi langsung di konstruktor Pc sebagai bentuk composition, memastikan objek Pc selalu terbangun dengan dasar componen tersebut.