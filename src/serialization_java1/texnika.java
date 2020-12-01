
package serialization_java1;

public class texnika extends Holodilnik {

    private static final long serialVersionUID = 1L;
    private Holodilnik typeOfHolodilnik;

    public texnika(int power, String name, boolean freeze) {
        super(power, name, freeze);
        this.typeOfHolodilnik = null;

    }

    

  public void settypeOfHolodilnik(Holodilnik typeOfHolodilnik ) {
        this.typeOfHolodilnik = typeOfHolodilnik;
    }

    @Override
    public String toString() {
        return super.toString()+"Holodilnik{" + "typeOfHolodilnik=" + typeOfHolodilnik + '}';
    }

  

}
