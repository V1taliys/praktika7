
package serialization_java1;


import java.io.Serializable;


public class Holodilnik implements Serializable {

  
    private static final long serialVersionUID = 1L;
      private final int power;
    private final String name;
    private final boolean freeze;

    public Holodilnik(int power, String name, boolean freeze) {
        this.power = power;
        this.name = name;
        this.freeze = freeze;
    }

    @Override
    public String toString() {
        return "Holodilnik{" + "power=" + power + ", name=" + name + ", freeze=" + freeze + '}';
    }

}

