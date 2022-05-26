package pl.dsw45634.solid.b_OCP.no_1.ds;

/**
 * W tym przypadku jeśli zaistnieje potrzeba dodania nowego kształtu trzeba
 * stworzyć nową klasę i uzupełnić wszystkie metody z które mają korzystać z nowego
 * obiektu, jeśli jest ich dużo może to być trudne.
 */

class Triangle {

    private int edge;
    private int height;

    public Triangle(int edge, int height) {
        this.edge = edge;
        this.height = height;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
