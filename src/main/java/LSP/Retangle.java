package LSP;

public class Retangle extends Quadrangle{
    public int height;
    public int width;

    public Retangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    int area() {
        return height * width;
    }
}
