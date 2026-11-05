package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tiempo {
    private LocalDate fecha;
    private String indicativo;
    private String nombre;
    private String provincia;
    private int altitud;
    private double tmed;
    private double prec;
    private double tmin;
    private LocalTime horatmin;
    private double tmax;
    private LocalTime horatmax;
    private int dir;
    private double velmedia;
    private double racha;
    private LocalTime horaracha;
    private double sol;
    private double presMax;
    private LocalTime horaPresMax;
    private double presMin;
    private LocalTime horaPresMin;

    public Tiempo(LocalDate fecha, String indicativo, String nombre, String provincia, int altitud, double tmed, double prec, double tmin, LocalTime horatmin, double tmax, LocalTime horatmax, int dir, double velmedia, double racha, LocalTime horaracha, double sol, double presMax, LocalTime horaPresMax, double presMin, LocalTime horaPresMin) {
        this.fecha = fecha;
        this.indicativo = indicativo;
        this.nombre = nombre;
        this.provincia = provincia;
        this.altitud = altitud;
        this.tmed = tmed;
        this.prec = prec;
        this.tmin = tmin;
        this.horatmin = horatmin;
        this.tmax = tmax;
        this.horatmax = horatmax;
        this.dir = dir;
        this.velmedia = velmedia;
        this.racha = racha;
        this.horaracha = horaracha;
        this.sol = sol;
        this.presMax = presMax;
        this.horaPresMax = horaPresMax;
        this.presMin = presMin;
        this.horaPresMin = horaPresMin;
    }

    public Tiempo() {
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public double getTmed() {
        return tmed;
    }

    public void setTmed(double tmed) {
        this.tmed = tmed;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public double getTmin() {
        return tmin;
    }

    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public LocalTime getHoratmin() {
        return horatmin;
    }

    public void setHoratmin(LocalTime horatmin) {
        this.horatmin = horatmin;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    public LocalTime getHoratmax() {
        return horatmax;
    }

    public void setHoratmax(LocalTime horatmax) {
        this.horatmax = horatmax;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public double getVelmedia() {
        return velmedia;
    }

    public void setVelmedia(double velmedia) {
        this.velmedia = velmedia;
    }

    public double getRacha() {
        return racha;
    }

    public void setRacha(double racha) {
        this.racha = racha;
    }

    public LocalTime getHoraracha() {
        return horaracha;
    }

    public void setHoraracha(LocalTime horaracha) {
        this.horaracha = horaracha;
    }

    public double getSol() {
        return sol;
    }

    public void setSol(double sol) {
        this.sol = sol;
    }

    public double getPresMax() {
        return presMax;
    }

    public void setPresMax(double presMax) {
        this.presMax = presMax;
    }

    public LocalTime getHoraPresMax() {
        return horaPresMax;
    }

    public void setHoraPresMax(LocalTime horaPresMax) {
        this.horaPresMax = horaPresMax;
    }

    public double getPresMin() {
        return presMin;
    }

    public void setPresMin(double presMin) {
        this.presMin = presMin;
    }

    public LocalTime getHoraPresMin() {
        return horaPresMin;
    }

    public void setHoraPresMin(LocalTime horaPresMin) {
        this.horaPresMin = horaPresMin;
    }


    @Override
    public String toString() {
        return "Tiempo{" +
                "fecha=" + fecha +
                ", indicativo='" + indicativo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", provincia='" + provincia + '\'' +
                ", altitud=" + altitud +
                ", tmed=" + tmed +
                ", prec=" + prec +
                ", tmin=" + tmin +
                ", horatmin=" + horatmin +
                ", tmax=" + tmax +
                ", horatmax=" + horatmax +
                ", dir=" + dir +
                ", velmedia=" + velmedia +
                ", racha=" + racha +
                ", horaracha=" + horaracha +
                ", sol=" + sol +
                ", presMax=" + presMax +
                ", horaPresMax=" + horaPresMax +
                ", presMin=" + presMin +
                ", horaPresMin=" + horaPresMin +
                '}';
    }
}