
package clasegenerica.Model;

import java.util.Objects;


public class caja<y> {
    
    private y dato;

    
    public void SetDato(y d){
        dato = d;
    }
    public  y GetDato(){
        return dato;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final caja<?> other = (caja<?>) obj;
        return Objects.equals(this.dato, other.dato);
    }
    
}
