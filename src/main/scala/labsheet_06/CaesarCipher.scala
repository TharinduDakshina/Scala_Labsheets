package labsheet_06

import scala.io.StdIn

object CaesarCipher {
  // Function to encrypt a message using the Caesar cipher
  def encrypt(message: String, shift: Int): String = {
    val encryptedChars = message.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val encryptedChar = (char - base + shift) % 26
        (base + encryptedChar).toChar
      } else {
        char
      }
    }
    encryptedChars.mkString
  }

  // Function to decrypt a message using the Caesar cipher
  def decrypt(encryptedMessage: String, shift: Int): String = {
    encrypt(encryptedMessage, 26 - shift)
  }

  def getMassage() : String ={
    print("Enter Massage : ");
    return StdIn.readLine()
  }

  def main(args: Array[String]): Unit = {
    val originalMessage: String = getMassage()
    val shift = 1

    val encryptedMessage = encrypt(originalMessage, shift)
    val decryptedMessage = decrypt(encryptedMessage, shift)

    println(s"Original Message: $originalMessage")
    println(s"Encrypted Message: $encryptedMessage")
    println(s"Decrypted Message: $decryptedMessage")
  }
}
