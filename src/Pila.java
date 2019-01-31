import java.util.Vector;

public class Pila<String> implements iPila<String> {

    private Vector<String> data;

    public Pila () {
        this.data = new Vector<>();
    }

    @Override
    public boolean empty() {
        return (data.size() == 0);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public String peek() {
        return data.get(data.size() - 1);
    }

    @Override
    public String pop() {
        return data.remove(data.size() - 1);
    }

    @Override
    public void push(String item) {
        data.add(item);
    }
}
