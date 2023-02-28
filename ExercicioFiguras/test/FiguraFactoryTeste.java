package A09S.aula.test;

import A09S.aula.model.Quadrado;
import A09S.aula.model.Triangulo;
import A09S.aula.sevice.FiguraFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiguraFactoryTeste {

    @Test
    void getTriangulo(){
        Triangulo triangulo = FiguraFactory.obterTriangulo("Vermelho");
        triangulo.setTamnaho(2);

        Triangulo triangulo1 = FiguraFactory.obterTriangulo("Vermelho");
        triangulo.setTamnaho(1);

        Assertions.assertEquals(triangulo.getCor(), "Vermelho");
        Assertions.assertEquals(triangulo1.getTamnaho(), 1);
        Assertions.assertEquals(FiguraFactory.trianguloHashMap.size() == 1, true);
    }

    @Test
    void getQuadrado(){

        Quadrado quadrado = FiguraFactory.obterQuadrado(2);
        quadrado.setCor("Verde");

        Quadrado quadrado1 = FiguraFactory.obterQuadrado(2);
        quadrado1.setCor("Vermelho");

        Assertions.assertEquals(quadrado.getTamnaho(), 2);
        Assertions.assertEquals(quadrado1.getCor(), "Vermelho");
        Assertions.assertEquals(FiguraFactory.quadradoHashMap.size() == 1, true);
    }

}
