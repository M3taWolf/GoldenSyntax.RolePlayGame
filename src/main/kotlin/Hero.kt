open class Hero(name: String, HP: Int) {

    // Variablen Heroes

    var playerName = name
    var playerHP = HP
    var isPlayerDefeated = false

    open fun attack(opponent: FinalBossSavathun) {
    }


    // Damage + Anzeige der eigenen HP

    fun looseHP(lostHP: Int) {
        playerHP -= lostHP
        if (this.playerHP <= 0) {
            isPlayerDefeated = true
            println("You lost. $playerName is defeated.")
        } else {
            println("$playerName has $playerHP left")
            println("\n")
        }
    }


}