
package clasegenerica.Model;


public class ArrayList {
    
    private Object [] elementos;
    private int i = 0;

    public ArrayList(int x) {
        elementos = new Object[x];
    }
    
    public void add(Object obj){
        elementos [i] = obj;
        i++;
    }
    public Object get(int i){
        return elementos[i];
    }
    
    
}
