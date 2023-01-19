const val HERO_NAME = "Madrigal"

fun main(args: Array<String>) {
    var playerLevel = 4
    var hasSteed = false
    var playerGold = 50
    val pubName = "The Unicorn's Horn"
    val publicanName = "Moe"

    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    println(playerLevel)

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel++
    println(playerLevel)

    println("$HERO_NAME arrives at $pubName.")
    println("The publican $publicanName asks \"Do you have a noble steed?\"")
    println("$HERO_NAME: No. I have no steed. But I do have $playerGold gold and I would like a drink.")
    println("$publicanName: Excellent, I have mead, wine and LaCroix. What will you have?")

    println("$HERO_NAME is ready for a dangerous quest and encounters a magical mirror " +
            "that reads ${HERO_NAME.reversed()}")
}