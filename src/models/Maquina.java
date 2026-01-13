package models;

import java.util.List;

public class Maquina implements Comparable<Maquina> {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
        this.riesgo = calcularRiesgo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    private int calcularSubred(){
        String[] ip = this.ip.split("\\.");
        return Integer.parseInt(ip[2]);
    }

    private int calcularRiesgo(){
        return -1;
    }

    @Override
    public int compareTo(Maquina o) {
        int comSubred = Integer.compare(this.subred, o.subred);
        if(comSubred != 0){
            return comSubred;
        }
        int comNombre = this.nombre.compareTo(o.nombre);
        return comNombre;
    }

}
