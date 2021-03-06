package main;

import random.MersenneTwisterFast;

import java.util.Random;

public enum Configuration {
    instance;

    public String fileSeparator = System.getProperty("file.separator");
    public String userDirectory = System.getProperty("user.dir");

    public String dataDirectory = userDirectory + fileSeparator + "data" + fileSeparator;
    public String dataFilePath = dataDirectory + "TSP280.txt";

    public String databaseFile = dataDirectory + "datastore.db";

    public int ROULETTE_WHEEL_SELECT_COUNT = 26;

    public int TOURNAMENT_SELECT_COUNT = 26;

    public Random random = new MersenneTwisterFast();
    public MersenneTwisterFast randomForMutation = new MersenneTwisterFast();
}