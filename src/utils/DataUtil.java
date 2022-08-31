package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String ConverteDataHora( Date data){
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/YY  HH:mm");
        return  formatar.format(data);
        // dia/mes/ano 00:00hs
    }

    public static String Hora( Date data){
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
        return  formatar.format(data);
        // dia/mes/ano 00:00hs
    }

    public static String Data( Date data){
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/YY");
        return  formatar.format(data);
        // dia/mes/ano 00:00hs
    }
}
