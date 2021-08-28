package pl.karolska.example.hospital;

class Doctor extends Employee {

    protected String specialization;
    public String license;

    Doctor(final String specialization, final String license) {
    this.specialization = specialization;
    this.license = license;

    }

    @Override
    public double earnPayment() {
        return basicPayment*4;
    }

    @Override
    public void setName(String name) {
        this.name = "Dr " + name;
    }
}





