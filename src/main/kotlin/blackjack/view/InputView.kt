package blackjack.view

import blackjack.domain.Player

class InputView {
    fun getPlayerNames(): List<String> {
        return runCatching {
            println(GET_PLAYER_NAME_SCRIPT)
            readln().split(",").map { it.trim() }
        }.getOrElse {
            println(it.message)
            getPlayerNames()
        }
    }

    fun getDecision(player: Player): Boolean {
        return runCatching {
            println(GET_DECISION_SCRIPT.format(player.name))
            return when (readln().lowercase()) {
                "y" -> true
                "n" -> false
                else -> throw IllegalArgumentException(INCORRECT_DECISION_ERROR)
            }
        }.getOrElse {
            println(it.message)
            getDecision(player)
        }
    }

    companion object {
        private const val GET_PLAYER_NAME_SCRIPT = "게임에 참가할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)"
        private const val GET_DECISION_SCRIPT = "%d는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)"
        private const val INCORRECT_DECISION_ERROR = "올바른 입력이 아닙니다(y,n으로 입력해 주세요"
    }
}