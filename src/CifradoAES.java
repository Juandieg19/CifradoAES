import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CifradoAES {

    // Clave de 16 caracteres (AES-128). SOLO PARA DEMOSTRACIÓN.
    private static final String CLAVE = "ClaveSegura12345";

    public static void main(String[] args) {
        try {

            // Ejemplo: dato sensible similar a un entorno bancario
            String datoOriginal = "Transaccion: $350000 - Cuenta 45781234";

            System.out.println("Dato original: " + datoOriginal);

            // Cifrar
            String datoCifrado = cifrarAES(datoOriginal, CLAVE);
            System.out.println("Dato cifrado: " + datoCifrado);

            // Descifrar
            String datoDescifrado = descifrarAES(datoCifrado, CLAVE);
            System.out.println("Dato descifrado: " + datoDescifrado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para cifrar con AES
    public static String cifrarAES(String texto, String clave) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(clave.getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] bytesCifrados = cipher.doFinal(texto.getBytes("UTF-8"));

        return Base64.getEncoder().encodeToString(bytesCifrados);
    }

    // Método para descifrar con AES
    public static String descifrarAES(String textoCifrado, String clave) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(clave.getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] bytesDescifrados = cipher.doFinal(Base64.getDecoder().decode(textoCifrado));

        return new String(bytesDescifrados, "UTF-8");
    }
}
