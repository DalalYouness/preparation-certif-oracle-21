package com.dalal.date_and_time;

// On importe la classe Instant qui fait partie de l'API java.time
// Elle permet de représenter un point précis dans le temps (timestamp) en UTC
import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {

        // Crée un objet Instant représentant le moment actuel (timestamp)
        Instant instant = Instant.now();

        // Affiche l'instant actuel sous forme ISO-8601 (ex: 2026-01-29T18:45:30.123Z)
        System.out.println(instant);

        // Affiche le nombre de millisecondes écoulées depuis l'époque Unix (1970-01-01T00:00:00Z)
        System.out.println(instant.toEpochMilli());

        // Affiche le nombre de secondes écoulées depuis l'époque Unix
        System.out.println(instant.getEpochSecond());

        // Affiche la partie nanoseconde de l'instant (le reste après les secondes)
        System.out.println(instant.getNano());
    }
}
