package rock_paper_scissors;

public enum Move {
    ROCK("Kamien") ,
    PAPER("Papier") ,
    SCISSORS("Nozyce");

    private String name;

    Move(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
