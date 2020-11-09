/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
    }
   
    /**
     * Devuelve el nombre del autor
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * Devuelve el numero de paginas del libro
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * Devuelve el t�tulo del libro
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Devuelve el numero de referencia
     */
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * Permite cambiar el n�mero de referencia
     */
    public void setNumeroRefernecia(String nuevaReferencia){
        if(nuevaReferencia.length() >= 3){
            numeroReferencia = nuevaReferencia;
        }
        else{
            System.out.println("El n�mero de referencia debe tener 3 caracteres como m�nimo");
        }
    }
    /**
     * Imprime el nombre del autor
     */
    
    public void imprimeAutor(){
        System.out.println("El autor del libro es: " + autor);
    }
    
    /**
     * Imprime el t�tulo del libro
     */
    public void imprimeTitulo(){
        System.out.println("El titulo del libro es: " + titulo);
    }
    
    /**
     * Imprime todos los detalles del libro
     */
    public void imprimeDetalles(){
        System.out.println(getDetalles());
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles(){
        String detalles = "";
        if(numeroReferencia.length() > 0){
            detalles = "T�tulo: " + titulo + ", Autor: " + autor + ", N�mero de p�ginas " + numeroPaginas + ", N�mero de referencia: " + numeroReferencia;
        }
        else{
            detalles = "T�tulo: " + titulo + ", Autor: " + autor + ", N�mero de p�ginas " + numeroPaginas + ", N�mero de referencia: " + "ZZZ";
        }
        return detalles;
    }
}
