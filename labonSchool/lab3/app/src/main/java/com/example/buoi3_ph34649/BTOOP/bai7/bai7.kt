package com.example.buoi3_ph34649.BTOOP.bai7


fun main() {
    val danhSachGV = mutableListOf<CBGV>()
    var tiepTuc: Boolean

    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Them giao vien")
                    println("--------------------------")
                    print("Nhap ho ten: ")
                    val hoten = readLine()!!
                    print("Nhap tuoi: ")
                    val tuoi = readLine()!!.toIntOrNull()
                    print("Nhap que quan: ")
                    val quequan = readLine()
                    print("Nhap ma so giao vien: ")
                    val msgv = readLine()!!
                    print("Nhap luong cung: ")
                    val luongcung = readLine()!!.toFloat()
                    print("Nhap luong thuong: ")
                    val lthuong = readLine()!!.toFloatOrNull()
                    print("Nhap tien phat: ")
                    val lphat = readLine()!!.toFloatOrNull()
                    val gv = CBGV(hoten, tuoi, quequan, msgv, luongcung, lthuong, lphat)
                    danhSachGV.add(gv)
                }

                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                    for (gv in danhSachGV) {
                        println(gv.getThongTin())
                    }
                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    print("Nhap msgv can xoa: ")
                    val msgv = readLine()!!
                    val iterator = danhSachGV.iterator()
                    var found = false
                    while (iterator.hasNext()) {
                        val gv = iterator.next()
                        if (gv.msgv == msgv) {
                            iterator.remove()
                            found = true
                            println("Da xoa giao vien voi ma so $msgv")
                            break
                        }
                    }
                    if (!found) {
                        println("Khong tim thay giao vien voi ma so $msgv")
                    }
                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Nhap msgv can cap nhat: ")
                    val msgv = readLine()!!
                    val gv = danhSachGV.find { it.msgv == msgv }
                    if (gv != null) {
                        print("Nhap ho ten moi (de trong neu khong thay doi): ")
                        val hoten = readLine()
                        if (!hoten.isNullOrEmpty()) gv.hoten = hoten

                        print("Nhap tuoi moi (de trong neu khong thay doi): ")
                        val tuoi = readLine()!!.toIntOrNull()
                        if (tuoi != null) gv.tuoi = tuoi

                        print("Nhap que quan moi (de trong neu khong thay doi): ")
                        val quequan = readLine()
                        if (!quequan.isNullOrEmpty()) gv.quequan = quequan

                        print("Nhap luong cung moi (de trong neu khong thay doi): ")
                        val luongcung = readLine()!!.toFloatOrNull()
                        if (luongcung != null) gv.luongcung = luongcung

                        print("Nhap luong thuong moi (de trong neu khong thay doi): ")
                        val lthuong = readLine()!!.toFloatOrNull()
                        if (lthuong != null) gv.lthuong = lthuong

                        print("Nhap tien phat moi (de trong neu khong thay doi): ")
                        val lphat = readLine()!!.toFloatOrNull()
                        if (lphat != null) gv.lphat = lphat

                        println("Thong tin giao vien da duoc cap nhat")
                    } else {
                        println("Khong tim thay giao vien voi ma so $msgv")
                    }
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                    break
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)
}