
import java.io.Serializable;
import java.util.Date;

public class Platillo implements Serializable {

    String comanda, mesero, platillo, fecha;

    public Platillo(String comanda, String mesero, String platillo, String fecha) {
        this.comanda = comanda;
        this.mesero = mesero;
        this.platillo = platillo;
        this.fecha = fecha;
    }

   

    public Object[] toArray() {
        return new Object[]{comanda, mesero, platillo, fecha};
    }

    @Override
    public String toString() {
        return "<html>" + comanda + "<br>" + mesero + "<br>" + platillo + "<br>" + fecha + "</html>";
    }

}
