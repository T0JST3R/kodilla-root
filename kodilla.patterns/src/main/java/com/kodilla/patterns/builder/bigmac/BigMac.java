package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private final List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        String bun;
        String sauce;
        int burgers;
        List<String> ingredients = new ArrayList<>();
        public static String FIRSTSAUSE = "FIRSTSAUCE";
        public static String SECONDSAUSE = "SECONDSAUSE";
        public static String BUN = "BUN";
        public static String ROLL = "ROLL";
        public static String SALAT = "SALAT";
        public static String ONION = "ONION";
        public static String BECON = "BECON";
        public static String CUCUMBER = "CUCUMBER";
        public static String CHILI = "CHILI";
        public static String Mushrooms = "MUSHROOMS";
        public static String SHRIMPS = "SHRIMPS";
        public static String CHEESE = "CHEESE";
        public boolean SESAME = false;


        public BigMacBuilder bun(String bun) {
            if (bun.contains(BUN) || bun.contains(ROLL)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun can be " + BUN + " OR " + ROLL);
            }
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if (sauce.contains(FIRSTSAUSE) || sauce.contains(SECONDSAUSE)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sauce can be only " + FIRSTSAUSE + " or " + SECONDSAUSE);

            }
            return this;
        }

        public BigMacBuilder sesame(boolean sesame) {
            this.SESAME = sesame;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder ingredients(String ingredient) {
            this.ingredients.add(ingredient);


            return this;
        }

        public BigMac build() {
            if (bun.contains(ROLL) && SESAME) {
                throw new IllegalStateException("Only BUN can be with sesame");
            } else {
                return new BigMac(bun, sauce, burgers, ingredients);
            }
        }
    }


    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }


    private BigMac(String bun, String sauce, int burgers, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
