package com.vdubyk.hm7.task2;


public enum Country {
    UKRAINE("Ukraine", Continent.EUROPE),
    POLAND("Poland", Continent.EUROPE),
    BELARUS("Belarus", Continent.EUROPE),
    GERMANY("Germany", Continent.EUROPE),
    CANADA("NORTH_AMERICA", Continent.NORTH_AMERICA),
    AUSTRALIA("AUSTRALIA", Continent.OCEANIA),
    EGYPT("EGYPT", Continent.AFRICA),
    SPAIN("SPAIN", Continent.EUROPE),
    FRANCE("FRANCE", Continent.EUROPE),
    ISRAEL("ISRAEL", Continent.EUROPE),
    ARGENTINA("ARGENTINA", Continent.SOUTH_AMERICA),
    NEW_ZEALAND("NEW_ZEALAND", Continent.OCEANIA),
    CHINA("CHINA", Continent.ASIA),
    JAPAN("JAPAN", Continent.ASIA),
    USA("USA", Continent.NORTH_AMERICA);

    private final String countryName;
    private final Continent continent;

    Country(String countryName, Continent continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }
}
