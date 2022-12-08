class Hunter(name: String = "HUNTER") : Hero(name, HP = 400) {

    // Variablen für die Tochterklasse: HUNTER

    var hunterAttack1 = 20.00
    var hunterAttack2 = 30.00
    var hunterAttack3 = 40.00
    var hunterAttackSuper = 50.00
    val hunterItem1 = 200.00
    var allHunterAttacks = mutableListOf<Double>(hunterAttack1, hunterAttack2, hunterAttack3, hunterAttackSuper)


    override fun attack(opponent: FinalBossSavathun) {

        // Kampfmenü Warlock, Auswahl der Attacken + Items

        if (!isPlayerDefeated) {
            println("IT'S YOUR TURN HUNTER, YOU CAN ATTACK SAVATHUN, USE POTION OR USE A POWER UP!")
            println("\n")
            println("To attack with DAWNBLADE      -->     enter 1!")
            println("To attack with VOIDWALKER     -->     enter 2!")
            println("To attack with STORMCALLER    -->     enter 3!")
            println("To attack with GOLDEN SYNTAX  -->     enter 4!")
            println("To use POTION                 -->     enter 5!")
            println("To use POWERUP                -->     enter 6!")


            var attack = readln().toInt()
            if (attack >= 1 && attack <= 4)
                opponent.looseHP(lostHP = allHunterAttacks[attack - 1])

            // Auswahl Item 1: Potion HP + 200

            if (attack == 5) {
                var healing = playerHP + hunterItem1
                println("You used Potion. You received 200HP ")
                println("\n")
            }

            // Auswahl Item 2: PowerUP, Stärke der Angriffe um 10% steigern

            if (attack == 6) {

                hunterAttack1 * 1.1
                hunterAttack2 * 1.1
                hunterAttack3 * 1.1
                println("SMART, YOU USED A POWER UP. YOUR ATTACKS INCREASES 10%!")
                println("\n")
            }
        }
    }

}









