package controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    //METODO que ordene un listado de maquinas por su subred y luego por el nombre
    //Si ambas sopn iguales se consideren maquinas y se descartan

    public Set<Maquina> ordenarSubRed(List<Maquina> maquinas){
        Set<Maquina> maquinasSet = new TreeSet<>(maquinas);
        for(Maquina maquina: maquinas){
            maquinasSet.add(maquina);
        }
        return maquinasSet;
    }

    public Set<Maquina> ordenarNombre(List<Maquina> maquinas){
        Set<Maquina> maquinasSet = new HashSet<>(maquinas);
        for(Maquina maquina: maquinas){
            maquinasSet.add(maquina);
        }
        return maquinasSet;
    }
}
