package TP5_1_H071231021_Simple;

class BangunRuang {
    double sisi;
    double panjang;
    double lebar;
    double tinggi;
    double radius;

    double hitungLuasPermukaan() {
        return 0;
    }

    double hitungVolume() {
        return 0;
    }
}

class Kubus extends BangunRuang {
    
    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {

    Bola(double radius) {
        this.radius = radius;
    }

    double hitungLuasPermukaan() {
        return 4 * Math.PI * radius * radius;
    }

    double hitungVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}

class Tabung extends BangunRuang {

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }

    double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}