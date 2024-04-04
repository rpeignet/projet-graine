package fr.projetgraine.DTO;

public class SachetDTO {
    public int poidsEnGrammes;
    public float prixEnEuros;
    public String idTypeDeGraine;

    public SachetDTO(int poidsEnGrammes, float prixEnEuros, String idTypeDeGraine) {
        this.poidsEnGrammes = poidsEnGrammes;
        this.prixEnEuros = prixEnEuros;
        this.idTypeDeGraine = idTypeDeGraine;
    }
}
