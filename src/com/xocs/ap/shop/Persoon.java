package com.xocs.ap.shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Persoon {

    private Set<Game> mijnGames = new HashSet<>();
    private double saldo;

    private boolean heeftGame(Game game) {
        return mijnGames.contains(game);
    }
}
