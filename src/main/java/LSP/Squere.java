package LSP;

public class Squere extends Quadrangle{
    public int len;

    public Squere(int len) {
        this.len = len;
    }

    @Override
    int area() {
        return len * len;
    }
}
