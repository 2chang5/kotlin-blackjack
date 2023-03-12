package blackjack.domain

import blackjack.domain.state.DealerHit
import blackjack.domain.state.State

class Dealer(override var state: State) : Participant {
    override fun isOverCondition(): Boolean = state !is DealerHit

    companion object {
        private const val ADD_CARD_CONDITION = 16
    }
}
