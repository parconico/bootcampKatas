/**
 * Contar el número de duplicados
 *
 * Escriba la función duplicateCount, que devuelva
 * el numero (entero) de letras duplicadas.
 *
 * Condicion 1 del String de entrada: (distinct case-insensitive)
 * No distinguen entre mayúsculas y minúsculas
 *
 * Regla de negocio
 * Suponer que el String de entrada SOLO contiene alfabetos (mayúsculas y minúsculas) y dígitos numericos
 *
 * Ejemplos de retornos de la funcion
 *
 * "abcde" -> 0 # ningún carácter se repite más de una vez
 * "aabbcde" -> 2 # 'a' y 'b'
 * "aabBcde" -> 2 # 'a' aparece dos veces y 'b' dos veces (`b` y` B`)
 * "indivisibility" -> 1 # 'i' aparece seis veces
 * "aA11" -> 2 # 'a' y '1'
 * "ABBA" -> 2 # 'A' y 'B' ocurren dos veces
 */

public class CountingDuplicate {

    public static int duplicateCount(String text) {

        //1. guardar String --> Lista/Array de caracteres
        char[] textoEnCaracteres = text.toLowerCase().toCharArray();

        //2. Objeto para armar el string
        StringBuilder caracteresDuplicados = new StringBuilder();

        //3. Contador de valores duplicados
        int contadorDuplicados = 0;

        //4. validacion para alfanumerico
        boolean cumpleAlfanumerico = text.matches("^[a-zA-Z0-9]+$");

        //5.
        if (cumpleAlfanumerico){
        //2. Comparar los valores del array
        for (int i = 0; i < textoEnCaracteres.length; i++) {
            for (int j = i+1; j < textoEnCaracteres.length; j++) {
                // Si los caracteres son iguales lo agregamos
                if (textoEnCaracteres[i]==textoEnCaracteres[j] && !caracteresDuplicados.toString().contains(String.valueOf(textoEnCaracteres[i]))){
                    caracteresDuplicados.append(textoEnCaracteres[i]);
                    contadorDuplicados++;
                    break;
                }
            }
        }}else{
            return  -1;
        }

        return contadorDuplicados;
    }

}
