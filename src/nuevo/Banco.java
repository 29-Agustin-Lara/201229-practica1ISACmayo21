package nuevo;

public class Banco {
    private String nombreBanco;
    private String direccionBanco;
    private String fraseBanco;
    private String CreditoPersona;

    public Banco(String nombreBanco, String direccionBanco, String fraseBanco, String creditoPersona) {
        this.nombreBanco = nombreBanco;
        this.direccionBanco = direccionBanco;
        this.fraseBanco = fraseBanco;
        CreditoPersona = creditoPersona;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getDireccionBanco() {
        return direccionBanco;
    }

    public void setDireccionBanco(String direccionBanco) {
        this.direccionBanco = direccionBanco;
    }

    public String getFraseBanco() {
        return fraseBanco;
    }

    public void setFraseBanco(String fraseBanco) {
        this.fraseBanco = fraseBanco;
    }

    public String getCreditoPersona() {
        return CreditoPersona;
    }

    public void setCreditoPersona(String creditoPersona) {
        CreditoPersona = creditoPersona;
    }

    public String mostrarDatosBanco (){
        return nombreBanco+"\nDireccion: "+"\n"+direccionBanco+"\n"+fraseBanco;
    }
    /*
    private String nombreBanco;
    private String direccionBanco;
    private String fraseBanco;
    private String CreditoPersona;
     */
}
