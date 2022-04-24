import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class LeerComic extends Historieta implements LeerPagina{

    public LeerComic(long id, String titulo, int numPaginas, String editorial) {
        super(id, titulo, numPaginas, editorial);
    }

    @Override
    public void leerPagina(Screen s, String rutaComic) throws InterruptedException{
        System.out.println("la ruta del comic: " + rutaComic);
        // crear un objeto con la carpeta donde esta el comic en imagenes
        File carpetaComic = new File(rutaComic);
        // obtener los contenidos de la carpeta
        String[] contenidos = carpetaComic.list();
        //List<String> lista = List.of(contenidos);
        List<String> lista = List.of(contenidos).stream().sorted().collect(Collectors.toList());
        System.out.println("LA LISTA: " + lista);
        int milisPorPagina = 120000 / lista.size();

        System.out.println(lista.size());
        System.out.println("Milisegundos por pagina: " + milisPorPagina);

        for(int i = 0; i < lista.size(); i++){
            System.out.println("Leyendo la pagina " + rutaComic + lista.get(i) + "...");
            if(i == 1){
                s.setVisible(true);
            }else{
                s.cls();
                s.repaint();
            }
            s.out(toString(), "Helvetica", 28, Colors.BlueHorizon);
            s.showImage(rutaComic + lista.get(i));
            s.setBounds(200, 50, 900, 876);
            Thread.sleep(milisPorPagina);
        }

    }

    @Override
    public void leerPagina(Screen s, boolean primeraPagina, String pagina) {
        System.out.println("Leyendo pagina " + pagina + "...");
        if(primeraPagina){
            s.setVisible(true);
        }else{
            s.cls();
            s.repaint();
        }
        //s.repaint();

        s.out(toString(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage(pagina);
        s.setBounds(200, 100, 900, 876);
    }
}
