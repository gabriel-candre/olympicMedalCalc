package entities;

public class Country {

    private String name;
    private Integer idCountry;
    private Integer goldMedals;
    private Integer silverMedals;
    private Integer bronzeMedals;
    private Integer rankingPosition;

    public Country() {

    }

    public Country(int idCountry, String name) {
        this.name = name;
        this.idCountry = idCountry;
        this.goldMedals = 0;
        this.silverMedals = 0;
        this.bronzeMedals = 0;
        this.rankingPosition = 0;
    }

    public Country(int id,int rankingPosition, String name, int goldMedals, int silverMedals, int bronzeMedals) {
        this.idCountry = id;
        this.rankingPosition = rankingPosition;
        this.name = name;
        this.goldMedals = goldMedals;
        this.silverMedals = silverMedals;
        this.bronzeMedals = bronzeMedals;
    }

    public Country(String name, int idCountry, int goldMedal, int silverMedals, int bronzeMedals, int rankingPosition) {
        this.name = name;
        this.idCountry = idCountry;
        this.goldMedals = goldMedal;
        this.silverMedals = silverMedals;
        this.bronzeMedals = bronzeMedals;
        this.rankingPosition = rankingPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getGoldMedals() {
        return goldMedals;
    }

    public void setGoldMedal(Integer goldMedal) {
        this.goldMedals = goldMedal;
    }

    public Integer getSilverMedals() {
        return silverMedals;
    }

    public void setSilverMedals(Integer silverMedals) {
        this.silverMedals = silverMedals;
    }

    public Integer getBronzeMedals() {
        return bronzeMedals;
    }

    public void setBronzeMedals(Integer bronzeMedals) {
        this.bronzeMedals = bronzeMedals;
    }

    public Integer getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(Integer rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    public void addGoldMedal(int qty) {
        this.goldMedals += qty;
    }

    public void addSilverMedal(int qty) {
        this.silverMedals += qty;
    }

    public void addBronzeMedal(int qty) {
        this.bronzeMedals += qty;
    }

    public String toFile() {
        return getIdCountry() + ";" + getName() + ";" + getGoldMedals() + ";" + getSilverMedals() + ";" + getBronzeMedals() + ";" + getRankingPosition();
    }

    public static Country fromFile(String fileString) {
        String [] fields = fileString.split(";");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        int goldMedals = Integer.parseInt(fields[2]);
        int silverMedals = Integer.parseInt(fields[3]);
        int bronzeMedals = Integer.parseInt(fields[4]);
        int position = Integer.parseInt(fields[5]);
        return new Country(id, position, name, goldMedals, silverMedals, bronzeMedals);
    }

    @Override
    public String toString() {
        return getName() + " | " + getGoldMedals() + " | " + getSilverMedals() + " | " + getBronzeMedals();
    }
}
