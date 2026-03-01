package devdojo.orientacaoobjetos.Rcolecoes.dominio;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }


    // === Modificando Sobrescritas ===

    //Reflexivo: x.equals(x) tem que sertre para tdo qe for difertente de null
    //Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.quals(x) == true
    //Traansitividade: para x,y,z diferntes de null, se x.equals(y) == true, e x.equals(z) == true logo,y.quals(z) == true
    //Consistente: x.equals(x) sempre retornaa true se x for diferente de true
    //para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode(x) == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente  o equals de y.equals(x) tem que  ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode x.equals(y) devera ser false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
