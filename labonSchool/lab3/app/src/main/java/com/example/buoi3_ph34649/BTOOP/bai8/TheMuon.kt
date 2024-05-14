package com.example.buoi3_ph34649.BTOOP.bai8


class TheMuon(
    var maPhieuMuon: String,
    var ngayMuon: Int,
    var hanTra: Int,
    var soHieuSach: String,
    var sinhVien: SinhVien
) {
    fun getThongTin(): String {
        return "TheMuon: MaPhieuMuon: $maPhieuMuon - NgayMuon: $ngayMuon - HanTra: $hanTra - SoHieuSach: $soHieuSach - SinhVien: ${sinhVien.getThongTin()}"
    }
}