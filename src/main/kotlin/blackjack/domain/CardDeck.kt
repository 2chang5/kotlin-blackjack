package blackjack.domain

import blackjack.Shape

class CardDeck() {

    companion object {
        private val Cards: List<Card> = Shape.values().fold(listOf()) { cards, shape -> cards + makeCard(shape) }

        private fun makeCard(shape: Shape): List<Card> = CardNumber.values().map { Card(shape, it) }

        fun drawCard(): Card = Cards.shuffled().first()
    }
}