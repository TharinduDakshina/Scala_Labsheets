package labsheet_06

import scala.io.StdIn

object CaesarCipher {
  def caesarEncrypt(massage: String, shift: Int): String = {

    val encryptedChars = massage.map { char =>
      if (char.isLetter) {
        val shiftOffset = if (char.isUpper) 'A' else 'a'
        val encryptedChar = ((char - shiftOffset + shift) % 26 + shiftOffset).toChar
        encryptedChar

      } else {
        char
      }
    }

    encryptedChars.mkString
  }

  def caesarDecrypt(ciphertext: String, shift: Int): String = {

    caesarEncrypt(ciphertext, -shift)
  }

  def cipher(massage: String, shift: Int, operation: String): String = {
    operation match {
      case "encrypt" => caesarEncrypt(massage, shift)
      case "decrypt" => caesarDecrypt(massage, shift)
      case _ => throw new IllegalArgumentException("Invalid operation. Use 'encrypt' or 'decrypt'.")
    }
  }

  def getMassage(): String = {
    print("Enter Message : ");
    return StdIn.readLine()
  }


  def main(args: Array[String]): Unit = {
    val plaintext = getMassage()
    val shiftAmount =4;

    // Encrypt the plaintext
    val encryptedText = cipher(plaintext, shiftAmount, "encrypt")
    println("Encrypted Message :" + encryptedText)

    // Decrypt the ciphertext
    val decryptedText = cipher(encryptedText, shiftAmount, "decrypt")
    println("Decrypted Message :" + decryptedText)
  }

}
