const val HERO_NAME = "Madrigal"
var playerLevel = 5

fun main(args: Array<String>) {
    println("$HERO_NAME announces her presence to the world.")
    println("What level is $HERO_NAME?")
    playerLevel = readLine()!!.toInt()
    println("$HERO_NAME's level is $playerLevel.")

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"
    var canTalkToBarbarians = !hasAngeredBarbarians &&
            (hasBefriendedBarbarians || playerClass == "barbarian")

    readBountyBoard()

    println("Time passes...")
    println("$HERO_NAME returns from her quest.")

    playerLevel++
    println(playerLevel)
    readBountyBoard()
}

private fun readBountyBoard(canTalkToBarbarians: Boolean = true) {
    println(
        """
        |$HERO_NAME approaches the bounty board. It reads:
        |   "${obtainQuest(playerLevel, canTalkToBarbarians)}"
        """.trimMargin()
    )
}

private fun obtainQuest(playerLevel: Int, canTalkToBarbarians: Boolean): String =
    when (playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            // Check whether diplomacy is an option
            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        }
        6 -> "Locate the enchanted sword."
        7 -> "Recover the long-lost artifact of creation."
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> "There are no quests right now."
    }