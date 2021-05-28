package nuevo;

public class Pila {
    int Tamano_maximo_pila;
    String arreglo[];
    int cima;

    public Pila(int n){
        Tamano_maximo_pila=n;
        arreglo=new String[Tamano_maximo_pila];
        cima=0;
    }

    public boolean vacio(){
        if (cima==0)
            return true;
        else {return false;}
    }

    public void agregar(String str){
        if (cima<=Tamano_maximo_pila){
            arreglo[cima]=str;
            cima++;
        }
    }

    public String mostrarCima(){
        if (cima>=0){
            return arreglo[cima-1];
        }
        else
            return null;
    }

    public String extraer(){
        String temp=null;
        if (cima>=0){
            temp=arreglo[cima-1];
            arreglo[cima-1]=null;
            cima--;
        }
        return temp;
    }

}