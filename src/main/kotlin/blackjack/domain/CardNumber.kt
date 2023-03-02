package blackjack.domain

enum class CardNumber(val value: Int?) {
    ACE(null),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ;

    companion object {
        fun shuffledCardNumbers(): List<CardNumber> = CardNumber.values().toList().shuffled()
    }
}