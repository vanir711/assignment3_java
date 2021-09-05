package cell;

public class ImmuneCell {
    public int strength;
    public int x;
    public int y;
    public int id;

    public ImmuneCell(){
        this.strength=0;
        this.x=0;
        this.y=0;
        this.id=0;
    }
    private void setStrength(int strength){
        if (strength>=0){
            this.strength=strength;
        }
        else{
            this.strength=0;
        }
    }
    private void setX(int x){
        if (x>=0){
            this.x=x;
        }
        else{
            this.x=0;
        }
    }
    private void setY(int y){
        if (y>=0){
            this.y=y;
        }
        else{
            this.y=0;
        }
    }
    private void setId(int id){
        if (id>=0){
            this.id=id;
        }
        else{
            this.id=0;
        }
    }
    public ImmuneCell(int strength, int x, int y, int id){
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
    }

    public void interactNeighbors(ArrayList<Cell> neighbors){

    }
}
