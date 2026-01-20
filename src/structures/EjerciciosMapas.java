package structures;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Person;

public class EjerciciosMapas {
    public Map<Integer, Integer> contarDuplicados(List<Integer> list){
        Map<Integer, Integer> conteo = new TreeMap<>();
        if(list == null){
            return conteo;
        }
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
            //if(conteo.containsKey(num)){
            //    int current = conteo.get(num);  //Metodo If largo complejidad o(n)
            //    conteo.put(num, current + 1);
            //}
        }
        return conteo;
    }

    public int ejercicio2(List<Integer> list){
        Map<Integer, Integer> conteo = new HashMap<>();
        for(Integer num : list){
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        for(Integer num : list){
            if(conteo.get(num) == 1){
                return num;
            }
        }
        return -1;
    }

    public void ejercicio3(List<Person> listado){
        Map<String, Integer> rankingMap = new HashMap<>();
        for(Person p: listado){
            String nombre = p.getName();
            int puntajeNuevo = p.getAge();
            
            int puntajeActual = rankingMap.getOrDefault(nombre, 0);
            if(puntajeNuevo > puntajeActual){
                rankingMap.put(nombre, puntajeNuevo);
            }
        }

        Set<Map.Entry<String, Integer>> ranking = new TreeSet<>((a, b) ->{
            int comparacion = b.getValue().compareTo(a.getValue());
            if(comparacion != 0){
                return comparacion;
            }
            return a.getKey().compareTo(b.getKey());
        });
        
        ranking.addAll(rankingMap.entrySet());

        System.out.println(ranking);
    }

    public Map<String, Integer> ejercicio4(Map<String, Integer> map){
        Map<String, Integer> max = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            //Logica de obtener la carrera con guion
            String[] parts = key.split("-");
            String carrera = parts[0];  // Obtiene computacion


            //Logica de comparar y reemplazar
            Integer notaActual = max.getOrDefault(carrera, 0);
            if(value > notaActual){
                max.put(carrera, value);
            }
        }
        return max;
    }
}
