# Implementasi CRUD dengan Upload dan Download CSV Berbasis OOP 
Pada praktikum ke 14  ini dilakukan implementasi CRUD dengan upload dan download CSV berbasis OOP menggunakan Java. Data direpresentasikan sebagai objek, sehingga operasi CRUD dapat dilakukan secara terstruktur, sedangkan upload CSV memasukkan data dari file eksternal ke objek, dan download CSV mengekspor data objek ke file dengan mudah dan efisien.

# Package Akun
- Pada class Daftar tambahkan label dan textField untuk pertanyaan. <br>
  <img width="401" height="269" alt="image" src="https://github.com/user-attachments/assets/a7d6abf6-0e09-48d5-9cfd-a97b308c2047" /> <br>
Kode ini berfungsi untuk proses pendaftaran akun baru. Sistem memeriksa apakah semua TextField termasuk TextField pertanyaan keamanan telah terisi. Pertanyaan keamanan (tfMinumanFav ) digunakan sebagai data tambahan untuk verifikasi jika suatu saat pengguna perlu ubah password akun. Setelah validasi, sistem mengecek apakah username sudah ada di database. Jika belum, data username, password, dan pertanyaan keamanan disimpan, lalu pengguna dialihkan ke halaman login. Jika username sudah terdaftar, pendaftaran dibatalkan dan pengguna diminta mengganti username. <br>
  <img width="748" height="450" alt="image" src="https://github.com/user-attachments/assets/09f6b628-c727-4db3-8b03-2c92e875f0d8" />
- Tambahkan dialog baru untuk pertanyaannya <br>
  <img width="403" height="232" alt="image" src="https://github.com/user-attachments/assets/ebf467b2-14f8-4f3b-9581-cd7f07281734" /> <br>
  Kode ini digunakan saat tombol Selesai diklik pada dialog input pertanyaan keamanan. Program memeriksa apakah TextField tfMinumanFav  berisi teks atau tidak. Jika masih kosong, muncul pesan peringatan dan kursor diarahkan kembali ke TextField agar pengguna mengisinya. Jika sudah terisi, teks dari TfFav disimpan ke variabel jawaban, kemudian dialog ditutup dengan dispose() sehingga pengguna kembali ke tampilan utama.
  <img width="748" height="178" alt="image" src="https://github.com/user-attachments/assets/4733eafd-1e38-41a7-926f-ac514cb79b6b" />
- Pada class “ResetPassword” kode ini berfungsi untuk mencari akun berdasarkan username lalu menampilkan dialog pertanyaan keamanan. Jika jawaban yang diberikan sesuai dengan data di database, maka pengguna diizinkan melanjutkan proses reset password. Jika tidak sesuai, proses dihentikan dan reset password tidak dapat dilakukan. <br>
  <img width="748" height="414" alt="image" src="https://github.com/user-attachments/assets/391fac97-aaaa-4964-b945-48807fab5a7b" />
  <img width="608" height="211" alt="image" src="https://github.com/user-attachments/assets/002a684d-8a7a-42c7-8876-9216bbdf1d0d" />

# Package DataMusik
- Pada class “Utama” tambahkan button download untuk tabel album.  <br>
  <img width="551" height="409" alt="image" src="https://github.com/user-attachments/assets/11d9d474-81ed-4fa1-8f5a-f8e1f079819c" /> <br>
  Kode ini digunakan untuk mengekspor data album dari tabel ke file CSV. Pengguna memilih lokasi penyimpanan menggunakan JFileChooser, lalu program menuliskan setiap data dalam tabel ke dalam file dengan pemisah titik koma. Jika file sudah ada, pengguna diminta konfirmasi untuk menimpa. Setelah berhasil, muncul pesan bahwa data berhasil disimpan. Jika gagal, ditampilkan pesan error.
  <img width="736" height="683" alt="image" src="https://github.com/user-attachments/assets/71a12a26-b256-474c-b759-61399d44c6b5" /> <br>
  <img width="676" height="318" alt="image" src="https://github.com/user-attachments/assets/7265394d-5ecb-43f4-ae35-3cd5751e14ab" />
- Pada class “Utama” tambahkan button Download untuk tabel musik. <br>
  <img width="439" height="325" alt="image" src="https://github.com/user-attachments/assets/d8cad569-843d-4398-8d9c-bd461e6f5a8f" /> <br>
  Kode ini digunakan untuk mengekspor data musik dari tabel ke file CSV. Pengguna memilih lokasi penyimpanan melalui JFileChooser, kemudian program menulis setiap baris tabel ke file dengan pemisah titik koma. Jika file sudah ada, akan muncul konfirmasi untuk menimpanya. <br>
  <img width="726" height="666" alt="image" src="https://github.com/user-attachments/assets/f792523c-e437-4476-99a5-0de5d52ea2f2" /> <br>
  <img width="699" height="296" alt="image" src="https://github.com/user-attachments/assets/2db6255e-3577-480e-873a-fbaf50eaf40b" />










