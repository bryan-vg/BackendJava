public class Main {
    public static void main(String[] args) throws InterruptedException{
        /*
        Screen s = new Screen();
        s.setVisible(true);
        s.out(ashe.showMessage(), "Impact", 28, Colors.MAGENTA);
        */
        //ashe.showMessage();
        //TestAshe();
        // call comic
        //leerComics();
        leerComicsRuta();
    }

    private static void leerComics() throws InterruptedException{
        Screen screen = new Screen();
        LeerComic leerComic = new LeerComic(1l, "Bob Esponja Conoce al Estrangulador", 10, "United Plankton Pictures");
        Runnable read = new Runnable() {
            @Override
            public void run() {
                try{
                    leerComic.leerPagina(screen, true, "comic_files/SpongeBob_Comics_47_August_2015-01.jpg");
                    Thread.sleep(3000);
                    leerComic.leerPagina(screen, false, "comic_files/SpongeBob_Comics_47_August_2015-02.jpg");
                    Thread.sleep(3000);
                    leerComic.leerPagina(screen, false, "comic_files/SpongeBob_Comics_47_August_2015-03.jpg");
                    Thread.sleep(3000);
                    leerComic.leerPagina(screen, false, "comic_files/SpongeBob_Comics_47_August_2015-04.jpg");
                    Thread.sleep(3000);
                    leerComic.leerPagina(screen, false, "comic_files/SpongeBob_Comics_47_August_2015-05.jpg");
                    Thread.sleep(3000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread readComic = new Thread(read);
        readComic.start();
    }

    // leer comics con ruta del archivo
    private static void leerComicsRuta() throws InterruptedException{
        Screen screen = new Screen();
        LeerComic leerComic = new LeerComic(1l, "Bob Esponja Conoce al Estrangulador", 10, "United Plankton Pictures");
        leerComic.leerPagina(screen, "comic_files/");
    }
}
