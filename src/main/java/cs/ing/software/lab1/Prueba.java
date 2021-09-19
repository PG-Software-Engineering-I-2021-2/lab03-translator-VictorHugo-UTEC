package cs.ing.software.lab1;
import com.google.cloud.translate.*;


import java.util.logging.Logger;


public class Prueba {

    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    public static String traducir(String texto){
        System.setProperty("GOOGLE_API_KEY", "8a254d832349fc50726bfeb26201bee1af230ad1");
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        Translation translation = translate.translate(texto);
        return translation.getTranslatedText();
    }

    public static void main(String[] args)
    {
        logger.info(traducir("Hola Mundo"));
    }
}
