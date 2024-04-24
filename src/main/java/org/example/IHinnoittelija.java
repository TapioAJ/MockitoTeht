package org.example;

public interface IHinnoittelija {
	public abstract float getAlennusProsentti(Asiakas asiakas, Tuote tuote);
	public abstract void setAlennusProsentti(Asiakas asiakas, float alennus);

	void aloita();

	void lopeta();
}
