package com.example.lab2_ph34649

import com.example.lab2_ph34649.ui.theme.SinhVienModel


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val listSV = mutableListOf<SinhVienModel>()

    var choice: Int

    do {
        println("1. Thêm sinh viên")
        println("2. Sửa thông tin sinh viên")
        println("3. Xóa sinh viên")
        println("4. Xem danh sách sinh viên")
        println("5. Thoát")
        print("Nhập lựa chọn của bạn: ")
        choice = scanner.nextInt()

        when (choice) {
            1 -> {
                val sv = nhapThongTinSinhVien(scanner)
                listSV.add(sv)
            }
            2 -> suaThongTinSinhVien(scanner, listSV)
            3 -> xoaSinhVien(scanner, listSV)
            4 -> hienThiDanhSachSinhVien(listSV)
            5 -> println("Thoát chương trình")
            else -> println("Lựa chọn không hợp lệ")
        }
    } while (choice != 5)
}

fun nhapThongTinSinhVien(scanner: Scanner): SinhVienModel {
    print("Nhập tên sinh viên: ")
    val tenSV = scanner.next()
    print("Nhập MSSV: ")
    val mssv = scanner.next()
    print("Nhập điểm trung bình: ")
    val diemTB = scanner.nextFloat()
    print("Đã tốt nghiệp? (true/false): ")
    val daTotNghiep = scanner.nextBoolean()
    print("Nhập tuổi: ")
    val tuoi = scanner.nextInt()

    return SinhVienModel(tenSV, mssv, diemTB, daTotNghiep, tuoi)
}

fun suaThongTinSinhVien(scanner: Scanner, listSV: MutableList<SinhVienModel>) {
    if (listSV.isEmpty()) {
        println("Danh sách sinh viên trống")
        return
    }

    println("Danh sách sinh viên:")
    hienThiDanhSachSinhVien(listSV)

    print("Chọn số thứ tự của sinh viên cần sửa: ")
    val index = scanner.nextInt()

    if (index in 0 until listSV.size) {
        val sv = listSV[index]
        println("Thông tin cũ của sinh viên:")
        println(sv.getThongTin())

        println("Nhập thông tin mới:")
        val newSV = nhapThongTinSinhVien(scanner)

        listSV[index] = newSV
        println("Sửa thông tin sinh viên thành công")
    } else {
        println("Số thứ tự không hợp lệ")
    }
}

fun xoaSinhVien(scanner: Scanner, listSV: MutableList<SinhVienModel>) {
    if (listSV.isEmpty()) {
        println("Danh sách sinh viên trống")
        return
    }

    println("Danh sách sinh viên:")
    hienThiDanhSachSinhVien(listSV)

    print("Chọn số thứ tự của sinh viên cần xóa: ")
    val index = scanner.nextInt()

    if (index in 0 until listSV.size) {
        listSV.removeAt(index)
        println("Xóa sinh viên thành công")
    } else {
        println("Số thứ tự không hợp lệ")
    }
}

fun hienThiDanhSachSinhVien(listSV: MutableList<SinhVienModel>) {
    println("Danh sách sinh viên:")
    for ((index, sv) in listSV.withIndex()) {
        println("$index: ${sv.getThongTin()}")
    }
}
