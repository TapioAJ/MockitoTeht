package org.example;

public class FakeHinnoittelija implements IHinnoittelija {
    private float alennus;
    public FakeHinnoittelija(float alennus) {
        this.alennus = alennus;
    }
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return alennus;
    }

    @Override
    public void setAlennusProsentti(Asiakas asiakas, float alennus) {
        this.alennus = alennus;
    }

    @Override
    public void aloita() {

    }

    @Override
    public void lopeta() {

    }
}