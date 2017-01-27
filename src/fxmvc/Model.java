package fxmvc;

public class Model {

    private int x;

    public Model()
    {
        this.x = 0;
    }

    public Model(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void telOp()
    {
        this.x++;
    }
}