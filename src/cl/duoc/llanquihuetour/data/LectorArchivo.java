package cl.duoc.llanquihuetour.data;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {
    public static void guardar(String ruta, String texto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {
            bw.write(texto); bw.newLine();
        } catch (IOException e) { System.out.println("Error al guardar: " + e.getMessage()); }
    }

    public static List<String> leer(String ruta) {
        List<String> lineas = new ArrayList<>();
        File f = new File(ruta);
        if (!f.exists()) return lineas;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String l; while ((l = br.readLine()) != null) lineas.add(l);
        } catch (IOException e) { System.out.println("Error al leer: " + e.getMessage()); }
        return lineas;
    }
}