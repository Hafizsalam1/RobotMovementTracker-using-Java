public class Robot implements Interface {

    private int Shiftx;
    private int Shifty;
    private int positionx;

    private int positiony;
    Mata_angin mata_angin;
    Mata_angin nilai_mataangin;
    public String input = "AARAAAA";
    String[] strSplit = input.split("");


    public Robot(Mata_angin mata_angin, int positionx, int positiony) {
        this.positionx = positionx;
        this.positiony = positiony;
        this.Shiftx = Shiftx;
        this.Shifty = Shifty;

        for (String s : strSplit) {


            if (mata_angin == Mata_angin.N) {
                switch (s) {
                    case "A":
                        this.mata_angin = Mata_angin.N;
                        this.positiony++;
                        break;
                    case "L":
                        this.mata_angin = Mata_angin.W;
                        break;
                    case "R":
                        this.mata_angin = Mata_angin.E;
                        break;
                }
            }
            else if (mata_angin == Mata_angin.E) {
                switch (s) {
                    case "A":
                        this.mata_angin = Mata_angin.E;
                        this.positionx++;
                        break;
                    case "L":
                        mata_angin = Mata_angin.N;
                        break;
                    case "R":
                        mata_angin = Mata_angin.S;
                        break;
                }
            }
            else if (mata_angin == Mata_angin.S) {
                switch (s) {
                    case "A":
                        this.mata_angin = Mata_angin.S;
                        this.positiony--;
                        break;
                    case "L":
                        mata_angin = Mata_angin.E;
                        break;
                    case "R":
                        mata_angin = Mata_angin.W;
                        break;
                }
            }
            else if (mata_angin == Mata_angin.W) {
                switch (s) {
                    case "A":
                        this.mata_angin = Mata_angin.W;
                        this.positionx--;
                        break;
                    case "L":
                        mata_angin = Mata_angin.S;
                        break;
                    case "R":
                        mata_angin = Mata_angin.N;
                        break;
                }
            }
            System.out.println( s + " -> "+ this.positionx + "," + this.positiony);
        }
    }


    @Override
    public int getPositionx() {
        return positionx;
    }

    @Override
    public void setPositionx(int positionx) {
        this.positionx = positionx;
    }

    @Override
    public int getPositiony() {
        return positiony;
    }

    @Override
    public void setPositiony(int positiony) {
        this.positiony = positiony;

    }


    public void move() {
        this.positionx = this.positionx + Shiftx;
        this.positiony = this.positiony + Shifty;
    }



}
