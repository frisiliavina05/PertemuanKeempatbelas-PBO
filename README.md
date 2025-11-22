# Implementasi CRUD dengan Upload dan Download CSV Berbasis OOP 
Pada praktikum ke 14  ini dilakukan implementasi CRUD dengan upload dan download CSV berbasis OOP menggunakan Java. Data direpresentasikan sebagai objek, sehingga operasi CRUD dapat dilakukan secara terstruktur, sedangkan upload CSV memasukkan data dari file eksternal ke objek, dan download CSV mengekspor data objek ke file dengan mudah dan efisien.

# Package Akun
- Pada class Daftar tambahkan label dan textField untuk pertanyaan. <br>
  <img width="401" height="269" alt="image" src="https://github.com/user-attachments/assets/a7d6abf6-0e09-48d5-9cfd-a97b308c2047" /> <br>
Kode ini berfungsi untuk proses pendaftaran akun baru. Sistem memeriksa apakah semua TextField termasuk TextField pertanyaan keamanan telah terisi. Pertanyaan keamanan (TfFav) digunakan sebagai data tambahan untuk verifikasi jika suatu saat pengguna perlu ubah password akun. Setelah validasi, sistem mengecek apakah username sudah ada di database. Jika belum, data username, password, dan pertanyaan keamanan disimpan, lalu pengguna dialihkan ke halaman login. Jika username sudah terdaftar, pendaftaran dibatalkan dan pengguna diminta mengganti username. <br>
<img width="748" height="450" alt="image" src="https://github.com/user-attachments/assets/09f6b628-c727-4db3-8b03-2c92e875f0d8" />

- 
