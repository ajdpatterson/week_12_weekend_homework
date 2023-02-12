public class Pilot {
    private String name;
    private RankType rank;
    private String licenceNumber;

    public Pilot(String name, RankType rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String fly() {
        return "Wheee";
    }
}
