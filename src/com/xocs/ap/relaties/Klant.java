package com.xocs.ap.relaties;

import java.util.HashMap;
import java.util.Map;

public class Klant {

    private Map<String,Rekening> rekeningen = new HashMap<>();

    public void addRekening(Rekening rekening) {
        rekeningen.put(rekening.getId(),rekening);
    }

    public double getTotaalSaldo() {
        return rekeningen.values().stream()
                .mapToDouble(r -> r.getSaldo())
                .sum();
    }

    public int getAantalRekeningen() {
        return rekeningen.size();
    }

    public double getSaldo(String rekeningId) {
        return rekeningen.containsKey(rekeningId) ? rekeningen.get(rekeningId).getSaldo() : 0.0;
    }

}
