public class Robot {

    private int positionx;

    private int positiony;
    Mata_angin mata_angin;
    public String input = "AARADAAA";
    String[] strSplit = input.split("");


    public Robot(Mata_angin mata_angin, int positionx, int positiony) {
        this.positionx = positionx;
        this.positiony = positiony;

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





    public void move() {
        this.positionx = this.positionx;
        this.positiony = this.positiony;
    }



}
