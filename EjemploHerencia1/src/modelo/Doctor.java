package modelo;

public class Doctor extends Person{
    private String specialty;
    private String hospital;

    public Doctor() {
    }

    public Doctor( int id, String name, String lastName, int age, String specialty, String hospital) {
        super(id, name, lastName, age);
        this.specialty = specialty;
        this.hospital = hospital;
    }

    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String retornarDatos() {
        return "Doctor{"+super.retornarDatos() + ", specialty=" + specialty + ", hospital=" + hospital + '}';
    }

   
    
    
    
    
}
