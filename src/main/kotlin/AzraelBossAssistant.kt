class finalBossAssistant(name: String = "Azrael") : FinalBossSavathun(HP = 200.00) {

    // Variablen für den beschworenen Boss: Azrael

    var azraelAttack1 = 5
    var azraelAttack2 = 10
    var azraelAttack3 = 15
    var azraelAttack4 = 20
    var allAzraelAttacks = mutableListOf<Int>(azraelAttack1, azraelAttack2, azraelAttack3, azraelAttack4)


    // Funktion Kampf Azrael, nach Beschwörung alle Angriffe um 10% gesteigert, gleichzeitig der Fluch von Savathun

    fun attack(opponentList: MutableList<Hero>) {
        if (!isBossDefeated) {

            for (opponent in opponentList) {
                opponent.looseHP(lostHP = allAzraelAttacks.random())
            }
            for (i in allAzraelAttacks.indices) {
                allAzraelAttacks[i] = (allAzraelAttacks[i] * 1.1).toInt()
            }
        }
    }


}

