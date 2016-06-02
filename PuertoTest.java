

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test001()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(2, "aaa", 12, 1990);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1200, "bbb", 40, 2014);
        Yate yate1 = new Yate(8, 4000, "ccc", 23, 2001);
        Velero velero2 = new Velero(3, "ddd", 5, 2016);
        Cliente cliente1 = new Cliente("enrique", "55555k");
        Cliente cliente2 = new Cliente("kevin", "4444p");
        Cliente cliente3 = new Cliente("puto", "333l");
        Cliente cliente4 = new Cliente("pene", "6666h");
        Cliente cliente5 = new Cliente("po", "descomunal");
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(4, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(5, cliente3, yate1));
        assertEquals(361600, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(27), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(7, cliente4, velero2));
    }
    
      @Test
    public void testPuerto01()
    {
        Velero velero1 = new Velero(4, "ABC", 20, 1989);
        Yate yate1 = new Yate(10, 20000, "GGG", 40, 1999);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(3000, "JKJ", 22, 2001);
        Cliente cliente1 = new Cliente("Juan Magan", "33444555K");
        Cliente cliente2 = new Cliente("Paulina Rubio", "27666777O");
        Cliente cliente3 = new Cliente("Enrique Iglesias", "90888777G");
        Puerto puerto1 = new Puerto();
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, yate1));
        assertEquals(2, puerto1.addAlquiler(3, cliente3, embarcac1));
        Velero velero2 = new Velero(1, "BBB", 15, 2010);
        Cliente cliente4 = new Cliente("Julio Iglesias", "23444555K");
        assertEquals(3, puerto1.addAlquiler(10, cliente4, velero2));
        Cliente cliente5 = new Cliente("Pedro Duque", "89777444K");
        Yate yate2 = new Yate(8, 40000, "YYY", 45, 2012);
        assertEquals(-1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
        assertEquals(800 + (300 * 20010), puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
    }
    
    @Test
    public void forBove()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Bove", "fgh5");
        Cliente cliente2 = new Cliente("Anibal", "Lecter");
        Cliente cliente3 = new Cliente("Kraken", "uhjmalk");
        Cliente cliente4 = new Cliente("Danikun", "kunkun");
        Velero velero1 = new Velero(2, "abc", 6, 1998);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(500, "def", 4, 2000);
        Yate yate1 = new Yate(2, 500, "ghi", 25, 2006);
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(5, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(6, cliente2, embarcac1));
        assertEquals(3, puerto1.addAlquiler(7, cliente3, yate1));
        assertEquals(150240, puerto1.liquidarAlquiler(2), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(25), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(-6), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(2), 0.1);
        assertEquals(2, puerto1.addAlquiler(2, cliente4, yate1));
    }
    
    @Test
    public void addAlquiler002()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Dani", "Kraken");
        Velero velero1 = new Velero(2, "Kraken", 4, 6854);

        System.out.println("Comprobamos que el puerto esta vacio:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente1, velero1));
        assertEquals(2, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(3, puerto1.addAlquiler(4, cliente1, velero1));
        System.out.println("Añadimos 4 barcos:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(680, puerto1.liquidarAlquiler(1), 0.1);
        System.out.println("Eliminamos el Barco del amarre 1:");
        puerto1.verEstadoAmarres();
        assertEquals(1, puerto1.addAlquiler(2, cliente1, velero1));
        System.out.println("1)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(720, puerto1.liquidarAlquiler(2), 0.1);
        System.out.println("Eliminamos el Barco del amarre 2:");
        puerto1.verEstadoAmarres();
        assertEquals(2, puerto1.addAlquiler(3, cliente1, velero1));
        System.out.println("2)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(640, puerto1.liquidarAlquiler(0), 0.1);
        System.out.println("Eliminamos el Barco del amarre 0:");
        puerto1.verEstadoAmarres();
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("3)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(760, puerto1.liquidarAlquiler(3), 0.1);
        System.out.println("Eliminamos el Barco del amarre 3:");
        puerto1.verEstadoAmarres();
        assertEquals(3, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("4)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(680, puerto1.liquidarAlquiler(1), 0.1);
        System.out.println("Eliminamos el Barco del amarre 1:");
        assertEquals(720, puerto1.liquidarAlquiler(2), 0.1);
        System.out.println("Eliminamos el Barco del amarre 2:");
        puerto1.verEstadoAmarres();
        assertEquals(1, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(2, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("5)Añadimos 2 barcos:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(640, puerto1.liquidarAlquiler(0), 0.1);
        System.out.println("Eliminamos el Barco del amarre 0:");
        assertEquals(640, puerto1.liquidarAlquiler(3), 0.1);
        System.out.println("Eliminamos el Barco del amarre 3:");
        puerto1.verEstadoAmarres();
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(3, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("6)Añadimos 2 barcos:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(640, puerto1.liquidarAlquiler(0), 0.1);
        System.out.println("Eliminamos el Barco del amarre 0:");
        assertEquals(640, puerto1.liquidarAlquiler(2), 0.1);
        System.out.println("Eliminamos el Barco del amarre 2:");
        puerto1.verEstadoAmarres();
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(2, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("7)Añadimos 2 barcos:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        assertEquals(640, puerto1.liquidarAlquiler(1), 0.1);
        System.out.println("Eliminamos el Barco del amarre 1:");
        assertEquals(640, puerto1.liquidarAlquiler(3), 0.1);
        System.out.println("Eliminamos el Barco del amarre 3:");
        puerto1.verEstadoAmarres();
        assertEquals(1, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(3, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("8)Añadimos 2 barcos:");
        puerto1.verEstadoAmarres();
        System.out.println("\n");//####################################################
        System.out.println("9)Añadimos 2 barcos con diferente precio de alquiler:");
        assertEquals(-1, puerto1.addAlquiler(2, cliente1, velero1));
        assertEquals(-1, puerto1.addAlquiler(3, cliente1, velero1));
        puerto1.verEstadoAmarres();
    }
}

