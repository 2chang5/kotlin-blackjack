package blackjack.domain

class Players(val value: List<Player>) {
    constructor(names: List<String>, generatePlayer: (String) -> Player) : this(names.map { generatePlayer(it) })

    fun progressPlayersAddCard(
        getDecision: (Player) -> Boolean,
        printPlayerCard: (Player) -> Unit,
        getCard: () -> Card,
    ) {
        value.forEach { it.progressAddCard(getDecision, printPlayerCard, getCard) }
    }
}