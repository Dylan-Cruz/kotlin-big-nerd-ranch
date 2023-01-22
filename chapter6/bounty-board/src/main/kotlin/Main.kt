const val HERO_NAME = "Madrigal"
var playerLevel = 5

fun main(args: Array<String>) {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    println(playerLevel)

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"
    var canTalkToBarbarians = !hasAngeredBarbarians &&
            (hasBefriendedBarbarians || playerClass == "barbarian")

    readBountyBoard()

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)
    readBountyBoard()
}

private fun readBountyBoard(canTalkToBarbarians: Boolean = true) {
    println("The hero approaches the bounty board. It reads:")
    println(obtainQuest(playerLevel, canTalkToBarbarians))
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