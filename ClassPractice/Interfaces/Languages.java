package Interfaces;

interface Language{
   void getClienLanguage(String clientLanguage);
}
public class Languages implements Language {
   public void getClienLanguage(String clientLanguage){
        System.out.println("Client would like to speak in language as: " + clientLanguage);
   }
}