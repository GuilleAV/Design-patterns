
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.objects.NativeArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GUILLE
 */
public class Paises {

    private List<Pais> paises;

    //create an object of Paises
    private static Paises instance = new Paises();

    //make the constructor private so that this class cannot be instantiated
    private Paises() {
        this.paises = new ArrayList<>();
        this.paises.add(new Pais("01", "Argentina"));
        this.paises.add(new Pais("02", "Peru"));
        this.paises.add(new Pais("03", "Brasil"));
        this.paises.add(new Pais("04", "Venezuela"));
        this.paises.add(new Pais("05", "Chile"));
        this.paises.add(new Pais("06", "Uruguay"));
    }

    //Get the only object available
    public static Paises getInstance() {
        return instance;
    }

    public void showPaises() {
        if (this.paises != null && !this.paises.isEmpty()) {
            this.paises.forEach(p -> {
                System.out.println("Pais Id " + p.getId() + " nombre " + p.getDescripcion());
            });

        } else {
            System.out.println("No hay paises para mostrar");
        }
    }

}
