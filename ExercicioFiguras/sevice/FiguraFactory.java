package A09S.aula.sevice;

import A09S.aula.model.Quadrado;
import A09S.aula.model.Triangulo;

import java.util.HashMap;

public class FiguraFactory {

    public static HashMap<String, Triangulo> trianguloHashMap = new HashMap<>();
    public static HashMap<Integer, Quadrado> quadradoHashMap = new HashMap<>();


    public static Triangulo obterTriangulo(String cor){
        Triangulo triangulo = trianguloHashMap.get(cor);
        if (triangulo == null) {
            triangulo = new Triangulo(cor);
            trianguloHashMap.put(cor, triangulo);
        }

        return triangulo;
    }

    public static Quadrado obterQuadrado(int tamanho){
        Quadrado quadrado = quadradoHashMap.get(tamanho);
        if (quadrado == null) {
            quadrado = new Quadrado(tamanho);
            quadradoHashMap.put(tamanho,quadrado);
        }

        return quadrado;
    }

}
