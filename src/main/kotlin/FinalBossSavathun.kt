open class FinalBossSavathun(name: String = "Savathun", HP: Double = 666.00) {

    // Variablen Endboss/Savathun

    var bossName = "SAVATHUN"
    var bossHP = HP
    var isBossDefeated = false
    var savathunAttack1 = 30
    var savathunAttack2 = 40
    var savathunAttack3 = 50
    var savathunAttack4 = 60
    var savathunAttack5 = 70
    var savathunAttackSuper = 100

    // Liste aller Attacken

    var allSavathunAttacks = mutableListOf<Int>(
        savathunAttack1,
        savathunAttack2,
        savathunAttack3,
        savathunAttack4,
        savathunAttack5,
        savathunAttackSuper
    )

    // Funktion für den Kampf, Savathun wählt zufällig eine der Angriffe aus der Liste aller Attacken.

    open fun attack(opponent: Hero) {
        if (bossHP >= 0) {
            opponent.playerHP -= allSavathunAttacks.random()
            println("${bossName} IS ATTACKING ${opponent.playerName} WITH FULL FORCE. ${opponent.playerName} HAS ${opponent.playerHP} HP LEFT. TRY TO COVER & STAY STRONG!")
            println("\n")
        }
    }

    // Funktion für den Kampf. Information, ob der Endboss besiegt ist oder weitere Attacken benötigt werden.

    fun looseHP(lostHP: Double) {
        bossHP -= lostHP
        if (this.bossHP <= 0) {
            isBossDefeated = true
            println("YOU DID IT!! WELL DONE WARRIORS!! SAVATHUN & AZRAEL ARE DEFEATED!!")
            println("YOUR PLACE IN HEAVEN IS SECURED!!")
            println("\n")
        } else {
            println("KEEP ATTACKING WARRIOR! SAVATHUN HAS $bossHP HP LEFT!")
            println("\n")

        }
    }


}