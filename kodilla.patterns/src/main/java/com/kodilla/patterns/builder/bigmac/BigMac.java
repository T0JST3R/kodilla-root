package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private final List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        List<String> ingredients = new ArrayList<>();
        public final static String FIRSTSAUSE = "FIRSTSAUCE";
        public final static String SECONDSAUSE = "SECONDSAUSE";
        public final static String BUN = "BUN";
        public final static String ROLL = "ROLL";
        public final static String SALAT = "SALAT";
        public final static String ONION = "ONION";
        public final static String BECON = "BECON";
        public final static String CUCUMBER = "CUCUMBER";
        public final static String CHILI = "CHILI";
        public final static String Mushrooms = "MUSHROOMS";
        public final static String SHRIMPS = "SHRIMPS";
        public final static String CHEESE = "CHEESE";
        private boolean sesame = false;


        public BigMacBuilder bun(String bun) {
            if (bun.equals(BUN) || bun.equals(ROLL)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun can be " + BUN + " OR " + ROLL);
            }
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if (sauce.equals(FIRSTSAUSE) || sauce.equals(SECONDSAUSE)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sauce can be only " + FIRSTSAUSE + " or " + SECONDSAUSE);
            }
            return this;
        }

        public BigMacBuilder sesame(boolean sesame) {
            this.sesame = sesame;
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
            if (bun.equals(ROLL) && sesame) {
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
