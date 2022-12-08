import kotlin.random.Random

fun fight(
    myCharacter: Titan,
    myCharacter2: Warlock,
    myCharacter3: Hunter,
    oppCharacter1: FinalBossSavathun,
    oppCharacter2: finalBossAssistant
) {

    // Einleitung und Begrüssungstext

    println("WELCOME TO GOLDEN SYNTAX. THE HOTTEST RPG AROUND THESE DAYS!!")
    println("TO SUCCEED, YOU AND YOUR CLAN MUST DEFEAT EVIL SAVATHUN!!")
    println("BUT NOTE: IT WON'T BE EASY & THERE ARE CHALLENGING SURPRISES WAITING FOR YOU!!")
    println("GOOD LUCK!!")
    println("\n")


    var allCharacters = mutableListOf(myCharacter, myCharacter2, myCharacter3)
    var isAzraelSummoned = false


    while (!oppCharacter1.isBossDefeated && !myCharacter.isPlayerDefeated) {


        // Angriffe der Krieger vs. Savathun und umgekehrt

        myCharacter.attack(oppCharacter1)
        if (oppCharacter1.isBossDefeated)
            break

        myCharacter2.attack(oppCharacter1)
        if (oppCharacter1.isBossDefeated)
            break

        myCharacter3.attack(oppCharacter1)
        if (oppCharacter1.isBossDefeated)
            break
        println("\n")

        // Wenn die HP von Savathun unter die Hälfte fällt, beschwört sie Azrael

        if (oppCharacter1.bossHP <= 333 && isAzraelSummoned == false) {
            println("YOU SHALL BURN! I'LL SUMMON AZRAEL!!")
            isAzraelSummoned = true

        }

        // Azrael attackiert zufällig einen Krieger mit gesteigerter Angriffskraft, Anzeige der eigenen HP nach Anfgriff

        if (oppCharacter1.bossHP <= 333) {
            oppCharacter2.attack(allCharacters.random())
            println("HURRY UP!! AZRAEL IS ATTACKING!! YOU MUST DEFEAT SAVATHUN TO DEFEAT AZRAEL!!")
            println("${myCharacter.playerName} HAS ${myCharacter.playerHP} LEFT")
            println("${myCharacter2.playerName} HAS ${myCharacter2.playerHP} LEFT")
            println("${myCharacter3.playerName} HAS ${myCharacter3.playerHP} LEFT")
            println("\n")
        }

        oppCharacter1.attack(allCharacters.random())

    }

}


fun main() {

    fight(
        Titan("TITAN"),
        Warlock("WARLOCK"),
        Hunter("HUNTER"),
        FinalBossSavathun("SAVATHUN"),
        finalBossAssistant("AZRAEL")
    )


}
