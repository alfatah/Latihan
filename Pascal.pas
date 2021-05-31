// Menghitung Luas Lingkaran
program LuasLingkaran;
const
phi =3.14;
var
jari,luas:real;
begin
write('Masukan Jari-Jari = ');
read(jari);
luas:=phi*jari*jari;
writeln('Luas adalah = ',luas:2:2);
readln;
end.

//////////////////////////////////////////////////////////////////////////////////////////////////

// Menghitung Luas Segitiga
program MenghitungLuasSegitiga;
var alas,tinggi,luas:real;
begin
write('Masukan Nilai Alas = ');
read(alas);
write('Masukan Nilai Tinggi = ');
read(tinggi);
luas:= alas*tinggi/2;
write('luas Segitiga Adalah = ',luas:2:2);
readln;
end.

