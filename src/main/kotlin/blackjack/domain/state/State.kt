package blackjack.domain.state

import blackjack.domain.CardBunchForState

interface State {
    val hand: CardBunchForState
}
