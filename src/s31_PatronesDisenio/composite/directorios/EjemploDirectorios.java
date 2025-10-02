package s31_PatronesDisenio.composite.directorios;

public class EjemploDirectorios {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.agregarComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.agregarComponente(new Archivo("stream-map.docx"));
        java.agregarComponente(stream);

        doc.agregarComponente(java);
        doc.agregarComponente(new Archivo("cv.docx"));
        doc.agregarComponente(new Archivo("logo.jpeg"));

        System.out.println(doc.mostrar(0));

        boolean encontrado = false;

        encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Archivo a buscar patron-composite.docx: " + encontrado);
        encontrado = doc.buscar("stream-map.docx");
        System.out.println("Archivo a buscar stream-map.docx: " + encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("Directorio a buscar Api Stream: " + encontrado);

    }
}
