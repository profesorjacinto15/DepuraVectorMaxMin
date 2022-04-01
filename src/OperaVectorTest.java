import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperaVectorTest {
    int vec[] = {2,5,8,6};
    int vec2 [] = {-2, -3, -20, -210};

    @org.junit.jupiter.api.Test
     void promedio() {
        int esp = 5;
        int resultado = OperaVector.promedio(vec);
        assertEquals(esp, resultado);
    }

    @org.junit.jupiter.api.Test
    void maximo() {
        int esp = 8;
        int resu = OperaVector.maximo(vec);
        assertEquals(esp, resu);

    }

    @org.junit.jupiter.api.Test
    void minimo() {
        int esp = 2;
        int re= OperaVector.minimo(vec);
        assertEquals(esp, re);
    }

    @org.junit.jupiter.api.Test
    void promediotodosiguales() {
        int vec2[] = {5, 5, 5, 5, 5};
        int espe = 5;
        int resultado = OperaVector.promedio(vec2);
        assertEquals(espe, resultado);
    }

    @org.junit.jupiter.api.Test
    void minitotodosnegativos() {
        int espe = -210;
        int re = OperaVector.minimo(vec2);
        assertEquals(espe, re);
    }

    @org.junit.jupiter.api.Test
    void maximotodosnegativos() {
        int esp = -2;
        int re = OperaVector.maximo(vec2);
        assertEquals(esp, re);
    }
}