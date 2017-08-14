package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;

    }

    public List execute() {
        List<Integer> playersList = new ArrayList<>();
        List<Integer> outcome = new ArrayList<>();

        int point = 0;

        int tinker = 0;

        int players = n;

        for (int counter = 0; counter < n; counter++) {

            playersList.add(1);

        }
        while(players > 0) {

            int pointer = point % n;

            while (tinker < k) {

                point += 1;
                pointer = point % n;

                if (playersList.get(pointer) == 1) {

                    tinker += 1;
                }
            }

            playersList.set(pointer, 0);

            if (pointer == 0) {

                pointer = n;
            }

            players -= 1;
            tinker = 0;
            outcome.add(pointer);
        }

        return outcome;
    }
}