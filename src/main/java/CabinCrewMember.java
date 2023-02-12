public class CabinCrewMember {
    private String name;
    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType) {
        this.name = name;
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return this.rankType;
    }

    public String squalk() {
        return "We're going to crash!";
    }
}
