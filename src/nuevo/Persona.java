package nuevo;

public class Persona extends Banco{
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private String correoElectronico;
    private String numeroTelefonoPersonal;

    public Persona(String nombreBanco, String direccionBanco, String fraseBanco, String creditoPersona, String nombre, String apellido, int diaNacimiento, int mesNacimiento, int anoNacimiento, String correoElectronico, String numeroTelefonoPersonal) {
        super(nombreBanco, direccionBanco, fraseBanco, creditoPersona);
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonoPersonal = numeroTelefonoPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonoPersonal() {
        return numeroTelefonoPersonal;
    }

    public void setNumeroTelefonoPersonal(String numeroTelefonoPersonal) {
        this.numeroTelefonoPersonal = numeroTelefonoPersonal;
    }

    public String mostrarDatosPersona (){
        return "Nombre: "+nombre+" "+apellido+"\nFecha de nacimiento: "+diaNacimiento+"/"+mesNacimiento+"/"+anoNacimiento+
                "\nCorreno Electronico: "+correoElectronico+"\nNumero de telefono: "+numeroTelefonoPersonal+"\nEstado de credito: "+getCreditoPersona();
    }

    /*
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private String correoElectronico;
    private String numeroTelefonoPersonal;
     */
}
