package oop.principles

import java.security.PrivateKey

fun main() {

    val mYLock = EncryptionLock(40)

    println("Testing for this key {${mYLock.unlock(34)}}")
    println("Testing for this key {${mYLock.unlock(45)}}")
    println("Testing for this key {${mYLock.unlock(70)}}")
    println("Testing for this key {${mYLock.unlock(89)}}")
    println("Testing for this key {${mYLock.unlock(136)}}")

}

class EncryptionLock {
    private var privateKey: Int = 0

    constructor(privateKey: Int) {
        this.privateKey = privateKey
    }
    fun unlock(publickKey: Int): Boolean {

        return formula(publickKey) == privateKey
    }

    fun formula(publicKey: Int): Int {
        return publicKey / 2 + 5
    }


}