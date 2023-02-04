public class Cube {
    private int edgeLength;

    public Cube (int edgeLenght){
        this.edgeLength = edgeLenght;
    }

    public int volume(){
        return (this.edgeLength * this.edgeLength) * this.edgeLength;
    }
    @Override
    public String toString(){
        return "The lenght of the edge is "+ this.edgeLength +" and the volume " + volume();

    }
    
}
