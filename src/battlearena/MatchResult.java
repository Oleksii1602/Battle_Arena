package battlearena;

public record MatchResult(String playerName, String playerType,
                          String computerType, String winner, int rounds) {
    public String toFileLine() {
        return playerName + " | " + playerType + " | " + computerType
                + " | " + winner + " | " + rounds + " rounds";
    }
}
