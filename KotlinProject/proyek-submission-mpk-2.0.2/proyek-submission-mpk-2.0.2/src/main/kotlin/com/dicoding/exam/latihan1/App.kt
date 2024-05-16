/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan1

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  merupakan angka genap
 */
fun isEvenNumber(number: Int) = number % 2 == 0

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  lebih dari 5
 */
fun moreThanFive(number: Int) = number > 5

/**
 *  TODO 3
 *  Sesuaikan fungsi di bawah ini agar dapat menghasilkan nilai akhir dengan
 *  rumus:
 *
 *      param * ( param + 10 )
 */
fun result(number: Int) = number * (number + 10)

fun main() {
    // Uji isEvenNumber
    val angkaGenap = 4
    val angkaGanjil = 7

    println("$angkaGenap adalah angka genap: ${isEvenNumber(angkaGenap)}")
    println("$angkaGanjil adalah angka genap: ${isEvenNumber(angkaGanjil)}")

    // Uji moreThanFive
    val kurangDariLima = 3
    val samaDenganLima = 5
    val lebihDariLima = 8

    println("$kurangDariLima lebih dari 5: ${moreThanFive(kurangDariLima)}")
    println("$samaDenganLima lebih dari 5: ${moreThanFive(samaDenganLima)}")
    println("$lebihDariLima lebih dari 5: ${moreThanFive(lebihDariLima)}")

    // Uji result
    val param1 = 5
    val param2 = 8

    println("Hasil untuk $param1: ${result(param1)}")
    println("Hasil untuk $param2: ${result(param2)}")
}
