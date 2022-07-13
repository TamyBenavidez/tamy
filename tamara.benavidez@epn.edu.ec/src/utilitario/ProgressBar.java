package utilitario;

/**
 * Barra de carga
 */

public class ProgressBar {
    /**
     * @param barra cantidad de caracteres
     * @param Flecha 
     * @param position
     * @return
     */
    
    static String barraFlecha(String barra , String Flecha , int position) {
        StringBuilder newBarra = new StringBuilder(barra).insert(position, Flecha);
        return newBarra.toString();
    }

    //tamara.benavidez@epn.edu.ec
    /**
     * @param email
     */
    public static void showProgressBar_a(String email) throws InterruptedException
    {
        String barra = "                           ",
                loadEmail = "";
                for (int charEmail = 0; charEmail < email.length(); charEmail++){
                    barra = barra(email.length(), charEmail);
                    System.out.print(barra);
                    Thread.sleep(200);
                    loadEmail += email.charAt(charEmail);
                    System.out.println(" " + (charEmail + 1) * 100 / email.length() + " % " + "\t\t Loading: " + charEmail + " de " + email.length() +
                    "  " + loadEmail);
                }
            }

    private static String barra(int lenBarra, int charEmail) {
        String fullBarra="";
        for (int index = 0; index < lenBarra; index++) {
            if (index<= charEmail)
            fullBarra += "=";
            else fullBarra += "-";
        }
        return "\r[" +fullBarra + "]";
    }
    public class CharUpperLowerCase {
        public static void main(String[] args) {
            char char1, char2;
            
            char1='vocals';
            char2='consonants';

            char char1UpperCase = Character.toUpperCase(char1);
            char char2LowerCase = Character.toLowerCase(char2);

            System.out.println(char1UpperCase);
            System.out.println(char2LowerCase);
        }
       
            }   
}            





        


