package org.mpei.ClassWork_1.PracticZad_3;

public class WeelType {
    private String label;
    private double rsdius;
    private boolean forWinter;

    public WeelType(String label, double rsdius, boolean forWinter) {
        this.label = label;
        this.rsdius = rsdius;
        this.forWinter = forWinter;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getRsdius() {
        return rsdius;
    }

    public void setRsdius(double rsdius) {
        this.rsdius = rsdius;
    }

    public boolean isForWinter() {
        return forWinter;
    }

    public void setForWinter(boolean forWinter) {
        this.forWinter = forWinter;
    }

    @Override
    public String toString() {
        return "WeelType{" +
                "label='" + label + '\'' +
                ", rsdius=" + rsdius +
                ", forWinter=" + forWinter +
                '}';
    }
}
